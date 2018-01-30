package com.example.fatin.ipray4mum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

public class ActivitySurahList extends AppCompatActivity{
    // User Session Manager Class
    UserSessionManager session;

    // Button Logout
    Button btnLogout;

    ListView listView;

    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listsurahview);

        textView = (TextView) findViewById(R.id.txtTrimester);

        listView = (ListView) findViewById(R.id.verseList);
        HashMap<String, String> titleDetail = new HashMap<>();

        // Session class instance
        session = new UserSessionManager(getApplicationContext());

        // get user data from session
        HashMap<String, String> user = session.getUserDetails();

        SimpleDateFormat newFormat = new SimpleDateFormat("MMM d, yyyy");

        try {
            // get email
            String expdate = user.get(UserSessionManager.KEY_DATE);

            Date ed = newFormat.parse(expdate);

            Date today = new Date();

            long diff = ed.getTime() - today.getTime();
            long days = 40 - ((diff / (24 * 60 * 60 * 1000)) / 7);

            if (days >= 0 && days < 13) {
                textView.setText("You're currently in 1st Semester");
                titleDetail.put("Surah Al-Fatihah", "7 verses");
                titleDetail.put("Surah Luqman", "34 verses");
                titleDetail.put("Surah Yaasin", "83 verses");
                titleDetail.put("Surah Al-Inshirah", "8 verses");
                titleDetail.put("Surah Inshiqaq", "25 verses");

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
                            Intent i = new Intent(ActivitySurahList.this, SurahInshirahEnglish.class);
                            startActivity(i);
                        }
                        else if (position == 1){
                            Intent i = new Intent(ActivitySurahList.this, SurahLuqmanEnglish.class);
                            startActivity(i);
                        }
                        else if (position == 2){
                            Intent i= new Intent(ActivitySurahList.this, AlfatihahEnglish.class);
                            startActivity(i);
                        }
                        else if (position == 3){
                            Intent i = new Intent(ActivitySurahList.this, SurahYaasinEnglish.class);
                            startActivity(i);
                        }
                        else if (position == 4){
                            Intent i = new Intent(ActivitySurahList.this, SurahInshiqaqEnglish.class);
                            startActivity(i);
                        }
                    }
                });

            } else if (days > 12 && days < 28) {
                textView.setText("You're currently in 2nd Semester");
                titleDetail.put("Surah Al-Fatihah", "7 verses");
                titleDetail.put("Surah Yusuf", "111 verses");
                titleDetail.put("Surah Inshiqaq", "25 verses");
                titleDetail.put("Surah Yaasin", "83 verses");
                titleDetail.put("Surah Al-Inshirah", "8 verses");

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
                            Intent i = new Intent(ActivitySurahList.this, SurahInshirahEnglish.class);
                            startActivity(i);
                        } else if (position == 1) {
                            Intent i = new Intent(ActivitySurahList.this, SurahYusufEnglish.class);
                            startActivity(i);
                        } else if (position == 2) {
                            Intent i = new Intent(ActivitySurahList.this, AlfatihahEnglish.class);
                            startActivity(i);
                        } else if (position == 3) {
                            Intent i = new Intent(ActivitySurahList.this, SurahYaasinEnglish.class);
                            startActivity(i);
                        } else if (position == 4) {
                            Intent i = new Intent(ActivitySurahList.this, SurahInshiqaqEnglish.class);
                            startActivity(i);
                        }
                    }
                });

            } else if (days > 27 && days < 41) {
                textView.setText("You're currently in 3rd Semester");
                titleDetail.put("Surah Al-Fatihah", "7 verses");
                titleDetail.put("Surah Yaasin", "83 verses");
                titleDetail.put("Surah Inshiqaq", "25 verses");
                titleDetail.put("Surah Al-Inshirah", "8 verses");
                titleDetail.put("Surah Maryam", "98 verses");
                titleDetail.put("Surah Hujurat", "18 verses");
                titleDetail.put("Surah At-Taubah", "129 verses");

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
                            Intent i = new Intent(ActivitySurahList.this, SurahInshirahEnglish.class);
                            startActivity(i);
                        }
                        else if (position == 1){
                            Intent i = new Intent(ActivitySurahList.this, SurahTaubahEnglish.class);
                            startActivity(i);
                        }
                        else if (position == 2){
                            Intent i= new Intent(ActivitySurahList.this, SurahHujuratEnglish.class);
                            startActivity(i);
                        }
                        else if (position == 3){
                            Intent i = new Intent(ActivitySurahList.this, SurahMaryamEnglish.class);
                            startActivity(i);
                        }
                        else if (position == 4){
                            Intent i = new Intent(ActivitySurahList.this, AlfatihahEnglish.class);
                            startActivity(i);
                        }
                        else if (position == 5){
                            Intent i = new Intent(ActivitySurahList.this, SurahYaasinEnglish.class);
                            startActivity(i);
                        }
                        else if (position == 6){
                            Intent i = new Intent(ActivitySurahList.this, SurahInshiqaqEnglish.class);
                            startActivity(i);
                        }
                    }
                });

            } else {
                finish();
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
