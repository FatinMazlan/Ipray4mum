package com.example.fatin.ipray4mum;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Fatin on 21/01/2018.
 */

public class FavouriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fav_activity);

        Snackbar.make(findViewById(R.id.favList_Layout), "No favourite items", Snackbar.LENGTH_SHORT).show();

    }
}
