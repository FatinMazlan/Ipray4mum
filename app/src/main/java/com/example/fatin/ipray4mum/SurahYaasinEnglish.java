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

public class SurahYaasinEnglish extends AppCompatActivity {
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
        arrayList.add(new VerseActivity("Yaasin", "يسٓ", "Yaa, Siin.", R.raw.yaasin1));
        arrayList.add(new VerseActivity("Yaasin", "وَٱلْقُرْءَانِ ٱلْحَكِيمِ", "By the Qur'an, full of Wisdom,-", R.raw.yaasin2));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنَّكَ لَمِنَ ٱلْمُرْسَلِينَ", "Thou art indeed one of the apostles,", R.raw.yaasin3));
        arrayList.add(new VerseActivity("Yaasin", "عَلَىٰ صِرَٰطٍ مُّسْتَقِيمٍ", "On a Straight Way.", R.raw.yaasin4));
        arrayList.add(new VerseActivity("Yaasin", "﻿تَنزِيلَ ٱلْعَزِيزِ ٱلرَّحِيمِ", "It is a Revelation sent down by (Him), the Exalted in Might, Most Merciful.", R.raw.yaasin5));
        arrayList.add(new VerseActivity("Yaasin", "﻿لِتُنذِرَ قَوْمًا مَّآ أُنذِرَ ءَابَآؤُهُمْ فَهُمْ غَٰفِلُونَ", "In order that thou mayest admonish a people, whose fathers had received no admonition, and who therefore remain heedless (of the Signs of Allah.", R.raw.yaasin6));
        arrayList.add(new VerseActivity("Yaasin", "﻿لَقَدْ حَقَّ ٱلْقَوْلُ عَلَىٰٓ أَكْثَرِهِمْ فَهُمْ لَا يُؤْمِنُونَ﻿", "The Word is proved true against the greater part of them: for they do not believe.", R.raw.yaasin7));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنَّا جَعَلْنَا فِىٓ أَعْنَٰقِهِمْ أَغْلَٰلًا فَهِىَ إِلَى ٱلْأَذْقَانِ فَهُم مُّقْمَحُونَ", "We have put yokes round their necks right up to their chins, so that their heads are forced up (and they cannot see).", R.raw.yaasin8));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَجَعَلْنَا مِنۢ بَيْنِ أَيْدِيهِمْ سَدًّا وَمِنْ خَلْفِهِمْ سَدًّا فَأَغْشَيْنَٰهُمْ فَهُمْ لَا يُبْصِرُونَ", "And We have put a bar in front of them and a bar behind them, and further, We have covered them up; so that they cannot see.", R.raw.yaasin9));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَسَوَآءٌ عَلَيْهِمْ ءَأَنذَرْتَهُمْ أَمْ لَمْ تُنذِرْهُمْ لَا يُؤْمِنُونَ﻿", "The same is it to them whether thou admonish them or thou do not admonish them: they will not believe.", R.raw.yaasin10));

        /*ayat 11-20*/
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنَّمَا تُنذِرُ مَنِ ٱتَّبَعَ ٱلذِّكْرَ وَخَشِىَ ٱلرَّحْمَٰنَ بِٱلْغَيْبِ ۖ فَبَشِّرْهُ بِمَغْفِرَةٍ وَأَجْرٍ كَرِيمٍ", "Thou canst but admonish such a one as follows the Message and fears the (Lord) Most Gracious, unseen: give such a one, therefore, good tidings, of Forgiveness and a Reward most generous.", R.raw.yaasin11));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنَّا نَحْنُ نُحْىِ ٱلْمَوْتَىٰ وَنَكْتُبُ مَا قَدَّمُوا۟ وَءَاثَٰرَهُمْ ۚ وَكُلَّ شَىْءٍ أَحْصَيْنَٰهُ فِىٓ إِمَامٍ مُّبِينٍ", "Verily We shall give life to the dead, and We record that which they send before and that which they leave behind, and of all things have We taken account in a clear Book (of evidence).", R.raw.yaasin12));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَٱضْرِبْ لَهُم مَّثَلًا أَصْحَٰبَ ٱلْقَرْيَةِ إِذْ جَآءَهَا ٱلْمُرْسَلُونَ", "Set forth to them, by way of a parable, the (story of) the Companions of the City. Behold!, there came apostles to it.", R.raw.yaasin13));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِذْ أَرْسَلْنَآ إِلَيْهِمُ ٱثْنَيْنِ فَكَذَّبُوهُمَا فَعَزَّزْنَا بِثَالِثٍ فَقَالُوٓا۟ إِنَّآ إِلَيْكُم مُّرْسَلُونَ", "When We (first) sent to them two apostles, they rejected them: But We strengthened them with a third: they said, \"Truly, we have been sent on a mission to you.\"", R.raw.yaasin14));
        arrayList.add(new VerseActivity("Yaasin", "﻿قَالُوا۟ مَآ أَنتُمْ إِلَّا بَشَرٌ مِّثْلُنَا وَمَآ أَنزَلَ ٱلرَّحْمَٰنُ مِن شَىْءٍ إِنْ أَنتُمْ إِلَّا تَكْذِبُونَ", "The (people) said: \"Ye are only men like ourselves; and ((Allah)) Most Gracious sends no sort of revelation: ye do nothing but lie.\"", R.raw.yaasin15));
        arrayList.add(new VerseActivity("Yaasin", "﻿قَالُوا۟ رَبُّنَا يَعْلَمُ إِنَّآ إِلَيْكُمْ لَمُرْسَلُونَ", "They said: \"Our Lord doth know that we have been sent on a mission to you:", R.raw.yaasin16));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَمَا عَلَيْنَآ إِلَّا ٱلْبَلَٰغُ ٱلْمُبِينُ", "\"And our duty is only to proclaim the clear Message.\"", R.raw.yaasin17));
        arrayList.add(new VerseActivity("Yaasin", "قَالُوٓا۟ إِنَّا تَطَيَّرْنَا بِكُمْ ۖ لَئِن لَّمْ تَنتَهُوا۟ لَنَرْجُمَنَّكُمْ وَلَيَمَسَّنَّكُم مِّنَّا عَذَابٌ أَلِيمٌ", "The (people) said: \"for us, we augur an evil omen from you: if ye desist not, we will certainly stone you. And a grievous punishment indeed will be inflicted on you by us.\"", R.raw.yaasin18));
        arrayList.add(new VerseActivity("Yaasin", "قَالُوا۟ طَٰٓئِرُكُم مَّعَكُمْ ۚ أَئِن ذُكِّرْتُم ۚ بَلْ أَنتُمْ قَوْمٌ مُّسْرِفُونَ", "They said: \"Your evil omens are with yourselves: (deem ye this an evil omen). If ye are admonished? Nay, but ye are a people transgressing all bounds!\"", R.raw.yaasin19));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَجَآءَ مِنْ أَقْصَا ٱلْمَدِينَةِ رَجُلٌ يَسْعَىٰ قَالَ يَٰقَوْمِ ٱتَّبِعُوا۟ ٱلْمُرْسَلِينَ", "Then there came running, from the farthest part of the City, a man, saying, \"O my people! Obey the apostles:", R.raw.yaasin20));

        /*ayat 21-30*/
        arrayList.add(new VerseActivity("Yaasin", "﻿ٱتَّبِعُوا۟ مَن لَّا يَسْـَٔلُكُمْ أَجْرًا وَهُم مُّهْتَدُونَ", "\"Obey those who ask no reward of you (for themselves), and who have themselves received Guidance.", R.raw.yaasin21));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَمَا لِىَ لَآ أَعْبُدُ ٱلَّذِى فَطَرَنِى وَإِلَيْهِ تُرْجَعُونَ", "\"It would not be reasonable in me if I did not serve Him Who created me, and to Whom ye shall (all) be brought back.", R.raw.yaasin22));
        arrayList.add(new VerseActivity("Yaasin", "﻿ءَأَتَّخِذُ مِن دُونِهِۦٓ ءَالِهَةً إِن يُرِدْنِ ٱلرَّحْمَٰنُ بِضُرٍّ لَّا تُغْنِ عَنِّى شَفَٰعَتُهُمْ شَيْـًٔا وَلَا يُنقِذُونِ", "\"Shall I take (other) gods besides Him? If ((Allah)) Most Gracious should intend some adversity for me, of no use whatever will be their intercession for me, nor can they deliver me.", R.raw.yaasin23));
        arrayList.add(new VerseActivity("Yaasin", "إِنِّىٓ إِذًا لَّفِى ضَلَٰلٍ مُّبِينٍ", "\"I would indeed, if I were to do so, be in manifest Error.", R.raw.yaasin24));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنِّىٓ ءَامَنتُ بِرَبِّكُمْ فَٱسْمَعُونِ", "\"For me, I have faith in the Lord of you (all): listen, then, to me!\"", R.raw.yaasin25));
        arrayList.add(new VerseActivity("Yaasin", "﻿قِيلَ ٱدْخُلِ ٱلْجَنَّةَ ۖ قَالَ يَٰلَيْتَ قَوْمِى يَعْلَمُونَ", "It was said: \"Enter thou the Garden.\" He said: \"Ah me! Would that my People knew (what I know)!-", R.raw.yaasin26));
        arrayList.add(new VerseActivity("Yaasin", "﻿بِمَا غَفَرَ لِى رَبِّى وَجَعَلَنِى مِنَ ٱلْمُكْرَمِينَ", "\"For that my Lord has granted me Forgiveness and has enrolled me among those held in honour!\"", R.raw.yaasin27));
        arrayList.add(new VerseActivity("Yaasin", "۞ وَمَآ أَنزَلْنَا عَلَىٰ قَوْمِهِۦ مِنۢ بَعْدِهِۦ مِن جُندٍ مِّنَ ٱلسَّمَآءِ وَمَا كُنَّا مُنزِلِينَ", "And We sent not down against his People, after him, any hosts from heaven, nor was it needful for Us so to do.", R.raw.yaasin28));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِن كَانَتْ إِلَّا صَيْحَةً وَٰحِدَةً فَإِذَا هُمْ خَٰمِدُونَ", "It was no more than a single mighty Blast, and behold! they were (like ashes) quenched and silent.", R.raw.yaasin29));
        arrayList.add(new VerseActivity("Yaasin", "﻿يَٰحَسْرَةً عَلَى ٱلْعِبَادِ ۚ مَا يَأْتِيهِم مِّن رَّسُولٍ إِلَّا كَانُوا۟ بِهِۦ يَسْتَهْزِءُونَ", "Ah! Alas for (My) Servants! There comes not an apostle to them but they mock him!", R.raw.yaasin30));

        /*ayat 31-40*/
        arrayList.add(new VerseActivity("Yaasin", "﻿أَلَمْ يَرَوْا۟ كَمْ أَهْلَكْنَا قَبْلَهُم مِّنَ ٱلْقُرُونِ أَنَّهُمْ إِلَيْهِمْ لَا يَرْجِعُونَ", "See they not how many generations before them we destroyed? Not to them will they return:", R.raw.yaasin31));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَإِنْ كُلٌّ لَمَّا جَمِيعٌ لَدَيْنَا مُحْضَرُونَ", "But each one of them all - will be brought before Us (for judgment).", R.raw.yaasin32));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَآيَةٌ لَهُمُ الْأَرْضُ الْمَيْتَةُ أَحْيَيْنَاهَا وَأَخْرَجْنَا مِنْهَا حَبًّا فَمِنْهُ يَأْكُلُونَ", "A Sign for them is the earth that is dead: We do give it life, and produce grain therefrom, of which ye do eat.", R.raw.yaasin33));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَجَعَلْنَا فِيهَا جَنَّاتٍ مِنْ نَخِيلٍ وَأَعْنَابٍ وَفَجَّرْنَا فِيهَا مِنَ الْعُيُونِ", "And We produce therein orchard with date-palms and vines, and We cause springs to gush forth therein:", R.raw.yaasin34));
        arrayList.add(new VerseActivity("Yaasin", "لِيَأْكُلُوا۟ مِن ثَمَرِهِۦ وَمَا عَمِلَتْهُ أَيْدِيهِمْ ۖ أَفَلَا يَشْكُرُونَ", "That they may enjoy the fruits of this (artistry): It was not their hands that made this: will they not then give thanks?", R.raw.yaasin35));
        arrayList.add(new VerseActivity("Yaasin", "سُبْحَـٰنَ ٱلَّذِى خَلَقَ ٱلْأَزْوَٰجَ كُلَّهَا مِمَّا تُنۢبِتُ ٱلْأَرْضُ وَمِنْ أَنفُسِهِمْ وَمِمَّا لَا يَعْلَمُونَ", "Glory to Allah, Who created in pairs all things that the earth produces, as well as their own (human) kind and (other) things of which they have no knowledge.", R.raw.yaasin36));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَءَايَةٌ لَّهُمُ ٱلَّيْلُ نَسْلَخُ مِنْهُ ٱلنَّهَارَ فَإِذَا هُم مُّظْلِمُونَ", "And a Sign for them is the Night: We withdraw therefrom the Day, and behold they are plunged in darkness;", R.raw.yaasin37));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَٱلشَّمْسُ تَجْرِى لِمُسْتَقَرٍّۢ لَّهَا ۚ ذَٰلِكَ تَقْدِيرُ ٱلْعَزِيزِ ٱلْعَلِيمِ", "And the sun runs his course for a period determined for him: that is the decree of (Him), the Exalted in Might, the All-Knowing.", R.raw.yaasin38));
        arrayList.add(new VerseActivity("Yaasin", "وَٱلْقَمَرَ قَدَّرْنَـٰهُ مَنَازِلَ حَتَّىٰ عَادَ كَٱلْعُرْجُونِ ٱلْقَدِيمِ", "And the Moon,- We have measured for her mansions (to traverse) till she returns like the old (and withered) lower part of a date-stalk.", R.raw.yaasin39));
        arrayList.add(new VerseActivity("Yaasin", "﻿لَا ٱلشَّمْسُ يَنۢبَغِى لَهَآ أَن تُدْرِكَ ٱلْقَمَرَ وَلَا ٱلَّيْلُ سَابِقُ ٱلنَّهَارِ ۚ وَكُلٌّ فِى فَلَكٍ يَسْبَحُونَ", "It is not permitted to the Sun to catch up the Moon, nor can the Night outstrip the Day: Each (just) swims along in (its own) orbit (according to Law).", R.raw.yaasin40));

        /*ayat 41-50*/
        arrayList.add(new VerseActivity("Yaasin", "﻿وَءَايَةٌ لَّهُمْ أَنَّا حَمَلْنَا ذُرِّيَّتَهُمْ فِى ٱلْفُلْكِ ٱلْمَشْحُونِ", "And a Sign for them is that We bore their race (through the Flood) in the loaded Ark;", R.raw.yaasin41));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَخَلَقْنَا لَهُم مِّن مِّثْلِهِۦ مَا يَرْكَبُونَ", "And We have created for them similar (vessels) on which they ride.", R.raw.yaasin42));
        arrayList.add(new VerseActivity("Yaasin", "﻿﻿وَإِن نَّشَأْ نُغْرِقْهُمْ فَلَا صَرِيخَ لَهُمْ وَلَا هُمْ يُنقَذُونَ", "If it were Our Will, We could drown them: then would there be no helper (to hear their cry), nor could they be delivered,", R.raw.yaasin43));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِلَّا رَحْمَةً مِّنَّا وَمَتَـٰعًا إِلَىٰ حِينٍ", "Except by way of Mercy from Us, and by way of (world) convenience (to serve them) for a time.", R.raw.yaasin44));
        arrayList.add(new VerseActivity("Yaasin", "وَإِذَا قِيلَ لَهُمُ ٱتَّقُوا۟ مَا بَيْنَ أَيْدِيكُمْ وَمَا خَلْفَكُمْ لَعَلَّكُمْ تُرْحَمُونَ﻿", "When they are told, \"Fear ye that which is before you and that which will be after you, in order that ye may receive Mercy,\" (they turn back).", R.raw.yaasin45));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَمَا تَأْتِيهِم مِّنْ ءَايَةٍ مِّنْ ءَايَـٰتِ رَبِّهِمْ إِلَّا كَانُوا۟ عَنْهَا مُعْرِضِينَ", "Not a Sign comes to them from among the Signs of their Lord, but they turn away therefrom.", R.raw.yaasin46));
        arrayList.add(new VerseActivity("Yaasin", "وَإِذَا قِيلَ لَهُمْ أَنفِقُوا۟ مِمَّا رَزَقَكُمُ ٱللَّـهُ قَالَ ٱلَّذِينَ كَفَرُوا۟ لِلَّذِينَ ءَامَنُوٓا۟ أَنُطْعِمُ مَن لَّوْ يَشَآءُ ٱللَّـهُ أَطْعَمَهُۥٓ إِنْ أَنتُمْ إِلَّا فِى ضَلَـٰلٍ مُّبِينٍ", "And when they are told, \"Spend ye of (the bounties) with which Allah has provided you,\" the Unbelievers say to those who believe: \"Shall we then feed those whom, if Allah had so willed, He would have fed, (Himself)?- Ye are in nothing but manifest error.\"", R.raw.yaasin47));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَيَقُولُونَ مَتَىٰ هَـٰذَا ٱلْوَعْدُ إِن كُنتُمْ صَـٰدِقِينَ﻿", "Further, they say, \"When will this promise (come to pass), if what ye say is true?\"", R.raw.yaasin48));
        arrayList.add(new VerseActivity("Yaasin", "﻿مَا يَنظُرُونَ إِلَّا صَيْحَةً وَٰحِدَةً تَأْخُذُهُمْ وَهُمْ يَخِصِّمُونَ", "They will not (have to) wait for aught but a single Blast: it will seize them while they are yet disputing among themselves!", R.raw.yaasin49));
        arrayList.add(new VerseActivity("Yaasin", "﻿فَلَا يَسْتَطِيعُونَ تَوْصِيَةً وَلَآ إِلَىٰٓ أَهْلِهِمْ يَرْجِعُونَ", "No (chance) will they then have, by will, to dispose (of their affairs), nor to return to their own people!", R.raw.yaasin50));

        /*ayat 51-60*/
        arrayList.add(new VerseActivity("Yaasin", "﻿وَنُفِخَ فِى ٱلصُّورِ فَإِذَا هُم مِّنَ ٱلْأَجْدَاثِ إِلَىٰ رَبِّهِمْ يَنسِلُونَ", "The trumpet shall be sounded, when behold! from the sepulchres (men) will rush forth to their Lord!", R.raw.yaasin51));
        arrayList.add(new VerseActivity("Yaasin", "﻿قَالُوا۟ يَـٰوَيْلَنَا مَنۢ بَعَثَنَا مِن مَّرْقَدِنَا ۜ ۗ هَـٰذَا مَا وَعَدَ ٱلرَّحْمَـٰنُ وَصَدَقَ ٱلْمُرْسَلُونَ", "They will say: \"Ah! Woe unto us! Who hath raised us up from our beds of repose?\"... (A voice will say:) \"This is what ((Allah)) Most Gracious had promised. And true was the word of the apostles!\"", R.raw.yaasin52));
        arrayList.add(new VerseActivity("Yaasin", "﻿﻿إِن كَانَتْ إِلَّا صَيْحَةً وَٰحِدَةً فَإِذَا هُمْ جَمِيعٌ لَّدَيْنَا مُحْضَرُونَ", "It will be no more than a single Blast, when lo! they will all be brought up before Us!", R.raw.yaasin53));
        arrayList.add(new VerseActivity("Yaasin", "﻿فَٱلْيَوْمَ لَا تُظْلَمُ نَفْسٌ شَيْـًٔا وَلَا تُجْزَوْنَ إِلَّا مَا كُنتُمْ تَعْمَلُونَ", "Then, on that Day, not a soul will be wronged in the least, and ye shall but be repaid the meeds of your past Deeds.", R.raw.yaasin54));
        arrayList.add(new VerseActivity("Yaasin", "إِنَّ أَصْحَـٰبَ ٱلْجَنَّةِ ٱلْيَوْمَ فِى شُغُلٍ فَـٰكِهُونَ", "Verily the Companions of the Garden shall that Day have joy in all that they do;", R.raw.yaasin55));
        arrayList.add(new VerseActivity("Yaasin", "﻿هُمْ وَأَزْوَٰجُهُمْ فِى ظِلَـٰلٍ عَلَى ٱلْأَرَآئِكِ مُتَّكِـُٔونَ﻿", "They and their associates will be in groves of (cool) shade, reclining on Thrones (of dignity);", R.raw.yaasin56));
        arrayList.add(new VerseActivity("Yaasin", "لَهُمْ فِيهَا فَـٰكِهَةٌ وَلَهُم مَّا يَدَّعُونَ", "(Every) fruit (enjoyment) will be there for them; they shall have whatever they call for;", R.raw.yaasin57));
        arrayList.add(new VerseActivity("Yaasin", "﻿سَلَـٰمٌ قَوْلًا مِّن رَّبٍّۢ رَّحِيمٍ", "\"Peace!\" - a word (of salutation) from a Lord Most Merciful!", R.raw.yaasin58));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَٱمْتَـٰزُوا۟ ٱلْيَوْمَ أَيُّهَا ٱلْمُجْرِمُونَ", "\"And O ye in sin! Get ye apart this Day!", R.raw.yaasin59));
        arrayList.add(new VerseActivity("Yaasin", "﻿أَلَمْ أَعْهَدْ إِلَيْكُمْ يَـٰبَنِىٓ ءَادَمَ أَن لَّا تَعْبُدُوا۟ ٱلشَّيْطَـٰنَ ۖ إِنَّهُۥ لَكُمْ عَدُوٌّ مُّبِينٌ", "\"Did I not enjoin on you, O ye Children of Adam, that ye should not worship Satan; for that he was to you an enemy avowed?-", R.raw.yaasin60));

        /*ayat 61-70*/
        arrayList.add(new VerseActivity("Yaasin", "﻿وَأَنِ ٱعْبُدُونِى ۚ هَـٰذَا صِرَٰطٌ مُّسْتَقِيمٌ", "\"And that ye should worship Me, (for that) this was the Straight Way?", R.raw.yaasin61));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَلَقَدْ أَضَلَّ مِنكُمْ جِبِلًّا كَثِيرًا ۖ أَفَلَمْ تَكُونُوا۟ تَعْقِلُونَ", "\"But he did lead astray a great multitude of you. Did ye not, then, understand?", R.raw.yaasin62));
        arrayList.add(new VerseActivity("Yaasin", "﻿هَـٰذِهِۦ جَهَنَّمُ ٱلَّتِى كُنتُمْ تُوعَدُونَ", "\"This is the Hell of which ye were (repeatedly) warned!", R.raw.yaasin63));
        arrayList.add(new VerseActivity("Yaasin", "﻿ٱصْلَوْهَا ٱلْيَوْمَ بِمَا كُنتُمْ تَكْفُرُونَ", "\"Embrace ye the (fire) this Day, for that ye (persistently) rejected (Truth).\"", R.raw.yaasin64));
        arrayList.add(new VerseActivity("Yaasin", "﻿ٱلْيَوْمَ نَخْتِمُ عَلَىٰٓ أَفْوَٰهِهِمْ وَتُكَلِّمُنَآ أَيْدِيهِمْ وَتَشْهَدُ أَرْجُلُهُم بِمَا كَانُوا۟ يَكْسِبُونَ", "That Day shall We set a seal on their mouths. But their hands will speak to us, and their feet bear witness, to all that they did.", R.raw.yaasin65));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَلَوْ نَشَآءُ لَطَمَسْنَا عَلَىٰٓ أَعْيُنِهِمْ فَٱسْتَبَقُوا۟ ٱلصِّرَٰطَ فَأَنَّىٰ يُبْصِرُونَ", "If it had been our Will, We could surely have blotted out their eyes; then should they have run about groping for the Path, but how could they have seen?", R.raw.yaasin66));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَلَوْ نَشَآءُ لَمَسَخْنَٰهُمْ عَلَىٰ مَكَانَتِهِمْ فَمَا ٱسْتَطَٰعُوا۟ مُضِيًّا وَلَا يَرْجِعُونَ", "And if it had been Our Will, We could have transformed them (to remain) in their places; then should they have been unable to move about, nor could they have returned (after error).", R.raw.yaasin67));
        arrayList.add(new VerseActivity("Yaasin", "﻿﻿وَمَن نُّعَمِّرْهُ نُنَكِّسْهُ فِى ٱلْخَلْقِ ۖ أَفَلَا يَعْقِلُونَ", "If We grant long life to any, We cause him to be reversed in nature: Will they not then understand?", R.raw.yaasin68));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَمَا عَلَّمْنَٰهُ ٱلشِّعْرَ وَمَا يَنۢبَغِى لَهُۥٓ ۚ إِنْ هُوَ إِلَّا ذِكْرٌ وَقُرْءَانٌ مُّبِينٌ", "We have not instructed the (Prophet) in Poetry, nor is it meet for him: this is no less than a Message and a Qur'an making things clear:", R.raw.yaasin69));
        arrayList.add(new VerseActivity("Yaasin", "﻿لِّيُنذِرَ مَن كَانَ حَيًّا وَيَحِقَّ ٱلْقَوْلُ عَلَى ٱلْكَٰفِرِينَ﻿", "That it may give admonition to any (who are) alive, and that the charge may be proved against those who reject (Truth).", R.raw.yaasin70));

        /*ayat 71-80*/
        arrayList.add(new VerseActivity("Yaasin", "﻿أَوَلَمْ يَرَوْا۟ أَنَّا خَلَقْنَا لَهُم مِّمَّا عَمِلَتْ أَيْدِينَآ أَنْعَٰمًا فَهُمْ لَهَا مَٰلِكُونَ", "See they not that it is We Who have created for them - among the things which Our hands have fashioned - cattle, which are under their dominion?-", R.raw.yaasin71));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَذَلَّلْنَٰهَا لَهُمْ فَمِنْهَا رَكُوبُهُمْ وَمِنْهَا يَأْكُلُونَ", "And that We have subjected them to their (use)? of them some do carry them and some they eat:", R.raw.yaasin72));
        arrayList.add(new VerseActivity("Yaasin", "وَلَهُمْ فِيهَا مَنَٰفِعُ وَمَشَارِبُ ۖ أَفَلَا يَشْكُرُونَ", "And they have (other) profits from them (besides), and they get (milk) to drink. Will they not then be grateful?", R.raw.yaasin73));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَٱتَّخَذُوا۟ مِن دُونِ ٱللَّهِ ءَالِهَةً لَّعَلَّهُمْ يُنصَرُونَ", "Yet they take (for worship) gods other than Allah, (hoping) that they might be helped!", R.raw.yaasin74));
        arrayList.add(new VerseActivity("Yaasin", "﻿لَا يَسْتَطِيعُونَ نَصْرَهُمْ وَهُمْ لَهُمْ جُندٌ مُّحْضَرُونَ", "They have not the power to help them: but they will be brought up (before Our Judgment-seat) as a troop (to be condemned).", R.raw.yaasin75));
        arrayList.add(new VerseActivity("Yaasin", "﻿فَلَا يَحْزُنكَ قَوْلُهُمْ ۘ إِنَّا نَعْلَمُ مَا يُسِرُّونَ وَمَا يُعْلِنُونَ", "Let not their speech, then, grieve thee. Verily We know what they hide as well as what they disclose.", R.raw.yaasin76));
        arrayList.add(new VerseActivity("Yaasin", "﻿أَوَلَمْ يَرَ ٱلْإِنسَٰنُ أَنَّا خَلَقْنَٰهُ مِن نُّطْفَةٍ فَإِذَا هُوَ خَصِيمٌ مُّبِينٌ", "Doth not man see that it is We Who created him from sperm? yet behold! he (stands forth) as an open adversary!", R.raw.yaasin77));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَضَرَبَ لَنَا مَثَلًا وَنَسِىَ خَلْقَهُۥ ۖ قَالَ مَن يُحْىِ ٱلْعِظَٰمَ وَهِىَ رَمِيمٌ", "And he makes comparisons for Us, and forgets his own (origin and) Creation: He says, \"Who can give life to (dry) bones and decomposed ones (at that)?\"", R.raw.yaasin78));
        arrayList.add(new VerseActivity("Yaasin", "﻿قُلْ يُحْيِيهَا ٱلَّذِىٓ أَنشَأَهَآ أَوَّلَ مَرَّةٍ ۖ وَهُوَ بِكُلِّ خَلْقٍ عَلِيمٌ", "Say, \"He will give them life Who created them for the first time! for He is Well-versed in every kind of creation!-", R.raw.yaasin79));
        arrayList.add(new VerseActivity("Yaasin", "ٱلَّذِى جَعَلَ لَكُم مِّنَ ٱلشَّجَرِ ٱلْأَخْضَرِ نَارًا فَإِذَآ أَنتُم مِّنْهُ تُوقِدُونَ﻿", "\"The same Who produces for you fire out of the green tree, when behold! ye kindle therewith (your own fires)!", R.raw.yaasin80));

        /*ayat 81-90*/
        arrayList.add(new VerseActivity("Yaasin", "أَوَلَيْسَ ٱلَّذِى خَلَقَ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضَ بِقَٰدِرٍ عَلَىٰٓ أَن يَخْلُقَ مِثْلَهُم ۚ بَلَىٰ وَهُوَ ٱلْخَلَّٰقُ ٱلْعَلِيمُ", "\"Is not He Who created the heavens and the earth able to create the like thereof?\" - Yea, indeed! for He is the Creator Supreme, of skill and knowledge (infinite)!", R.raw.yaasin81));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنَّمَآ أَمْرُهُۥٓ إِذَآ أَرَادَ شَيْـًٔا أَن يَقُولَ لَهُۥ كُن فَيَكُونُ", "Verily, when He intends a thing, His Command is, \"be\", and it is!", R.raw.yaasin82));
        arrayList.add(new VerseActivity("Yaasin", "﻿﻿فَسُبْحَٰنَ ٱلَّذِى بِيَدِهِۦ مَلَكُوتُ كُلِّ شَىْءٍ وَإِلَيْهِ تُرْجَعُونَ", "So glory to Him in Whose hands is the dominion of all things: and to Him will ye be all brought back.", R.raw.yaasin83));

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
                mp = MediaPlayer.create(this, R.raw.yaasinfull);
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
                Intent i = new Intent(SurahYaasinEnglish.this, SurahYaasinMalay.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}