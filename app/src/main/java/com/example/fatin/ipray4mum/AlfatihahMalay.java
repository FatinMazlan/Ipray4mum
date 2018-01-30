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
 * Created by Fatin on 07/12/2017.
 */

public class AlfatihahMalay extends AppCompatActivity{

    ArrayList<VerseActivity> arrayList;
    private QuranActivity adapter;
    private ListView verseList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranview);

        verseList = (ListView) findViewById(R.id.verseList);
        arrayList = new ArrayList<>();
        arrayList.add(new VerseActivity("Al-Fatihah", "بِسْمِ ٱللَّهِ ٱلرَّحْمَٰنِ ٱلرَّحِيم", "Dengan nama Allah, Yang Maha Pemurah, lagi Maha Mengasihani.", R.raw.ayat1));
        arrayList.add(new VerseActivity("Al-Fatihah", "ٱلْحَمْدُ لِلَّهِ رَبِّ ٱلْعَٰلَمِينِ", "Segala puji tertentu bagi Allah, Tuhan yang memelihara dan mentadbirkan sekalian alam.", R.raw.ayat2));
        arrayList.add(new VerseActivity("Al-Fatihah", "ٱلرَّحْمَٰنِ ٱلرَّحِيم", "Yang Maha Pemurah, lagi Maha Mengasihani.", R.raw.ayat3));
        arrayList.add(new VerseActivity("Al-Fatihah", "مَٰلِكِ يَوْمِ ٱلدِّينِ", "Yang Menguasai pemerintahan hari Pembalasan (hari Akhirat).", R.raw.ayat4));
        arrayList.add(new VerseActivity("Al-Fatihah", "ِإِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ", "Engkaulah sahaja (Ya Allah) Yang Kami sembah, dan kepada Engkaulah sahaja kami memohon pertolongan.", R.raw.ayat5));
        arrayList.add(new VerseActivity("Al-Fatihah", "ٱهْدِنَا ٱلصِّرَٰطَ ٱلْمُسْتَقِيمَ", "Tunjukilah kami jalan yang lurus.", R.raw.ayat6));
        arrayList.add(new VerseActivity("Al-Fatihah", "صِرَٰطَ ٱلَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ ٱلْمَغْضُوبِ عَلَيْهِمْ وَلَا ٱلضَّآلِّينَ",
                "Iaitu jalan orang-orang yang Engkau telah kurniakan nikmat kepada mereka, bukan (jalan) orang-orang yang Engkau telah muraki, dan bukan pula (jalan) orang-orang yang sesat.", R.raw.ayat7));

        adapter = new QuranActivity(this, R.layout.verseview, arrayList);
        verseList.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu; this adds items to the action bar if it is
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    private MediaPlayer mp = null;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_play_all:
                mp = MediaPlayer.create(this, R.raw.alfatihah);
                mp.start();
                break;
            case R.id.action_stopmenu:
                if (mp != null)
                    mp.stop();
                break;
            case R.id.action_infomenu:
                break;
            case R.id.action_eng:
                if(mp != null)
                    mp.stop();
                Intent i = new Intent(AlfatihahMalay.this, AlfatihahEnglish.class);
                startActivity(i);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}