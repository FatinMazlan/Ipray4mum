package com.example.fatin.ipray4mum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by Fatin on 25/01/2018.
 */

public class YusufBenefit extends AppCompatActivity{

    TextView title, benefit, titleTime, timeAfdal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benefit_activity);

        title = (TextView) findViewById(R.id.title);
        benefit = (TextView) findViewById(R.id.benefit);
        titleTime = (TextView) findViewById(R.id.titleTime);
        timeAfdal = (TextView) findViewById(R.id.timeAfdal);

        title.setText("Mukjizat Surah Yusuf");
        titleTime.setText("Waktu digalakkan membaca");
        benefit.setText("Memperolehi anak yang tampan\n\n" +
                "Berkelakuan soleh seperti Nabi Yusuf\n\n" +
                "Dijauhkan daripada iri hati, dengki dan malapetaka\n\n" +
                "Dimuliakan dan diangkat darjatnya oleh Allah\n\n" +
                "Terlindung daripada tipu daya syaitan\n\n" +
                "Pada hari kiamat, wajahnya indah seperti Nabi Yusuf");
        timeAfdal.setText("Digalakkan membaca pada setiap masa " + Html.fromHtml("<b>terutamanya pada waktu malam</b>"));

    }
}
