package com.septian.andre.clubliga1indonesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Club> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(ClubData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ClubAdapter club = new ClubAdapter(this);
        club.setListClub(list);
        rvCategory.setAdapter(club);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedDetailClub(list.get(position));
            }
        });
    }

    private void showSelectedDetailClub(Club club) {
        Intent moveDetail = new Intent(MainActivity.this, ClubDetail.class);
        moveDetail.putExtra("key", club);
        startActivity(moveDetail);
    }
}
