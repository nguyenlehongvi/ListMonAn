package com.example.applist_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<MonAn> arrayList;
        AdapterMonan adapter;

        listView = findViewById(R.id.listviewMonan);
        arrayList = new ArrayList<>();
        arrayList.add(new MonAn("GÀ CHIÊN NƯỚC MẮM", "ĐƠN GIÁ: 30.000 VNĐ", R.drawable.ga));
        arrayList.add(new MonAn("MÌ XÀO BÒ", "ĐƠN GIÁ: 25.000 VNĐ", R.drawable.mixaobo));

        adapter = new AdapterMonan(MainActivity.this, R.layout.layout_monan, arrayList);

        listView.setAdapter(adapter);

    }
}