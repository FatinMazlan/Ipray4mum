package com.example.fatin.ipray4mum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Fatin on 13/01/2018.
 */

public class ActivityDoaList extends AppCompatActivity{

    ListView listView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quranview);

        listView = (ListView) findViewById(R.id.verseList);
        HashMap<String, String> titleDetail = new HashMap<>();

        titleDetail.put("Doa anak yang baik", "Ali-Imran:38");
        titleDetail.put("Doa anak rajin solat", "Ibrahim:40");
        titleDetail.put("Doa anak yang soleh", "As-Saffat:100");
        titleDetail.put("Doa anak yang menenangkan hati", "Al-Furqan:74");
        titleDetail.put("Doa anak yang berdisiplin", "An-Nahl:78");
        titleDetail.put("Doa mudah melahirkan anak ", "Al-A'raf:54-55");
        titleDetail.put("Doa anak soleh solehah", "As-Sajadah:7-9");
        titleDetail.put("Ayat Kursi", "Al-Baqarah:255");

        List<HashMap<String, String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.listsurah,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.txtTitle, R.id.txtDetail});
        Iterator it = titleDetail.entrySet().iterator();
        while (it.hasNext())
        {
            HashMap<String, String> resultsMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            listItems.add(resultsMap);
        }

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if (position == 0) {
                            Intent i = new Intent(ActivityDoaList.this, Sajadah.class);
                            startActivity(i);
                        }
                        else if (position == 1){
                            Intent i = new Intent(ActivityDoaList.this, Ibrahim.class);
                            startActivity(i);
                        }
                        else if (position == 2){
                            Intent i= new Intent(ActivityDoaList.this, AlFurqan.class);
                            startActivity(i);
                        }
                        else if (position == 3){
                            Intent i = new Intent(ActivityDoaList.this, Nahl.class);
                            startActivity(i);
                        }
                        else if (position == 4){
                            Intent i = new Intent(ActivityDoaList.this, AyatKursi.class);
                            startActivity(i);
                        }
                        else if (position == 5){
                            Intent i= new Intent(ActivityDoaList.this, Imran.class);
                            startActivity(i);
                        }
                        else if (position == 6){
                            Intent i = new Intent(ActivityDoaList.this, AlAraf.class);
                            startActivity(i);
                        }
                        else if (position == 7){
                            Intent i = new Intent(ActivityDoaList.this, Saffat.class);
                            startActivity(i);
                        }
                    }
                });

            }
}