package com.example.currencies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listViews);

        ArrayList<DataFlags> list = new ArrayList<>();

        list.add(new DataFlags(R.drawable.brazil_flag, R.string.brazil, R.string.brazilBRL));
        list.add(new DataFlags(R.drawable.china_flag, R.string.china, R.string.chinaCNY));
        list.add(new DataFlags(R.drawable.japan_flag, R.string.japan, R.string.japanJPY));
        list.add(new DataFlags(R.drawable.russia_flag, R.string.russian, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.singapore_flag, R.string.singapore, R.string.singaporeSGD));
        list.add(new DataFlags(R.drawable.south_africa_flag, R.string.south_africa, R.string.south_africaZAR));
        list.add(new DataFlags(R.drawable.turkey_flag, R.string.turkish, R.string.turkishTRY));

        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);
    }
}