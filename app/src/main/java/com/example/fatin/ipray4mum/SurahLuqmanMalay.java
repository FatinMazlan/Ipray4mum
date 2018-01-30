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

public class SurahLuqmanMalay extends AppCompatActivity {
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
        arrayList.add(new VerseActivity("Luqman", "تِلْكَ ءَايَٰتُ ٱلْكِتَٰبِ ٱلْحَكِيمِ", "Ini ialah ayat-ayat Kitab (Al-Quran) yang mengandungi hikmat-hikmat dan kebenaran yang tetap kukuh,", R.raw.luqman2));
        arrayList.add(new VerseActivity("Luqman", "﻿﻿﻿هُدًى وَرَحْمَةً لِّلْمُحْسِنِينَ", "Menjadi hidayah petunjuk dan rahmat bagi orang-orang yang sedia mengerjakan amal-amal yang baik", R.raw.luqman3));
        arrayList.add(new VerseActivity("Luqman", "﻿ٱلَّذِينَ يُقِيمُونَ ٱلصَّلَوٰةَ وَيُؤْتُونَ ٱلزَّكَوٰةَ وَهُم بِٱلْءَاخِرَةِ هُمْ يُوقِنُونَ﻿", "Iaitu orang-orang yang mendirikan sembahyang, dan memberi zakat, serta mereka yakin tentang adanya hari akhirat.", R.raw.luqman4));
        arrayList.add(new VerseActivity("Luqman", "أُو۟لَٰٓئِكَ عَلَىٰ هُدًى مِّن رَّبِّهِمْ ۖ وَأُو۟لَٰٓئِكَ هُمُ ٱلْمُفْلِحُونَ﻿", "Mereka itulah yang tetap mendapat hidayah petunjuk dari Tuhan mereka, dan merekalah orang-orang yang berjaya.", R.raw.luqman5));
        arrayList.add(new VerseActivity("Luqman", "﻿وَمِنَ ٱلنَّاسِ مَن يَشْتَرِى لَهْوَ ٱلْحَدِيثِ لِيُضِلَّ عَن سَبِيلِ ٱللَّهِ بِغَيْرِ عِلْمٍ وَيَتَّخِذَهَا هُزُوًا ۚ أُو۟لَٰٓئِكَ لَهُمْ عَذَابٌ مُّهِينٌ﻿", "Dan ada di antara manusia: orang yang memilih serta membelanjakan hartanya kepada cerita-cerita dan perkara-perkara hiburan yang melalaikan; yang berakibat menyesatkan (dirinya dan orang ramai) dari agama Allah dengan tidak berdasarkan sebarang pengetahuan; dan ada pula orang yang menjadikan agama Allah itu sebagai ejek-ejekan; merekalah orang-orang yang akan beroleh azab yang menghinakan.", R.raw.luqman6));
        arrayList.add(new VerseActivity("Luqman", "﻿وَإِذَا تُتْلَىٰ عَلَيْهِ ءَايَٰتُنَا وَلَّىٰ مُسْتَكْبِرًا كَأَن لَّمْ يَسْمَعْهَا كَأَنَّ فِىٓ أُذُنَيْهِ وَقْرًا ۖ فَبَشِّرْهُ بِعَذَابٍ أَلِيمٍ", "Dan apabila dibacakan kepadanya ayat-ayat Kami, berpalinglah dia dengan angkuhnya, seoleh-oleh ada penyumbat pada kedua telinganya; maka gembirakanlah dia dengan balasan azab yang tidak terperi sakitnya.", R.raw.luqman7));
        arrayList.add(new VerseActivity("Luqman", "﻿إِنَّ ٱلَّذِينَ ءَامَنُوا۟ وَعَمِلُوا۟ ٱلصَّٰلِحَٰتِ لَهُمْ جَنَّٰتُ ٱلنَّعِيمِ", "Sesungguhnya orang-orang yang beriman dan beramal soleh, mereka akan beroleh Syurga yang penuh dengan berbagai nikmat,", R.raw.luqman8));
        arrayList.add(new VerseActivity("Luqman", "﻿خَٰلِدِينَ فِيهَا ۖ وَعْدَ ٱللَّهِ حَقًّا ۚ وَهُوَ ٱلْعَزِيزُ ٱلْحَكِيمُ", "Kekallah mereka di dalamnya. Demikian dijanjikan Allah - janji yang tetap benar; dan Dia lah jua yang Maha Kuasa, lagi Maha Bijaksana.", R.raw.luqman9));
        arrayList.add(new VerseActivity("Luqman", "خَلَقَ ٱلسَّمَٰوَٰتِ بِغَيْرِ عَمَدٍ تَرَوْنَهَا ۖ وَأَلْقَىٰ فِى ٱلْأَرْضِ رَوَٰسِىَ أَن تَمِيدَ بِكُمْ وَبَثَّ فِيهَا مِن كُلِّ دَآبَّةٍ ۚ وَأَنزَلْنَا مِنَ ٱلسَّمَآءِ مَآءً فَأَنۢبَتْنَا فِيهَا مِن كُلِّ زَوْجٍ كَرِيمٍ", "Ia menciptakan langit dengan tidak bertiang sebagaimana yang kamu melihatnya; dan Ia mengadakan di bumi gunung-ganang yang menetapnya supaya bumi itu tidak menghayun-hayunkan kamu; dan Ia biakkan padanya berbagai jenis binatang. Dan Kami menurunkan hujan dari langit, lalu Kami tumbuhkan di bumi berbagai jenis tanaman yang memberi banyak manfaat.", R.raw.luqman10));

        /*ayat 11-20*/
        arrayList.add(new VerseActivity("Luqman", "﻿هَٰذَا خَلْقُ ٱللَّهِ فَأَرُونِى مَاذَا خَلَقَ ٱلَّذِينَ مِن دُونِهِۦ ۚ بَلِ ٱلظَّٰلِمُونَ فِى ضَلَٰلٍ مُّبِينٍ", "Ini (semuanya adalah) ciptaan Allah, maka cubalah kamu tunjukkan kepadaKu apakah yang telah diciptakan oleh makhluk-makhluk yang lain daripadaNya (yang kamu sembah itu)? (Tidak ada sesuatu pun) bahkan orang-orang yang zalim (dengan perbuatan syiriknya) itu berada dalam kesesatan yang jelas nyata.", R.raw.luqman11));
        arrayList.add(new VerseActivity("Luqman", "﻿وَلَقَدْ ءَاتَيْنَا لُقْمَٰنَ ٱلْحِكْمَةَ أَنِ ٱشْكُرْ لِلَّهِ ۚ وَمَن يَشْكُرْ فَإِنَّمَا يَشْكُرُ لِنَفْسِهِۦ ۖ وَمَن كَفَرَ فَإِنَّ ٱللَّهَ غَنِىٌّ حَمِيدٌ﻿", "\"Dan sesungguhnya Kami telah memberi kepada Luqman, hikmat kebijaksanaan, (serta Kami perintahkan kepadanya): Bersyukurlah kepada Allah (akan segala nikmatNya kepadamu)\". Dan sesiapa yang bersyukur maka faedahnya itu hanyalah terpulang kepada dirinya sendiri, dan sesiapa yang tidak bersyukur (maka tidaklah menjadi hal kepada Allah), kerana sesungguhnya Allah Maha Kaya, lagi Maha Terpuji.", R.raw.luqman12));
        arrayList.add(new VerseActivity("Luqman", "وَإِذْ قَالَ لُقْمَٰنُ لِٱبْنِهِۦ وَهُوَ يَعِظُهُۥ يَٰبُنَىَّ لَا تُشْرِكْ بِٱللَّهِ ۖ إِنَّ ٱلشِّرْكَ لَظُلْمٌ عَظِيمٌ", "Dan (ingatlah) ketika Luqman berkata kepada anaknya, semasa ia memberi nasihat kepadanya: \"Wahai anak kesayanganku, janganlah engkau mempersekutukan Allah (dengan sesuatu yang lain), sesungguhnya perbuatan syirik itu adalah satu kezaliman yang besar\".", R.raw.luqman13));
        arrayList.add(new VerseActivity("Luqman", "وَوَصَّيْنَا ٱلْإِنسَٰنَ بِوَٰلِدَيْهِ حَمَلَتْهُ أُمُّهُۥ وَهْنًا عَلَىٰ وَهْنٍ وَفِصَٰلُهُۥ فِى عَامَيْنِ أَنِ ٱشْكُرْ لِى وَلِوَٰلِدَيْكَ إِلَىَّ ٱلْمَصِيرُ", "Dan Kami wajibkan manusia berbuat baik kepada kedua ibu bapanya; ibunya telah mengandungnya dengan menanggung kelemahan demi kelemahan (dari awal mengandung hingga akhir menyusunya), dan tempoh menceraikan susunya ialah dalam masa dua tahun; (dengan yang demikian) bersyukurlah kepadaKu dan kepada kedua ibubapamu; dan (ingatlah), kepada Akulah jua tempat kembali (untuk menerima balasan).", R.raw.luqman14));
        arrayList.add(new VerseActivity("Luqman", "﻿وَإِن جَٰهَدَاكَ عَلَىٰٓ أَن تُشْرِكَ بِى مَا لَيْسَ لَكَ بِهِۦ عِلْمٌ فَلَا تُطِعْهُمَا ۖ وَصَاحِبْهُمَا فِى ٱلدُّنْيَا مَعْرُوفًا ۖ وَٱتَّبِعْ سَبِيلَ مَنْ أَنَابَ إِلَىَّ ۚ ثُمَّ إِلَىَّ مَرْجِعُكُمْ فَأُنَبِّئُكُم بِمَا كُنتُمْ تَعْمَلُونَ", "Dan jika mereka berdua mendesakmu supaya engkau mempersekutukan denganKu sesuatu yang engkau - dengan fikiran sihatmu - tidak mengetahui sungguh adanya maka janganlah engkau taat kepada mereka; dan bergaulah dengan mereka di dunia dengan cara yang baik. Dan turutlah jalan orang-orang yang rujuk kembali kepadaKu (dengan tauhid dan amal-amal yang soleh). Kemudian kepada Akulah tempat kembali kamu semuanya, maka Aku akan menerangkan kepada kamu segala yang kamu telah kerjakan.", R.raw.luqman15));
        arrayList.add(new VerseActivity("Luqman", "يَٰبُنَىَّ إِنَّهَآ إِن تَكُ مِثْقَالَ حَبَّةٍ مِّنْ خَرْدَلٍ فَتَكُن فِى صَخْرَةٍ أَوْ فِى ٱلسَّمَٰوَٰتِ أَوْ فِى ٱلْأَرْضِ يَأْتِ بِهَا ٱللَّهُ ۚ إِنَّ ٱللَّهَ لَطِيفٌ خَبِيرٌ", "(Luqman menasihati anaknya dengan berkata): \"Wahai anak kesayanganku, sesungguhnya jika ada sesuatu perkara (yang baik atau yang buruk) sekalipun seberat bijih sawi, serta ia tersembunyi di dalam batu besar atau di langit atau pun di bumi, sudah tetap akan dibawa oleh Allah (untuk dihakimi dan dibalasNya); kerana sesungguhnya Allah Maha Halus pengetahuanNya; lagi Amat Meliputi akan segala yang tersembunyi.\"", R.raw.luqman16));
        arrayList.add(new VerseActivity("Luqman", "﻿يَٰبُنَىَّ أَقِمِ ٱلصَّلَوٰةَ وَأْمُرْ بِٱلْمَعْرُوفِ وَٱنْهَ عَنِ ٱلْمُنكَرِ وَٱصْبِرْ عَلَىٰ مَآ أَصَابَكَ ۖ إِنَّ ذَٰلِكَ مِنْ عَزْمِ ٱلْأُمُورِ", "\"Wahai anak kesayanganku, dirikanlah sembahyang, dan suruhlah berbuat kebaikan, serta laranglah daripada melakukan perbuatan yang mungkar, dan bersabarlah atas segala bala bencana yang menimpamu. Sesungguhnya yang demikian itu adalah dari perkara-perkara yang dikehendaki diambil berat melakukannya.\"", R.raw.luqman17));
        arrayList.add(new VerseActivity("Luqman", "وَلَا تُصَعِّرْ خَدَّكَ لِلنَّاسِ وَلَا تَمْشِ فِى ٱلْأَرْضِ مَرَحًا ۖ إِنَّ ٱللَّهَ لَا يُحِبُّ كُلَّ مُخْتَالٍ فَخُورٍ", "\"Dan janganlah engkau memalingkan mukamu (kerana memandang rendah) kepada manusia, dan janganlah engkau berjalan di bumi dengan berlagak sombong; sesungguhnya Allah tidak suka kepada tiap-tiap orang yang sombong takbur, lagi membanggakan diri.\"", R.raw.luqman18));
        arrayList.add(new VerseActivity("Luqman", "﻿وَٱقْصِدْ فِى مَشْيِكَ وَٱغْضُضْ مِن صَوْتِكَ ۚ إِنَّ أَنكَرَ ٱلْأَصْوَٰتِ لَصَوْتُ ٱلْحَمِيرِ", "\"Dan sederhanakanlah langkahmu semasa berjalan, juga rendahkanlah suaramu (semasa berkata-kata), sesungguhnya seburuk-buruk suara ialah suara keldai\".", R.raw.luqman19));
        arrayList.add(new VerseActivity("Luqman", "أَلَمْ تَرَوْا۟ أَنَّ ٱللَّهَ سَخَّرَ لَكُم مَّا فِى ٱلسَّمَٰوَٰتِ وَمَا فِى ٱلْأَرْضِ وَأَسْبَغَ عَلَيْكُمْ نِعَمَهُۥ ظَٰهِرَةً وَبَاطِنَةً ۗ وَمِنَ ٱلنَّاسِ مَن يُجَٰدِلُ فِى ٱللَّهِ بِغَيْرِ عِلْمٍ وَلَا هُدًى وَلَا كِتَٰبٍ مُّنِيرٍ", "Tidakkah kamu memperhatikan bahawa Allah telah memudahkan untuk kegunaan kamu apa yang ada di langit dan yang ada di bumi, dan telah melimpahkan kepada kami nikmat-nimatNya yang zahir dan yang batin? Dalam pada itu, ada di antara manusia orang yang membantah mengenai (sifat-sifat) Allah dengan tidak berdasarkan sebarang pengetahuan atau sebarang petunjuk; dan tidak juga berdasarkan mana-mana Kitab Allah yang menerangi kebenaran.", R.raw.luqman20));

        /*ayat 21-30*/
        arrayList.add(new VerseActivity("Luqman", "﻿وَإِذَا قِيلَ لَهُمُ ٱتَّبِعُوا۟ مَآ أَنزَلَ ٱللَّهُ قَالُوا۟ بَلْ نَتَّبِعُ مَا وَجَدْنَا عَلَيْهِ ءَابَآءَنَآ ۚ أَوَلَوْ كَانَ ٱلشَّيْطَٰنُ يَدْعُوهُمْ إِلَىٰ عَذَابِ ٱلسَّعِيرِ", "Dan apabila dikatakan kepada mereka (yang ingkar): \"Turutlah akan apa yang telah diturunkan oleh Allah\" mereka menjawab: \"(Tidak), bahkan Kami hanya menurut apa yang Kami dapati datuk nenek kami melakukannya\". Patutkah mereka (menurut datuk neneknya) sekalipun Syaitan mengajak mereka itu (melakukan perbuatan yang menjerumuskan mereka) ke dalam azab api neraka yang marak menjulang?", R.raw.luqman21));
        arrayList.add(new VerseActivity("Luqman", "﻿۞ وَمَن يُسْلِمْ وَجْهَهُۥٓ إِلَى ٱللَّهِ وَهُوَ مُحْسِنٌ فَقَدِ ٱسْتَمْسَكَ بِٱلْعُرْوَةِ ٱلْوُثْقَىٰ ۗ وَإِلَى ٱللَّهِ عَٰقِبَةُ ٱلْأُمُورِ", "Dan sesiapa yang berserah diri bulat-bulat kepada Allah (dengan ikhlas) sedang ia berusaha mengerjakan kebaikan, maka sesungguhnya ia telah berpegang kepada simpulan (tali agama) yang teguh dan (ingatlah) kepada Allah jualah kesudahan segala urusan.", R.raw.luqman22));
        arrayList.add(new VerseActivity("Luqman", "﻿وَمَن كَفَرَ فَلَا يَحْزُنكَ كُفْرُهُۥٓ ۚ إِلَيْنَا مَرْجِعُهُمْ فَنُنَبِّئُهُم بِمَا عَمِلُوٓا۟ ۚ إِنَّ ٱللَّهَ عَلِيمٌۢ بِذَاتِ ٱلصُّدُورِ", "Dan sesiapa yang kufur ingkar, maka janganlah engkau (wahai Muhammad) berdukacita tentang kekufurannya itu; kepada Kamilah tempat kembalinya mereka, kemudian Kami akan memberitahu kepada mereka tentang apa yang mereka telah kerjakan. Sesungguhnya Allah Maha Mengetahui akan segala (isi hati) yang terkandung di dalam dada.", R.raw.luqman23));
        arrayList.add(new VerseActivity("Luqman", "﻿نُمَتِّعُهُمْ قَلِيلًا ثُمَّ نَضْطَرُّهُمْ إِلَىٰ عَذَابٍ غَلِيظٍ", "Kami akan berikan mereka menikmati kesenangan bagi sementara (di dunia), kemudian Kami akan memaksa mereka (dengan menyeretnya) ke dalam azab yang amat berat.", R.raw.luqman24));
        arrayList.add(new VerseActivity("Luqman", "وَلَئِن سَأَلْتَهُم مَّنْ خَلَقَ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضَ لَيَقُولُنَّ ٱللَّهُ ۚ قُلِ ٱلْحَمْدُ لِلَّهِ ۚ بَلْ أَكْثَرُهُمْ لَا يَعْلَمُونَ", "Dan sesungguhnya jika engkau (wahai Muhammad) bertanya kepada mereka (yang musyrik) itu: \"Siapakah yang menciptakan langit dan bumi?\" Sudah tentu mereka akan menjawab: \"Allah\". Ucapkanlah (wahai Muhammad): \"Alhamdulillah\" (sebagai bersyukur disebabkan pengakuan mereka yang demikian - tidak mengingkari Allah), bahkan kebanyakan mereka tidak mengetahui (hakikat tauhid dan pengertian syirik).", R.raw.luqman25));
        arrayList.add(new VerseActivity("Luqman", "﻿لِلَّهِ مَا فِى ٱلسَّمَٰوَٰتِ وَٱلْأَرْضِ ۚ إِنَّ ٱللَّهَ هُوَ ٱلْغَنِىُّ ٱلْحَمِيدُ", "Allah jua yang memiliki segala yang ada di langit dan di bumi; sesungguhnya Allah Dia lah jua yang Maha Kaya, lagi sentiasa Terpuji.", R.raw.luqman26));
        arrayList.add(new VerseActivity("Luqman", "﻿وَلَوْ أَنَّمَا فِى ٱلْأَرْضِ مِن شَجَرَةٍ أَقْلَٰمٌ وَٱلْبَحْرُ يَمُدُّهُۥ مِنۢ بَعْدِهِۦ سَبْعَةُ أَبْحُرٍ مَّا نَفِدَتْ كَلِمَٰتُ ٱللَّهِ ۗ إِنَّ ٱللَّهَ عَزِيزٌ حَكِيمٌ", "Dan sekiranya segala pohon yang ada di bumi menjadi pena, dan segala lautan (menjadi tinta), dengan dibantu kepadanya tujuh lautan lagi sesudah itu, nescaya tidak akan habis Kalimah-kalimah Allah itu ditulis. Sesungguhnya Allah Maha Kuasa, lagi Maha Bijaksana.", R.raw.luqman27));
        arrayList.add(new VerseActivity("Luqman", "﻿مَّا خَلْقُكُمْ وَلَا بَعْثُكُمْ إِلَّا كَنَفْسٍ وَٰحِدَةٍ ۗ إِنَّ ٱللَّهَ سَمِيعٌۢ بَصِيرٌ", "(Bagi Allah Yang Maha Kuasa) soal menciptakan kamu semua (dari tiada kepada ada), dan soal membangkitkan kamu hidup semula sesudah mati, tidak ada apa-apa sukarnya, hanyalah seperti (mencipta dan menghidupkan semula) seorang manusia sahaja. Sesungguhnya Allah Maha Mendengar, lagi Maha Melihat.", R.raw.luqman28));
        arrayList.add(new VerseActivity("Luqman", "أَلَمْ تَرَ أَنَّ ٱللَّهَ يُولِجُ ٱلَّيْلَ فِى ٱلنَّهَارِ وَيُولِجُ ٱلنَّهَارَ فِى ٱلَّيْلِ وَسَخَّرَ ٱلشَّمْسَ وَٱلْقَمَرَ كُلٌّ يَجْرِىٓ إِلَىٰٓ أَجَلٍ مُّسَمًّى وَأَنَّ ٱللَّهَ بِمَا تَعْمَلُونَ خَبِيرٌ", "Tidakkah engkau memerhatikan bahawa Allah memasukkan malam pada siang dan memasukkan siang pada malam (silih berganti), dan Ia memudahkan matahari dan bulan (untuk faedah makhluk-makhlukNya)? Tiap-tiap satu dari keduanya beredar untuk suatu masa yang telah ditetapkan. Dan (ingatlah) sesungguhnya Allah Maha Mengetahui dengan mendalam akan apa yang kamu lakukan.", R.raw.luqman29));
        arrayList.add(new VerseActivity("Luqman", "﻿ذَٰلِكَ بِأَنَّ ٱللَّهَ هُوَ ٱلْحَقُّ وَأَنَّ مَا يَدْعُونَ مِن دُونِهِ ٱلْبَٰطِلُ وَأَنَّ ٱللَّهَ هُوَ ٱلْعَلِىُّ ٱلْكَبِيرُ", "Bersifatnya Allah dengan penuh kekuasaan dan luas ilmu pengetahuan itu kerana bahawasanya Allah Dia lah sahaja Tuhan Yang Sebenar-benarnya, dan bahawa segala yang mereka sembah selain dari Allah adalah palsu belaka. Dan (ingatlah) sesungguhnya Allah Dia lah Yang Maha Tinggi keadaanNya, lagi Maha Besar (kekuasaanNya).", R.raw.luqman30));

        /*ayat 31-40*/
        arrayList.add(new VerseActivity("Luqman", "أَلَمْ تَرَ أَنَّ ٱلْفُلْكَ تَجْرِى فِى ٱلْبَحْرِ بِنِعْمَتِ ٱللَّهِ لِيُرِيَكُم مِّنْ ءَايَٰتِهِۦٓ ۚ إِنَّ فِى ذَٰلِكَ لَءَايَٰتٍ لِّكُلِّ صَبَّارٍ شَكُورٍ", "Tidakkah engkau memerhatikan bahawasanya kapal-kapal belayar di laut dengan nikmat Kurnia Allah, untuk diperlihatkan kepada kamu sebahagian dari tanda-tanda kemurahanNya? Sesungguhnya yang demikian itu mengandungi keterangan-keterangan dan bukti (untuk berfikir) bagi tiap-tiap (mukmin) yang tetap teguh pendiriannya, lagi sentiasa bersyukur.", R.raw.luqman31));
        arrayList.add(new VerseActivity("Luqman", "وَإِذَا غَشِيَهُم مَّوْجٌ كَٱلظُّلَلِ دَعَوُا۟ ٱللَّهَ مُخْلِصِينَ لَهُ ٱلدِّينَ فَلَمَّا نَجَّىٰهُمْ إِلَى ٱلْبَرِّ فَمِنْهُم مُّقْتَصِدٌ ۚ وَمَا يَجْحَدُ بِـَٔايَٰتِنَآ إِلَّا كُلُّ خَتَّارٍ كَفُورٍ", "Dan (orang-orang yang tidak bersifat demikian) apabila mereka dirempuh serta diliputi oleh ombak yang besar seperti kelompok-kelompok awan menyerkup, pada saat itu mereka semua berdoa kepada Allah dengan mengikhlaskan kepercayaan mereka kepadaNya semata-mata. Kemudian bila sahaja Allah menyelamatkan mereka ke darat maka sebahagian sahaja di antara mereka yang bersikap adil (lalu bersyukur kepada Allah serta mengesakanNya). Dan sememangnya tiada yang mengingkari bukti-bukti kemurahan Kami melainkan tiap-tiap orang yang bersifat pemungkir janji, lagi amat tidak mengenang budi.", R.raw.luqman32));
        arrayList.add(new VerseActivity("Luqman", "يَٰٓأَيُّهَا ٱلنَّاسُ ٱتَّقُوا۟ رَبَّكُمْ وَٱخْشَوْا۟ يَوْمًا لَّا يَجْزِى وَالِدٌ عَن وَلَدِهِۦ وَلَا مَوْلُودٌ هُوَ جَازٍ عَن وَالِدِهِۦ شَيْـًٔا ۚ إِنَّ وَعْدَ ٱللَّهِ حَقٌّ ۖ فَلَا تَغُرَّنَّكُمُ ٱلْحَيَوٰةُ ٱلدُّنْيَا وَلَا يَغُرَّنَّكُم بِٱللَّهِ ٱلْغَرُورُ", "Wahai sekalian manusia, bertaqwalah kepada Tuhan kamu, dan takutilah akan hari (akhirat) yang padanya seseorang ibu atau bapa tidak dapat melepaskan anaknya dari azab dosanya, dan seorang anak pula tidak dapat melepaskan ibu atau bapanya dari azab dosa masing-masing sedikit pun. Sesungguhnya janji Allah itu adalah benar, maka janganlah kamu diperdayakan oleh kehidupan dunia, dan jangan pula kamu diperdayakan oleh bisikan dan ajakan Syaitan yang menyebabkan kamu berani melanggar perintah Allah.", R.raw.luqman33));
        arrayList.add(new VerseActivity("Luqman", "﻿إِنَّ ٱللَّهَ عِندَهُۥ عِلْمُ ٱلسَّاعَةِ وَيُنَزِّلُ ٱلْغَيْثَ وَيَعْلَمُ مَا فِى ٱلْأَرْحَامِ ۖ وَمَا تَدْرِى نَفْسٌ مَّاذَا تَكْسِبُ غَدًا ۖ وَمَا تَدْرِى نَفْسٌۢ بِأَىِّ أَرْضٍ تَمُوتُ ۚ إِنَّ ٱللَّهَ عَلِيمٌ خَبِيرٌۢ", "Sesungguhnya di sisi Allah pengetahuan yang tepat tentang hari kiamat. Dan Dia lah jua yang menurunkan hujan, dan yang mengetahui dengan sebenar-benarnya tentang apa yang ada dalam rahim (ibu yang mengandung). Dan tiada seseorang pun yang betul mengetahui apa yang akan diusahakannya esok (sama ada baik atau jahat); dan tiada seorangpun yang dapat mengetahui di bumi negeri manakah ia akan mati. Sesungguhnya Allah Maha Mengetahui, lagi Amat Meliputi pengetahuanNya.", R.raw.luqman34));

        adapter = new QuranActivity(this, R.layout.verseview, arrayList);
        verseList.setAdapter(adapter);
    }

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
                mp = MediaPlayer.create(this, R.raw.luqmanfull);
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
                Intent i = new Intent(SurahLuqmanMalay.this, SurahLuqmanEnglish.class);
                startActivity(i);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}