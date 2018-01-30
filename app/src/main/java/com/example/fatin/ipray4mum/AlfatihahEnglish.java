package com.example.fatin.ipray4mum;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by Fatin on 07/12/2017.
 */

public class AlfatihahEnglish extends AppCompatActivity{

    ArrayList<VerseActivity> arrayList;
    private QuranActivity adapter;
    private ListView verseList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranview);

        verseList = (ListView) findViewById(R.id.verseList);
        arrayList = new ArrayList<>();
        arrayList.add(new VerseActivity("Al-Fatihah", "بِسْمِ ٱللَّهِ ٱلرَّحْمَٰنِ ٱلرَّحِيم", "In the Name of Allah, the Most Beneficent, the Most Merciful.", R.raw.ayat1));
        arrayList.add(new VerseActivity("Al-Fatihah", "ٱلْحَمْدُ لِلَّهِ رَبِّ ٱلْعَٰلَمِينِ", "All the praises and thanks be to Allah, the Lord of the 'Alamin (mankind, jinns and all that exists).", R.raw.ayat2));
        arrayList.add(new VerseActivity("Al-Fatihah", "ٱلرَّحْمَٰنِ ٱلرَّحِيم", "The Most Beneficent, the Most Merciful.", R.raw.ayat3));
        arrayList.add(new VerseActivity("Al-Fatihah", "مَٰلِكِ يَوْمِ ٱلدِّينِ", "The Only Owner (and the Only Ruling Judge) of the Day of Recompense (i.e. the Day of Resurrection).", R.raw.ayat4));
        arrayList.add(new VerseActivity("Al-Fatihah", "ِإِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ", "You (Alone) we worship, and you (Alone) we ask for help (for each and everything).", R.raw.ayat5));
        arrayList.add(new VerseActivity("Al-Fatihah", "ٱهْدِنَا ٱلصِّرَٰطَ ٱلْمُسْتَقِيمَ", "Guide us to the Straight Way.", R.raw.ayat6));
        arrayList.add(new VerseActivity("Al-Fatihah", "صِرَٰطَ ٱلَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ ٱلْمَغْضُوبِ عَلَيْهِمْ وَلَا ٱلضَّآلِّينَ",
                "The Way of those on whom You have bestowed Your Grace , not (the way) of those who earned Your Anger (such as the Jews), nor of those who went astray (such as the Christians).", R.raw.ayat7));

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
                mp = MediaPlayer.create(this, R.raw.alfatihah);
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
                Intent i = new Intent(AlfatihahEnglish.this, AlfatihahMalay.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}