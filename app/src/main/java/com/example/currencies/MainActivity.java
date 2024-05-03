package com.example.currencies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listViews);

        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.russia_flag, R.string.russian, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.south_africa_flag, R.string.south_africa, R.string.south_africaZAR));
        list.add(new DataFlags(R.drawable.singapore_flag, R.string.singapore, R.string.singaporeSGD));
        list.add(new DataFlags(R.drawable.turkey_flag, R.string.turkish, R.string.turkishTRY));
        list.add(new DataFlags(R.drawable.usa_flag, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable._flag, R.string.russian, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.china_flag, R.string.china, R.string.china));

        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}