package com.example.fatin.ipray4mum.reminder;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.fatin.ipray4mum.AddReminderActivity;
import com.example.fatin.ipray4mum.AlarmMainActivity;
import com.example.fatin.ipray4mum.AlfatihahEnglish;
import com.example.fatin.ipray4mum.R;
import com.example.fatin.ipray4mum.SurahHujuratEnglish;
import com.example.fatin.ipray4mum.SurahInshiqaqEnglish;
import com.example.fatin.ipray4mum.SurahInshirahEnglish;
import com.example.fatin.ipray4mum.SurahLuqmanEnglish;
import com.example.fatin.ipray4mum.SurahMaryamEnglish;
import com.example.fatin.ipray4mum.SurahTaubahEnglish;
import com.example.fatin.ipray4mum.SurahYaasinEnglish;
import com.example.fatin.ipray4mum.SurahYusufEnglish;
import com.example.fatin.ipray4mum.UserSessionManager;
import com.example.fatin.ipray4mum.data.AlarmReminderContract;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by delaroy on 9/22/17.
 */

public class ReminderAlarmService extends IntentService {

    private static final String TAG = ReminderAlarmService.class.getSimpleName();

    private static final int NOTIFICATION_ID = 42;

    Cursor cursor;
    //This is a deep link intent, and needs the task stack
    public static PendingIntent getReminderPendingIntent(Context context, Uri uri) {
        Intent action = new Intent(context, ReminderAlarmService.class);
        action.setData(uri);
        return PendingIntent.getService(context, 0, action, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    public ReminderAlarmService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        vibrator.vibrate(2000);

        Uri uri = intent.getData();

        //Grab the task description
        if(uri != null){
            cursor = getContentResolver().query(uri, null, null, null, null);
        }

        String description = "";

        //Display a notification to view the task details
        Intent action = new Intent();
        try {
            if (cursor != null && cursor.moveToFirst()) {
                description = AlarmReminderContract.getColumnString(cursor, AlarmReminderContract.AlarmReminderEntry.KEY_TITLE);

                if(description.equalsIgnoreCase("Surah Al-Fatihah")){
                    action = new Intent(this, AlfatihahEnglish.class);
                }
                else if(description.equalsIgnoreCase("Surah Luqman")){
                    action = new Intent(this, SurahLuqmanEnglish.class);
                }
                else if(description.equalsIgnoreCase("Surah Yaasin")){
                    action = new Intent(this, SurahYaasinEnglish.class);
                }
                else if(description.equalsIgnoreCase("Surah Inshiqaq")){
                    action = new Intent(this, SurahInshiqaqEnglish.class);
                }
                else if(description.equalsIgnoreCase("Surah Al-Inshirah")){
                    action = new Intent(this, SurahInshirahEnglish.class);
                }
                else if(description.equalsIgnoreCase("Surah Yusuf")){
                    action = new Intent(this, SurahYusufEnglish.class);
                }
                else if(description.equalsIgnoreCase("Surah Maryam")){
                    action = new Intent(this, SurahMaryamEnglish.class);
                }
                else if(description.equalsIgnoreCase("Surah Hujurat")){
                    action = new Intent(this, SurahHujuratEnglish.class);
                }
                else if(description.equalsIgnoreCase("Surah At-Taubah")){
                    action = new Intent(this, SurahTaubahEnglish.class);
                }
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }

        action.setData(uri);
        PendingIntent operation = TaskStackBuilder.create(this)
                .addNextIntentWithParentStack(action)
                .getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification note = new NotificationCompat.Builder(this)
                .setContentTitle("iPray4Mum")
                .setContentText(description)
                .setSmallIcon(R.drawable.ic_add_alert_black_24dp)
                .setContentIntent(operation)
                .setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_SOUND)
                .build();

        manager.notify(NOTIFICATION_ID, note);
    }
}