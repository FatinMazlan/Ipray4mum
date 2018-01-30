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
 * Created by Fatin on 21/12/2017.
 */

public class SurahLuqmanEnglish extends AppCompatActivity {
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
        arrayList.add(new VerseActivity("Luqman", "الٓمٓ", "Alif, Laam, Miim.", R.raw.luqman1));
        arrayList.add(new VerseActivity("Luqman", "تِلْكَ ءَايَٰتُ ٱلْكِتَٰبِ ٱلْحَكِيمِ", "These are Verses of the Wise Book,-", R.raw.luqman2));
        arrayList.add(new VerseActivity("Luqman", "﻿﻿﻿هُدًى وَرَحْمَةً لِّلْمُحْسِنِينَ", "A Guide and a Mercy to the Doers of Good,-", R.raw.luqman3));
        arrayList.add(new VerseActivity("Luqman", "﻿ٱلَّذِينَ يُقِيمُونَ ٱلصَّلَوٰةَ وَيُؤْتُونَ ٱلزَّكَوٰةَ وَهُم بِٱلْءَاخِرَةِ هُمْ يُوقِنُونَ﻿", "Those who establish regular Prayer, and give regular Charity, and have (in their hearts) the assurance of the Hereafter.", R.raw.luqman4));
        arrayList.add(new VerseActivity("Luqman", "أُو۟لَٰٓئِكَ عَلَىٰ هُدًى مِّن رَّبِّهِمْ ۖ وَأُو۟لَٰٓئِكَ هُمُ ٱلْمُفْلِحُونَ﻿", "These are on (true) guidance from their Lord: and these are the ones who will prosper.", R.raw.luqman5));
        arrayList.add(new VerseActivity("Luqman", "﻿وَمِنَ ٱلنَّاسِ مَن يَشْتَرِى لَهْوَ ٱلْحَدِيثِ لِيُضِلَّ عَن سَبِيلِ ٱللَّهِ بِغَيْرِ عِلْمٍ وَيَتَّخِذَهَا هُزُوًا ۚ أُو۟لَٰٓئِكَ لَهُمْ عَذَابٌ مُّهِينٌ﻿", "But there are, among men, those who purchase idle tales, without knowledge (or meaning), to mislead (men) from the Path of Allah and throw ridicule (on the Path): for such there will be a Humiliating Penalty.", R.raw.luqman6));
        arrayList.add(new VerseActivity("Luqman", "﻿وَإِذَا تُتْلَىٰ عَلَيْهِ ءَايَٰتُنَا وَلَّىٰ مُسْتَكْبِرًا كَأَن لَّمْ يَسْمَعْهَا كَأَنَّ فِىٓ أُذُنَيْهِ وَقْرًا ۖ فَبَشِّرْهُ بِعَذَابٍ أَلِيمٍ", "When Our Signs are rehearsed to such a one, he turns away in arrogance, as if he heard them not, as if there were deafness in both his ears: announce to him a grievous Penalty.", R.raw.luqman7));
        arrayList.add(new VerseActivity("Luqman", "﻿إِنَّ ٱلَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ ٱلصَّٰلِحَٰتِ لَهُمْ جَنَّٰتُ ٱلنَّعِيمِ", "For those who believe and work righteous deeds, there will be Gardens of Bliss,-", R.raw.luqman8));
        arrayList.add(new VerseActivity("Luqman", "﻿خَٰلِدِينَ فِيهَا ۖ وَعْدَ ٱللَّهِ حَقًّا ۚ وَهُوَ ٱلْعَزِيزُ ٱلْحَكِيمُ", "To dwell therein. The promise of Allah is true: and He is Exalted in Power, Wise.", R.raw.luqman9));
        arrayList.add(new VerseActivity("Luqman", "خَلَقَ ٱلسَّمَٰوَٰتِ بِغَيْرِ عَمَدٍ تَرَوْنَهَا ۖ وَأَلْقَىٰ فِى ٱلْأَرْضِ رَوَٰسِىَ أَن تَمِيدَ بِكُمْ وَبَثَّ فِيهَا مِن كُلِّ دَآبَّةٍ ۚ وَأَنزَلْنَا مِنَ ٱلسَّمَآءِ مَآءً فَأَنۢبَتْنَا فِيهَا مِن كُلِّ زَوْجٍ كَرِيمٍ", "He created the heavens without any pillars that ye can see; He set on the earth mountains standing firm, lest it should shake with you; and He scattered through it beasts of all kinds. We send down rain from the sky, and produce on the earth every kind of noble creature, in pairs.", R.raw.luqman10));

        /*ayat 11-20*/
        arrayList.add(new VerseActivity("Luqman", "﻿هَٰذَا خَلْقُ ٱللَّهِ فَأَرُونِى مَاذَا خَلَقَ ٱلَّذِينَ مِن دُونِهِۦ ۚ بَلِ ٱلظَّٰلِمُونَ فِى ضَلَٰلٍ مُّبِينٍ", "Such is the Creation of Allah. now show Me what is there that others besides Him have created: nay, but the Transgressors are in manifest error.", R.raw.luqman11));
        arrayList.add(new VerseActivity("Luqman", "﻿وَلَقَدْ ءَاتَيْنَا لُقْمَٰنَ ٱلْحِكْمَةَ أَنِ ٱشْكُرْ لِلَّهِ ۚ وَمَن يَشْكُرْ فَإِنَّمَا يَشْكُرُ لِنَفْسِهِۦ ۖ وَمَن كَفَرَ فَإِنَّ ٱللَّهَ غَنِىٌّ حَمِيدٌ﻿", "We bestowed (in the past) Wisdom on Luqman: \"Show (thy) gratitude to Allah.\" Any who is (so) grateful does so to the profit of his own soul: but if any is ungrateful, verily Allah is free of all wants, Worthy of all praise.", R.raw.luqman12));
        arrayList.add(new VerseActivity("Luqman", "وَإِذْ قَالَ لُقْمَٰنُ لِٱبْنِهِۦ وَهُوَ يَعِظُهُۥ يَٰبُنَىَّ لَا تُشْرِكْ بِٱللَّهِ ۖ إِنَّ ٱلشِّرْكَ لَظُلْمٌ عَظِيمٌ", "Behold, Luqman said to his son by way of instruction: \"O my son! join not in worship (others) with Allah. for false worship is indeed the highest wrong-doing.\"", R.raw.luqman13));
        arrayList.add(new VerseActivity("Luqman", "وَوَصَّيْنَا ٱلْإِنسَٰنَ بِوَٰلِدَيْهِ حَمَلَتْهُ أُمُّهُۥ وَهْنًا عَلَىٰ وَهْنٍ وَفِصَٰلُهُۥ فِى عَامَيْنِ أَنِ ٱشْكُرْ لِى وَلِوَٰلِدَيْكَ إِلَىَّ ٱلْمَصِيرُ", "And We have enjoined on man (to be good) to his parents: in travail upon travail did his mother bear him, and in years twain was his weaning: (hear the command), \"Show gratitude to Me and to thy parents: to Me is (thy final) Goal.\"", R.raw.luqman14));
        arrayList.add(new VerseActivity("Luqman", "﻿وَإِن جَٰهَدَاكَ عَلَىٰٓ أَن تُشْرِكَ بِى مَا لَيْسَ لَكَ بِهِۦ عِلْمٌ فَلَا تُطِعْهُمَا ۖ وَصَاحِبْهُمَا فِى ٱلدُّنْيَا مَعْرُوفًا ۖ وَٱتَّبِعْ سَبِيلَ مَنْ أَنَابَ إِلَىَّ ۚ ثُمَّ إِلَىَّ مَرْجِعُكُمْ فَأُنَبِّئُكُم بِمَا كُنتُمْ تَعْمَلُونَ", "\"But if they strive to make thee join in worship with Me things of which thou hast no knowledge, obey them not; yet bear them company in this life with justice (and consideration), and follow the way of those who turn to me (in love): in the end the return of you all is to Me, and I will tell you the truth (and meaning) of all that ye did.\"", R.raw.luqman15));
        arrayList.add(new VerseActivity("Luqman", "يَٰبُنَىَّ إِنَّهَآ إِن تَكُ مِثْقَالَ حَبَّةٍ مِّنْ خَرْدَلٍ فَتَكُن فِى صَخْرَةٍ أَوْ فِى ٱلسَّمَٰوَٰتِ أَوْ فِى ٱلْأَرْضِ يَأْتِ بِهَا ٱللَّهُ ۚ إِنَّ ٱللَّهَ لَطِيفٌ خَبِيرٌ", "\"O my son!\" (said Luqman), \"If there be (but) the weight of a mustard-seed and it were (hidden) in a rock, or (anywhere) in the heavens or on earth, Allah will bring it forth: for Allah understands the finest mysteries, (and) is well-acquainted (with them).\"", R.raw.luqman16));
        arrayList.add(new VerseActivity("Luqman", "﻿يَٰبُنَىَّ أَقِمِ ٱلصَّلَوٰةَ وَأْمُرْ بِٱلْمَعْرُوفِ وَٱنْهَ عَنِ ٱلْمُنكَرِ وَٱصْبِرْ عَلَىٰ مَآ أَصَابَكَ ۖ إِنَّ ذَٰلِكَ مِنْ عَزْمِ ٱلْأُمُورِ", "\"O my son! establish regular prayer, enjoin what is just, and forbid what is wrong: and bear with patient constancy whatever betide thee; for this is firmness (of purpose) in (the conduct of) affairs.\"", R.raw.luqman17));
        arrayList.add(new VerseActivity("Luqman", "وَلَا تُصَعِّرْ خَدَّكَ لِلنَّاسِ وَلَا تَمْشِ فِى ٱلْأَرْضِ مَرَحًا ۖ إِنَّ ٱللَّهَ لَا يُحِبُّ كُلَّ مُخْتَالٍ فَخُورٍ", "\"And swell not thy cheek (for pride) at men, nor walk in insolence through the earth; for Allah loveth not any arrogant boaster.\"", R.raw.luqman18));
        arrayList.add(new VerseActivity("Luqman", "﻿وَٱقْصِدْ فِى مَشْيِكَ وَٱغْضُضْ مِن صَوْتِكَ ۚ إِنَّ أَنكَرَ ٱلْأَصْوَٰتِ لَصَوْتُ ٱلْحَمِيرِ", "\"And be moderate in thy pace, and lower thy voice; for the harshest of sounds without doubt is the braying of the ass.\"", R.raw.luqman19));
        arrayList.add(new VerseActivity("Luqman", "أَلَمْ تَرَوْا۟ أَنَّ ٱللَّهَ سَخَّرَ لَكُم مَّا فِى ٱلسَّمَٰوَٰتِ وَمَا فِى ٱلْأَرْضِ وَأَسْبَغَ عَلَيْكُمْ نِعَمَهُۥ ظَٰهِرَةً وَبَاطِنَةً ۗ وَمِنَ ٱلنَّاسِ مَن يُجَٰدِلُ فِى ٱللَّهِ بِغَيْرِ عِلْمٍ وَلَا هُدًى وَلَا كِتَٰبٍ مُّنِيرٍ", "Do ye not see that Allah has subjected to your (use) all things in the heavens and on earth, and has made his bounties flow to you in exceeding measure, (both) seen and unseen? Yet there are among men those who dispute about Allah, without knowledge and without guidance, and without a Book to enlighten them!", R.raw.luqman20));

        /*ayat 21-30*/
        arrayList.add(new VerseActivity("Luqman", "﻿وَإِذَا قِيلَ لَهُمُ ٱتَّبِعُوا۟ مَآ أَنزَلَ ٱللَّهُ قَالُوا۟ بَلْ نَتَّبِعُ مَا وَجَدْنَا عَلَيْهِ ءَابَآءَنَآ ۚ أَوَلَوْ كَانَ ٱلشَّيْطَٰنُ يَدْعُوهُمْ إِلَىٰ عَذَابِ ٱلسَّعِيرِ", "When they are told to follow the (Revelation) that Allah has sent down, they say: \"Nay, we shall follow the ways that we found our fathers (following)\". What! even if it is Satan beckoning them to the Penalty of the (Blazing) Fire?", R.raw.luqman21));
        arrayList.add(new VerseActivity("Luqman", "﻿۞ وَمَن يُسْلِمْ وَجْهَهُۥٓ إِلَى ٱللَّهِ وَهُوَ مُحْسِنٌ فَقَدِ ٱسْتَمْسَكَ بِٱلْعُرْوَةِ ٱلْوُثْقَىٰ ۗ وَإِلَى ٱللَّهِ عَٰقِبَةُ ٱلْأُمُورِ", "Whoever submits his whole self to Allah, and is a doer of good, has grasped indeed the most trustworthy hand-hold: and with Allah rests the End and Decision of (all) affairs.", R.raw.luqman22));
        arrayList.add(new VerseActivity("Luqman", "﻿وَمَن كَفَرَ فَلَا يَحْزُنكَ كُفْرُهُۥٓ ۚ إِلَيْنَا مَرْجِعُهُمْ فَنُنَبِّئُهُم بِمَا عَمِلُوٓا۟ ۚ إِنَّ ٱللَّهَ عَلِيمٌۢ بِذَاتِ ٱلصُّدُورِ", "But if any reject Faith, let not his rejection grieve thee: to Us is their return, and We shall tell them the truth of their deeds: for Allah knows well all that is in (men's) hearts.", R.raw.luqman23));
        arrayList.add(new VerseActivity("Luqman", "﻿نُمَتِّعُهُمْ قَلِيلًا ثُمَّ نَضْطَرُّهُمْ إِلَىٰ عَذَابٍ غَلِيظٍ", "We grant them their pleasure for a little while: in the end shall We drive them to a chastisement unrelenting.", R.raw.luqman24));
        arrayList.add(new VerseActivity("Luqman", "وَلَئِن سَأَلْتَهُم مَّنْ خَلَقَ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضَ لَيَقُولُنَّ ٱللَّهُ ۚ قُلِ ٱلْحَمْدُ لِلَّهِ ۚ بَلْ أَكْثَرُهُمْ لَا يَعْلَمُونَ", "If thou ask them, who it is that created the heavens and the earth. They will certainly say, \"(Allah)\". Say: \"Praise be to Allah.\" But most of them understand not.", R.raw.luqman25));
        arrayList.add(new VerseActivity("Luqman", "﻿لِلَّهِ مَا فِى ٱلسَّمَٰوَٰتِ وَٱلْأَرْضِ ۚ إِنَّ ٱللَّهَ هُوَ ٱلْغَنِىُّ ٱلْحَمِيدُ", "To Allah belong all things in heaven and earth: verily Allah is He (that is) free of all wants, worthy of all praise.", R.raw.luqman26));
        arrayList.add(new VerseActivity("Luqman", "﻿وَلَوْ أَنَّمَا فِى ٱلْأَرْضِ مِن شَجَرَةٍ أَقْلَٰمٌ وَٱلْبَحْرُ يَمُدُّهُۥ مِنۢ بَعْدِهِۦ سَبْعَةُ أَبْحُرٍ مَّا نَفِدَتْ كَلِمَٰتُ ٱللَّهِ ۗ إِنَّ ٱللَّهَ عَزِيزٌ حَكِيمٌ", "And if all the trees on earth were pens and the ocean (were ink), with seven oceans behind it to add to its (supply), yet would not the words of Allah be exhausted (in the writing): for Allah is Exalted in Power, full of Wisdom.", R.raw.luqman27));
        arrayList.add(new VerseActivity("Luqman", "﻿مَّا خَلْقُكُمْ وَلَا بَعْثُكُمْ إِلَّا كَنَفْسٍ وَٰحِدَةٍ ۗ إِنَّ ٱللَّهَ سَمِيعٌۢ بَصِيرٌ", "And your creation or your resurrection is in no wise but as an individual soul: for Allah is He Who hears and sees (all things).", R.raw.luqman28));
        arrayList.add(new VerseActivity("Luqman", "أَلَمْ تَرَ أَنَّ ٱللَّهَ يُولِجُ ٱلَّيْلَ فِى ٱلنَّهَارِ وَيُولِجُ ٱلنَّهَارَ فِى ٱلَّيْلِ وَسَخَّرَ ٱلشَّمْسَ وَٱلْقَمَرَ كُلٌّ يَجْرِىٓ إِلَىٰٓ أَجَلٍ مُّسَمًّى وَأَنَّ ٱللَّهَ بِمَا تَعْمَلُونَ خَبِيرٌ", "Seest thou not that Allah merges Night into Day and he merges Day into Night; that He has subjected the sun, and the moon (to his Law), each running its course for a term appointed; and that Allah is well-acquainted with all that ye do?", R.raw.luqman29));
        arrayList.add(new VerseActivity("Luqman", "﻿ذَٰلِكَ بِأَنَّ ٱللَّهَ هُوَ ٱلْحَقُّ وَأَنَّ مَا يَدْعُونَ مِن دُونِهِ ٱلْبَٰطِلُ وَأَنَّ ٱللَّهَ هُوَ ٱلْعَلِىُّ ٱلْكَبِيرُ", "That is because Allah is the (only) Reality, and because whatever else they invoke besides Him is Falsehood; and because Allah,- He is the Most High, Most Great.", R.raw.luqman30));

        /*ayat 31-40*/
        arrayList.add(new VerseActivity("Luqman", "أَلَمْ تَرَ أَنَّ ٱلْفُلْكَ تَجْرِى فِى ٱلْبَحْرِ بِنِعْمَتِ ٱللَّهِ لِيُرِيَكُم مِّنْ ءَايَٰتِهِۦٓ ۚ إِنَّ فِى ذَٰلِكَ لَءَايَٰتٍ لِّكُلِّ صَبَّارٍ شَكُورٍ", "Seest thou not that the ships sail through the ocean by the Grace of Allah.- that He may show you of His Signs? Verily in this are Signs for all who constantly persevere and give thanks.", R.raw.luqman31));
        arrayList.add(new VerseActivity("Luqman", "وَإِذَا غَشِيَهُم مَّوْجٌ كَٱلظُّلَلِ دَعَوُا۟ ٱللَّهَ مُخْلِصِينَ لَهُ ٱلدِّينَ فَلَمَّا نَجَّىٰهُمْ إِلَى ٱلْبَرِّ فَمِنْهُم مُّقْتَصِدٌ ۚ وَمَا يَجْحَدُ بِـَٔايَٰتِنَآ إِلَّا كُلُّ خَتَّارٍ كَفُورٍ", "When a wave covers them like the canopy (of clouds), they call to Allah, offering Him sincere devotion. But when He has delivered them safely to land, there are among them those that halt between (right and wrong). But none reject Our Signs except only a perfidious ungrateful (wretch)!", R.raw.luqman32));
        arrayList.add(new VerseActivity("Luqman", "يَٰٓأَيُّهَا ٱلنَّاسُ ٱتَّقُوا۟ رَبَّكُمْ وَٱخْشَوْا۟ يَوْمًا لَّا يَجْزِى وَالِدٌ عَن وَلَدِهِۦ وَلَا مَوْلُودٌ هُوَ جَازٍ عَن وَالِدِهِۦ شَيْـًٔا ۚ إِنَّ وَعْدَ ٱللَّهِ حَقٌّ ۖ فَلَا تَغُرَّنَّكُمُ ٱلْحَيَوٰةُ ٱلدُّنْيَا وَلَا يَغُرَّنَّكُم بِٱللَّهِ ٱلْغَرُورُ", "O mankind! do your duty to your Lord, and fear (the coming of) a Day when no father can avail aught for his son, nor a son avail aught for his father. Verily, the promise of Allah is true: let not then this present life deceive you, nor let the chief Deceiver deceive you about Allah.", R.raw.luqman33));
        arrayList.add(new VerseActivity("Luqman", "﻿إِنَّ ٱللَّهَ عِندَهُۥ عِلْمُ ٱلسَّاعَةِ وَيُنَزِّلُ ٱلْغَيْثَ وَيَعْلَمُ مَا فِى ٱلْأَرْحَامِ ۖ وَمَا تَدْرِى نَفْسٌ مَّاذَا تَكْسِبُ غَدًا ۖ وَمَا تَدْرِى نَفْسٌۢ بِأَىِّ أَرْضٍ تَمُوتُ ۚ إِنَّ ٱللَّهَ عَلِيمٌ خَبِيرٌۢ", "Verily the knowledge of the Hour is with Allah (alone). It is He Who sends down rain, and He Who knows what is in the wombs. Nor does any one know what it is that he will earn on the morrow: Nor does any one know in what land he is to die. Verily with Allah is full knowledge and He is acquainted (with all things).", R.raw.luqman34));

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
                mp = MediaPlayer.create(this, R.raw.luqmanfull);
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
                Intent i = new Intent(SurahLuqmanEnglish.this,SurahLuqmanMalay.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}