package com.example.fatin.ipray4mum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Fatin on 16/01/2018.
 */

public class Ibrahim extends AppCompatActivity {
    ArrayList<DoaVerse> arrayList2;
    private DoaActivity adapter;
    private ListView verseList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranview);

        verseList = (ListView) findViewById(R.id.verseList);
        arrayList2 = new ArrayList<>();
        arrayList2.add(new DoaVerse("رَبِّ ٱجْعَلْنِى مُقِيمَ ٱلصَّلَوٰةِ وَمِن ذُرِّيَّتِى ۚ رَبَّنَا وَتَقَبَّلْ دُعَآءِ", "O my Lord! make me one who establishes regular Prayer, and also (raise such) among my offspring O our Lord! and accept Thou my Prayer.", "Wahai Tuhanku! Jadikanlah daku orang yang mendirikan sembahyang dan demikianlah juga zuriat keturunanku. Wahai Tuhan kami, perkenankanlah doa permohonanku.", R.raw.ibrahim40));//anak rajin solat dan bertaqwa

        adapter = new DoaActivity(this, R.layout.doaview, arrayList2);
        verseList.setAdapter(adapter);
    }
}