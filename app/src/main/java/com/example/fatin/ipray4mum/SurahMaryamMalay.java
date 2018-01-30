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

public class SurahMaryamMalay extends AppCompatActivity {
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
        arrayList.add(new VerseActivity("Maryam", "ذِكْرُ رَحْمَتِ رَبِّكَ عَبْدَهُۥ زَكَرِيَّآ", "(Ini ialah) perihal limpahan rahmat Tuhanmu (wahai Muhammad), kepada hambaNya Zakaria.", R.raw.maryam2));
        arrayList.add(new VerseActivity("Maryam", "إِذْ نَادَىٰ رَبَّهُۥ نِدَآءً خَفِيًّا", "(Ingatkanlah peristiwa) ketika Nabi Zakaria berdoa kepada tuhannya dengan doa permohonan secara perlahan.", R.raw.maryam3));
        arrayList.add(new VerseActivity("Maryam", "قَالَ رَبِّ إِنِّى وَهَنَ ٱلْعَظْمُ مِنِّى وَٱشْتَعَلَ ٱلرَّأْسُ شَيْبًا وَلَمْ أَكُنۢ بِدُعَآئِكَ رَبِّ شَقِيًّا", "Ia merayu dengan berkata: \"Wahai Tuhanku! Sesungguhnya telah lemahlah tulang -tulangku, dan telah putih melepaklah uban kepalaku; dan aku - wahai Tuhanku - tidak pernah merasa hampa dengan doa permohonanku kepadaMu.", R.raw.maryam4));
        arrayList.add(new VerseActivity("Maryam", "وَإِنِّى خِفْتُ ٱلْمَوَ‌ٰلِىَ مِن وَرَآءِى وَكَانَتِ ٱمْرَأَتِى عَاقِرًا فَهَبْ لِى مِن لَّدُنكَ وَلِيًّا", "Dan sesungguhnya aku merasa bimbang akan kecuaian kaum kerabatku menyempurnakan tugas-tugas agama sepeninggalanku; dan isteriku pula adalah seorang yang mandul; oleh itu, kurniakanlah daku dari sisiMu seorang anak lelaki.", R.raw.maryam5));
        arrayList.add(new VerseActivity("Maryam", "يَرِثُنِى وَيَرِثُ مِنْ ءَالِ يَعْقُوبَ ۖ وَٱجْعَلْهُ رَبِّ رَضِيًّا", "Yang layak mewarisi daku, juga mewarisi keluarga Nabi Yaakub; dan jadikanlah dia - wahai Tuhanku seorang yang diredhai serta disukai\".", R.raw.maryam6));
        arrayList.add(new VerseActivity("Maryam", "﻿يَـٰزَكَرِيَّآ إِنَّا نُبَشِّرُكَ بِغُلَـٰمٍ ٱسْمُهُۥ يَحْيَىٰ لَمْ نَجْعَل لَّهُۥ مِن قَبْلُ سَمِيًّا", "(Nabi Zakaria diseru setelah dikabulkan doanya):\"Wahai Zakaria! Sesungguhnya Kami memberikan khabar yang mengembirakanmu dengan mengurniakan seorang anak lelaki bernama Yahya, yang kami tidak pernah jadikan sebelum itu, seorangpun yang senama dengannya\".", R.raw.maryam7));
        arrayList.add(new VerseActivity("Maryam", "قَالَ رَبِّ أَنَّىٰ يَكُونُ لِى غُلَـٰمٌ وَكَانَتِ ٱمْرَأَتِى عَاقِرًا وَقَدْ بَلَغْتُ مِنَ ٱلْكِبَرِ عِتِيًّا", "Nabi Zakaria bertanya: \"Wahai Tuhanku! Bagaimanakah caranya aku akan beroleh seorang anak, sedang isteriku adalah seorang yang mandul dan aku sendiri pula telah sampai had umur yang setua-tuanya?\"", R.raw.maryam8));
        arrayList.add(new VerseActivity("Maryam", "﻿قَالَ كَذَ‌ٰلِكَ قَالَ رَبُّكَ هُوَ عَلَىَّ هَيِّنٌ وَقَدْ خَلَقْتُكَ مِن قَبْلُ وَلَمْ تَكُ شَيْـًٔا", "Penyeru itu menjawab: Demikian keadaannya - janganlah dihairankan; Tuhanmu berfirman; \"Hal itu mudah bagiKu kerana sesungguhnya Aku telah menciptakanmu dahulu, sedang engkau pada masa itu belum ada sebarang apapun.\"", R.raw.maryam9));
        arrayList.add(new VerseActivity("Maryam", "﻿قَالَ رَبِّ ٱجْعَل لِّىٓ ءَايَةً ۚ قَالَ ءَايَتُكَ أَلَّا تُكَلِّمَ ٱلنَّاسَ ثَلَـٰثَ لَيَالٍ سَوِيًّا", "Nabi Zakaria merayu lagi: \"Wahai Tuhanku! Jadikanlah satu tanda bagiku (yang menunjukkan isteriku mengandung)\", Allah Taala berfirman: \"Tandamu itu ialah engkau tidak akan dapat berkata-kata dengan orang ramai selama tiga malam, sedang engkau dalam keadaan sihat\".", R.raw.maryam10));

        /*ayat 11-20*/
        arrayList.add(new VerseActivity("Maryam", "فَخَرَجَ عَلَىٰ قَوْمِهِۦ مِنَ ٱلْمِحْرَابِ فَأَوْحَىٰٓ إِلَيْهِمْ أَن سَبِّحُوا۟ بُكْرَةً وَعَشِيًّا", "Maka dia pun keluar mendapatkan kaumnya dari Mihrab (tempat sembahyangnya), lalu ia memberi isyarat kepada mereka: \"Hendaklah kamu bertasbih (mengerjakan ibadat kepada Allah) pagi dan petang\".", R.raw.maryam11));
        arrayList.add(new VerseActivity("Maryam", "﻿يَـٰيَحْيَىٰ خُذِ ٱلْكِتَـٰبَ بِقُوَّةٍ ۖ وَءَاتَيْنَـٰهُ ٱلْحُكْمَ صَبِيًّا", "\"Wahai Yahya, terimalah Kitab itu (serta amalkanlah) dengan bersungguh-sungguh! Dan Kami berikan kepadanya Hikmat kebijaksanaan semasa ia masih kanak-kanak.", R.raw.maryam12));
        arrayList.add(new VerseActivity("Maryam", "وَحَنَانًا مِّن لَّدُنَّا وَزَكَو‌ٰةً ۖ وَكَانَ تَقِيًّا", "dan (Kami mengurniakannya) rahmat dari sisi Kami, serta kelebihan yang kembang manfaatnya; dan ia seorang yang bertaqwa.", R.raw.maryam13));
        arrayList.add(new VerseActivity("Maryam", "﻿وَبَرًّۢا بِوَ‌ٰلِدَيْهِ وَلَمْ يَكُن جَبَّارًا عَصِيًّا", "Dan ia taat serta berbuat baik kepada ibu bapanya, dan ia pula tidak sombong angkuh atau derhaka.", R.raw.maryam14));
        arrayList.add(new VerseActivity("Maryam", "﻿وَسَلَـٰمٌ عَلَيْهِ يَوْمَ وُلِدَ وَيَوْمَ يَمُوتُ وَيَوْمَ يُبْعَثُ حَيًّا", "Dan (Kami limpahkan) kepadanya selamat sejahtera pada hari ia diperanakkan, dan pada hari ia mati, serta pada hari ia dibangkitkan hidup semula (pada hari kiamat).", R.raw.maryam15));
        arrayList.add(new VerseActivity("Maryam", "﻿وَٱذْكُرْ فِى ٱلْكِتَـٰبِ مَرْيَمَ إِذِ ٱنتَبَذَتْ مِنْ أَهْلِهَا مَكَانًا شَرْقِيًّا", "Dan bacakanlah (wahai Muhammad) di dalam Kitab Al-Quran ini perihal Maryam, ketika dia memencilkan diri dari keluarganya di sebuah tempat sebelah timur.", R.raw.maryam16));
        arrayList.add(new VerseActivity("Maryam", "﻿فَٱتَّخَذَتْ مِن دُونِهِمْ حِجَابًا فَأَرْسَلْنَآ إِلَيْهَا رُوحَنَا فَتَمَثَّلَ لَهَا بَشَرًا سَوِيًّا", "Kemudian Maryam membuat dinding untuk melindungi dirinya dari mereka maka Kami hantarkan kepadanya: Roh dari kami lalu ia menyamar diri kepadanya sebagai seorang lelaki yang sempurna bentuk kejadiannya.", R.raw.maryam17));
        arrayList.add(new VerseActivity("Maryam", "قَالَتْ إِنِّىٓ أَعُوذُ بِٱلرَّحْمَـٰنِ مِنكَ إِن كُنتَ تَقِيًّا", "Maryam berkata: Sesungguhnya aku berlindung kepada (Allah) Ar-Rahman daripada (gangguan) mu kalaulah engkau seorang yang bertaqwa.", R.raw.maryam18));
        arrayList.add(new VerseActivity("Maryam", "قَالَ إِنَّمَآ أَنَا۠ رَسُولُ رَبِّكِ لِأَهَبَ لَكِ غُلَـٰمًا زَكِيًّا", "Ia berkata: \"Sesungguhnya aku pesuruh Tuhanmu, untuk menyebabkanmu dikurniakan seorang anak yang suci\".", R.raw.maryam19));
        arrayList.add(new VerseActivity("Maryam", "قَالَتْ أَنَّىٰ يَكُونُ لِى غُلَـٰمٌ وَلَمْ يَمْسَسْنِى بَشَرٌ وَلَمْ أَكُ بَغِيًّا", "Maryam bertanya (dengan cemas): Bagaimanakah aku akan beroleh seorang anak lelaki, padahal aku tidak pernah disentuh oleh seorang lelaki pun, dan aku pula bukan perempuan jahat?\"", R.raw.maryam20));

        /*ayat 21-30*/
        arrayList.add(new VerseActivity("Maryam", "قَالَ كَذَ‌ٰلِكِ قَالَ رَبُّكِ هُوَ عَلَىَّ هَيِّنٌ ۖ وَلِنَجْعَلَهُۥٓ ءَايَةً لِّلنَّاسِ وَرَحْمَةً مِّنَّا ۚ وَكَانَ أَمْرًا مَّقْضِيًّا", "Ia menjawab: \"Demikianlah keadaannya tak usahlah dihairankan; Tuhanmu berfirman: Hal itu mudah bagiKu; dan Kami hendak menjadikan pemberian anak itu sebagai satu tanda (yang membuktikan kekuasaan Kami) untuk umat manusia dan sebagai satu rahmat dari Kami; dan hal itu adalah satu perkara yang telah ditetapkan berlakunya.", R.raw.maryam21));
        arrayList.add(new VerseActivity("Maryam", "۞ فَحَمَلَتْهُ فَٱنتَبَذَتْ بِهِۦ مَكَانًا قَصِيًّا", "Maka Maryam hamilah mengandungnya, lalu ia memencilkan diri dengan kandungannya itu ke sebuah tempat yang jauh.", R.raw.maryam22));
        arrayList.add(new VerseActivity("Maryam", "فَأَجَآءَهَا ٱلْمَخَاضُ إِلَىٰ جِذْعِ ٱلنَّخْلَةِ قَالَتْ يَـٰلَيْتَنِى مِتُّ قَبْلَ هَـٰذَا وَكُنتُ نَسْيًا مَّنسِيًّا", "(Ketika ia hendak bersalin) maka sakit beranak itu memaksanya (pergi bersandar) ke pangkal sebatang pohon tamar (kurma); ia berkata alangkah baiknya kalau aku mati sebelum ini dan menjadilah aku sesuatu yang dilupakan orang dan tidak dikenang-kenang!", R.raw.maryam23));
        arrayList.add(new VerseActivity("Maryam", "فَنَادَىٰهَا مِن تَحْتِهَآ أَلَّا تَحْزَنِى قَدْ جَعَلَ رَبُّكِ تَحْتَكِ سَرِيًّا", "Lalu ia diseru dari sebelah bawahnya: \"Janganlah engkau berdukacita (wahai Maryam), sesungguhnya Tuhanmu telah menjadikan di bawahmu sebatang anak sungai.", R.raw.maryam24));
        arrayList.add(new VerseActivity("Maryam", "﻿وَهُزِّىٓ إِلَيْكِ بِجِذْعِ ٱلنَّخْلَةِ تُسَٰقِطْ عَلَيْكِ رُطَبًا جَنِيًّا", "Dan gegarlah ke arahmu batang pohon tamar itu, supaya gugur kepadamu buah tamar yang masak.", R.raw.maryam25));
        arrayList.add(new VerseActivity("Maryam", "فَكُلِى وَٱشْرَبِى وَقَرِّى عَيْنًا ۖ فَإِمَّا تَرَيِنَّ مِنَ ٱلْبَشَرِ أَحَدًا فَقُولِىٓ إِنِّى نَذَرْتُ لِلرَّحْمَٰنِ صَوْمًا فَلَنْ أُكَلِّمَ ٱلْيَوْمَ إِنسِيًّا", "\"Maka makanlah dan minumlah serta bertenanglah hati dari segala yang merunsingkan. Kemudian kalau engkau melihat seseorang manusia, maka katakanlah: Sesungguhnya aku bernazar diam membisu kerana (Allah) Ar-Rahman; (setelah aku menyatakan yang demikian) maka aku tidak akan berkata-kata kepada sesiapapun dari kalangan manusia pada hari ini\".", R.raw.maryam26));
        arrayList.add(new VerseActivity("Maryam", "﻿فَأَتَتْ بِهِۦ قَوْمَهَا تَحْمِلُهُۥ ۖ قَالُوا۟ يَٰمَرْيَمُ لَقَدْ جِئْتِ شَيْـًٔا فَرِيًّا", "Kemudian baliklah ia kepada kaumnya dengan mendokong anaknya mereka pun menempelaknya dengan berkata: Wahai Maryam! Sesungguhnya engkau telah melakukan suatu perkara yang besar salahnya!", R.raw.maryam27));
        arrayList.add(new VerseActivity("Maryam", "﻿يَٰٓأُخْتَ هَٰرُونَ مَا كَانَ أَبُوكِ ٱمْرَأَ سَوْءٍ وَمَا كَانَتْ أُمُّكِ بَغِيًّا", "\"Wahai saudara perempuan Harun, bapamu bukanlah seorang yang buruk akhlaknya, dan ibumu pula bukanlah seorang perempuan jahat!\"", R.raw.maryam28));
        arrayList.add(new VerseActivity("Maryam", "﻿فَأَشَارَتْ إِلَيْهِ ۖ قَالُوا۟ كَيْفَ نُكَلِّمُ مَن كَانَ فِى ٱلْمَهْدِ صَبِيًّا", "Maka Maryam segera menunjuk kepada anaknya. Mereka berkata (dengan hairannya): \"Bagaimana kami boleh berkata-kata dengan seorang yang masih kanak-kanak dalam buaian?\"", R.raw.maryam29));
        arrayList.add(new VerseActivity("Maryam", "﻿قَالَ إِنِّى عَبْدُ ٱللَّهِ ءَاتَىٰنِىَ ٱلْكِتَٰبَ وَجَعَلَنِى نَبِيًّا", "Ia menjawab: \"Sesungguhnya aku ini hamba Allah; Ia telah memberikan kepadaku Kitab (Injil), dan Ia telah menjadikan daku seorang Nabi.", R.raw.maryam30));

        /*ayat 31-40*/
        arrayList.add(new VerseActivity("Maryam", "﻿وَجَعَلَنِى مُبَارَكًا أَيْنَ مَا كُنتُ وَأَوْصَٰنِى بِٱلصَّلَوٰةِ وَٱلزَّكَوٰةِ مَا دُمْتُ حَيًّا", "Dan Ia menjadikan daku seorang yang berkat di mana sahaja aku berada, dan diperintahkan daku mengerjakan sembahyang dan memberi zakat selagi aku hidup.", R.raw.maryam31));
        arrayList.add(new VerseActivity("Maryam", "﻿وَبَرًّۢا بِوَٰلِدَتِى وَلَمْ يَجْعَلْنِى جَبَّارًا شَقِيًّا", "\"Serta (diperintahkan daku) taat dan berbuat baik kepada ibuku, dan Ia tidak menjadikan daku seorang yang sombong takbur atau derhaka.", R.raw.maryam32));
        arrayList.add(new VerseActivity("Maryam", "وَٱلسَّلَٰمُ عَلَىَّ يَوْمَ وُلِدتُّ وَيَوْمَ أَمُوتُ وَيَوْمَ أُبْعَثُ حَيًّا", "Dan segala keselamatan serta kesejahteraan dilimpahkan kepadaku pada hari aku diperanakkan dan pada hari aku mati, serta pada hari aku dibangkitkan hidup semula (pada hari kiamat)\".", R.raw.maryam33));
        arrayList.add(new VerseActivity("Maryam", "﻿ذَٰلِكَ عِيسَى ٱبْنُ مَرْيَمَ ۚ قَوْلَ ٱلْحَقِّ ٱلَّذِى فِيهِ يَمْتَرُونَ", "Yang demikian sifat-sifatnya itulah Isa Ibni Maryam. Keterangan yang tersebut ialah keterangan yang sebenar-benarnya, yang mereka ragu-ragu dan berselisihan padanya.", R.raw.maryam34));
        arrayList.add(new VerseActivity("Maryam", "مَا كَانَ لِلَّهِ أَن يَتَّخِذَ مِن وَلَدٍ ۖ سُبْحَٰنَهُۥٓ ۚ إِذَا قَضَىٰٓ أَمْرًا فَإِنَّمَا يَقُولُ لَهُۥ كُن فَيَكُونُ", "Tiadalah layak bagi Allah mempunyai anak. Maha Sucilah Ia. Apabila menetapkan jadinya sesuatu perkara, maka hanyalah Ia berfirman kepadanya: \"Jadilah engkau\", lalu menjadilah ia.", R.raw.maryam35));
        arrayList.add(new VerseActivity("Maryam", "﻿وَإِنَّ ٱللَّهَ رَبِّى وَرَبُّكُمْ فَٱعْبُدُوهُ ۚ هَٰذَا صِرَٰطٌ مُّسْتَقِيمٌ", "Dan sesungguhnya Allah ialah Tuhanku dan Tuhan kamu maka sembahlah kamu akan Dia inilah jalan yang betul - lurus.", R.raw.maryam36));
        arrayList.add(new VerseActivity("Maryam", "فَٱخْتَلَفَ ٱلْأَحْزَابُ مِنۢ بَيْنِهِمْ ۖ فَوَيْلٌ لِّلَّذِينَ كَفَرُوا۟ مِن مَّشْهَدِ يَوْمٍ عَظِيمٍ", "Kemudian, golongan-golongan (dari kaumnya) itu berselisihan sesama sendiri. Maka kecelakaanlah bagi orang-orang kafir (yang berselisihan) itu, dari apa yang disaksikan pada hari yang besar huru-haranya.", R.raw.maryam37));
        arrayList.add(new VerseActivity("Maryam", "﻿أَسْمِعْ بِهِمْ وَأَبْصِرْ يَوْمَ يَأْتُونَنَا ۖ لَٰكِنِ ٱلظَّٰلِمُونَ ٱلْيَوْمَ فِى ضَلَٰلٍ مُّبِينٍ", "Sungguh jelas pendengaran dan penglihatan mereka yang kafir itu semasa mereka datang mengadap Kami pada hari akhirat. Tetapi orang-orang yang zalim (dengan perbuatan kufur dan maksiat) pada masa di dunia ini, berada dalam kesesatan yang nyata.", R.raw.maryam38));
        arrayList.add(new VerseActivity("Maryam", "وَأَنذِرْهُمْ يَوْمَ ٱلْحَسْرَةِ إِذْ قُضِىَ ٱلْأَمْرُ وَهُمْ فِى غَفْلَةٍ وَهُمْ لَا يُؤْمِنُونَ", "Dan berilah amaran (wahai Muhammad) kepada umat manusia seluruhnya tentang hari penyesalan iaitu hari diselesaikan perbicaraan perkara masing-masing pada masa mereka (yang ingkar) di dunia ini berada dalam kelalaian serta mereka pula tidak mahu beriman.", R.raw.maryam39));
        arrayList.add(new VerseActivity("Maryam", "﻿إِنَّا نَحْنُ نَرِثُ ٱلْأَرْضَ وَمَنْ عَلَيْهَا وَإِلَيْنَا يُرْجَعُونَ", "Sesungguhnya Kamilah yang mewarisi bumi dan segala makhluk yang ada di atasnya; dan kepada Kamilah mereka akan dikembalikan.", R.raw.maryam40));

        /*ayat 41-50*/
        arrayList.add(new VerseActivity("Maryam", "وَٱذْكُرْ فِى ٱلْكِتَٰبِ إِبْرَٰهِيمَ ۚ إِنَّهُۥ كَانَ صِدِّيقًا نَّبِيًّا", "Dan bacakanlah (wahai Muhammad) di dalam Kitab (Al-Quran) ini perihal Nabi Ibrahim; sesungguhnya adalah ia seorang yang amat benar, lagi menjadi Nabi.", R.raw.maryam41));
        arrayList.add(new VerseActivity("Maryam", "إِذْ قَالَ لِأَبِيهِ يَٰٓأَبَتِ لِمَ تَعْبُدُ مَا لَا يَسْمَعُ وَلَا يُبْصِرُ وَلَا يُغْنِى عَنكَ شَيْـًٔا", "Ketika ia berkata kepada bapanya: \"Wahai ayahku, mengapa ayah menyembah benda yang tidak mendengar dan tidak melihat serta tidak dapat menolongmu sedikitpun?\"", R.raw.maryam42));
        arrayList.add(new VerseActivity("Maryam", "يَٰٓأَبَتِ إِنِّى قَدْ جَآءَنِى مِنَ ٱلْعِلْمِ مَا لَمْ يَأْتِكَ فَٱتَّبِعْنِىٓ أَهْدِكَ صِرَٰطًا سَوِيًّا", "\"Wahai ayahku, sesungguhnya telah datang kepadaku dari ilmu pengetahuan yang tidak pernah datang kepadamu oleh itu ikutlah daku; aku akan memimpinmu ke jalan yang betul.\"", R.raw.maryam43));
        arrayList.add(new VerseActivity("Maryam", "يَٰٓأَبَتِ لَا تَعْبُدِ ٱلشَّيْطَٰنَ ۖ إِنَّ ٱلشَّيْطَٰنَ كَانَ لِلرَّحْمَٰنِ عَصِيًّا", "\"Wahai ayahku, janganlah ayah menyembah Syaitan, sesungguhnya Syaitan itu adalah menderhaka kepada Allah yang melimpah-limpah rahmatNya.\"", R.raw.maryam44));
        arrayList.add(new VerseActivity("Maryam", "يَٰٓأَبَتِ إِنِّىٓ أَخَافُ أَن يَمَسَّكَ عَذَابٌ مِّنَ ٱلرَّحْمَٰنِ فَتَكُونَ لِلشَّيْطَٰنِ وَلِيًّا", "\"Wahai ayahku, sesungguhnya aku bimbang bahawa ayah akan kena azab dari (Allah) Ar-Rahman disebabkan ayah menyembah yang lainnya; maka dengan sebab itu akan menjadilah ayah rakan bagi Syaitan di dalam neraka\".", R.raw.maryam45));
        arrayList.add(new VerseActivity("Maryam", "قَالَ أَرَاغِبٌ أَنتَ عَنْ ءَالِهَتِى يَٰٓإِبْرَٰهِيمُ ۖ لَئِن لَّمْ تَنتَهِ لَأَرْجُمَنَّكَ ۖ وَٱهْجُرْنِى مَلِيًّا", "(Bapanya) menjawab: \"Patutkah engkau bencikan tuhan-tuhanku, wahai Ibrahim? Demi sesungguhnya jika engkau tidak berhenti daripada menyeru dan menasihati daku sudah tentu aku akan meluntarmu dengan batu; dan (ingatlah lebih baik) engkau tinggalkan daku sepanjang masa\".", R.raw.maryam46));
        arrayList.add(new VerseActivity("Maryam", "قَالَ سَلَٰمٌ عَلَيْكَ ۖ سَأَسْتَغْفِرُ لَكَ رَبِّىٓ ۖ إِنَّهُۥ كَانَ بِى حَفِيًّا", "Nabi Ibrahim berkata: \"Selamat tinggalah ayah; aku akan memohon kepada Tuhanku mengampuni dosamu; sesungguhnya Ia sentiasa melimpahkan kemurahan ihsanNya kepadaku.", R.raw.maryam47));
        arrayList.add(new VerseActivity("Maryam", "وَأَعْتَزِلُكُمْ وَمَا تَدْعُونَ مِن دُونِ ٱللَّهِ وَأَدْعُوا۟ رَبِّى عَسَىٰٓ أَلَّآ أَكُونَ بِدُعَآءِ رَبِّى شَقِيًّا", "Dan aku akan membawa diri meninggalkan kamu semua serta apa yang kamu sembah yang lain dari Allah; dan aku akan beribadat kepada Tuhanku dengan ikhlas; mudah-mudahan aku dengan ibadatku kepada Tuhanku itu tidak menjadi hampa (dan derhaka seperti kamu)\".", R.raw.maryam48));
        arrayList.add(new VerseActivity("Maryam", "فَلَمَّا ٱعْتَزَلَهُمْ وَمَا يَعْبُدُونَ مِن دُونِ ٱللَّهِ وَهَبْنَا لَهُۥٓ إِسْحَٰقَ وَيَعْقُوبَ ۖ وَكُلًّا جَعَلْنَا نَبِيًّا", "Maka apabila ia berhijrah meninggalkan mereka dan apa yang mereka sembah yang lain dari Allah kami kurniakan kepadanya: Ishak (anaknya), dan Yaakub (cucunya); dan kedua-duanya Kami jadikan berpangkat Nabi.", R.raw.maryam49));
        arrayList.add(new VerseActivity("Maryam", "﻿وَوَهَبْنَا لَهُم مِّن رَّحْمَتِنَا وَجَعَلْنَا لَهُمْ لِسَانَ صِدْقٍ عَلِيًّا", "Dan Kami kurniakan kepada mereka dari rahmat Kami, dan Kami jadikan bagi mereka sebutan dan pujian yang tinggi dalam kalangan umat manusia.", R.raw.maryam50));

        /*ayat 51-60*/
        arrayList.add(new VerseActivity("Maryam", "﻿وَٱذْكُرْ فِى ٱلْكِتَٰبِ مُوسَىٰٓ ۚ إِنَّهُۥ كَانَ مُخْلَصًا وَكَانَ رَسُولًا نَّبِيًّا", "Dan bacakanlah (wahai Muhammad) di dalam Kitab (Al-Quran) ini perihal Nabi Musa; sesungguhnya ia adalah orang pilihan, dan adalah ia seorang Rasul, lagi Nabi.", R.raw.maryam51));
        arrayList.add(new VerseActivity("Maryam", "﻿وَنَٰدَيْنَٰهُ مِن جَانِبِ ٱلطُّورِ ٱلْأَيْمَنِ وَقَرَّبْنَٰهُ نَجِيًّا", "Dan Kami telah menyerunya dari arah sebelah kanan Gunung Tursina, dan Kami dampingkan dia dengan diberi penghormatan berkata dengan Kami.", R.raw.maryam52));
        arrayList.add(new VerseActivity("Maryam", "﻿وَوَهَبْنَا لَهُۥ مِن رَّحْمَتِنَآ أَخَاهُ هَٰرُونَ نَبِيًّا", "Dan Kami kurniakan kepadanya dari rahmat Kami, saudaranya: Harun, yang juga berpangkat Nabi.", R.raw.maryam53));
        arrayList.add(new VerseActivity("Maryam", "﻿وَٱذْكُرْ فِى ٱلْكِتَٰبِ إِسْمَٰعِيلَ ۚ إِنَّهُۥ كَانَ صَادِقَ ٱلْوَعْدِ وَكَانَ رَسُولًا نَّبِيًّا", "Dan bacakanlah (wahai Muhammad) di dalam Kitab (Al-Quran) ini perihal Nabi Ismail; sesungguhnya ia adalah benar menepati janji dan adalah ia seorang Rasul, lagi berpangkat Nabi.", R.raw.maryam54));
        arrayList.add(new VerseActivity("Maryam", "﻿وَكَانَ يَأْمُرُ أَهْلَهُۥ بِٱلصَّلَوٰةِ وَٱلزَّكَوٰةِ وَكَانَ عِندَ رَبِّهِۦ مَرْضِيًّا", "Dan adalah ia menyuruh keluarganya mengerjakan sembahyang dan memberi zakat, dan ia pula adalah seorang yang diredhai di sisi Tuhannya!", R.raw.maryam55));
        arrayList.add(new VerseActivity("Maryam", "﻿وَٱذْكُرْ فِى ٱلْكِتَٰبِ إِدْرِيسَ ۚ إِنَّهُۥ كَانَ صِدِّيقًا نَّبِيًّا", "Dan bacakanlah (wahai Muhammad) di dalam Kitab (Al-Quran) ini perihal Nabi Idris; sesungguhnya adalah ia amat benar (tutur katanya dan imannya), serta ia seorang Nabi.", R.raw.maryam56));
        arrayList.add(new VerseActivity("Maryam", "وَرَفَعْنَٰهُ مَكَانًا عَلِيًّا", "Dan Kami telah mengangkatnya ke tempat yang tinggi darjatnya.", R.raw.maryam57));
        arrayList.add(new VerseActivity("Maryam", "أُو۟لَٰٓئِكَ ٱلَّذِينَ أَنْعَمَ ٱللَّهُ عَلَيْهِم مِّنَ ٱلنَّبِيِّۦنَ مِن ذُرِّيَّةِ ءَادَمَ وَمِمَّنْ حَمَلْنَا مَعَ نُوحٍ وَمِن ذُرِّيَّةِ إِبْرَٰهِيمَ وَإِسْرَٰٓءِيلَ وَمِمَّنْ هَدَيْنَا وَٱجْتَبَيْنَآ ۚ إِذَا تُتْلَىٰ عَلَيْهِمْ ءَايَٰتُ ٱلرَّحْمَٰنِ خَرُّوا۟ سُجَّدًا وَبُكِيًّا ۩", "Mereka itulah sebahagian dari Nabi-nabi yang telah dikurniakan Allah nikmat yang melimpah-limpah kepada mereka dari keturunan Nabi Adam, dan dari keturunan orang-orang yang Kami bawa (dalam bahtera) bersama-sama Nabi Nuh, dan dari keturunan Nabi Ibrahim, dan (dari keturunan) Israil- dan mereka itu adalah dari orang-orang yang Kami beri hidayah petunjuk dan Kami pilih. Apabila dibacakan kepada mereka ayat-ayat (Allah) Ar-Rahman, mereka segera sujud serta menangis.", R.raw.maryam58));
        arrayList.add(new VerseActivity("Maryam", "۞ فَخَلَفَ مِنۢ بَعْدِهِمْ خَلْفٌ أَضَاعُوا۟ ٱلصَّلَوٰةَ وَٱتَّبَعُوا۟ ٱلشَّهَوَٰتِ ۖ فَسَوْفَ يَلْقَوْنَ غَيًّا", "Kemudian mereka digantikan oleh keturunan-keturunan yang mencuaikan sembahyang serta menurut hawa nafsu (dengan melakukan maksiat); maka mereka akan menghadapi azab (dalam neraka),", R.raw.maryam59));
        arrayList.add(new VerseActivity("Maryam", "﻿إِلَّا مَن تَابَ وَءَامَنَ وَعَمِلَ صَٰلِحًا فَأُو۟لَٰٓئِكَ يَدْخُلُونَ ٱلْجَنَّةَ وَلَا يُظْلَمُونَ شَيْـًٔا", "Kecuali orang-orang yang bertaubat dan beriman serta beramal soleh, maka mereka itu akan masuk Syurga, dan mereka pula tidak dikurangkan pahala sedikitpun, -", R.raw.maryam60));

        /*ayat 61-70*/
        arrayList.add(new VerseActivity("Maryam", "﻿جَنَّٰتِ عَدْنٍ ٱلَّتِى وَعَدَ ٱلرَّحْمَٰنُ عِبَادَهُۥ بِٱلْغَيْبِ ۚ إِنَّهُۥ كَانَ وَعْدُهُۥ مَأْتِيًّا", "(Iaitu) Syurga \"Adn\" yang telah dijanjikan oleh (Allah) Ar-Rahman kepada hamba-hambaNya disebabkan kepercayaan mereka akan perkara-perkara yang ghaib; sesungguhnya Tuhan itu, janjiNya tetap berlaku.", R.raw.maryam61));
        arrayList.add(new VerseActivity("Maryam", "لَّا يَسْمَعُونَ فِيهَا لَغْوًا إِلَّا سَلَٰمًا ۖ وَلَهُمْ رِزْقُهُمْ فِيهَا بُكْرَةً وَعَشِيًّا", "Mereka tidak akan mendengar di dalamnya perkataan yang sia-sia tetapi mereka sentiasa mendengar perkataan yang baik-baik; dan makan minum untuk mereka disediakan di dalamnya, pagi dan petang (sepanjang masa).", R.raw.maryam62));
        arrayList.add(new VerseActivity("Maryam", "﻿تِلْكَ ٱلْجَنَّةُ ٱلَّتِى نُورِثُ مِنْ عِبَادِنَا مَن كَانَ تَقِيًّا", "Itulah taman Syurga yang Kami akan berikan sebagai warisan pusaka kepada orang-orang. yang bertaqwa dari hamba-hamba Kami.", R.raw.maryam63));
        arrayList.add(new VerseActivity("Maryam", "وَمَا نَتَنَزَّلُ إِلَّا بِأَمْرِ رَبِّكَ ۖ لَهُۥ مَا بَيْنَ أَيْدِينَا وَمَا خَلْفَنَا وَمَا بَيْنَ ذَٰلِكَ ۚ وَمَا كَانَ رَبُّكَ نَسِيًّا", "Dan (berkatalah malaikat): \"Kami tidak turun dari semasa ke semasa melainkan dengan perintah Tuhanmu (wahai Muhammad); Dia lah jua yang menguasai serta mentadbirkan apa yang di hadapan kita dan apa yang di belakang kita serta apa yang di antara itu; dan tiadalah Tuhanmu itu lupa, -", R.raw.maryam64));
        arrayList.add(new VerseActivity("Maryam", "رَّبُّ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضِ وَمَا بَيْنَهُمَا فَٱعْبُدْهُ وَٱصْطَبِرْ لِعِبَٰدَتِهِۦ ۚ هَلْ تَعْلَمُ لَهُۥ سَمِيًّا", "\"Tuhan yang mencipta dan mentadbirkan langit dan bumi serta segala yang ada di antara keduanya; oleh itu, sembahlah engkau akan Dia dan bersabarlah dengan tekun tetap dalam beribadat kepadaNya; adakah engkau mengetahui sesiapapun yang senama dan sebanding denganNya?\"", R.raw.maryam65));
        arrayList.add(new VerseActivity("Maryam", "وَيَقُولُ ٱلْإِنسَٰنُ أَءِذَا مَا مِتُّ لَسَوْفَ أُخْرَجُ حَيًّا", "Dan manusia (yang kafir) berkata: \"Apa! Apabila aku mati, adakah aku akan dibangkitkan hidup semula?\"", R.raw.maryam66));
        arrayList.add(new VerseActivity("Maryam", "﻿أَوَلَا يَذْكُرُ ٱلْإِنسَٰنُ أَنَّا خَلَقْنَٰهُ مِن قَبْلُ وَلَمْ يَكُ شَيْـًٔا", "Patutkah manusia itu berkata demikian dan tidak memikirkan bahawa Kami telah menciptakan dia dahulu sedang ia pada masa itu belum ada sebarang apapun?", R.raw.maryam67));
        arrayList.add(new VerseActivity("Maryam", "﻿فَوَرَبِّكَ لَنَحْشُرَنَّهُمْ وَٱلشَّيَٰطِينَ ثُمَّ لَنُحْضِرَنَّهُمْ حَوْلَ جَهَنَّمَ جِثِيًّا", "Oleh itu, demi Tuhanmu (wahai Muhammad)! Sesungguhnya Kami akan himpunkan mereka yang kafir itu beserta syaitan-syaitan di Padang Mahsyar, kemudian Kami akan bawa mereka duduk berlutut di keliling neraka Jahannam.", R.raw.maryam68));
        arrayList.add(new VerseActivity("Maryam", "ثُمَّ لَنَنزِعَنَّ مِن كُلِّ شِيعَةٍ أَيُّهُمْ أَشَدُّ عَلَى ٱلرَّحْمَٰنِ عِتِيًّا", "Sesudah itu, sesungguhnya kami akan cabut dari tiap-tiap golongan, mana-mana orang yang sangat derhaka kepada (Allah) Ar-Rahman, di antara mereka.", R.raw.maryam69));
        arrayList.add(new VerseActivity("Maryam", "ثُمَّ لَنَحْنُ أَعْلَمُ بِٱلَّذِينَ هُمْ أَوْلَىٰ بِهَا صِلِيًّا", "Kemudian, sesungguhnya Kami lebih mengetahui akan orang-orang yang lebih patut diseksa dan dibakar dangan api neraka itu.", R.raw.maryam70));

        /*ayat 71-80*/
        arrayList.add(new VerseActivity("Maryam", "﻿وَإِن مِّنكُمْ إِلَّا وَارِدُهَا ۚ كَانَ عَلَىٰ رَبِّكَ حَتْمًا مَّقْضِيًّا", "Dan tiada seorangpun di antara kamu melainkan akan sampai kepadanya; (yang demikian) adalah satu perkara yang mesti (berlaku) yang telah ditetapkan oleh Tuhanmu.", R.raw.maryam71));
        arrayList.add(new VerseActivity("Maryam", "ثُمَّ نُنَجِّى ٱلَّذِينَ ٱتَّقَوا۟ وَّنَذَرُ ٱلظَّٰلِمِينَ فِيهَا جِثِيًّا", "Kemudian Kami akan selamatkan orang-orang yang bertaqwa, dan kami akan biarkan orang-orang yang zalim (dengan kekufurannya dan maksiatnya) tinggal berlutut di dalam neraka itu.", R.raw.maryam72));
        arrayList.add(new VerseActivity("Maryam", "﻿وَإِذَا تُتْلَىٰ عَلَيْهِمْ ءَايَٰتُنَا بَيِّنَٰتٍ قَالَ ٱلَّذِينَ كَفَرُوا۟ لِلَّذِينَ ءَامَنُوٓا۟ أَىُّ ٱلْفَرِيقَيْنِ خَيْرٌ مَّقَامًا وَأَحْسَنُ نَدِيًّا", "Dan apabila dibacakan kepada mereka ayat-ayat Kami yang jelas nyata, berkatalah orang-orang yang kafir kepada orang-orang yang beriman: \"Puak yang manakah (dari kami dan kamu) yang lebih baik tempat tinggalnya dan lebih elok majlis perhimpunannya?\"", R.raw.maryam73));
        arrayList.add(new VerseActivity("Maryam", "﻿وَكَمْ أَهْلَكْنَا قَبْلَهُم مِّن قَرْنٍ هُمْ أَحْسَنُ أَثَٰثًا وَرِءْيًا", "Dan berapa banyak kaum-kaum (yang ingkar) sebelum mereka, kami telah binasakan, sedang mereka lebih elok alat-alat kesenangannya dan lebih elok keadaannya pada pandangan mata.", R.raw.maryam74));
        arrayList.add(new VerseActivity("Maryam", "قُلْ مَن كَانَ فِى ٱلضَّلَٰلَةِ فَلْيَمْدُدْ لَهُ ٱلرَّحْمَٰنُ مَدًّا ۚ حَتَّىٰٓ إِذَا رَأَوْا۟ مَا يُوعَدُونَ إِمَّا ٱلْعَذَابَ وَإِمَّا ٱلسَّاعَةَ فَسَيَعْلَمُونَ مَنْ هُوَ شَرٌّ مَّكَانًا وَأَضْعَفُ جُندًا", "Katakanlah (wahai Muhammad): \"Sesiapa yang berada di dalam kesesatan, maka biarlah (Allah) Ar-Rahman melanjutkan baginya satu tempoh yang tertentu, hingga apabila mereka melihat apa yang dijanjikan kepada mereka, - sama ada azab sengsara dunia ataupun azab kiamat, maka (pada saat itu) mereka akan mengetahui siapakah orangnya yang lebih buruk kedudukannya dan lebih lemah penyokong-penyokongnya.\"", R.raw.maryam75));
        arrayList.add(new VerseActivity("Maryam", "وَيَزِيدُ ٱللَّهُ ٱلَّذِينَ ٱهْتَدَوْا۟ هُدًى ۗ وَٱلْبَٰقِيَٰتُ ٱلصَّٰلِحَٰتُ خَيْرٌ عِندَ رَبِّكَ ثَوَابًا وَخَيْرٌ مَّرَدًّا", "Dan Allah akan menambahi hidayah petunjuk bagi orang-orang yang menurut jalan petunjuk; dan amal-amal yang baik yang tetap kekal faedah-faedahnya itu, lebih baik balasan pahalanya di sisi Tuhanmu dan lebih baik kesudahannya.", R.raw.maryam76));
        arrayList.add(new VerseActivity("Maryam", "أَفَرَءَيْتَ ٱلَّذِى كَفَرَ بِـَٔايَٰتِنَا وَقَالَ لَأُوتَيَنَّ مَالًا وَوَلَدًا", "Maka tidakkah engkau merasa hairan memikirkan (wahai Muhammad), akan orang yang kufur ingkar kepada ayat-ayat keterangan Kami serta ia berkata: \"Demi sesungguhnya aku akan diberikan harta kekayaan dan anak-pinak pada hari akhirat?\"", R.raw.maryam77));
        arrayList.add(new VerseActivity("Maryam", "أَطَّلَعَ ٱلْغَيْبَ أَمِ ٱتَّخَذَ عِندَ ٱلرَّحْمَٰنِ عَهْدًا", "Adakah ia telah mengetahui akan perkara yang ghaib, atau adakah ia telah membuat perjanjian dengan (Allah) Ar-Rahman mengenainya?", R.raw.maryam78));
        arrayList.add(new VerseActivity("Maryam", "كَلَّا ۚ سَنَكْتُبُ مَا يَقُولُ وَنَمُدُّ لَهُۥ مِنَ ٱلْعَذَابِ مَدًّا", "Tidak sekali-kali! Kami akan menulis apa yang dikatakannya, dan Kami akan tambahi baginya dari azab seksa, berganda-ganda.", R.raw.maryam79));
        arrayList.add(new VerseActivity("Maryam", "وَنَرِثُهُۥ مَا يَقُولُ وَيَأْتِينَا فَرْدًا", "Dan Kami akan warisi (harta benda dan anak-pinak) yang dikatakannya itu, dan ia akan datang kepada kami dengan seorang diri.", R.raw.maryam80));

        /*ayat 81-90*/
        arrayList.add(new VerseActivity("Maryam", "﻿وَٱتَّخَذُوا۟ مِن دُونِ ٱللَّهِ ءَالِهَةً لِّيَكُونُوا۟ لَهُمْ عِزًّا", "Dan mereka yang kafir menyembah benda-benda yang lain dari Allah sebagai tuhan-tuhan, supaya benda-benda yang mereka sembah itu menjadi penolong-penolong yang memberi kemuliaan dan pengaruh kepada mereka.", R.raw.maryam81));
        arrayList.add(new VerseActivity("Maryam", "كَلَّا ۚ سَيَكْفُرُونَ بِعِبَادَتِهِمْ وَيَكُونُونَ عَلَيْهِمْ ضِدًّا", "Tidak sekali-kali! Bahkan benda-benda yang mereka pertuhankan itu mengingkari perbuatan mereka menyembahnya, dan akan menjadi musuh yang membawa kehinaan kepada mereka.", R.raw.maryam82));
        arrayList.add(new VerseActivity("Maryam", "﻿أَلَمْ تَرَ أَنَّآ أَرْسَلْنَا ٱلشَّيَٰطِينَ عَلَى ٱلْكَٰفِرِينَ تَؤُزُّهُمْ أَزًّا", "Tidakkah engkau mengetahui (Wahai Muhammad) bahawa Kami telah menghantarkan Syaitan-syaitan kepada orang-orang kafir, untuk menggalakkan mereka mengerjakan perbuatan kufur dan maksiat dengan bersungguh-sungguh?", R.raw.maryam83));
        arrayList.add(new VerseActivity("Maryam", "فَلَا تَعْجَلْ عَلَيْهِمْ ۖ إِنَّمَا نَعُدُّ لَهُمْ عَدًّا", "Oleh itu, janganlah engkau segera marah terhadap mereka yang ingkar itu, kerana sesungguhnya kami hanya menghitung hari yang sedikit sahaja bilangannya untuk mereka.", R.raw.maryam84));
        arrayList.add(new VerseActivity("Maryam", "﻿يَوْمَ نَحْشُرُ ٱلْمُتَّقِينَ إِلَى ٱلرَّحْمَٰنِ وَفْدًا", "(Ingatlah) hari Kami himpunkan orang-orang yang bertaqwa untuk mengadap (Allah) Ar-Rahman, dengan berpasuk-pasukan.", R.raw.maryam85));
        arrayList.add(new VerseActivity("Maryam", "وَنَسُوقُ ٱلْمُجْرِمِينَ إِلَىٰ جَهَنَّمَ وِرْدًا", "Dan Kami akan menghalau orang-orang yang bersalah ke neraka Jahannam, dalam keadaan dahaga.", R.raw.maryam86));
        arrayList.add(new VerseActivity("Maryam", "لَّا يَمْلِكُونَ ٱلشَّفَٰعَةَ إِلَّا مَنِ ٱتَّخَذَ عِندَ ٱلرَّحْمَٰنِ عَهْدًا", "Mereka tidak berhak mendapat dan memberi syafaat, kecuali orang yang telah mengikat perjanjian (dengan iman dan amal yang soleh) di sisi Allah yang melimpah-limpah rahmatNya!.", R.raw.maryam87));
        arrayList.add(new VerseActivity("Maryam", "﻿وَقَالُوا۟ ٱتَّخَذَ ٱلرَّحْمَٰنُ وَلَدًا", "Dan mereka yang kafir berkata: \"(Allah) Ar-Rahman, mempunyai anak.\"", R.raw.maryam88));
        arrayList.add(new VerseActivity("Maryam", "لَّقَدْ جِئْتُمْ شَيْـًٔا إِدًّا", "Demi sesungguhnya, kamu telah melakukan satu perkara yang besar salahnya!", R.raw.maryam89));
        arrayList.add(new VerseActivity("Maryam", "﻿تَكَادُ ٱلسَّمَٰوَٰتُ يَتَفَطَّرْنَ مِنْهُ وَتَنشَقُّ ٱلْأَرْضُ وَتَخِرُّ ٱلْجِبَالُ هَدًّا", "Langit nyaris-nyaris pecah disebabkan (anggapan mereka) yang demikian, dan bumi pula nyaris-nyaris terbelah, serta gunung-ganang pun nyaris-nyaris runtuh ranap, -", R.raw.maryam90));

        /*ayat 91-98*/
        arrayList.add(new VerseActivity("Maryam", "أَن دَعَوْا۟ لِلرَّحْمَٰنِ وَلَدًا", "Kerana mereka mendakwa mengatakan: (Allah) Ar-Rahman mempunyai anak.", R.raw.maryam91));
        arrayList.add(new VerseActivity("Maryam", "﻿وَمَا يَنۢبَغِى لِلرَّحْمَٰنِ أَن يَتَّخِذَ وَلَدًا", "Padahal tiadalah layak bagi (Allah) Ar-Rahman, bahawa Ia mempunyai anak.", R.raw.maryam92));
        arrayList.add(new VerseActivity("Maryam", "إِن كُلُّ مَن فِى ٱلسَّمَٰوَٰتِ وَٱلْأَرْضِ إِلَّآ ءَاتِى ٱلرَّحْمَٰنِ عَبْدًا", "Tidak ada sesiapapun di langit dan di bumi melainkan ia akan datang kepada (Allah) Ar-Rahman, sebagai hamba.", R.raw.maryam93));
        arrayList.add(new VerseActivity("Maryam", "﻿لَّقَدْ أَحْصَىٰهُمْ وَعَدَّهُمْ عَدًّا", "Demi sesungguhnya! Allah telah mengira mereka (dengan pengetahuanNya) serta menghitung mereka satu persatu.", R.raw.maryam94));
        arrayList.add(new VerseActivity("Maryam", "وَكُلُّهُمْ ءَاتِيهِ يَوْمَ ٱلْقِيَٰمَةِ فَرْدًا", "Dan mereka masing-masing akan datang mengadapNya pada hari kiamat dengan seorang diri.", R.raw.maryam95));
        arrayList.add(new VerseActivity("Maryam", "﻿إِنَّ ٱلَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ ٱلصَّٰلِحَٰتِ سَيَجْعَلُ لَهُمُ ٱلرَّحْمَٰنُ وُدًّا", "Sesungguhnya orang-orang yang beriman dan beramal soleh, Allah yang melimpah-limpah rahmatnya akan menanamkan bagi mereka dalam hati orang ramai perasaan kasih sayang.", R.raw.maryam96));
        arrayList.add(new VerseActivity("Maryam", "﻿فَإِنَّمَا يَسَّرْنَٰهُ بِلِسَانِكَ لِتُبَشِّرَ بِهِ ٱلْمُتَّقِينَ وَتُنذِرَ بِهِۦ قَوْمًا لُّدًّا", "Maka sesungguhnya Kami memudahkan turunnya Al-Quran ini dengan bahasamu (wahai Muhammad), ialah supaya engkau memberi khabar gembira dengannya kepada orang-orang yang bertaqwa, dan supaya engkau memberi amaran dengannya kepada kaum yang degil dalam kekufurannya.", R.raw.maryam97));
        arrayList.add(new VerseActivity("Maryam", "وَكَمْ أَهْلَكْنَا قَبْلَهُم مِّن قَرْنٍ هَلْ تُحِسُّ مِنْهُم مِّنْ أَحَدٍ أَوْ تَسْمَعُ لَهُمْ رِكْزًۢا", "Dan amatlah banyaknya kaum-kaum kafir yang Kami telah binasakan sebelum mereka; engkau tidak menyedari ataupun mendengar suara yang sayup bagi seseorangpun dari orang-orang yang telah dibinasakan itu.", R.raw.maryam98));

        adapter = new QuranActivity(this, R.layout.verseview, arrayList);
        verseList.setAdapter(adapter);
    }

    Menu menu;

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu; this adds items to the action bar if it is
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    private MediaPlayer mp = null;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_play_all:
                mp = MediaPlayer.create(this, R.raw.maryamfull);
                mp.start();
                break;
            case R.id.action_stopmenu:
                if (mp != null)
                    mp.stop();
                break;
            case R.id.action_infomenu:
                break;
            case R.id.action_eng:
                if(mp != null)
                    mp.stop();
                Intent i = new Intent(SurahMaryamMalay.this, SurahMaryamEnglish.class);
                startActivity(i);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}