package com.example.madprojectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends AppCompatActivity {

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<Adapter> userList;
    Adapter adapter;
    private List<RowsTable> itemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);

        // Initialize RecyclerView and its LayoutManager
        mrecyclerView = findViewById(R.id.RecyclerView);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the list of items to be displayed in RecyclerView
        itemList = new ArrayList<>();
        itemList.add(new RowsTable(R.id.imageVectoryes, R.id.btnGoogle, R.id.txtSrUXDesigner, R.id.txtGoogleOne, R.id.imageLocation, R.id.txtNewYork,
                R.id.imageArrowdown, R.id.txtDuration, R.id.txtFulltime, R.id.imageClock, R.id.txtDescription, R.id.imageClockOne,
                R.id.txtDurationOne, R.id.txtPrice, R.id.txtView, R.id.imageUpload));
        itemList.add(new RowsTable(R.id.imageVectoryes1, R.id.btnGoogle3, R.id.txtSrUXDesigner3, R.id.txtGoogleOne2, R.id.imageLocation2,
                R.id.txtNewYork2, R.id.imageArrowdown2, R.id.txtDuration2, R.id.txtFulltime1, R.id.imageClock1, R.id.txtDescription1,
                R.id.imageClockOne1, R.id.txtDurationOne1, R.id.txtPrice1, R.id.txtView2, R.id.imageUpload1));
        itemList.add(new RowsTable(R.id.imageVectoryes4, R.id.btnGoogle4, R.id.txtSrUXDesigner4, R.id.txtGoogleOne4, R.id.imageLocation4,
                R.id.txtNewYork4, R.id.imageArrowdown4, R.id.txtDuration4, R.id.txtFulltime4, R.id.imageClock4, R.id.txtDescription4,
                R.id.imageClockOne4, R.id.txtDurationOne4, R.id.txtPrice4, R.id.txtView6, R.id.imageUpload4));

        // Initialize the adapter and set it to RecyclerView
        adapter = new Adapter(this, itemList);
        mrecyclerView.setAdapter(adapter);

    }

}


