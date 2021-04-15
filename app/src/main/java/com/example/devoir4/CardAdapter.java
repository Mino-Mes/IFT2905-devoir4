package com.example.devoir4;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private int []  images;
    private RecyclerViewClickListener listener;

    public CardAdapter(int [] images, RecyclerViewClickListener listener) {
        this.images = images;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_items, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        int image_id = images[position];
        Intent intent;
        holder.movie.setImageResource(image_id);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }


    public interface RecyclerViewClickListener {
        void onClick(View v, int position);
    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView movie;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            movie= itemView.findViewById(R.id.movieCard);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, getAdapterPosition());
        }
    }
}
