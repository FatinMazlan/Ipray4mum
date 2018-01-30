package com.example.fatin.ipray4mum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Fatin on 16/01/2018.
 */

public class AlFurqan extends AppCompatActivity {
    ArrayList<DoaVerse> arrayList2;
    private DoaActivity adapter;
    private ListView verseList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranview);

        verseList = (ListView) findViewById(R.id.verseList);
        arrayList2 = new ArrayList<>();
        arrayList2.add(new DoaVerse("رَبَّنَا هَبْ لَنَا مِنْ أَزْوَٰجِنَا وَذُرِّيَّٰتِنَا قُرَّةَ أَعْيُنٍ وَٱجْعَلْنَا لِلْمُتَّقِينَ إِمَامًا", "Our Lord! Grant unto us wives and offspring who will be the comfort of our eyes, and give us (the grace) to lead the righteous.", "Wahai Tuhan kami, berilah kami beroleh dari isteri-isteri dan zuriat keturunan kami: perkara-perkara yang menyukakan hati melihatnya, dan jadikanlah kami imam ikutan bagi orang-orang yang (mahu) bertaqwa.", R.raw.furqan74));//anak menenangkan hati

        adapter = new DoaActivity(this, R.layout.doaview, arrayList2);
        verseList.setAdapter(adapter);
    }
}