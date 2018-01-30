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

public class SurahInshiqaqMalay extends AppCompatActivity {
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
        arrayList.add(new VerseActivity("Inshiqaq", "إِذَا ٱلسَّمَآءُ ٱنشَقَّتْ", "Apabila langit terbelah,", R.raw.inshiqaq1));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ", "Serta mematuhi perintah Tuhannya, dan sudah semestinya ia patuh;", R.raw.inshiqaq2));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿﻿وَإِذَا ٱلْأَرْضُ مُدَّتْ", "Dan apabila bumi diratakan,", R.raw.inshiqaq3));
        arrayList.add(new VerseActivity("Inshiqaq", "وَأَلْقَتْ مَا فِيهَا وَتَخَلَّتْ﻿", "Serta mengeluarkan apa yang di dalamnya, dan menjadi kosong,", R.raw.inshiqaq4));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ", "Serta mematuhi perintah Tuhannya, dan sudah semestinya ia patuh; - (Maka pada saat itu tiap-tiap seorang akan mengetahui apa yang telah dilakukannya).", R.raw.inshiqaq5));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿يَٰٓأَيُّهَا ٱلْإِنسَٰنُ إِنَّكَ كَادِحٌ إِلَىٰ رَبِّكَ كَدْحًا فَمُلَٰقِيهِ﻿", "Wahai manusia! Sesungguhnya engkau sentiasa berpenat-lelah (menjalankan keadaan hidupmu) dengan sedaya upayamu hinggalah (semasa engkau) kembali kepada Tuhanmu, kemudian engkau tetap menemui balasan apa yang engkau telah usahakan itu (tercatit semuanya).", R.raw.inshiqaq6));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَأَمَّا مَنْ أُوتِىَ كِتَٰبَهُۥ بِيَمِينِهِۦ", "Kemudian sesiapa yang diberi menerima surat amalnya dengan tangan kanannya, -", R.raw.inshiqaq7));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَسَوْفَ يُحَاسَبُ حِسَابًا يَسِيرًا", "Maka ia akan dihisab dengan cara yang mudah dan ringan,", R.raw.inshiqaq8));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَيَنقَلِبُ إِلَىٰٓ أَهْلِهِۦ مَسْرُورًا", "Dan ia akan pergi kepada keluarganya (yang beriman) dengan sukacita.", R.raw.inshiqaq9));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَأَمَّا مَنْ أُوتِىَ كِتَٰبَهُۥ وَرَآءَ ظَهْرِهِۦ", "Dan sesiapa yang diberi menerima surat amalnya (dengan tangan kiri), dari sebelah belakangnya,", R.raw.inshiqaq10));

        /*ayat 11-20*/
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَسَوْفَ يَدْعُوا۟ ثُبُورًا", "Maka ia akan meraung menyebut-nyebut kebinasaannya,", R.raw.inshiqaq11));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَيَصْلَىٰ سَعِيرًا", "Dan ia akan menderita bakaran neraka yang marak menjulang.", R.raw.inshiqaq12));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿إِنَّهُۥ كَانَ فِىٓ أَهْلِهِۦ مَسْرُورًا", "Sebenarnya ia semasa di dunia dahulu bersukaria dalam kalangan keluarganya (yang juga kufur ingkar)!", R.raw.inshiqaq13));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿إِنَّهُۥ ظَنَّ أَن لَّن يَحُورَ", "Sesungguhnya ia menyangka bahawa ia tidak sekali-kali akan kembali (kepada Kami untuk menerima balasan) !", R.raw.inshiqaq14));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿بَلَىٰٓ إِنَّ رَبَّهُۥ كَانَ بِهِۦ بَصِيرًا", "(Sangkaannya itu tidak betul) bahkan ia tetap kembali! Sesungguhnya Tuhannya sentiasa Melihat dan Mengetahui keadaannya!", R.raw.inshiqaq15));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَلَآ أُقْسِمُ بِٱلشَّفَقِ", "Maka Aku bersumpah, demi mega;", R.raw.inshiqaq16));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَٱلَّيْلِ وَمَا وَسَقَ", "Dan malam serta segala yang dihimpunkannya;", R.raw.inshiqaq17));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَٱلْقَمَرِ إِذَا ٱتَّسَقَ", "Dan bulan apabila (penuh cahayanya) menjadi purnama:", R.raw.inshiqaq18));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿لَتَرْكَبُنَّ طَبَقًا عَن طَبَقٍ", "Sesungguhnya kamu tetap melalui beberapa keadaan yang bertingkat-tingkat baik buruknya, (sebelum kamu menemui Tuhan - menerima kesenangan dan kebahagiaan atau sebaliknya)", R.raw.inshiqaq19));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَمَا لَهُمْ لَا يُؤْمِنُونَ", "Maka apakah alasan bagi mereka bersikap tidak mahu beriman?", R.raw.inshiqaq20));

        /*ayat 21-30*/
        arrayList.add(new VerseActivity("Inshiqaq", "وَإِذَا قُرِئَ عَلَيْهِمُ ٱلْقُرْءَانُ لَا يَسْجُدُونَ ۩", "Dan (apakah pula alasannya) apabila dibacakan Al-Quran kepada mereka, mereka tidak mahu taat dan sujud?", R.raw.inshiqaq21));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿بَلِ ٱلَّذِينَ كَفَرُوا۟ يُكَذِّبُونَ", "(Tidak ada satu alasan pun) bahkan orang-orang yang kafir, semata-mata mendustakannya;", R.raw.inshiqaq22));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿وَٱللَّهُ أَعْلَمُ بِمَا يُوعُونَ", "Sedang Allah mengetahui apa yang mereka rahsiakan dalam hati.", R.raw.inshiqaq23));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿فَبَشِّرْهُم بِعَذَابٍ أَلِيمٍ", "Maka khabarkanlah kepada mereka dengan azab yang tidak terperi sakitnya;", R.raw.inshiqaq24));
        arrayList.add(new VerseActivity("Inshiqaq", "﻿إِلَّا ٱلَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ ٱلصَّٰلِحَٰتِ لَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍۭ", "Tetapi orang-orang yang beriman dan beramal soleh mereka beroleh pahala balasan yang tidak putus-putus.", R.raw.inshiqaq25));

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
                Intent i = new Intent(SurahInshiqaqMalay.this, SurahInshiqaqEnglish.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
