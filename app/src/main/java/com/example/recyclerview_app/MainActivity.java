package com.example.recyclerview_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<recycler_items> items= new ArrayList<recycler_items>();
        items.add(new recycler_items("john wick","john@gmail.com",R.drawable.imag1));
        items.add(new recycler_items("Blood spill","blood@gmail.com",R.drawable.img4));
        items.add(new recycler_items("Dirty","john@gmail.com",R.drawable.imag1));
        items.add(new recycler_items("Bossy","Bossy@gmail.com",R.drawable.img3));
        items.add(new recycler_items("john wick","john@gmail.com",R.drawable.imag1));
        items.add(new recycler_items("Blood spill","blood@gmail.com",R.drawable.img4));
        items.add(new recycler_items("Dirty","john@gmail.com",R.drawable.imag1));
        items.add(new recycler_items("Bossy","Bossy@gmail.com",R.drawable.img3));
        items.add(new recycler_items("Blood spill","blood@gmail.com",R.drawable.img4));
        items.add(new recycler_items("Dirty","john@gmail.com",R.drawable.imag1));
        items.add(new recycler_items("Bossy","Bossy@gmail.com",R.drawable.img3));
        items.add(new recycler_items("john wick","john@gmail.com",R.drawable.imag1));
        items.add(new recycler_items("Blood spill","blood@gmail.com",R.drawable.img4));

        RecyclerView recyclerView = findViewById(R.id.recyclerView_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}