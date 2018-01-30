package com.example.fatin.ipray4mum;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Fatin on 16/01/2018.
 */

public class SurahInshirahEnglish extends AppCompatActivity{
    ArrayList<VerseActivity> arrayList;
    private QuranActivity adapter;
    private ListView verseList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranview);

        verseList = (ListView) findViewById(R.id.verseList);
        arrayList = new ArrayList<>();

        arrayList.add(new VerseActivity("Inshirah", "أَلَمْ نَشْرَحْ لَكَ صَدْرَكَ", "Have We not expanded thee thy breast?-", R.raw.inshirah1));
        arrayList.add(new VerseActivity("Inshirah", "﻿وَوَضَعْنَا عَنكَ وِزْرَكَ", "And removed from thee thy burden", R.raw.inshirah2));
        arrayList.add(new VerseActivity("Inshirah", "﻿ٱلَّذِىٓ أَنقَضَ ظَهْرَكَ", "The which did gall thy back?-", R.raw.inshirah3));
        arrayList.add(new VerseActivity("Inshirah", "﻿وَرَفَعْنَا لَكَ ذِكْرَكَ", "And raised high the esteem (in which) thou (art held)?", R.raw.inshirah4));
        arrayList.add(new VerseActivity("Inshirah", "﻿فَإِنَّ مَعَ ٱلْعُسْرِ يُسْرًا", "So, verily, with every difficulty, there is relief:", R.raw.inshirah5));
        arrayList.add(new VerseActivity("Inshirah", "﻿إِنَّ مَعَ ٱلْعُسْرِ يُسْرًا", "Verily, with every difficulty there is relief.", R.raw.inshirah6));
        arrayList.add(new VerseActivity("Inshirah", "﻿فَإِذَا فَرَغْتَ فَٱنصَبْ", "Therefore, when thou art free (from thine immediate task), still labour hard,", R.raw.inshirah7));
        arrayList.add(new VerseActivity("Inshirah", "وَإِلَىٰ رَبِّكَ فَٱرْغَب", "And to thy Lord turn (all) thy attention.", R.raw.inshirah8));

        adapter = new QuranActivity(this, R.layout.verseview, arrayList);
        verseList.setAdapter(adapter);
    }

    Menu menu;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private MediaPlayer mp = null;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_playall:
                mp = MediaPlayer.create(this, R.raw.inshirahfull);
                mp.start();
                break;
            case R.id.action_stop:
                if(mp != null)
                    mp.stop();;
                break;
            case R.id.action_info:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                break;
            case R.id.action_malay:
                if(mp != null)
                    mp.stop();
                Intent i = new Intent(SurahInshirahEnglish.this, SurahInshirahMalay.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}