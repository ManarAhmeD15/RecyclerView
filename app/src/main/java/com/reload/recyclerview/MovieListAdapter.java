package com.reload.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MoviesViewHolder> {
ArrayList<Movies>movies;

    public MovieListAdapter(ArrayList<Movies> movies) {

        this.movies=movies;
    }

    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_item,null,false);
        MoviesViewHolder viewHolder=new MoviesViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder holder, int position) {
Movies m=movies.get(position);
holder.iv_image.setImageResource(m.getImg());
holder.tv_name.setText(m.getName());

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class MoviesViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        ImageView iv_image;

        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);

tv_name=itemView.findViewById(R.id.movie_name_tv);
iv_image=itemView.findViewById(R.id.movie_img);


        }
    }
}
