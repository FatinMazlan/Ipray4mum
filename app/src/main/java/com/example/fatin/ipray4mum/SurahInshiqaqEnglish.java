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

public class SurahInshiqaqEnglish extends AppCompatActivity{
    ArrayList<VerseActivity> arrayList;
    private QuranActivity adapter;
    private ListView verseList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranview);

        verseList = (ListView) findViewById(R.id.verseList);
        arrayList = new ArrayList<>();

        /*ayat 1-10*/
        arrayList.add(new VerseActivity("Inshiqaq", "إِذَا ٱلسَّمَآءُ ٱنشَقَّتْ", "When the sky is rent asunder,", R.raw.inshiqaq1));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ", "And hearkens to (the Command of) its Lord, and it must needs (do so);-", R.raw.inshiqaq2));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿﻿وَإِذَا ٱلْأَرْضُ مُدَّتْ", "And when the earth is flattened out,", R.raw.inshiqaq3));
        arrayList.add(new VerseActivity("Inshiqaq", "وَأَلْقَتْ مَا فِيهَا وَتَخَلَّتْ﻿", "And casts forth what is within it and becomes (clean) empty,", R.raw.inshiqaq4));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ", "And hearkens to (the Command of) its Lord,- and it must needs (do so);- (then will come Home the full reality).", R.raw.inshiqaq5));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿يَٰٓأَيُّهَا ٱلْإِنسَٰنُ إِنَّكَ كَادِحٌ إِلَىٰ رَبِّكَ كَدْحًا فَمُلَٰقِيهِ﻿", "O thou man! Verily thou art ever toiling on towards thy Lord- painfully toiling,- but thou shalt meet Him.", R.raw.inshiqaq6));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَأَمَّا مَنْ أُوتِىَ كِتَٰبَهُۥ بِيَمِينِهِۦ", "Then he who is given his Record in his right hand,", R.raw.inshiqaq7));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَسَوْفَ يُحَاسَبُ حِسَابًا يَسِيرًا", "Soon will his account be taken by an easy reckoning,", R.raw.inshiqaq8));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَيَنقَلِبُ إِلَىٰٓ أَهْلِهِۦ مَسْرُورًا", "And he will turn to his people, rejoicing!", R.raw.inshiqaq9));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَأَمَّا مَنْ أُوتِىَ كِتَٰبَهُۥ وَرَآءَ ظَهْرِهِۦ", "But he who is given his Record behind his back,-", R.raw.inshiqaq10));

        /*ayat 11-20*/
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَسَوْفَ يَدْعُوا۟ ثُبُورًا", "Soon will he cry for perdition,", R.raw.inshiqaq11));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَيَصْلَىٰ سَعِيرًا", "And he will enter a Blazing Fire.", R.raw.inshiqaq12));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿إِنَّهُۥ كَانَ فِىٓ أَهْلِهِۦ مَسْرُورًا", "Truly, did he go about among his people, rejoicing!", R.raw.inshiqaq13));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿إِنَّهُۥ ظَنَّ أَن لَّن يَحُورَ", "Truly, did he think that he would not have to return (to Us)!", R.raw.inshiqaq14));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿بَلَىٰٓ إِنَّ رَبَّهُۥ كَانَ بِهِۦ بَصِيرًا", "Nay, nay! for his Lord was (ever) watchful of him!", R.raw.inshiqaq15));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَلَآ أُقْسِمُ بِٱلشَّفَقِ", "So I do call to witness the ruddy glow of Sunset;", R.raw.inshiqaq16));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَٱلَّيْلِ وَمَا وَسَقَ", "The Night and its Homing;", R.raw.inshiqaq17));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَٱلْقَمَرِ إِذَا ٱتَّسَقَ", "And the Moon in her fullness:", R.raw.inshiqaq18));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿لَتَرْكَبُنَّ طَبَقًا عَن طَبَقٍ", "Ye shall surely travel from stage to stage.", R.raw.inshiqaq19));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَمَا لَهُمْ لَا يُؤْمِنُونَ", "What then is the matter with them, that they believe not?-", R.raw.inshiqaq20));

        /*ayat 21-30*/
        arrayList.add(new VerseActivity("Inshiqaq", "وَإِذَا قُرِئَ عَلَيْهِمُ ٱلْقُرْءَانُ لَا يَسْجُدُونَ ۩", "And when the Qur'an is read to them, they fall not prostrate,", R.raw.inshiqaq21));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿بَلِ ٱلَّذِينَ كَفَرُوا۟ يُكَذِّبُونَ", "But on the contrary the Unbelievers reject (it).", R.raw.inshiqaq22));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَٱللَّهُ أَعْلَمُ بِمَا يُوعُونَ", "But Allah has full knowledge of what they secrete (in their breasts)", R.raw.inshiqaq23));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَبَشِّرْهُم بِعَذَابٍ أَلِيمٍ", "So announce to them a Penalty Grievous,", R.raw.inshiqaq24));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿إِلَّا ٱلَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ ٱلصَّٰلِحَٰتِ لَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍۭ", "Except to those who believe and work righteous deeds: For them is a Reward that will never fail.", R.raw.inshiqaq25));

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
                mp = MediaPlayer.create(this, R.raw.inshiqaqfull);
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
                Intent i = new Intent(SurahInshiqaqEnglish.this, SurahInshiqaqMalay.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}