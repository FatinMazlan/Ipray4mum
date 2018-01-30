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

public class SurahInshirahMalay extends AppCompatActivity {
    ArrayList<VerseActivity> arrayList;
    private QuranActivity adapter;
    private ListView verseList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranview);

        verseList = (ListView) findViewById(R.id.verseList);
        arrayList = new ArrayList<>();

        arrayList.add(new VerseActivity("Inshirah", "أَلَمْ نَشْرَحْ لَكَ صَدْرَكَ", "Bukankah Kami telah melapangkan bagimu: dadamu (wahai Muhammad serta mengisinya dengan iman dan hidayah petunjuk) ?", R.raw.inshirah1));
        arrayList.add(new VerseActivity("Inshirah", "﻿وَوَضَعْنَا عَنكَ وِزْرَكَ", "Dan Kami telah meringankan daripadamu: bebanmu (menyiarkan Islam) -", R.raw.inshirah2));
        arrayList.add(new VerseActivity("Inshirah", "﻿ٱلَّذِىٓ أَنقَضَ ظَهْرَكَ", "Yang memberati tanggunganmu, (dengan memberikan berbagai kemudahan dalam melaksanakannya)?", R.raw.inshirah3));
        arrayList.add(new VerseActivity("Inshirah", "﻿وَرَفَعْنَا لَكَ ذِكْرَكَ", "Dan Kami telah meninggikan bagimu: sebutan namamu (dengan mengurniakan pangkat Nabi dan berbagai kemuliaan)?", R.raw.inshirah4));
        arrayList.add(new VerseActivity("Inshirah", "﻿فَإِنَّ مَعَ ٱلْعُسْرِ يُسْرًا", "Oleh itu, maka (tetapkanlah kepercayaanmu) bahawa sesungguhnya tiap-tiap kesukaran disertai kemudahan,", R.raw.inshirah5));
        arrayList.add(new VerseActivity("Inshirah", "﻿إِنَّ مَعَ ٱلْعُسْرِ يُسْرًا", "(Sekali lagi ditegaskan): bahawa sesungguhnya tiap-tiap kesukaran disertai kemudahan.", R.raw.inshirah6));
        arrayList.add(new VerseActivity("Inshirah", "﻿فَإِذَا فَرَغْتَ فَٱنصَبْ", "Kemudian apabila engkau telah selesai (daripada sesuatu amal soleh), maka bersungguh-sungguhlah engkau berusaha (mengerjakan amal soleh yang lain),", R.raw.inshirah7));
        arrayList.add(new VerseActivity("Inshirah", "وَإِلَىٰ رَبِّكَ فَٱرْغَب", "Dan kepada Tuhanmu sahaja hendaklah engkau memohon (apa yang engkau gemar dan ingini).", R.raw.inshirah8));

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
                Intent i = new Intent(SurahInshirahMalay.this, SurahInshirahEnglish.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
