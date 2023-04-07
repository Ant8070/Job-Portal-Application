package com.example.madprojectfinal;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<RowsTable> mData;
    private Context context;

    public Adapter(MainPage mainPage, List<RowsTable> data) {
        mData = data;
        context = mainPage;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rows_table, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.txtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Google.class);
                context.startActivity(intent);
            }

        }
        );
        holder.txtview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Airbnb.class);
                context.startActivity(intent);}
            });
        holder.txtview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Spotify.class);
                context.startActivity(intent);}
        });
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageVectoryes;
        public ImageView btnGoogle;
        public TextView txtSrUXDesigner;
        public TextView txtGoogleOne;
        public ImageView img_location;
        public TextView txtNewYork;
        public ImageView imageArrowdown;
        public TextView txtDuration;
        public TextView txtFulltime;
        public ImageView imageClock;
        public TextView txtDescription;
        public ImageView imageClockOne;
        public TextView txtDurationOne;
        public TextView txtPrice;
        public Button txtview;
        public ImageView imageUpload;
        public ImageView imageVectoryes2;
        public ImageView btnGoogle2;
        public TextView txtSrUXDesigner2;
        public TextView txtGoogleOne2;
        public ImageView img_location2;
        public TextView txtNewYork2;
        public ImageView imageArrowdown2;
        public TextView txtDuration2;
        public TextView txtFulltime2;
        public ImageView imageClock2;
        public TextView txtDescription2;
        public ImageView imageClockOne2;
        public TextView txtDurationOne2;
        public TextView txtPrice2;
        public Button txtview2;
        public ImageView imageUpload2;
        public ImageView imageVectoryes3;
        public ImageView btnGoogle3;
        public TextView txtSrUXDesigner3;
        public TextView txtGoogleOne3;
        public ImageView img_location3;
        public TextView txtNewYork3;
        public ImageView imageArrowdown3;
        public TextView txtDuration3;
        public TextView txtFulltime3;
        public ImageView imageClock3;
        public TextView txtDescription3;
        public ImageView imageClockOne3;
        public TextView txtDurationOne3;
        public TextView txtPrice3;
        public Button txtview3;
        public ImageView imageUpload3;

        public ViewHolder(View itemView) {
            super(itemView);

            imageVectoryes = itemView.findViewById(R.id.imageVectoryes);
            btnGoogle = itemView.findViewById(R.id.btnGoogle);
            txtSrUXDesigner = itemView.findViewById(R.id.txtSrUXDesigner);
            txtGoogleOne = itemView.findViewById(R.id.txtGoogleOne);
            img_location = itemView.findViewById(R.id.imageLocation);
            txtNewYork = itemView.findViewById(R.id.txtNewYork);
            imageArrowdown = itemView.findViewById(R.id.imageArrowdown);
            txtDuration = itemView.findViewById(R.id.txtDuration);
            txtFulltime = itemView.findViewById(R.id.txtFulltime);
            imageClock = itemView.findViewById(R.id.imageClock);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            imageClockOne = itemView.findViewById(R.id.imageClockOne);
            txtDurationOne = itemView.findViewById(R.id.txtDurationOne);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtview = itemView.findViewById(R.id.txtView);
            imageUpload = itemView.findViewById(R.id.imageUpload);

            imageVectoryes2 = itemView.findViewById(R.id.imageVectoryes1);
            btnGoogle2 = itemView.findViewById(R.id.btnGoogle3);
            txtSrUXDesigner2 = itemView.findViewById(R.id.txtSrUXDesigner3);
            txtGoogleOne2 = itemView.findViewById(R.id.txtGoogleOne2);
            img_location2 = itemView.findViewById(R.id.imageLocation2);
            txtNewYork2 = itemView.findViewById(R.id.txtNewYork2);
            imageArrowdown2 = itemView.findViewById(R.id.imageArrowdown2);
            txtDuration2 = itemView.findViewById(R.id.txtDuration2);
            txtFulltime2 = itemView.findViewById(R.id.txtFulltime2);
            imageClock2 = itemView.findViewById(R.id.imageClock2);
            txtDescription2 = itemView.findViewById(R.id.txtDescription2);
            imageClockOne2 = itemView.findViewById(R.id.imageClockOne2);
            txtDurationOne2 = itemView.findViewById(R.id.txtDurationOne1);
            txtPrice2 = itemView.findViewById(R.id.txtPrice2);
            txtview2 = itemView.findViewById(R.id.txtView2);
            imageUpload2 = itemView.findViewById(R.id.imageUpload1);

            imageVectoryes3 = itemView.findViewById(R.id.imageVectoryes4);
            btnGoogle3 = itemView.findViewById(R.id.btnGoogle4);
            txtSrUXDesigner3 = itemView.findViewById(R.id.txtSrUXDesigner4);
            txtGoogleOne3 = itemView.findViewById(R.id.txtGoogleOne4);
            img_location3 = itemView.findViewById(R.id.imageLocation4);
            txtNewYork3 = itemView.findViewById(R.id.txtNewYork4);
            imageArrowdown3 = itemView.findViewById(R.id.imageArrowdown4);
            txtDuration3 = itemView.findViewById(R.id.txtDuration4);
            txtFulltime3 = itemView.findViewById(R.id.txtFulltime4);
            imageClock3 = itemView.findViewById(R.id.imageClock4);
            txtDescription3 = itemView.findViewById(R.id.txtDescription4);
            imageClockOne3 = itemView.findViewById(R.id.imageClockOne4);
            txtDurationOne3 = itemView.findViewById(R.id.txtDurationOne4);
            txtPrice3 = itemView.findViewById(R.id.txtPrice4);
            txtview3 = itemView.findViewById(R.id.txtView6);
            imageUpload3 = itemView.findViewById(R.id.imageUpload4);

        }


    }
}
