package com.example.fatin.ipray4mum;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MenuActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    Button startBtn;

    EditText editName;
    TextView showDate;
    DatePicker dp;

    // User Session Manager Class
    UserSessionManager session;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        // User Session Manager
        session = new UserSessionManager(getApplicationContext());

        // get Email, Password input text
        editName = (EditText) findViewById(R.id.editName);
        showDate = (TextView) findViewById(R.id.showDate);

        // User Login button
        startBtn = (Button) findViewById(R.id.startBtn);


        // Login button click event
        startBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // Get username, password from EditText
                String username = editName.getText().toString();
                String edd = showDate.getText().toString();

                // Validate if username, password is filled
                if (username.trim().length() > 0 && edd.trim().length() > 0) {

                    // For testing puspose username, password is checked with static data
                    // username = admin
                    // password = admin

                    session.createUserLoginSession(username, edd);

                    // Starting MainActivity
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                    // Add new Flag to start new Activity
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(i);

                    finish();

                } else {

                    // user didn't entered username or password
                    Toast.makeText(getApplicationContext(), "Please enter username and expected due date", Toast.LENGTH_LONG).show();

                }

            }
        });
    }

    public void datePicker(View view){
        DatePickerFragment fragment = new DatePickerFragment();
        fragment.show(getSupportFragmentManager(), "date");
    }

    private void setDate(final Calendar calendar){
        final DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        ((TextView) findViewById(R.id.showDate)).setText(dateFormat.format(calendar.getTime()));

        Calendar today = Calendar.getInstance();

        long diff = calendar.getTimeInMillis() - today.getTimeInMillis();
        long days = 40 - ((diff / (24 * 60 * 60 * 1000)) / 7);

        ((TextView) findViewById(R.id.showWeek)).setText(Long.toString(days) + "th Week");

        if (days >= 0 && days < 13)
        {
            ((TextView) findViewById(R.id.showTri)).setText("First Trimester");
        }
        else if (days > 12 && days < 28)
        {
            ((TextView) findViewById(R.id.showTri)).setText("Second Trimester");
        }
        else if (days > 27 && days < 41)
        {
            ((TextView) findViewById(R.id.showTri)).setText("Third Trimester");
        }
        else
        {
            session.logoutUser();
        }

    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day){
        view.setMinDate(System.currentTimeMillis() - 1000);
        Calendar cal = new GregorianCalendar(year, month, day);
        setDate(cal);
    }

    public static class DatePickerFragment extends DialogFragment {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState){
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            return new DatePickerDialog(getActivity(),
                    (DatePickerDialog.OnDateSetListener) getActivity(), year, month, day);
        }
    }

}