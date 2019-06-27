package com.septian.andre.clubliga1indonesia;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Club> listClub;

    ClubAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<Club> getListClub() {
        return listClub;
    }

    void setListClub(ArrayList<Club> listClub) {
        this.listClub = listClub;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_club, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        final Club club = getListClub().get(position);

        Glide.with(context)
                .load(club.getLogo())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgLogo);

        holder.tvClubName.setText(club.getClubName());
        holder.tvClubNameDetail.setText(club.getClubNameDetail());
        holder.club = club;

        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new
                CustomOnItemClickListener.OnItemClickCallback() {
                    @Override
                    public void onItemClicked(View view, int position) {
                        Toast.makeText(context, "Share " + getListClub().get(position).getClubName(), Toast.LENGTH_SHORT).show();
                    }
                }));
    }

    @Override
    public int getItemCount() {
        return getListClub().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgLogo;
        TextView tvClubName, tvClubNameDetail;
        Button btnDetail, btnShare;
        Club club;

        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.img_item_logo);
            tvClubName = itemView.findViewById(R.id.tv_club_name);
            tvClubNameDetail = itemView.findViewById(R.id.tv_club_name_detail);
            btnDetail = itemView.findViewById(R.id.btn_detail);
            btnShare = itemView.findViewById(R.id.btn_share);

            btnDetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent clubDetail = new Intent(context, ClubDetail.class);
            clubDetail.putExtra("key", club);
            context.startActivity(clubDetail);
        }
    }
}
