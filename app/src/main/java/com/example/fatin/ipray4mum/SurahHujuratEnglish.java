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

public class SurahHujuratEnglish extends AppCompatActivity {
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
        arrayList.add(new VerseActivity("Hujurat", "يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟ لَا تُقَدِّمُوا۟ بَيْنَ يَدَىِ ٱللَّهِ وَرَسُولِهِۦ ۖ وَٱتَّقُوا۟ ٱللَّهَ ۚ إِنَّ ٱللَّهَ سَمِيعٌ عَلِيمٌ", "O Ye who believe! Put not yourselves forward before Allah and His Messenger. but fear Allah. for Allah is He Who hears and knows all things.", R.raw.hujurat1));
        arrayList.add(new VerseActivity("Hujurat", "﻿يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟ لَا تَرْفَعُوٓا۟ أَصْوَٰتَكُمْ فَوْقَ صَوْتِ ٱلنَّبِىِّ وَلَا تَجْهَرُوا۟ لَهُۥ بِٱلْقَوْلِ كَجَهْرِ بَعْضِكُمْ لِبَعْضٍ أَن تَحْبَطَ أَعْمَٰلُكُمْ وَأَنتُمْ لَا تَشْعُرُونَ", "O ye who believe! Raise not your voices above the voice of the Prophet, nor speak aloud to him in talk, as ye may speak aloud to one another, lest your deeds become vain and ye perceive not.", R.raw.hujurat2));
        arrayList.add(new VerseActivity("Hujurat", "﻿إِنَّ ٱلَّذِينَ يَغُضُّونَ أَصْوَٰتَهُمْ عِندَ رَسُولِ ٱللَّهِ أُو۟لَٰٓئِكَ ٱلَّذِينَ ٱمْتَحَنَ ٱللَّهُ قُلُوبَهُمْ لِلتَّقْوَىٰ ۚ لَهُم مَّغْفِرَةٌ وَأَجْرٌ عَظِيمٌ", "Those that lower their voices in the presence of Allah.s Messenger,- their hearts has Allah tested for piety: for them is Forgiveness and a great Reward.", R.raw.hujurat3));
        arrayList.add(new VerseActivity("Hujurat", "﻿إِنَّ ٱلَّذِينَ يُنَادُونَكَ مِن وَرَآءِ ٱلْحُجُرَٰتِ أَكْثَرُهُمْ لَا يَعْقِلُونَ", "Those who shout out to thee from without the inner apartments - most of them lack understanding.", R.raw.hujurat4));
        arrayList.add(new VerseActivity("Hujurat", "وَلَوْ أَنَّهُمْ صَبَرُوا۟ حَتَّىٰ تَخْرُجَ إِلَيْهِمْ لَكَانَ خَيْرًا لَّهُمْ ۚ وَٱللَّهُ غَفُورٌ رَّحِيمٌ", "If only they had patience until thou couldst come out to them, it would be best for them: but Allah is Oft-Forgiving, Most Merciful.", R.raw.hujurat5));
        arrayList.add(new VerseActivity("Hujurat", "يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوٓا۟ إِن جَآءَكُمْ فَاسِقٌۢ بِنَبَإٍ فَتَبَيَّنُوٓا۟ أَن تُصِيبُوا۟ قَوْمًۢا بِجَهَٰلَةٍ فَتُصْبِحُوا۟ عَلَىٰ مَا فَعَلْتُمْ نَٰدِمِينَ", "O ye who believe! If a wicked person comes to you with any news, ascertain the truth, lest ye harm people unwittingly, and afterwards become full of repentance for what ye have done.", R.raw.hujurat6));
        arrayList.add(new VerseActivity("Hujurat", "﻿وَٱعْلَمُوٓا۟ أَنَّ فِيكُمْ رَسُولَ ٱللَّهِ ۚ لَوْ يُطِيعُكُمْ فِى كَثِيرٍ مِّنَ ٱلْأَمْرِ لَعَنِتُّمْ وَلَٰكِنَّ ٱللَّهَ حَبَّبَ إِلَيْكُمُ ٱلْإِيمَٰنَ وَزَيَّنَهُۥ فِى قُلُوبِكُمْ وَكَرَّهَ إِلَيْكُمُ ٱلْكُفْرَ وَٱلْفُسُوقَ وَٱلْعِصْيَانَ ۚ أُو۟لَٰٓئِكَ هُمُ ٱلرَّٰشِدُونَ", "And know that among you is Allah.s Messenger. were he, in many matters, to follow your (wishes), ye would certainly fall into misfortune: But Allah has endeared the Faith to you, and has made it beautiful in your hearts, and He has made hateful to you Unbelief, wickedness, and rebellion: such indeed are those who walk in righteousness;-", R.raw.hujurat7));
        arrayList.add(new VerseActivity("Hujurat", "فَضْلًا مِّنَ ٱللَّهِ وَنِعْمَةً ۚ وَٱللَّهُ عَلِيمٌ حَكِيمٌ", "A Grace and Favour from Allah. and Allah is full of Knowledge and Wisdom.", R.raw.hujurat8));
        arrayList.add(new VerseActivity("Hujurat", "﻿وَإِن طَآئِفَتَانِ مِنَ ٱلْمُؤْمِنِينَ ٱقْتَتَلُوا۟ فَأَصْلِحُوا۟ بَيْنَهُمَا ۖ فَإِنۢ بَغَتْ إِحْدَىٰهُمَا عَلَى ٱلْأُخْرَىٰ فَقَٰتِلُوا۟ ٱلَّتِى تَبْغِى حَتَّىٰ تَفِىٓءَ إِلَىٰٓ أَمْرِ ٱللَّهِ ۚ فَإِن فَآءَتْ فَأَصْلِحُوا۟ بَيْنَهُمَا بِٱلْعَدْلِ وَأَقْسِطُوٓا۟ ۖ إِنَّ ٱللَّهَ يُحِبُّ ٱلْمُقْسِطِينَ", "If two parties among the Believers fall into a quarrel, make ye peace between them: but if one of them transgresses beyond bounds against the other then fight ye (all) against the one that transgresses until it complies with the command of Allah; but if it complies then make peace between them with justice and be fair: for Allah loves those who are fair (and just).", R.raw.hujurat9));
        arrayList.add(new VerseActivity("Hujurat", "﻿إِنَّمَا ٱلْمُؤْمِنُونَ إِخْوَةٌ فَأَصْلِحُوا۟ بَيْنَ أَخَوَيْكُمْ ۚ وَٱتَّقُوا۟ ٱللَّهَ لَعَلَّكُمْ تُرْحَمُونَ", "The Believers are but a single Brotherhood: So make peace and reconciliation between your two (contending) brothers; and fear Allah, that ye may receive Mercy.", R.raw.hujurat10));

        /*ayat 11-20*/
        arrayList.add(new VerseActivity("Hujurat", "يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟ لَا يَسْخَرْ قَوْمٌ مِّن قَوْمٍ عَسَىٰٓ أَن يَكُونُوا۟ خَيْرًا مِّنْهُمْ وَلَا نِسَآءٌ مِّن نِّسَآءٍ عَسَىٰٓ أَن يَكُنَّ خَيْرًا مِّنْهُنَّ ۖ وَلَا تَلْمِزُوٓا۟ أَنفُسَكُمْ وَلَا تَنَابَزُوا۟ بِٱلْأَلْقَٰبِ ۖ بِئْسَ ٱلِٱسْمُ ٱلْفُسُوقُ بَعْدَ ٱلْإِيمَٰنِ ۚ وَمَن لَّمْ يَتُبْ فَأُو۟لَٰٓئِكَ هُمُ ٱلظَّٰلِمُونَ", "O ye who believe! Let not some men among you laugh at others: It may be that the (latter) are better than the (former): Nor let some women laugh at others: It may be that the (latter are better than the (former): Nor defame nor be sarcastic to each other, nor call each other by (offensive) nicknames: Ill-seeming is a name connoting wickedness, (to be used of one) after he has believed: And those who do not desist are (indeed) doing wrong.", R.raw.hujurat11));
        arrayList.add(new VerseActivity("Hujurat", "يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟ ٱجْتَنِبُوا۟ كَثِيرًا مِّنَ ٱلظَّنِّ إِنَّ بَعْضَ ٱلظَّنِّ إِثْمٌ ۖ وَلَا تَجَسَّسُوا۟ وَلَا يَغْتَب بَّعْضُكُم بَعْضًا ۚ أَيُحِبُّ أَحَدُكُمْ أَن يَأْكُلَ لَحْمَ أَخِيهِ مَيْتًا فَكَرِهْتُمُوهُ ۚ وَٱتَّقُوا۟ ٱللَّهَ ۚ إِنَّ ٱللَّهَ تَوَّابٌ رَّحِيمٌ", "O ye who believe! Avoid suspicion as much (as possible): for suspicion in some cases is a sin: And spy not on each other behind their backs. Would any of you like to eat the flesh of his dead brother? Nay, ye would abhor it...But fear Allah. For Allah is Oft-Returning, Most Merciful.", R.raw.hujurat12));
        arrayList.add(new VerseActivity("Hujurat", "﻿يَٰٓأَيُّهَا ٱلنَّاسُ إِنَّا خَلَقْنَٰكُم مِّن ذَكَرٍ وَأُنثَىٰ وَجَعَلْنَٰكُمْ شُعُوبًا وَقَبَآئِلَ لِتَعَارَفُوٓا۟ ۚ إِنَّ أَكْرَمَكُمْ عِندَ ٱللَّهِ أَتْقَىٰكُمْ ۚ إِنَّ ٱللَّهَ عَلِيمٌ خَبِيرٌ", "O mankind! We created you from a single (pair) of a male and a female, and made you into nations and tribes, that ye may know each other (not that ye may despise (each other). Verily the most honoured of you in the sight of Allah is (he who is) the most righteous of you. And Allah has full knowledge and is well acquainted (with all things).", R.raw.hujurat13));
        arrayList.add(new VerseActivity("Hujurat", "﻿۞ قَالَتِ ٱلْأَعْرَابُ ءَامَنَّا ۖ قُل لَّمْ تُؤْمِنُوا۟ وَلَٰكِن قُولُوٓا۟ أَسْلَمْنَا وَلَمَّا يَدْخُلِ ٱلْإِيمَٰنُ فِى قُلُوبِكُمْ ۖ وَإِن تُطِيعُوا۟ ٱللَّهَ وَرَسُولَهُۥ لَا يَلِتْكُم مِّنْ أَعْمَٰلِكُمْ شَيْـًٔا ۚ إِنَّ ٱللَّهَ غَفُورٌ رَّحِيمٌ", "The desert Arabs say, \"We believe.\" Say, \"Ye have no faith; but ye (only)say, 'We have submitted our wills to Allah,' For not yet has Faith entered your hearts. But if ye obey Allah and His Messenger, He will not belittle aught of your deeds: for Allah is Oft-Forgiving, Most Merciful.\"", R.raw.hujurat14));
        arrayList.add(new VerseActivity("Hujurat", "﻿إِنَّمَا ٱلْمُؤْمِنُونَ ٱلَّذِينَ ءَامَنُوا۟ بِٱللَّهِ وَرَسُولِهِۦ ثُمَّ لَمْ يَرْتَابُوا۟ وَجَٰهَدُوا۟ بِأَمْوَٰلِهِمْ وَأَنفُسِهِمْ فِى سَبِيلِ ٱللَّهِ ۚ أُو۟لَٰٓئِكَ هُمُ ٱلصَّٰدِقُونَ", "Only those are Believers who have believed in Allah and His Messenger, and have never since doubted, but have striven with their belongings and their persons in the Cause of Allah: Such are the sincere ones.", R.raw.hujurat15));
        arrayList.add(new VerseActivity("Hujurat", "﻿قُلْ أَتُعَلِّمُونَ ٱللَّهَ بِدِينِكُمْ وَٱللَّهُ يَعْلَمُ مَا فِى ٱلسَّمَٰوَٰتِ وَمَا فِى ٱلْأَرْضِ ۚ وَٱللَّهُ بِكُلِّ شَىْءٍ عَلِيمٌ", "Say: \"What! Will ye instruct Allah about your religion? But Allah knows all that is in the heavens and on earth: He has full knowledge of all things.", R.raw.hujurat16));
        arrayList.add(new VerseActivity("Hujurat", "يَمُنُّونَ عَلَيْكَ أَنْ أَسْلَمُوا۟ ۖ قُل لَّا تَمُنُّوا۟ عَلَىَّ إِسْلَٰمَكُم ۖ بَلِ ٱللَّهُ يَمُنُّ عَلَيْكُمْ أَنْ هَدَىٰكُمْ لِلْإِيمَٰنِ إِن كُنتُمْ صَٰدِقِينَ", "They impress on thee as a favour that they have embraced Islam. Say, \"Count not your Islam as a favour upon me: Nay, Allah has conferred a favour upon you that He has guided you to the faith, if ye be true and sincere.", R.raw.hujurat17));
        arrayList.add(new VerseActivity("Hujurat", "﻿إِنَّ ٱللَّهَ يَعْلَمُ غَيْبَ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضِ ۚ وَٱللَّهُ بَصِيرٌۢ بِمَا تَعْمَلُونَ", "\"Verily Allah knows the secrets of the heavens and the earth: and Allah Sees well all that ye do.\"", R.raw.hujurat18));

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
                mp = MediaPlayer.create(this, R.raw.hujuratfull);
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
                Intent i = new Intent(SurahHujuratEnglish.this, SurahHujuratMalay.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}