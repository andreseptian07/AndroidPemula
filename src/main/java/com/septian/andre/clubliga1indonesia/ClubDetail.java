package com.septian.andre.clubliga1indonesia;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.Objects;

public class ClubDetail extends AppCompatActivity {
    TextView clubName, clubNameDetail, nickname, born, stadium, coach, supporters;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_detail);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        Club club = getIntent().getParcelableExtra("key");

        logo = findViewById(R.id.img_item_logo);
        clubName = findViewById(R.id.tv_club_name);
        clubNameDetail = findViewById(R.id.tv_club_name_detail);
        nickname = findViewById(R.id.tv_nickname);
        born = findViewById(R.id.tv_born);
        stadium = findViewById(R.id.tv_stadium);
        coach = findViewById(R.id.tv_coach);
        supporters = findViewById(R.id.tv_supporters);

        Glide.with(this)
                .load(club.getLogo())
                .apply(new RequestOptions().override(750, 750))
                .into(logo);

        clubName.setText(club.getClubName());
        clubNameDetail.setText(club.getClubNameDetail());
        nickname.setText(club.getNickname());
        born.setText(club.getBorn());
        stadium.setText(club.getStadium());
        coach.setText(club.getCoach());
        supporters.setText(club.getSupporters());

        Log.i("logo", club.getLogo());
        Log.i("club", club.getClubNameDetail());

        ActionBar menu = getSupportActionBar();
        menu.setDisplayHomeAsUpEnabled(true);
        menu.setDisplayShowHomeEnabled(true);
    }
}
