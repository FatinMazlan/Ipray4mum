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

public class SurahMaryamEnglish extends AppCompatActivity {
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
        arrayList.add(new VerseActivity("Maryam", "كٓهيعٓصٓ", "Kaaf, Haa, Yaa, Ain, Saad", R.raw.maryam1));
        arrayList.add(new VerseActivity("Maryam", "ذِكْرُ رَحْمَتِ رَبِّكَ عَبْدَهُۥ زَكَرِيَّآ", "(This is) a recital of the Mercy of thy Lord to His servant Zakariya.", R.raw.maryam2));
        arrayList.add(new VerseActivity("Maryam", "إِذْ نَادَىٰ رَبَّهُۥ نِدَآءً خَفِيًّا", "Behold! he cried to his Lord in secret,", R.raw.maryam3));
        arrayList.add(new VerseActivity("Maryam", "قَالَ رَبِّ إِنِّى وَهَنَ ٱلْعَظْمُ مِنِّى وَٱشْتَعَلَ ٱلرَّأْسُ شَيْبًا وَلَمْ أَكُنۢ بِدُعَآئِكَ رَبِّ شَقِيًّا", "Praying: \"O my Lord! infirm indeed are my bones, and the hair of my head doth glisten with grey: but never am I unblest, O my Lord, in my prayer to Thee!", R.raw.maryam4));
        arrayList.add(new VerseActivity("Maryam", "وَإِنِّى خِفْتُ ٱلْمَوَ‌ٰلِىَ مِن وَرَآءِى وَكَانَتِ ٱمْرَأَتِى عَاقِرًا فَهَبْ لِى مِن لَّدُنكَ وَلِيًّا", "\"Now I fear (what) my relatives (and colleagues) (will do) after me: but my wife is barren: so give me an heir as from Thyself,-", R.raw.maryam5));
        arrayList.add(new VerseActivity("Maryam", "يَرِثُنِى وَيَرِثُ مِنْ ءَالِ يَعْقُوبَ ۖ وَٱجْعَلْهُ رَبِّ رَضِيًّا", "\"(One that) will (truly) represent me, and represent the posterity of Yacob; and make him, O my Lord! one with whom Thou art well-pleased!\"", R.raw.maryam6));
        arrayList.add(new VerseActivity("Maryam", "﻿يَـٰزَكَرِيَّآ إِنَّا نُبَشِّرُكَ بِغُلَـٰمٍ ٱسْمُهُۥ يَحْيَىٰ لَمْ نَجْعَل لَّهُۥ مِن قَبْلُ سَمِيًّا", "(His prayer was answered): \"O Zakariya! We give thee good news of a son: His name shall be Yahya: on none by that name have We conferred distinction before.\"", R.raw.maryam7));
        arrayList.add(new VerseActivity("Maryam", "قَالَ رَبِّ أَنَّىٰ يَكُونُ لِى غُلَـٰمٌ وَكَانَتِ ٱمْرَأَتِى عَاقِرًا وَقَدْ بَلَغْتُ مِنَ ٱلْكِبَرِ عِتِيًّا", "He said: \"O my Lord! How shall I have a son, when my wife is barren and I have grown quite decrepit from old age?\"", R.raw.maryam8));
        arrayList.add(new VerseActivity("Maryam", "﻿قَالَ كَذَ‌ٰلِكَ قَالَ رَبُّكَ هُوَ عَلَىَّ هَيِّنٌ وَقَدْ خَلَقْتُكَ مِن قَبْلُ وَلَمْ تَكُ شَيْـًٔا", "He said: \"So (it will be) thy Lord saith, 'that is easy for Me: I did indeed create thee before, when thou hadst been nothing!'\"", R.raw.maryam9));
        arrayList.add(new VerseActivity("Maryam", "﻿قَالَ رَبِّ ٱجْعَل لِّىٓ ءَايَةً ۚ قَالَ ءَايَتُكَ أَلَّا تُكَلِّمَ ٱلنَّاسَ ثَلَـٰثَ لَيَالٍ سَوِيًّا", "(Zakariya) said: \"O my Lord! give me a Sign.\" \"Thy Sign,\" was the answer, \"Shall be that thou shalt speak to no man for three nights, although thou art not dumb.\"", R.raw.maryam10));

        /*ayat 11-20*/
        arrayList.add(new VerseActivity("Maryam", "فَخَرَجَ عَلَىٰ قَوْمِهِۦ مِنَ ٱلْمِحْرَابِ فَأَوْحَىٰٓ إِلَيْهِمْ أَن سَبِّحُوا۟ بُكْرَةً وَعَشِيًّا", "So Zakariya came out to his people from his chamber: He told them by signs to celebrate Allah.s praises in the morning and in the evening.", R.raw.maryam11));
        arrayList.add(new VerseActivity("Maryam", "﻿يَـٰيَحْيَىٰ خُذِ ٱلْكِتَـٰبَ بِقُوَّةٍ ۖ وَءَاتَيْنَـٰهُ ٱلْحُكْمَ صَبِيًّا", "(To his son came the command): \"O Yahya! take hold of the Book with might\": and We gave him Wisdom even as a youth,", R.raw.maryam12));
        arrayList.add(new VerseActivity("Maryam", "وَحَنَانًا مِّن لَّدُنَّا وَزَكَو‌ٰةً ۖ وَكَانَ تَقِيًّا", "And piety (for all creatures) as from Us, and purity: He was devout,", R.raw.maryam13));
        arrayList.add(new VerseActivity("Maryam", "﻿وَبَرًّۢا بِوَ‌ٰلِدَيْهِ وَلَمْ يَكُن جَبَّارًا عَصِيًّا", "And kind to his parents, and he was not overbearing or rebellious.", R.raw.maryam14));
        arrayList.add(new VerseActivity("Maryam", "﻿وَسَلَـٰمٌ عَلَيْهِ يَوْمَ وُلِدَ وَيَوْمَ يَمُوتُ وَيَوْمَ يُبْعَثُ حَيًّا", "So Peace on him the day he was born, the day that he dies, and the day that he will be raised up to life (again)!", R.raw.maryam15));
        arrayList.add(new VerseActivity("Maryam", "﻿وَٱذْكُرْ فِى ٱلْكِتَـٰبِ مَرْيَمَ إِذِ ٱنتَبَذَتْ مِنْ أَهْلِهَا مَكَانًا شَرْقِيًّا", "Relate in the Book (the story of) Mary, when she withdrew from her family to a place in the East.", R.raw.maryam16));
        arrayList.add(new VerseActivity("Maryam", "﻿فَٱتَّخَذَتْ مِن دُونِهِمْ حِجَابًا فَأَرْسَلْنَآ إِلَيْهَا رُوحَنَا فَتَمَثَّلَ لَهَا بَشَرًا سَوِيًّا", "She placed a screen (to screen herself) from them; then We sent her our angel, and he appeared before her as a man in all respects.", R.raw.maryam17));
        arrayList.add(new VerseActivity("Maryam", "قَالَتْ إِنِّىٓ أَعُوذُ بِٱلرَّحْمَـٰنِ مِنكَ إِن كُنتَ تَقِيًّا", "She said: \"I seek refuge from thee to ((Allah)) Most Gracious: (come not near) if thou dost fear Allah.\"", R.raw.maryam18));
        arrayList.add(new VerseActivity("Maryam", "قَالَ إِنَّمَآ أَنَا۠ رَسُولُ رَبِّكِ لِأَهَبَ لَكِ غُلَـٰمًا زَكِيًّا", "He said: \"Nay, I am only a messenger from thy Lord, (to announce) to thee the gift of a holy son.", R.raw.maryam19));
        arrayList.add(new VerseActivity("Maryam", "قَالَتْ أَنَّىٰ يَكُونُ لِى غُلَـٰمٌ وَلَمْ يَمْسَسْنِى بَشَرٌ وَلَمْ أَكُ بَغِيًّا", "She said: \"How shall I have a son, seeing that no man has touched me, and I am not unchaste?\"", R.raw.maryam20));

        /*ayat 21-30*/
        arrayList.add(new VerseActivity("Maryam", "قَالَ كَذَ‌ٰلِكِ قَالَ رَبُّكِ هُوَ عَلَىَّ هَيِّنٌ ۖ وَلِنَجْعَلَهُۥٓ ءَايَةً لِّلنَّاسِ وَرَحْمَةً مِّنَّا ۚ وَكَانَ أَمْرًا مَّقْضِيًّا", "He said: \"So (it will be): Thy Lord saith, 'that is easy for Me: and (We wish) to appoint him as a Sign unto men and a Mercy from Us':It is a matter (so) decreed.\"", R.raw.maryam21));
        arrayList.add(new VerseActivity("Maryam", "۞ فَحَمَلَتْهُ فَٱنتَبَذَتْ بِهِۦ مَكَانًا قَصِيًّا", "So she conceived him, and she retired with him to a remote place.", R.raw.maryam22));
        arrayList.add(new VerseActivity("Maryam", "فَأَجَآءَهَا ٱلْمَخَاضُ إِلَىٰ جِذْعِ ٱلنَّخْلَةِ قَالَتْ يَـٰلَيْتَنِى مِتُّ قَبْلَ هَـٰذَا وَكُنتُ نَسْيًا مَّنسِيًّا", "And the pains of childbirth drove her to the trunk of a palm-tree: She cried (in her anguish): \"Ah! would that I had died before this! would that I had been a thing forgotten and out of sight!\"", R.raw.maryam23));
        arrayList.add(new VerseActivity("Maryam", "فَنَادَىٰهَا مِن تَحْتِهَآ أَلَّا تَحْزَنِى قَدْ جَعَلَ رَبُّكِ تَحْتَكِ سَرِيًّا", "But (a voice) cried to her from beneath the (palm-tree): \"Grieve not! for thy Lord hath provided a rivulet beneath thee;", R.raw.maryam24));
        arrayList.add(new VerseActivity("Maryam", "﻿وَهُزِّىٓ إِلَيْكِ بِجِذْعِ ٱلنَّخْلَةِ تُسَٰقِطْ عَلَيْكِ رُطَبًا جَنِيًّا", "\"And shake towards thyself the trunk of the palm-tree: It will let fall fresh ripe dates upon thee.", R.raw.maryam25));
        arrayList.add(new VerseActivity("Maryam", "فَكُلِى وَٱشْرَبِى وَقَرِّى عَيْنًا ۖ فَإِمَّا تَرَيِنَّ مِنَ ٱلْبَشَرِ أَحَدًا فَقُولِىٓ إِنِّى نَذَرْتُ لِلرَّحْمَٰنِ صَوْمًا فَلَنْ أُكَلِّمَ ٱلْيَوْمَ إِنسِيًّا", "\"So eat and drink and cool (thine) eye. And if thou dost see any man, say, 'I have vowed a fast to ((Allah)) Most Gracious, and this day will I enter into not talk with any human being'\"", R.raw.maryam26));
        arrayList.add(new VerseActivity("Maryam", "﻿فَأَتَتْ بِهِۦ قَوْمَهَا تَحْمِلُهُۥ ۖ قَالُوا۟ يَٰمَرْيَمُ لَقَدْ جِئْتِ شَيْـًٔا فَرِيًّا", "At length she brought the (babe) to her people, carrying him (in her arms). They said: \"O Mary! truly an amazing thing hast thou brought!", R.raw.maryam27));
        arrayList.add(new VerseActivity("Maryam", "﻿يَٰٓأُخْتَ هَٰرُونَ مَا كَانَ أَبُوكِ ٱمْرَأَ سَوْءٍ وَمَا كَانَتْ أُمُّكِ بَغِيًّا", "\"O sister of Aaron! Thy father was not a man of evil, nor thy mother a woman unchaste!\"", R.raw.maryam28));
        arrayList.add(new VerseActivity("Maryam", "﻿فَأَشَارَتْ إِلَيْهِ ۖ قَالُوا۟ كَيْفَ نُكَلِّمُ مَن كَانَ فِى ٱلْمَهْدِ صَبِيًّا", "But she pointed to the babe. They said: \"How can we talk to one who is a child in the cradle?\"", R.raw.maryam29));
        arrayList.add(new VerseActivity("Maryam", "﻿قَالَ إِنِّى عَبْدُ ٱللَّهِ ءَاتَىٰنِىَ ٱلْكِتَٰبَ وَجَعَلَنِى نَبِيًّا", "He said: \"I am indeed a servant of Allah. He hath given me revelation and made me a prophet;", R.raw.maryam30));

        /*ayat 31-40*/
        arrayList.add(new VerseActivity("Maryam", "﻿وَجَعَلَنِى مُبَارَكًا أَيْنَ مَا كُنتُ وَأَوْصَٰنِى بِٱلصَّلَوٰةِ وَٱلزَّكَوٰةِ مَا دُمْتُ حَيًّا", "\"And He hath made me blessed wheresoever I be, and hath enjoined on me Prayer and Charity as long as I live;", R.raw.maryam31));
        arrayList.add(new VerseActivity("Maryam", "﻿وَبَرًّۢا بِوَٰلِدَتِى وَلَمْ يَجْعَلْنِى جَبَّارًا شَقِيًّا", "\"(He) hath made me kind to my mother, and not overbearing or miserable;", R.raw.maryam32));
        arrayList.add(new VerseActivity("Maryam", "وَٱلسَّلَٰمُ عَلَىَّ يَوْمَ وُلِدتُّ وَيَوْمَ أَمُوتُ وَيَوْمَ أُبْعَثُ حَيًّا", "\"So peace is on me the day I was born, the day that I die, and the day that I shall be raised up to life (again)\"!", R.raw.maryam33));
        arrayList.add(new VerseActivity("Maryam", "﻿ذَٰلِكَ عِيسَى ٱبْنُ مَرْيَمَ ۚ قَوْلَ ٱلْحَقِّ ٱلَّذِى فِيهِ يَمْتَرُونَ", "Such (was) Isa the son of Maryam: (it is) a statement of truth, about which they (vainly) dispute.", R.raw.maryam34));
        arrayList.add(new VerseActivity("Maryam", "مَا كَانَ لِلَّهِ أَن يَتَّخِذَ مِن وَلَدٍ ۖ سُبْحَٰنَهُۥٓ ۚ إِذَا قَضَىٰٓ أَمْرًا فَإِنَّمَا يَقُولُ لَهُۥ كُن فَيَكُونُ", "It is not befitting to (the majesty of) Allah that He should beget a son. Glory be to Him! when He determines a matter, He only says to it, \"Be\", and it is.", R.raw.maryam35));
        arrayList.add(new VerseActivity("Maryam", "﻿وَإِنَّ ٱللَّهَ رَبِّى وَرَبُّكُمْ فَٱعْبُدُوهُ ۚ هَٰذَا صِرَٰطٌ مُّسْتَقِيمٌ", "Verily Allah is my Lord and your Lord: Him therefore serve ye: this is a Way that is straight.", R.raw.maryam36));
        arrayList.add(new VerseActivity("Maryam", "فَٱخْتَلَفَ ٱلْأَحْزَابُ مِنۢ بَيْنِهِمْ ۖ فَوَيْلٌ لِّلَّذِينَ كَفَرُوا۟ مِن مَّشْهَدِ يَوْمٍ عَظِيمٍ", "But the sects differ among themselves: and woe to the unbelievers because of the (coming) Judgment of a Momentous Day!", R.raw.maryam37));
        arrayList.add(new VerseActivity("Maryam", "﻿أَسْمِعْ بِهِمْ وَأَبْصِرْ يَوْمَ يَأْتُونَنَا ۖ لَٰكِنِ ٱلظَّٰلِمُونَ ٱلْيَوْمَ فِى ضَلَٰلٍ مُّبِينٍ", "How plainly will they see and hear, the Day that they will appear before Us! but the unjust today are in error manifest!", R.raw.maryam38));
        arrayList.add(new VerseActivity("Maryam", "وَأَنذِرْهُمْ يَوْمَ ٱلْحَسْرَةِ إِذْ قُضِىَ ٱلْأَمْرُ وَهُمْ فِى غَفْلَةٍ وَهُمْ لَا يُؤْمِنُونَ", "But warn them of the Day of Distress, when the matter will be determined: for (behold,) they are negligent and they do not believe!", R.raw.maryam39));
        arrayList.add(new VerseActivity("Maryam", "﻿إِنَّا نَحْنُ نَرِثُ ٱلْأَرْضَ وَمَنْ عَلَيْهَا وَإِلَيْنَا يُرْجَعُونَ", "It is We Who will inherit the earth, and all beings thereon: to Us will they all be returned.", R.raw.maryam40));

        /*ayat 41-50*/
        arrayList.add(new VerseActivity("Maryam", "وَٱذْكُرْ فِى ٱلْكِتَٰبِ إِبْرَٰهِيمَ ۚ إِنَّهُۥ كَانَ صِدِّيقًا نَّبِيًّا", "(Also mention in the Book (the story of) Ibrahim: He was a man of Truth, a prophet.", R.raw.maryam41));
        arrayList.add(new VerseActivity("Maryam", "إِذْ قَالَ لِأَبِيهِ يَٰٓأَبَتِ لِمَ تَعْبُدُ مَا لَا يَسْمَعُ وَلَا يُبْصِرُ وَلَا يُغْنِى عَنكَ شَيْـًٔا", "Behold, he said to his father: \"O my father! why worship that which heareth not and seeth not, and can profit thee nothing?", R.raw.maryam42));
        arrayList.add(new VerseActivity("Maryam", "يَٰٓأَبَتِ إِنِّى قَدْ جَآءَنِى مِنَ ٱلْعِلْمِ مَا لَمْ يَأْتِكَ فَٱتَّبِعْنِىٓ أَهْدِكَ صِرَٰطًا سَوِيًّا", "\"O my father! to me hath come knowledge which hath not reached thee: so follow me: I will guide thee to a way that is even and straight.", R.raw.maryam43));
        arrayList.add(new VerseActivity("Maryam", "يَٰٓأَبَتِ لَا تَعْبُدِ ٱلشَّيْطَٰنَ ۖ إِنَّ ٱلشَّيْطَٰنَ كَانَ لِلرَّحْمَٰنِ عَصِيًّا", "\"O my father! serve not Satan: for Satan is a rebel against ((Allah)) Most Gracious.", R.raw.maryam44));
        arrayList.add(new VerseActivity("Maryam", "يَٰٓأَبَتِ إِنِّىٓ أَخَافُ أَن يَمَسَّكَ عَذَابٌ مِّنَ ٱلرَّحْمَٰنِ فَتَكُونَ لِلشَّيْطَٰنِ وَلِيًّا", "\"O my father! I fear lest a Penalty afflict thee from ((Allah)) Most Gracious, so that thou become to Satan a friend.\"", R.raw.maryam45));
        arrayList.add(new VerseActivity("Maryam", "قَالَ أَرَاغِبٌ أَنتَ عَنْ ءَالِهَتِى يَٰٓإِبْرَٰهِيمُ ۖ لَئِن لَّمْ تَنتَهِ لَأَرْجُمَنَّكَ ۖ وَٱهْجُرْنِى مَلِيًّا", "(The father) replied: \"Dost thou hate my gods, O Ibrahim? If thou forbear not, I will indeed stone thee: Now get away from me for a good long while!\"", R.raw.maryam46));
        arrayList.add(new VerseActivity("Maryam", "قَالَ سَلَٰمٌ عَلَيْكَ ۖ سَأَسْتَغْفِرُ لَكَ رَبِّىٓ ۖ إِنَّهُۥ كَانَ بِى حَفِيًّا", "Ibrahim said: \"Peace be on thee: I will pray to my Lord for thy forgiveness: for He is to me Most Gracious.", R.raw.maryam47));
        arrayList.add(new VerseActivity("Maryam", "وَأَعْتَزِلُكُمْ وَمَا تَدْعُونَ مِن دُونِ ٱللَّهِ وَأَدْعُوا۟ رَبِّى عَسَىٰٓ أَلَّآ أَكُونَ بِدُعَآءِ رَبِّى شَقِيًّا", "\"And I will turn away from you (all) and from those whom ye invoke besides Allah. I will call on my Lord: perhaps, by my prayer to my Lord, I shall be not unblest.\"", R.raw.maryam48));
        arrayList.add(new VerseActivity("Maryam", "فَلَمَّا ٱعْتَزَلَهُمْ وَمَا يَعْبُدُونَ مِن دُونِ ٱللَّهِ وَهَبْنَا لَهُۥٓ إِسْحَٰقَ وَيَعْقُوبَ ۖ وَكُلًّا جَعَلْنَا نَبِيًّا", "When he had turned away from them and from those whom they worshipped besides Allah, We bestowed on him Ishak and Yacob, and each one of them We made a prophet.", R.raw.maryam49));
        arrayList.add(new VerseActivity("Maryam", "﻿وَوَهَبْنَا لَهُم مِّن رَّحْمَتِنَا وَجَعَلْنَا لَهُمْ لِسَانَ صِدْقٍ عَلِيًّا", "And We bestowed of Our Mercy on them, and We granted them lofty honour on the tongue of truth.", R.raw.maryam50));

        /*ayat 51-60*/
        arrayList.add(new VerseActivity("Maryam", "﻿وَٱذْكُرْ فِى ٱلْكِتَٰبِ مُوسَىٰٓ ۚ إِنَّهُۥ كَانَ مُخْلَصًا وَكَانَ رَسُولًا نَّبِيًّا", "Also mention in the Book (the story of) Moses: for he was specially chosen, and he was an apostle (and) a prophet.", R.raw.maryam51));
        arrayList.add(new VerseActivity("Maryam", "﻿وَنَٰدَيْنَٰهُ مِن جَانِبِ ٱلطُّورِ ٱلْأَيْمَنِ وَقَرَّبْنَٰهُ نَجِيًّا", "And we called him from the right side of Mount (Sinai), and made him draw near to Us, for mystic (converse).", R.raw.maryam52));
        arrayList.add(new VerseActivity("Maryam", "﻿وَوَهَبْنَا لَهُۥ مِن رَّحْمَتِنَآ أَخَاهُ هَٰرُونَ نَبِيًّا", "And, out of Our Mercy, We gave him his brother Harun, (also) a prophet.", R.raw.maryam53));
        arrayList.add(new VerseActivity("Maryam", "﻿وَٱذْكُرْ فِى ٱلْكِتَٰبِ إِسْمَٰعِيلَ ۚ إِنَّهُۥ كَانَ صَادِقَ ٱلْوَعْدِ وَكَانَ رَسُولًا نَّبِيًّا", "Also mention in the Book (the story of) Isma'il: He was (strictly) true to what he promised, and he was an apostle (and) a prophet.", R.raw.maryam54));
        arrayList.add(new VerseActivity("Maryam", "﻿وَكَانَ يَأْمُرُ أَهْلَهُۥ بِٱلصَّلَوٰةِ وَٱلزَّكَوٰةِ وَكَانَ عِندَ رَبِّهِۦ مَرْضِيًّا", "He used to enjoin on his people Prayer and Charity, and he was most acceptable in the sight of his Lord.", R.raw.maryam55));
        arrayList.add(new VerseActivity("Maryam", "﻿وَٱذْكُرْ فِى ٱلْكِتَٰبِ إِدْرِيسَ ۚ إِنَّهُۥ كَانَ صِدِّيقًا نَّبِيًّا", "Also mention in the Book the case of Idris: He was a man of truth (and sincerity), (and) a prophet:", R.raw.maryam56));
        arrayList.add(new VerseActivity("Maryam", "وَرَفَعْنَٰهُ مَكَانًا عَلِيًّا", "And We raised him to a lofty station.", R.raw.maryam57));
        arrayList.add(new VerseActivity("Maryam", "أُو۟لَٰٓئِكَ ٱلَّذِينَ أَنْعَمَ ٱللَّهُ عَلَيْهِم مِّنَ ٱلنَّبِيِّۦنَ مِن ذُرِّيَّةِ ءَادَمَ وَمِمَّنْ حَمَلْنَا مَعَ نُوحٍ وَمِن ذُرِّيَّةِ إِبْرَٰهِيمَ وَإِسْرَٰٓءِيلَ وَمِمَّنْ هَدَيْنَا وَٱجْتَبَيْنَآ ۚ إِذَا تُتْلَىٰ عَلَيْهِمْ ءَايَٰتُ ٱلرَّحْمَٰنِ خَرُّوا۟ سُجَّدًا وَبُكِيًّا ۩", "Those were some of the prophets on whom Allah did bestow His Grace,- of the posterity of Adam, and of those who We carried (in the Ark) with Nuh, and of the posterity of Ibrahim and Israel of those whom We guided and chose. Whenever the Signs of ((Allah)) Most Gracious were rehearsed to them, they would fall down in prostrate adoration and in tears.", R.raw.maryam58));
        arrayList.add(new VerseActivity("Maryam", "۞ فَخَلَفَ مِنۢ بَعْدِهِمْ خَلْفٌ أَضَاعُوا۟ ٱلصَّلَوٰةَ وَٱتَّبَعُوا۟ ٱلشَّهَوَٰتِ ۖ فَسَوْفَ يَلْقَوْنَ غَيًّا", "But after them there followed a posterity who missed prayers and followed after lusts soon, then, will they face Destruction,-", R.raw.maryam59));
        arrayList.add(new VerseActivity("Maryam", "﻿إِلَّا مَن تَابَ وَءَامَنَ وَعَمِلَ صَٰلِحًا فَأُو۟لَٰٓئِكَ يَدْخُلُونَ ٱلْجَنَّةَ وَلَا يُظْلَمُونَ شَيْـًٔا", "Except those who repent and believe, and work righteousness: for these will enter the Garden and will not be wronged in the least,-", R.raw.maryam60));

        /*ayat 61-70*/
        arrayList.add(new VerseActivity("Maryam", "﻿جَنَّٰتِ عَدْنٍ ٱلَّتِى وَعَدَ ٱلرَّحْمَٰنُ عِبَادَهُۥ بِٱلْغَيْبِ ۚ إِنَّهُۥ كَانَ وَعْدُهُۥ مَأْتِيًّا", "Gardens of Eternity, those which ((Allah)) Most Gracious has promised to His servants in the Unseen: for His promise must (necessarily) come to pass.", R.raw.maryam61));
        arrayList.add(new VerseActivity("Maryam", "لَّا يَسْمَعُونَ فِيهَا لَغْوًا إِلَّا سَلَٰمًا ۖ وَلَهُمْ رِزْقُهُمْ فِيهَا بُكْرَةً وَعَشِيًّا", "They will not there hear any vain discourse, but only salutations of Peace: And they will have therein their sustenance, morning and evening.", R.raw.maryam62));
        arrayList.add(new VerseActivity("Maryam", "﻿تِلْكَ ٱلْجَنَّةُ ٱلَّتِى نُورِثُ مِنْ عِبَادِنَا مَن كَانَ تَقِيًّا", "Such is the Garden which We give as an inheritance to those of Our servants who guard against Evil.", R.raw.maryam63));
        arrayList.add(new VerseActivity("Maryam", "وَمَا نَتَنَزَّلُ إِلَّا بِأَمْرِ رَبِّكَ ۖ لَهُۥ مَا بَيْنَ أَيْدِينَا وَمَا خَلْفَنَا وَمَا بَيْنَ ذَٰلِكَ ۚ وَمَا كَانَ رَبُّكَ نَسِيًّا", "(The angels say:) \"We descend not but by command of thy Lord: to Him belongeth what is before us and what is behind us, and what is between: and thy Lord never doth forget,-", R.raw.maryam64));
        arrayList.add(new VerseActivity("Maryam", "رَّبُّ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضِ وَمَا بَيْنَهُمَا فَٱعْبُدْهُ وَٱصْطَبِرْ لِعِبَٰدَتِهِۦ ۚ هَلْ تَعْلَمُ لَهُۥ سَمِيًّا", "\"Lord of the heavens and of the earth, and of all that is between them; so worship Him, and be constant and patient in His worship: knowest thou of any who is worthy of the same Name as He?\"", R.raw.maryam65));
        arrayList.add(new VerseActivity("Maryam", "وَيَقُولُ ٱلْإِنسَٰنُ أَءِذَا مَا مِتُّ لَسَوْفَ أُخْرَجُ حَيًّا", "Man says: \"What! When I am dead, shall I then be raised up alive?\"", R.raw.maryam66));
        arrayList.add(new VerseActivity("Maryam", "﻿أَوَلَا يَذْكُرُ ٱلْإِنسَٰنُ أَنَّا خَلَقْنَٰهُ مِن قَبْلُ وَلَمْ يَكُ شَيْـًٔا", "But does not man call to mind that We created him before out of nothing?", R.raw.maryam67));
        arrayList.add(new VerseActivity("Maryam", "﻿فَوَرَبِّكَ لَنَحْشُرَنَّهُمْ وَٱلشَّيَٰطِينَ ثُمَّ لَنُحْضِرَنَّهُمْ حَوْلَ جَهَنَّمَ جِثِيًّا", "So, by thy Lord, without doubt, We shall gather them together, and (also) the Evil Ones (with them); then shall We bring them forth on their knees round about Hell;", R.raw.maryam68));
        arrayList.add(new VerseActivity("Maryam", "ثُمَّ لَنَنزِعَنَّ مِن كُلِّ شِيعَةٍ أَيُّهُمْ أَشَدُّ عَلَى ٱلرَّحْمَٰنِ عِتِيًّا", "Then shall We certainly drag out from every sect all those who were worst in obstinate rebellion against ((Allah)) Most Gracious.", R.raw.maryam69));
        arrayList.add(new VerseActivity("Maryam", "ثُمَّ لَنَحْنُ أَعْلَمُ بِٱلَّذِينَ هُمْ أَوْلَىٰ بِهَا صِلِيًّا", "And certainly We know best those who are most worthy of being burned therein.", R.raw.maryam70));

        /*ayat 71-80*/
        arrayList.add(new VerseActivity("Maryam", "﻿وَإِن مِّنكُمْ إِلَّا وَارِدُهَا ۚ كَانَ عَلَىٰ رَبِّكَ حَتْمًا مَّقْضِيًّا", "Not one of you but will pass over it: this is, with thy Lord, a Decree which must be accomplished.", R.raw.maryam71));
        arrayList.add(new VerseActivity("Maryam", "ثُمَّ نُنَجِّى ٱلَّذِينَ ٱتَّقَوا۟ وَّنَذَرُ ٱلظَّٰلِمِينَ فِيهَا جِثِيًّا", "But We shall save those who guarded against evil, and We shall leave the wrong-doers therein, (humbled) to their knees.", R.raw.maryam72));
        arrayList.add(new VerseActivity("Maryam", "﻿وَإِذَا تُتْلَىٰ عَلَيْهِمْ ءَايَٰتُنَا بَيِّنَٰتٍ قَالَ ٱلَّذِينَ كَفَرُوا۟ لِلَّذِينَ ءَامَنُوٓا۟ أَىُّ ٱلْفَرِيقَيْنِ خَيْرٌ مَّقَامًا وَأَحْسَنُ نَدِيًّا", "When Our Clear Signs are rehearsed to them, the Unbelievers say to those who believe, \"Which of the two sides is best in point of position? Which makes the best show in council?\"", R.raw.maryam73));
        arrayList.add(new VerseActivity("Maryam", "﻿وَكَمْ أَهْلَكْنَا قَبْلَهُم مِّن قَرْنٍ هُمْ أَحْسَنُ أَثَٰثًا وَرِءْيًا", "But how many (countless) generations before them have we destroyed, who were even better in equipment and in glitter to the eye?", R.raw.maryam74));
        arrayList.add(new VerseActivity("Maryam", "قُلْ مَن كَانَ فِى ٱلضَّلَٰلَةِ فَلْيَمْدُدْ لَهُ ٱلرَّحْمَٰنُ مَدًّا ۚ حَتَّىٰٓ إِذَا رَأَوْا۟ مَا يُوعَدُونَ إِمَّا ٱلْعَذَابَ وَإِمَّا ٱلسَّاعَةَ فَسَيَعْلَمُونَ مَنْ هُوَ شَرٌّ مَّكَانًا وَأَضْعَفُ جُندًا", "Say: \"If any men go astray, ((Allah)) Most Gracious extends (the rope) to them, until, when they see the warning of Allah (being fulfilled) - either in punishment or in (the approach of) the Hour,- they will at length realise who is worst in position, and (who) weakest in forces!", R.raw.maryam75));
        arrayList.add(new VerseActivity("Maryam", "وَيَزِيدُ ٱللَّهُ ٱلَّذِينَ ٱهْتَدَوْا۟ هُدًى ۗ وَٱلْبَٰقِيَٰتُ ٱلصَّٰلِحَٰتُ خَيْرٌ عِندَ رَبِّكَ ثَوَابًا وَخَيْرٌ مَّرَدًّا", "\"And Allah doth advance in guidance those who seek guidance: and the things that endure, Good Deeds, are best in the sight of thy Lord, as rewards, and best in respect of (their) eventual return.\"", R.raw.maryam76));
        arrayList.add(new VerseActivity("Maryam", "أَفَرَءَيْتَ ٱلَّذِى كَفَرَ بِـَٔايَٰتِنَا وَقَالَ لَأُوتَيَنَّ مَالًا وَوَلَدًا", "Hast thou then seen the (sort of) man who rejects Our Signs, yet says: \"I shall certainly be given wealth and children?\"", R.raw.maryam77));
        arrayList.add(new VerseActivity("Maryam", "أَطَّلَعَ ٱلْغَيْبَ أَمِ ٱتَّخَذَ عِندَ ٱلرَّحْمَٰنِ عَهْدًا", "Has he penetrated to the Unseen, or has he taken a contract with ((Allah)) Most Gracious?", R.raw.maryam78));
        arrayList.add(new VerseActivity("Maryam", "كَلَّا ۚ سَنَكْتُبُ مَا يَقُولُ وَنَمُدُّ لَهُۥ مِنَ ٱلْعَذَابِ مَدًّا", "Nay! We shall record what he says, and We shall add and add to his punishment.", R.raw.maryam79));
        arrayList.add(new VerseActivity("Maryam", "وَنَرِثُهُۥ مَا يَقُولُ وَيَأْتِينَا فَرْدًا", "To Us shall return all that he talks of and he shall appear before Us bare and alone.", R.raw.maryam80));

        /*ayat 81-90*/
        arrayList.add(new VerseActivity("Maryam", "﻿وَٱتَّخَذُوا۟ مِن دُونِ ٱللَّهِ ءَالِهَةً لِّيَكُونُوا۟ لَهُمْ عِزًّا", "And they have taken (for worship) gods other than Allah, to give them power and glory!", R.raw.maryam81));
        arrayList.add(new VerseActivity("Maryam", "كَلَّا ۚ سَيَكْفُرُونَ بِعِبَادَتِهِمْ وَيَكُونُونَ عَلَيْهِمْ ضِدًّا", "Instead, they shall reject their worship, and become adversaries against them.", R.raw.maryam82));
        arrayList.add(new VerseActivity("Maryam", "﻿أَلَمْ تَرَ أَنَّآ أَرْسَلْنَا ٱلشَّيَٰطِينَ عَلَى ٱلْكَٰفِرِينَ تَؤُزُّهُمْ أَزًّا", "Seest thou not that We have set the Evil Ones on against the unbelievers, to incite them with fury?", R.raw.maryam83));
        arrayList.add(new VerseActivity("Maryam", "فَلَا تَعْجَلْ عَلَيْهِمْ ۖ إِنَّمَا نَعُدُّ لَهُمْ عَدًّا", "So make no haste against them, for We but count out to them a (limited) number (of days).", R.raw.maryam84));
        arrayList.add(new VerseActivity("Maryam", "﻿يَوْمَ نَحْشُرُ ٱلْمُتَّقِينَ إِلَى ٱلرَّحْمَٰنِ وَفْدًا", "The day We shall gather the righteous to ((Allah)) Most Gracious, like a band presented before a king for honours,", R.raw.maryam85));
        arrayList.add(new VerseActivity("Maryam", "وَنَسُوقُ ٱلْمُجْرِمِينَ إِلَىٰ جَهَنَّمَ وِرْدًا", "And We shall drive the sinners to Hell, like thirsty cattle driven down to water,-", R.raw.maryam86));
        arrayList.add(new VerseActivity("Maryam", "لَّا يَمْلِكُونَ ٱلشَّفَٰعَةَ إِلَّا مَنِ ٱتَّخَذَ عِندَ ٱلرَّحْمَٰنِ عَهْدًا", "None shall have the power of intercession, but such a one as has received permission (or promise) from ((Allah)) Most Gracious.", R.raw.maryam87));
        arrayList.add(new VerseActivity("Maryam", "﻿وَقَالُوا۟ ٱتَّخَذَ ٱلرَّحْمَٰنُ وَلَدًا", "They say: \"((Allah)) Most Gracious has begotten a son!\"", R.raw.maryam88));
        arrayList.add(new VerseActivity("Maryam", "لَّقَدْ جِئْتُمْ شَيْـًٔا إِدًّا", "Indeed ye have put forth a thing most monstrous!", R.raw.maryam89));
        arrayList.add(new VerseActivity("Maryam", "﻿تَكَادُ ٱلسَّمَٰوَٰتُ يَتَفَطَّرْنَ مِنْهُ وَتَنشَقُّ ٱلْأَرْضُ وَتَخِرُّ ٱلْجِبَالُ هَدًّا", "At it the skies are ready to burst, the earth to split asunder, and the mountains to fall down in utter ruin,", R.raw.maryam90));

        /*ayat 91-98*/
        arrayList.add(new VerseActivity("Maryam", "أَن دَعَوْا۟ لِلرَّحْمَٰنِ وَلَدًا", "That they should invoke a son for ((Allah)) Most Gracious.", R.raw.maryam91));
        arrayList.add(new VerseActivity("Maryam", "﻿وَمَا يَنۢبَغِى لِلرَّحْمَٰنِ أَن يَتَّخِذَ وَلَدًا", "For it is not consonant with the majesty of ((Allah)) Most Gracious that He should beget a son.", R.raw.maryam92));
        arrayList.add(new VerseActivity("Maryam", "إِن كُلُّ مَن فِى ٱلسَّمَٰوَٰتِ وَٱلْأَرْضِ إِلَّآ ءَاتِى ٱلرَّحْمَٰنِ عَبْدًا", "Not one of the beings in the heavens and the earth but must come to ((Allah)) Most Gracious as a servant.", R.raw.maryam93));
        arrayList.add(new VerseActivity("Maryam", "﻿لَّقَدْ أَحْصَىٰهُمْ وَعَدَّهُمْ عَدًّا", "He does take an account of them (all), and hath numbered them (all) exactly.", R.raw.maryam94));
        arrayList.add(new VerseActivity("Maryam", "وَكُلُّهُمْ ءَاتِيهِ يَوْمَ ٱلْقِيَٰمَةِ فَرْدًا", "And everyone of them will come to Him singly on the Day of Judgment.", R.raw.maryam95));
        arrayList.add(new VerseActivity("Maryam", "﻿إِنَّ ٱلَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ ٱلصَّٰلِحَٰتِ سَيَجْعَلُ لَهُمُ ٱلرَّحْمَٰنُ وُدًّا", "On those who believe and work deeds of righteousness, will ((Allah)) Most Gracious bestow love.", R.raw.maryam96));
        arrayList.add(new VerseActivity("Maryam", "﻿فَإِنَّمَا يَسَّرْنَٰهُ بِلِسَانِكَ لِتُبَشِّرَ بِهِ ٱلْمُتَّقِينَ وَتُنذِرَ بِهِۦ قَوْمًا لُّدًّا", "So have We made the (Qur'an) easy in thine own tongue, that with it thou mayest give Glad Tidings to the righteous, and warnings to people given to contention.", R.raw.maryam97));
        arrayList.add(new VerseActivity("Maryam", "وَكَمْ أَهْلَكْنَا قَبْلَهُم مِّن قَرْنٍ هَلْ تُحِسُّ مِنْهُم مِّنْ أَحَدٍ أَوْ تَسْمَعُ لَهُمْ رِكْزًۢا", "But how many (countless) generations before them have We destroyed? Canst thou find a single one of them (now) or hear (so much as) a whisper of them?", R.raw.maryam98));

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
                mp = MediaPlayer.create(this, R.raw.maryamfull);
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
                Intent i = new Intent(SurahMaryamEnglish.this, SurahMaryamMalay.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
