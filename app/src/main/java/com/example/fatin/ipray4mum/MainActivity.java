package com.example.fatin.ipray4mum;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity{

    // User Session Manager Class
    UserSessionManager session;

    // Button Logout
    Button btnLogout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Session class instance
        session = new UserSessionManager(getApplicationContext());

        TextView txtName = (TextView) findViewById(R.id.txtName);
        TextView txtDate = (TextView) findViewById(R.id.txtDate);

        // Check user login
        // If User is not logged in , This will redirect user to LoginActivity.
        if(session.checkLogin())
            finish();

        // get user data from session
        HashMap<String, String> user = session.getUserDetails();

        // get name
        String name = user.get(UserSessionManager.KEY_NAME);

        SimpleDateFormat newFormat = new SimpleDateFormat("MMM d, yyyy");

        try{
            // get email
            String expdate = user.get(UserSessionManager.KEY_DATE);
            txtDate.setText(Html.fromHtml("<b>" + expdate + "</b>"));

            Date ed = newFormat.parse(expdate);

            Date today = new Date();

            long diff = ed.getTime() - today.getTime();
            long days = 40 - ((diff / (24 * 60 * 60 * 1000)) / 7);

            ((TextView) findViewById(R.id.txtCurrentWeek)).setText(Html.fromHtml("<b>" + Long.toString(days) + "th Week<b>"));

            if (days == 0 && days < 13)
            {
                ((TextView) findViewById(R.id.txtCurrentTri)).setText(Html.fromHtml("<b>First Trimester<b>"));
            }
            else if (days > 12 && days < 28)
            {
                ((TextView) findViewById(R.id.txtCurrentTri)).setText(Html.fromHtml("<b>Second Trimester<b>"));
            }
            else if (days > 27 && days < 41)
            {
                ((TextView) findViewById(R.id.txtCurrentTri)).setText(Html.fromHtml("<b>Third Trimester<b>"));
            }
            else
            {
                session.logoutUser();
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //get intent data
        Intent i2 = getIntent();

        Button quranButton = (Button) findViewById(R.id.quranBtn);
        quranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, ActivitySurahList.class);
                startActivity(i2);
            }
        });

        Button doaButton = (Button) findViewById(R.id.doaBtn);
        doaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, ActivityDoaList.class);
                startActivity(i2);
            }
        });

        Button favouriteButton = (Button) findViewById(R.id.favBtn);
        favouriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, FavouriteActivity.class);
                startActivity(i2);
            }
        });

        Button achievementButton = (Button) findViewById(R.id.logBtn);
        achievementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, AchievementActivity.class);
                startActivity(i2);
            }
        });

        Button reminderButton = (Button) findViewById(R.id.reminderBtn);
        reminderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, AlarmMainActivity.class);
                startActivity(i2);
            }
        });


        Button userButton = (Button) findViewById(R.id.userBtn);
        userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, UserProfile.class);
                startActivity(i2);
            }
        });
    }
}