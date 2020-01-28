package com.books.orders.activity;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.books.orders.commonClass.CommonMethods;
import com.books.orders.commonClass.JsonInterfaceClass;
import com.books.orders.commonClass.Utils;
import com.books.orders.model.response.BooksDetailsResponse;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.books.orders.R;

public class BooksDetails extends AppCompatActivity {
    private TextView mTitle, mAuotherName, mCategory, mAvgReadingTime, mTotleRents, mDescription;
    private JsonInterfaceClass interfaceClass;
    private String mtitleId;
    private ImageView imageView, imageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        mViews();
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void mViews() {
        mTitle = findViewById(R.id.title_name);
        mAuotherName = findViewById(R.id.auther_name);
        mCategory = findViewById(R.id.category);
        mAvgReadingTime = findViewById(R.id.avg_reading_time);
        mTotleRents = findViewById(R.id.total_rents);
        mDescription = findViewById(R.id.description);
        imageView = findViewById(R.id.icon);
        imageBack = findViewById(R.id.select_lab_back);
        mtitleId = getIntent().getStringExtra("titleId");

        if (mtitleId != null && !mtitleId.isEmpty()) {
            details(mtitleId);
        }

    }


    private void details(String titleId) {
        interfaceClass = CommonMethods.getRetrofit(BooksDetails.this).create(JsonInterfaceClass.class);
        Utils.displayProgressDialog(BooksDetails.this, getString(R.string.processing_request), false);
        Call<BooksDetailsResponse> booksDetailsResponseCall = interfaceClass.booksDetails(titleId);
        booksDetailsResponseCall.enqueue(new Callback<BooksDetailsResponse>() {
            @Override
            public void onResponse(Call<BooksDetailsResponse> call, Response<BooksDetailsResponse> response) {
                Utils.cancelProgressDialog(BooksDetails.this);
                if (response.isSuccess()) {
                    if (response.body() != null) {
                        if (response.body().getSuccessObject() != null && !response.body().getSuccessObject().toString().isEmpty()) {

                            if (response.body().getSuccessObject().getImage_url() != null && !response.body().getSuccessObject().getImage_url().isEmpty()) {
                                Glide.with(BooksDetails.this).load(response.body().getSuccessObject().getImage_url())
                                        .diskCacheStrategy(DiskCacheStrategy.NONE)
                                        .skipMemoryCache(true)
                                        .into(imageView);

                            } else {
                                Glide.with(BooksDetails.this).load(R.drawable.defaultprofile)
                                        .diskCacheStrategy(DiskCacheStrategy.NONE)
                                        .skipMemoryCache(true)
                                        .into(imageView);
                            }

                            if (response.body().getSuccessObject().getJb_info().getTitle() != null && !response.body().getSuccessObject().getJb_info().getTitle().isEmpty()) {
                                mTitle.setText(CommonMethods.getString(response.body().getSuccessObject().getJb_info().getTitle()));
                            } else {
                                mTitle.setText("");
                            }

                            if (response.body().getSuccessObject().getJb_info().getAuthor().getName() != null && !response.body().getSuccessObject().getJb_info().getAuthor().getName().isEmpty()) {
                                mAuotherName.setText("By" + CommonMethods.getString(response.body().getSuccessObject().getJb_info().getAuthor().getName()));
                            } else {
                                mAuotherName.setText("");
                            }

                            if (response.body().getSuccessObject().getJb_info().getCategory().getName() != null && !response.body().getSuccessObject().getJb_info().getCategory().getName().isEmpty()) {
                                mCategory.setText(CommonMethods.getString(response.body().getSuccessObject().getJb_info().getCategory().getName()));
                            } else {
                                mCategory.setText("");
                            }
                            if (CommonMethods.getString(response.body().getSuccessObject().getJb_info().getAvg_reading_time()) != null && !CommonMethods.getString(response.body().getSuccessObject().getJb_info().getAvg_reading_time()).isEmpty()) {
                                mAvgReadingTime.setText("Avg reading time : " + CommonMethods.getString(response.body().getSuccessObject().getJb_info().getAvg_reading_time()));
                            } else {
                                mAvgReadingTime.setText("");
                            }
                            if (CommonMethods.getString(response.body().getSuccessObject().getJb_info().getTimes_rented()) != null && !CommonMethods.getString(response.body().getSuccessObject().getJb_info().getTimes_rented()).isEmpty()) {
                                mTotleRents.setText("Times Rented : " + CommonMethods.getString(response.body().getSuccessObject().getJb_info().getTimes_rented()));
                            } else {
                                mTotleRents.setText("");
                            }

                            if (response.body().getSuccessObject().getDescription() != null && !response.body().getSuccessObject().getDescription().isEmpty()) {
                                mDescription.setText(CommonMethods.getString(response.body().getSuccessObject().getDescription()));
                            } else {
                                mDescription.setText("");
                            }


                        } else {

                        }
                    } else {

                    }
                } else {

                }
            }

            @Override
            public void onFailure(Call<BooksDetailsResponse> call, Throwable t) {
                Utils.cancelProgressDialog(BooksDetails.this);
                Toast.makeText(BooksDetails.this, getString(R.string.unable_to_process), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
