package com.example.fatin.ipray4mum;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import java.text.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class UserProfile extends AppCompatActivity {


    // User Session Manager Class
    UserSessionManager session;

    // Button Logout
    Button btnLogout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userprofile);

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

            ((TextView) findViewById(R.id.txtCurrentWeek)).setText(Html.fromHtml("<b>" + Long.toString(days) + "th Week</b>"));

            if (days >= 0 && days < 13)
            {
                ((TextView) findViewById(R.id.txtCurrentTri)).setText(Html.fromHtml("<b>First Trimester</b>"));
            }
            else if (days > 12 && days < 28)
            {
                ((TextView) findViewById(R.id.txtCurrentTri)).setText(Html.fromHtml("<b>Second Trimester</b>"));
            }
            else if (days > 27 && days < 41)
            {
                ((TextView) findViewById(R.id.txtCurrentTri)).setText(Html.fromHtml("<b>Third Trimester</b>"));
            }
            else
            {
                session.logoutUser();
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Show user data on activity
        txtName.setText(Html.fromHtml("<b>" + name + "</b>"));
    }

}