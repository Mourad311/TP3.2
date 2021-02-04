package com.example.menu;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;


public class MainActivity extends AppCompatActivity {

    private LinkedList<Recipe> recipes;
    private RecyclerView rcView;
    private RecipeAdapter adapter;
    public static final String EXTRA_REPLY = "com.example.menu.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.d("Question1","You don't need a layout manager with a RecyclerView to handle the hierarchy and layout of View elements");
        Log.d("Question2","RecyclerView.Adapter");
        Log.d("Question3","RecyclerView.ViewHolder");

        recipes = DataProvider.getRecipes();

        rcView = findViewById(R.id.recyclerview);

        adapter = new RecipeAdapter(this, recipes);

        rcView.setAdapter(adapter);

        rcView.setLayoutManager(new LinearLayoutManager(this));
    }




}
