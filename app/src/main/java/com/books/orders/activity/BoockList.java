package com.books.orders.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.widget.Toast;

import com.books.orders.commonClass.CommonMethods;
import com.books.orders.commonClass.JsonInterfaceClass;
import com.books.orders.commonClass.Utils;
import com.books.orders.model.response.JustbookResponse;
import com.books.orders.R;
import com.books.orders.adapter.JustbookAdapter;

public class BoockList extends AppCompatActivity {
    RecyclerView recyclerView;
    JustbookAdapter justbookAdapter;
    private JsonInterfaceClass interfaceClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        getData();


    }

    private void getData() {
        interfaceClass = CommonMethods.getRetrofit(BoockList.this).create(JsonInterfaceClass.class);
        Utils.displayProgressDialog(this, getString(R.string.processing_request), false);
        Call<JustbookResponse> justbookResponseCall = interfaceClass.justbook();
        justbookResponseCall.enqueue(new Callback<JustbookResponse>() {
            @Override
            public void onResponse(Call<JustbookResponse> call, Response<JustbookResponse> response) {
                Utils.cancelProgressDialog(BoockList.this);
                if (response.isSuccess()) {
                    if (response.body() != null && !response.body().toString().isEmpty()) {
                        if (response.body().getSuccessObject() != null && !response.body().getSuccessObject().toString().isEmpty()) {
                            justbookAdapter = new JustbookAdapter(BoockList.this, response.body().getSuccessObject().getContent());
                            recyclerView.setAdapter(justbookAdapter);
                        }
                    } else {

                    }

                } else {

                }
            }
            @Override
            public void onFailure(Call<JustbookResponse> call, Throwable t) {
                Utils.cancelProgressDialog(BoockList.this);
                Toast.makeText(BoockList.this, getString(R.string.unable_to_process), Toast.LENGTH_SHORT).show();

            }
        });


    }
}
