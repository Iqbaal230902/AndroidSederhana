package com.dicoding.aplikasisederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFoods;
    private ArrayList<Foods> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rvFoods = findViewById(R.id.rv_foods);
        rvFoods.setHasFixedSize(true);

        list.addAll(FoodsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvFoods.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(list);
        rvFoods.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item1) {
            Intent iAbout = new Intent(MainActivity.this, About.class);
            startActivity(iAbout);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
