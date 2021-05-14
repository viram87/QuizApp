package com.example.quizapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.quizapp.databinding.ActivityHomePageBinding;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

    ActivityHomePageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomePageBinding.inflate(getLayoutInflater());

            ArrayList<CategoryModel> categories = new ArrayList();
            categories.add(new CategoryModel("" , "Mathematics" , ""));
            categories.add(new CategoryModel("" , "Science" , ""));
            categories.add(new CategoryModel("" , "History" , ""));
            categories.add(new CategoryModel("" , "Language" , ""));

        CategoryAdapter adapter = new CategoryAdapter(this ,categories );
        binding.categoryList.setLayoutManager(new GridLayoutManager(this,2));
        binding.categoryList.setAdapter(adapter);




    }
}