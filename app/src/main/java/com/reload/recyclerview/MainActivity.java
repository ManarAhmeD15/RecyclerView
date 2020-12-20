package com.reload.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc=findViewById(R.id.recycler);
        ArrayList<Movies>movies=new ArrayList<>();
        movies.add(new Movies(R.drawable.movie1,"movie 1"));
        movies.add(new Movies(R.drawable.movie2,"movie 2"));
        movies.add(new Movies(R.drawable.movie3,"movie 3"));
        movies.add(new Movies(R.drawable.movie4,"movie 4"));

        MovieListAdapter adapter=new MovieListAdapter(movies);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
        rc.setHasFixedSize(true);
        rc.setLayoutManager(lm);
        rc.setAdapter(adapter);

    }
}