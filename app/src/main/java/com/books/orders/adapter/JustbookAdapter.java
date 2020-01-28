package com.books.orders.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.books.orders.activity.BooksDetails;
import com.books.orders.model.response.JustbookResponse;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.books.orders.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class JustbookAdapter extends RecyclerView.Adapter<Justbookholder> {
    private Activity activity;
    private List<JustbookResponse.SuccessObjectBean.ContentBean> successObjectBeans = new ArrayList<>();


    public JustbookAdapter(Activity activity, List<JustbookResponse.SuccessObjectBean.ContentBean> successObjectBeans) {
        this.activity = activity;
        this.successObjectBeans = successObjectBeans;
    }

    @NonNull
    @Override
    public Justbookholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.justbook_row, parent, false);
        Justbookholder appointmentAttachmentViewHolder = new Justbookholder(view);
        return appointmentAttachmentViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Justbookholder holder, int position) {

        if (successObjectBeans.get(position).getImage_url() != null) {
            Glide.with(activity).load(successObjectBeans.get(position).getImage_url())
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .skipMemoryCache(true)
                    .into(holder.icon);

        } else {
            Glide.with(activity).load(R.drawable.defaultprofile)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .skipMemoryCache(true)
                    .into(holder.icon);
        }

        if (successObjectBeans.get(position).getTitle() != null &&
                !successObjectBeans.get(position).getTitle().isEmpty()) {
            holder.mLabName.setText(successObjectBeans.get(position).getTitle());
        } else {
            holder.mLabName.setText("");
        }

        if (successObjectBeans.get(position).getAuthor() != null &&
                !successObjectBeans.get(position).getAuthor().isEmpty()) {
            holder.mCertificate.setText("By " + successObjectBeans.get(position).getAuthor());
        } else {
            holder.mCertificate.setText("");
        }
        holder.mListLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(activity, BooksDetails.class);
                in.putExtra("titleId", successObjectBeans.get(position).getTitle_id());
                activity.startActivity(in);
            }
        });


    }

    @Override
    public int getItemCount() {
        return successObjectBeans.size();
    }
}

class Justbookholder extends RecyclerView.ViewHolder {
    TextView mLabName;
    TextView mCertificate;
    LinearLayout mListLayout;
    ImageView icon;

    public Justbookholder(@NonNull View itemView) {
        super(itemView);
        mLabName = itemView.findViewById(R.id.lab_name);
        mCertificate = itemView.findViewById(R.id.certificate);
        mListLayout = itemView.findViewById(R.id.mainLayout);
        icon = itemView.findViewById(R.id.icon);
    }
}
