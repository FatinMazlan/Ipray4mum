package com.example.fatin.ipray4mum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Fatin on 16/01/2018.
 */

public class AlAraf extends AppCompatActivity {
    ArrayList<DoaVerse> arrayList2;
    private DoaActivity adapter;
    private ListView verseList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranview);

        verseList = (ListView) findViewById(R.id.verseList);
        arrayList2 = new ArrayList<>();
        arrayList2.add(new DoaVerse("إِنَّ رَبَّكُمُ ٱللَّهُ ٱلَّذِى خَلَقَ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضَ فِى سِتَّةِ أَيَّامٍ ثُمَّ ٱسْتَوَىٰ عَلَى ٱلْعَرْشِ يُغْشِى ٱلَّيْلَ ٱلنَّهَارَ يَطْلُبُهُۥ حَثِيثًا وَٱلشَّمْسَ وَٱلْقَمَرَ وَٱلنُّجُومَ مُسَخَّرَٰتٍۭ بِأَمْرِهِۦٓ ۗ أَلَا لَهُ ٱلْخَلْقُ وَٱلْأَمْرُ ۗ تَبَارَكَ ٱللَّهُ رَبُّ ٱلْعَٰلَمِينَ", "Your Guardian-Lord is Allah, Who created the heavens and the earth in six days, and is firmly established on the throne (of authority): He draweth the night as a veil o'er the day, each seeking the other in rapid succession: He created the sun, the moon, and the stars, (all) governed by laws under His command. Is it not His to create and to govern? Blessed be Allah, the Cherisher and Sustainer of the worlds!", "Sesungguhnya Tuhan kamu ialah Allah yang menciptakan langit dan bumi dalam enam masa lalu Ia bersemayam di atas Arasy; Ia melindungi malam dengan siang yang mengiringinya dengan deras (silih berganti) dan (Ia pula yang menciptakan) matahari dan bulan serta bintang-bintang, (semuanya) tunduk kepada perintahNya. Ingatlah, kepada Allah jualah tertentu urusan menciptakan (sekalian makhluk) dan urusan pemerintahan. Maha Suci Allah yang mencipta dan mentadbirkan sekalian alam.", R.raw.araf54));
        arrayList2.add(new DoaVerse("﻿ٱدْعُوا۟ رَبَّكُمْ تَضَرُّعًا وَخُفْيَةً ۚ إِنَّهُۥ لَا يُحِبُّ ٱلْمُعْتَدِينَ", "Call on your Lord with humility and in private: for Allah loveth not those who trespass beyond bounds.", "Berdoalah kepada Tuhan kamu dengan merendah diri dan (dengan suara) perlahan-lahan. Sesungguhnya Allah tidak suka kepada orang-orang yang melampaui batas.", R.raw.araf55));


        adapter = new DoaActivity(this, R.layout.doaview, arrayList2);
        verseList.setAdapter(adapter);
    }
}