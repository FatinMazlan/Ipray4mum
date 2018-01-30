package com.example.fatin.ipray4mum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Fatin on 16/01/2018.
 */

public class Sajadah extends AppCompatActivity {
    ArrayList<DoaVerse> arrayList2;
    private DoaActivity adapter;
    private ListView verseList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranview);

        verseList = (ListView) findViewById(R.id.verseList);
        arrayList2 = new ArrayList<>();
        arrayList2.add(new DoaVerse("ٱلَّذِىٓ أَحْسَنَ كُلَّ شَىْءٍ خَلَقَهُۥ ۖ وَبَدَأَ خَلْقَ ٱلْإِنسَٰنِ مِن طِينٍ", "He Who has made everything which He has created most good: He began the creation of man with (nothing more than) clay,", "Yang menciptakan tiap-tiap sesuatu dengan sebaik-baiknya, dan dimulakanNya kejadian manusia berasal dari tanah;", R.raw.sajadah7));
        arrayList2.add(new DoaVerse("﻿ثُمَّ جَعَلَ نَسْلَهُۥ مِن سُلَٰلَةٍ مِّن مَّآءٍ مَّهِينٍ", "And made his progeny from a quintessence of the nature of a fluid despised:", "Kemudian Ia menjadikan keturunan manusia itu dari sejenis pati, iaitu dari air (benih) yang sedikit dipandang orang;", R.raw.sajadah8));
        arrayList2.add(new DoaVerse("ثُمَّ سَوَّىٰهُ وَنَفَخَ فِيهِ مِن رُّوحِهِۦ ۖ وَجَعَلَ لَكُمُ ٱلسَّمْعَ وَٱلْأَبْصَٰرَ وَٱلْأَفْـِٔدَةَ ۚ قَلِيلًا مَّا تَشْكُرُونَ", "But He fashioned him in due proportion, and breathed into him something of His spirit. And He gave you (the faculties of) hearing and sight and feeling (and understanding): little thanks do ye give!", "Kemudian Ia menyempurnakan kejadiannya, serta meniupkan padanya: roh ciptaanNya. Dan Ia mengurniakan kepada kamu pendengaran dan penglihatan serta hati (akal fikiran), (supaya kamu bersyukur, tetapi) amatlah sedikit kamu bersyukur.", R.raw.sajadah9));//anak soleh/solehah

        adapter = new DoaActivity(this, R.layout.doaview, arrayList2);
        verseList.setAdapter(adapter);
    }
}