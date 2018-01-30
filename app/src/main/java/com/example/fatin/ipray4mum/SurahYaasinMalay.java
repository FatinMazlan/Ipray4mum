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

public class SurahYaasinMalay extends AppCompatActivity {
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
        arrayList.add(new VerseActivity("Yaasin", "وَٱلْقُرْءَانِ ٱلْحَكِيمِ", "Demi Al-Quran yang mengandungi hikmat-hikmat dan kebenaran yang tetap kukuh,", R.raw.yaasin2));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنَّكَ لَمِنَ ٱلْمُرْسَلِينَ", "Sesungguhnya engkau (wahai Muhammad adalah seorang Rasul) dari Rasul-rasul yang telah diutus,", R.raw.yaasin3));
        arrayList.add(new VerseActivity("Yaasin", "عَلَىٰ صِرَٰطٍ مُّسْتَقِيمٍ", "Yang tetap di atas jalan yang lurus (agama Islam).", R.raw.yaasin4));
        arrayList.add(new VerseActivity("Yaasin", "﻿تَنزِيلَ ٱلْعَزِيزِ ٱلرَّحِيمِ", "Al-Quran itu, diturunkan oleh Allah Yang Maha Kuasa, lagi Maha Mengasihani,", R.raw.yaasin5));
        arrayList.add(new VerseActivity("Yaasin", "﻿لِتُنذِرَ قَوْمًا مَّآ أُنذِرَ ءَابَآؤُهُمْ فَهُمْ غَٰفِلُونَ", "Supaya engkau memberi peringatan dan amaran kepada kaum yang datuk neneknya telah lama tidak diberikan peringatan dan amaran; sebab itulah mereka lalai.", R.raw.yaasin6));
        arrayList.add(new VerseActivity("Yaasin", "﻿لَقَدْ حَقَّ ٱلْقَوْلُ عَلَىٰٓ أَكْثَرِهِمْ فَهُمْ لَا يُؤْمِنُونَ﻿", "Demi sesungguhnya, telah tetap hukuman seksa atas kebanyakan mereka, kerana mereka tidak mahu beriman.", R.raw.yaasin7));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنَّا جَعَلْنَا فِىٓ أَعْنَٰقِهِمْ أَغْلَٰلًا فَهِىَ إِلَى ٱلْأَذْقَانِ فَهُم مُّقْمَحُونَ", "Sesungguhnya Kami jadikan (kesombongan dan keengganan mereka tunduk kepada kebenaran sebagai) belenggu yang memberkas kedua tangan mereka ke batang leher mereka; (lebarnya belenggu itu) sampai (menongkatkan) dagu mereka lalu menjadilah mereka terdongak.", R.raw.yaasin8));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَجَعَلْنَا مِنۢ بَيْنِ أَيْدِيهِمْ سَدًّا وَمِنْ خَلْفِهِمْ سَدًّا فَأَغْشَيْنَٰهُمْ فَهُمْ لَا يُبْصِرُونَ", "Dan Kami jadikan (sifat tamak dan gila mereka kepada harta benda dan pangkat itu sebagai) sekatan (yang menghalang mereka daripada memandang kepada keburukan dan kesingkatan masa dunia yang ada) di hadapan mereka, dan sekatan (yang menghalang mereka daripada memikirkan azab yang ada) di belakang mereka (pada hari kiamat). lalu Kami tutup pandangan mereka; maka dengan itu, mereka tidak dapat melihat (jalan yang benar).", R.raw.yaasin9));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَسَوَآءٌ عَلَيْهِمْ ءَأَنذَرْتَهُمْ أَمْ لَمْ تُنذِرْهُمْ لَا يُؤْمِنُونَ﻿", "Dan (dengan sebab itu) sama sahaja kepada mereka, engkau beri amaran atau engkau tidak beri amaran kepadanya - mereka tidak akan beriman.", R.raw.yaasin10));

        /*ayat 11-20*/
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنَّمَا تُنذِرُ مَنِ ٱتَّبَعَ ٱلذِّكْرَ وَخَشِىَ ٱلرَّحْمَٰنَ بِٱلْغَيْبِ ۖ فَبَشِّرْهُ بِمَغْفِرَةٍ وَأَجْرٍ كَرِيمٍ", "Sesungguhnya peringatan dan amaran (yang berkesan dan mendatangkan faedah) hanyalah yang engkau berikan kepada orang yang sedia menurut ajaran Al-Quran serta ia takut (melanggar perintah Allah) Ar-Rahman semasa ia tidak dilihat orang dan semasa ia tidak melihat azab Tuhan. Oleh itu berilah kepadanya berita yang mengembirakan dengan keampunan dan pahala yang mulia.", R.raw.yaasin11));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنَّا نَحْنُ نُحْىِ ٱلْمَوْتَىٰ وَنَكْتُبُ مَا قَدَّمُوا۟ وَءَاثَٰرَهُمْ ۚ وَكُلَّ شَىْءٍ أَحْصَيْنَٰهُ فِىٓ إِمَامٍ مُّبِينٍ", "Sesungguhnya Kami menghidupkan orang-orang yang mati, dan Kami tuliskan segala yang mereka telah kerjakan serta segala kesan perkataan dan perbuatan yang mereka tinggalkan. Dan (ingatlah) tiap-tiap sesuatu kami catitkan satu persatu dalam Kitab (ibu Suratan) yang jelas nyata.", R.raw.yaasin12));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَٱضْرِبْ لَهُم مَّثَلًا أَصْحَٰبَ ٱلْقَرْيَةِ إِذْ جَآءَهَا ٱلْمُرْسَلُونَ", "Dan ceritakanlah kepada mereka satu keadaan yang ajaib mengenai kisah penduduk sebuah bandar (yang tertentu) iaitu ketika mereka didatangi Rasul-rasul (Kami),", R.raw.yaasin13));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِذْ أَرْسَلْنَآ إِلَيْهِمُ ٱثْنَيْنِ فَكَذَّبُوهُمَا فَعَزَّزْنَا بِثَالِثٍ فَقَالُوٓا۟ إِنَّآ إِلَيْكُم مُّرْسَلُونَ", "Ketika Kami mengutus kepada mereka dua orang Rasul lalu mereka mendustakannya; kemudian Kami kuatkan (kedua Rasul itu) dengan Rasul yang ketiga, lalu Rasul-rasul itu berkata: ` Sesungguhnya kami ini adalah diutuskan kepada kamu '.", R.raw.yaasin14));
        arrayList.add(new VerseActivity("Yaasin", "﻿قَالُوا۟ مَآ أَنتُمْ إِلَّا بَشَرٌ مِّثْلُنَا وَمَآ أَنزَلَ ٱلرَّحْمَٰنُ مِن شَىْءٍ إِنْ أَنتُمْ إِلَّا تَكْذِبُونَ", "Penduduk bandar itu menjawab: \"Kamu ini tidak lain hanyalah manusia seperti kami juga, dan Tuhan Yang Maha Pemurah tidak menurunkan sesuatupun (tentang agama yang kamu dakwakan); Kamu ini tidak lain hanyalah berdusta\".", R.raw.yaasin15));
        arrayList.add(new VerseActivity("Yaasin", "﻿قَالُوا۟ رَبُّنَا يَعْلَمُ إِنَّآ إِلَيْكُمْ لَمُرْسَلُونَ", "Rasul-rasul berkata: Tuhan Kami mengetahui bahawa sesungguhnya Kami adalah Rasul-rasul yang diutus kepada kamu,", R.raw.yaasin16));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَمَا عَلَيْنَآ إِلَّا ٱلْبَلَٰغُ ٱلْمُبِينُ", "\"Dan tugas Kami hanyalah menyampaikan perintah-perintahNya dengan cara yang jelas nyata\".", R.raw.yaasin17));
        arrayList.add(new VerseActivity("Yaasin", "قَالُوٓا۟ إِنَّا تَطَيَّرْنَا بِكُمْ ۖ لَئِن لَّمْ تَنتَهُوا۟ لَنَرْجُمَنَّكُمْ وَلَيَمَسَّنَّكُم مِّنَّا عَذَابٌ أَلِيمٌ", "Penduduk bandar itu berkata pula: \"Sesungguhnya kami merasa nahas dan malang dengan sebab kamu. Demi sesungguhnya, kalau kamu tidak berhenti (dari menjalankan tugas yang kamu katakan itu), tentulah kami akan merejam kamu dan sudah tentu kamu akan merasai dari pihak kami azab seksa yang tidak terperi sakitnya\".", R.raw.yaasin18));
        arrayList.add(new VerseActivity("Yaasin", "قَالُوا۟ طَٰٓئِرُكُم مَّعَكُمْ ۚ أَئِن ذُكِّرْتُم ۚ بَلْ أَنتُمْ قَوْمٌ مُّسْرِفُونَ", "Rasul-rasul itu menjawab: \"Nahas dan malang kamu itu adalah disebabkan (kekufuran) yang ada pada kamu. Patutkah kerana kamu diberi peringatan dan nasihat pengajaran (maka kamu mengancam kami dengan apa yang kamu katakan itu)? (Kamu bukanlah orang-orang yang mahu insaf) bahkan kamu adalah kaum pelampau\".", R.raw.yaasin19));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَجَآءَ مِنْ أَقْصَا ٱلْمَدِينَةِ رَجُلٌ يَسْعَىٰ قَالَ يَٰقَوْمِ ٱتَّبِعُوا۟ ٱلْمُرْسَلِينَ", "Dan (semasa Rasul-rasul itu diancam), datanglah seorang lelaki dari hujung bandar itu dengan berlari, lalu memberi nasihat dengan katanya:\" Wahai kaumku! Turutlah Rasul-rasul itu -", R.raw.yaasin20));

        /*ayat 21-30*/
        arrayList.add(new VerseActivity("Yaasin", "﻿ٱتَّبِعُوا۟ مَن لَّا يَسْـَٔلُكُمْ أَجْرًا وَهُم مُّهْتَدُونَ", "\"Turutlah orang-orang yang tidak meminta kapada kamu sesuatu balasan, sedang mereka adalah orang-orang mandapat hidayah petunjuk\".", R.raw.yaasin21));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَمَا لِىَ لَآ أَعْبُدُ ٱلَّذِى فَطَرَنِى وَإِلَيْهِ تُرْجَعُونَ", "Dan (apabila ditanya: Sudahkah engkau menerima agama mereka? Maka jawabnya): \"Mengapa aku tidak menyembah Tuhan yang menciptakan daku, dan yang kepadaNyalah (aku dan) kamu semua akan dikembalikan?", R.raw.yaasin22));
        arrayList.add(new VerseActivity("Yaasin", "﻿ءَأَتَّخِذُ مِن دُونِهِۦٓ ءَالِهَةً إِن يُرِدْنِ ٱلرَّحْمَٰنُ بِضُرٍّ لَّا تُغْنِ عَنِّى شَفَٰعَتُهُمْ شَيْـًٔا وَلَا يُنقِذُونِ", "\"Patutkah aku menyembah beberapa tuhan yang lain dari Allah? (Sudah tentu tidak patut, kerana) jika Allah yang Maha Pemurah hendak menimpakan daku dengan sesuatu bahaya, mereka tidak dapat memberikan sebarang syafaat kepadaku, dan mereka juga tidak dapat menyelamatkan daku.", R.raw.yaasin23));
        arrayList.add(new VerseActivity("Yaasin", "إِنِّىٓ إِذًا لَّفِى ضَلَٰلٍ مُّبِينٍ", "\"Sesungguhnya aku (kalau melakukan syirik) tentulah aku pada ketika itu berada dalam kesesatan yang nyata.", R.raw.yaasin24));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنِّىٓ ءَامَنتُ بِرَبِّكُمْ فَٱسْمَعُونِ", "\"Sesungguhnya aku telah beriman kepada Tuhan kamu, maka dengarlah (nasihatku)\",.", R.raw.yaasin25));
        arrayList.add(new VerseActivity("Yaasin", "﻿قِيلَ ٱدْخُلِ ٱلْجَنَّةَ ۖ قَالَ يَٰلَيْتَ قَوْمِى يَعْلَمُونَ", "(Setelah ia mati) lalu dikatakan kepadanya: \"Masuklah ke dalam Syurga\". Ia berkata; \"Alangkah baiknya kalau kaumku mengetahui -", R.raw.yaasin26));
        arrayList.add(new VerseActivity("Yaasin", "﻿بِمَا غَفَرَ لِى رَبِّى وَجَعَلَنِى مِنَ ٱلْمُكْرَمِينَ", "\"Tentang perkara yang menyebabkan daku diampunkan oleh Tuhanku, serta dijadikannya daku dari orang-orang yang dimuliakan\".", R.raw.yaasin27));
        arrayList.add(new VerseActivity("Yaasin", "۞ وَمَآ أَنزَلْنَا عَلَىٰ قَوْمِهِۦ مِنۢ بَعْدِهِۦ مِن جُندٍ مِّنَ ٱلسَّمَآءِ وَمَا كُنَّا مُنزِلِينَ", "Dan Kami tidak menurunkan kepada kaumnya sesudah ia (mati) sebarang pasukan tentera dari langit (untuk membinasakan mereka), dan tidak perlu Kami menurunkannya.", R.raw.yaasin28));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِن كَانَتْ إِلَّا صَيْحَةً وَٰحِدَةً فَإِذَا هُمْ خَٰمِدُونَ", "(Kebinasaan mereka) hanyalah dilakukan dengan satu pekikan (yang dahsyat), maka dengan serta merta mereka semua sunyi-sepi tidak hidup lagi.", R.raw.yaasin29));
        arrayList.add(new VerseActivity("Yaasin", "﻿يَٰحَسْرَةً عَلَى ٱلْعِبَادِ ۚ مَا يَأْتِيهِم مِّن رَّسُولٍ إِلَّا كَانُوا۟ بِهِۦ يَسْتَهْزِءُونَ", "Sungguh besar perasaan sesal dan kecewa yang menimpa hamba-hamba (yang mengingkari kebenaran)! Tidak datang kepada mereka seorang Rasul melainkan mereka mengejek-ejek dan memperolok-olokkannya.", R.raw.yaasin30));

        /*ayat 31-40*/
        arrayList.add(new VerseActivity("Yaasin", "﻿أَلَمْ يَرَوْا۟ كَمْ أَهْلَكْنَا قَبْلَهُم مِّنَ ٱلْقُرُونِ أَنَّهُمْ إِلَيْهِمْ لَا يَرْجِعُونَ", "Tidakkah mereka mengetahui berapa banyak umat-umat yang telah Kami binasakan sebelum mereka? Umat-umat yang telah binasa itu tidak kembali lagi kepada mereka (bahkan kembali kepada Kami, untuk menerima balasan).", R.raw.yaasin31));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَإِنْ كُلٌّ لَمَّا جَمِيعٌ لَدَيْنَا مُحْضَرُونَ", "Dan tidak ada satu makhluk pun melainkan dihimpunkan ke tempat perbicaraan Kami, semuanya dibawa hadir (untuk menerima balasan).", R.raw.yaasin32));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَآيَةٌ لَهُمُ الْأَرْضُ الْمَيْتَةُ أَحْيَيْنَاهَا وَأَخْرَجْنَا مِنْهَا حَبًّا فَمِنْهُ يَأْكُلُونَ", "Dan dalil yang terang untuk mereka (memahami kekuasaan dan kemurahan kami), ialah bumi yang mati; kami hidupkan dia serta kami keluarkan daripadanya biji-bijian, maka daripada biji-bijian itu mereka makan.", R.raw.yaasin33));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَجَعَلْنَا فِيهَا جَنَّاتٍ مِنْ نَخِيلٍ وَأَعْنَابٍ وَفَجَّرْنَا فِيهَا مِنَ الْعُيُونِ", "Dan kami jadikan di bumi itu kebun-kebun kurma dan anggur, dan kami pancarkan padanya beberapa matair,", R.raw.yaasin34));
        arrayList.add(new VerseActivity("Yaasin", "لِيَأْكُلُوا۟ مِن ثَمَرِهِۦ وَمَا عَمِلَتْهُ أَيْدِيهِمْ ۖ أَفَلَا يَشْكُرُونَ", "Supaya mereka makan dari buah-buahannya dan dari apa yang dikerjakan oleh tangan mereka; maka patutkah mereka tidak bersyukur?", R.raw.yaasin35));
        arrayList.add(new VerseActivity("Yaasin", "سُبْحَـٰنَ ٱلَّذِى خَلَقَ ٱلْأَزْوَٰجَ كُلَّهَا مِمَّا تُنۢبِتُ ٱلْأَرْضُ وَمِنْ أَنفُسِهِمْ وَمِمَّا لَا يَعْلَمُونَ", "Maha Suci Tuhan yang telah menciptakan makhluk-makhluk semuanya berpasangan; sama ada dari yang ditumbuhkan oleh bumi, atau dari diri mereka, ataupun dari apa yang mereka tidak mengetahuinya.", R.raw.yaasin36));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَءَايَةٌ لَّهُمُ ٱلَّيْلُ نَسْلَخُ مِنْهُ ٱلنَّهَارَ فَإِذَا هُم مُّظْلِمُونَ", "Dan lagi dalil yang terang untuk mereka (berfikir) ialah malam; Kami hilangkan siang daripadanya, maka dengan serta-merta mereka berada dalam gelap-gelita;", R.raw.yaasin37));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَٱلشَّمْسُ تَجْرِى لِمُسْتَقَرٍّۢ لَّهَا ۚ ذَٰلِكَ تَقْدِيرُ ٱلْعَزِيزِ ٱلْعَلِيمِ", "Dan (sebahagian dari dalil yang tersebut ialah) matahari; ia kelihatan beredar ke tempat yang ditetapkan baginya; itu adalah takdir Tuhan yang Maha Kuasa, lagi Maha Mengetahui;", R.raw.yaasin38));
        arrayList.add(new VerseActivity("Yaasin", "وَٱلْقَمَرَ قَدَّرْنَـٰهُ مَنَازِلَ حَتَّىٰ عَادَ كَٱلْعُرْجُونِ ٱلْقَدِيمِ", "Dan bulan pula Kami takdirkan dia beredar melalui beberapa peringkat, sehingga di akhir peredarannya kelihatan kembalinya pula ke peringkat awalnya - (berbentuk melengkung) seperti tandan yang kering.", R.raw.yaasin39));
        arrayList.add(new VerseActivity("Yaasin", "﻿لَا ٱلشَّمْسُ يَنۢبَغِى لَهَآ أَن تُدْرِكَ ٱلْقَمَرَ وَلَا ٱلَّيْلُ سَابِقُ ٱلنَّهَارِ ۚ وَكُلٌّ فِى فَلَكٍ يَسْبَحُونَ", "(Dengan ketentuan yang demikian), matahari tidak mudah baginya mengejar bulan, dan malam pula tidak dapat mendahului siang; kerana tiap-tiap satunya beredar terapung-apung di tempat edarannya masing-masing.", R.raw.yaasin40));

        /*ayat 41-50*/
        arrayList.add(new VerseActivity("Yaasin", "﻿وَءَايَةٌ لَّهُمْ أَنَّا حَمَلْنَا ذُرِّيَّتَهُمْ فِى ٱلْفُلْكِ ٱلْمَشْحُونِ", "Dan satu dalil lagi untuk mereka (insaf) ialah, Kami membawa belayar jenis keluarga mereka dalam bahtera yang penuh sarat;", R.raw.yaasin41));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَخَلَقْنَا لَهُم مِّن مِّثْلِهِۦ مَا يَرْكَبُونَ", "Dan Kami ciptakan untuk mereka, jenis-jenis kenderaan yang sama dengannya, yang mereka dapat mengenderainya.", R.raw.yaasin42));
        arrayList.add(new VerseActivity("Yaasin", "﻿﻿وَإِن نَّشَأْ نُغْرِقْهُمْ فَلَا صَرِيخَ لَهُمْ وَلَا هُمْ يُنقَذُونَ", "Dan jika kami kehendaki, kami boleh tenggelamkan mereka; (kiranya Kami lakukan yang demikian) maka tidak ada yang dapat memberi pertolongan kepada mereka, dan mereka juga tidak dapat diselamatkan, -", R.raw.yaasin43));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِلَّا رَحْمَةً مِّنَّا وَمَتَـٰعًا إِلَىٰ حِينٍ", "Kecuali dengan kemurahan dari pihak Kami memberi rahmat dan kesenangan hidup kepada mereka hingga ke suatu masa.", R.raw.yaasin44));
        arrayList.add(new VerseActivity("Yaasin", "وَإِذَا قِيلَ لَهُمُ ٱتَّقُوا۟ مَا بَيْنَ أَيْدِيكُمْ وَمَا خَلْفَكُمْ لَعَلَّكُمْ تُرْحَمُونَ﻿", "Dan apabila dikatakan kepada mereka: \" berjaga-jagalah kamu akan apa yang ada di hadapan kamu (dari urusan-urusan hidup di dunia ini), dan apa yang ada di belakang kamu (dari huru-hara dan balasan akhirat), supaya kamu beroleh rahmat\", (mereka tidak mengindahkannya).", R.raw.yaasin45));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَمَا تَأْتِيهِم مِّنْ ءَايَةٍ مِّنْ ءَايَـٰتِ رَبِّهِمْ إِلَّا كَانُوا۟ عَنْهَا مُعْرِضِينَ", "Dan (itulah tabiat mereka) tidak ada sesuatu keterangan yang sampai kepada mereka dari keterangan-keterangan tuhan mereka melainkan mereka selalu berpaling daripadanya (enggan menerimanya).", R.raw.yaasin46));
        arrayList.add(new VerseActivity("Yaasin", "وَإِذَا قِيلَ لَهُمْ أَنفِقُوا۟ مِمَّا رَزَقَكُمُ ٱللَّـهُ قَالَ ٱلَّذِينَ كَفَرُوا۟ لِلَّذِينَ ءَامَنُوٓا۟ أَنُطْعِمُ مَن لَّوْ يَشَآءُ ٱللَّـهُ أَطْعَمَهُۥٓ إِنْ أَنتُمْ إِلَّا فِى ضَلَـٰلٍ مُّبِينٍ", "Dan apabila dikatakan kepada mereka:\" Dermakanlah sebahagian dari rezeki yang dikurniakan Allah kepada kamu\", berkatalah orang-orang yang kafir itu kepada orang-orang yang beriman (secara mengejek-ejek): \" Patutkah kami memberi makan kepada orang yang jika Allah kehendaki tentulah Ia akan memberinya makan? Kamu ini hanyalah berada dalam kesesatan yang nyata\".", R.raw.yaasin47));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَيَقُولُونَ مَتَىٰ هَـٰذَا ٱلْوَعْدُ إِن كُنتُمْ صَـٰدِقِينَ﻿", "Dan (apabila mereka diingatkan tentang huru-hara dan balasan akhirat) mereka bertanya (secara mempersenda): \" Bilakah datangnya (hari akhirat) yang dijanjikan itu? Jika betul kamu orang-orang yang benar (maka kami sedia menunggu)!\",", R.raw.yaasin48));
        arrayList.add(new VerseActivity("Yaasin", "﻿مَا يَنظُرُونَ إِلَّا صَيْحَةً وَٰحِدَةً تَأْخُذُهُمْ وَهُمْ يَخِصِّمُونَ", "Mereka tidak menunggu melainkan satu pekikan yang - (dengan secara mengejut) akan membinasakan mereka semasa mereka dalam keadaan leka bertengkar (merundingkan urusan dunia masing-masing).", R.raw.yaasin49));
        arrayList.add(new VerseActivity("Yaasin", "﻿فَلَا يَسْتَطِيعُونَ تَوْصِيَةً وَلَآ إِلَىٰٓ أَهْلِهِمْ يَرْجِعُونَ", "Maka dengan itu, mereka tidak berpeluang membuat sebarang pesanan (wasiat atau lainnya), dan (kalau mereka berada di luar) mereka tidak sempat kembali kepada keluarganya.", R.raw.yaasin50));

        /*ayat 51-60*/
        arrayList.add(new VerseActivity("Yaasin", "﻿وَنُفِخَ فِى ٱلصُّورِ فَإِذَا هُم مِّنَ ٱلْأَجْدَاثِ إِلَىٰ رَبِّهِمْ يَنسِلُونَ", "Dan sudah tentu akan ditiupkan sangkakala (menghidupkan orang-orang yang telah mati; apabila berlaku yang demikian) maka semuanya segera bangkit keluar dari kubur masing-masing (untuk) mengadap Tuhannya.", R.raw.yaasin51));
        arrayList.add(new VerseActivity("Yaasin", "﻿قَالُوا۟ يَـٰوَيْلَنَا مَنۢ بَعَثَنَا مِن مَّرْقَدِنَا ۜ ۗ هَـٰذَا مَا وَعَدَ ٱلرَّحْمَـٰنُ وَصَدَقَ ٱلْمُرْسَلُونَ", "(Pada ketika itu) orang-orang yang tidak percayakan hidup semula berkata: Aduhai celakanya kami! Siapakah yang membangkitkan kami dari kubur tempat tidur kami?,, (Lalu dikatakan kepada mereka): \" Inilah dia yang telah dijanjikan oleh Allah Yang Maha Pemurah dan benarlah berita yang disampaikan oleh Rasul-rasul!,", R.raw.yaasin52));
        arrayList.add(new VerseActivity("Yaasin", "﻿﻿إِن كَانَتْ إِلَّا صَيْحَةً وَٰحِدَةً فَإِذَا هُمْ جَمِيعٌ لَّدَيْنَا مُحْضَرُونَ", "Hanyalah dengan berlakunya satu pekikan sahaja, maka dengan serta merta mereka dihimpunkan ke tempat perbicaraan Kami, semuanya dibawa hadir (untuk menerima balasan).", R.raw.yaasin53));
        arrayList.add(new VerseActivity("Yaasin", "﻿فَٱلْيَوْمَ لَا تُظْلَمُ نَفْسٌ شَيْـًٔا وَلَا تُجْزَوْنَ إِلَّا مَا كُنتُمْ تَعْمَلُونَ", "Maka pada hari itu, tidak ada seseorang yang akan dianiaya sedikitpun, dan kamu pula tidak akan dibalas melainkan menurut amal yang kamu telah kerjakan.", R.raw.yaasin54));
        arrayList.add(new VerseActivity("Yaasin", "إِنَّ أَصْحَـٰبَ ٱلْجَنَّةِ ٱلْيَوْمَ فِى شُغُلٍ فَـٰكِهُونَ", "Sesungguhnya penduduk Syurga pada hari itu, berada dalam keadaan sibuk leka menikmati kesenangan;", R.raw.yaasin55));
        arrayList.add(new VerseActivity("Yaasin", "﻿هُمْ وَأَزْوَٰجُهُمْ فِى ظِلَـٰلٍ عَلَى ٱلْأَرَآئِكِ مُتَّكِـُٔونَ﻿", "Mereka dengan pasangan-pasangan mereka bersukaria di tempat yang teduh, sambil duduk berbaring di atas pelamin;", R.raw.yaasin56));
        arrayList.add(new VerseActivity("Yaasin", "لَهُمْ فِيهَا فَـٰكِهَةٌ وَلَهُم مَّا يَدَّعُونَ", "Mereka beroleh dalam Syurga itu pelbagai jenis buah-buahan, dan mereka beroleh apa sahaja yang mereka kehendaki;", R.raw.yaasin57));
        arrayList.add(new VerseActivity("Yaasin", "﻿سَلَـٰمٌ قَوْلًا مِّن رَّبٍّۢ رَّحِيمٍ", "(Mereka juga beroleh) ucapan salam sejahtera dari Tuhan Yang Maha Mengasihani.", R.raw.yaasin58));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَٱمْتَـٰزُوا۟ ٱلْيَوْمَ أَيُّهَا ٱلْمُجْرِمُونَ", "Dan (sebaliknya dikatakan kepada orang-orang yang kafir): \"Berpisahlah kamu pada hari ini, hai orang-orang yang berdosa, (dari bercampur gaul dengan orang-orang yang beriman).", R.raw.yaasin59));
        arrayList.add(new VerseActivity("Yaasin", "﻿أَلَمْ أَعْهَدْ إِلَيْكُمْ يَـٰبَنِىٓ ءَادَمَ أَن لَّا تَعْبُدُوا۟ ٱلشَّيْطَـٰنَ ۖ إِنَّهُۥ لَكُمْ عَدُوٌّ مُّبِينٌ", "\"Bukankah Aku telah perintahkan kamu wahai anak-anak Adam, supaya kamu jangan menyembah Syaitan? Sesungguhnya ia musuh yang nyata terhadap kamu!", R.raw.yaasin60));

        /*ayat 61-70*/
        arrayList.add(new VerseActivity("Yaasin", "﻿وَأَنِ ٱعْبُدُونِى ۚ هَـٰذَا صِرَٰطٌ مُّسْتَقِيمٌ", "\"Dan (Aku perintahkan): hendaklah kamu menyembahKu; inilah jalan yang lurus.", R.raw.yaasin61));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَلَقَدْ أَضَلَّ مِنكُمْ جِبِلًّا كَثِيرًا ۖ أَفَلَمْ تَكُونُوا۟ تَعْقِلُونَ", "\"Dan sesungguhnya Syaitan itu telah menyesatkan golongan yang ramai di antara kamu; (setelah kamu mengetahui akibat mereka) maka tidakkah sepatutnya kamu berfikir dan insaf?", R.raw.yaasin62));
        arrayList.add(new VerseActivity("Yaasin", "﻿هَـٰذِهِۦ جَهَنَّمُ ٱلَّتِى كُنتُمْ تُوعَدُونَ", "\"Yang kamu saksikan sekarang ialah neraka Jahannam, yang kamu selalu diancam memasukinya (kalau kamu tidak taatkan perintah Allah).", R.raw.yaasin63));
        arrayList.add(new VerseActivity("Yaasin", "﻿ٱصْلَوْهَا ٱلْيَوْمَ بِمَا كُنتُمْ تَكْفُرُونَ", "\"Rasalah kamu bakarannya pada hari ini, disebabkan perbuatan kufur yang kamu telah lakukan!\"", R.raw.yaasin64));
        arrayList.add(new VerseActivity("Yaasin", "﻿ٱلْيَوْمَ نَخْتِمُ عَلَىٰٓ أَفْوَٰهِهِمْ وَتُكَلِّمُنَآ أَيْدِيهِمْ وَتَشْهَدُ أَرْجُلُهُم بِمَا كَانُوا۟ يَكْسِبُونَ", "Pada waktu itu Kami meteraikan mulut mereka (sejurus); dan (memberi peluang kepada) tangan-tangan mereka memberitahu Kami (kesalahan masing-masing), dan kaki mereka pula menjadi saksi tentang apa yang mereka telah usahakan.", R.raw.yaasin65));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَلَوْ نَشَآءُ لَطَمَسْنَا عَلَىٰٓ أَعْيُنِهِمْ فَٱسْتَبَقُوا۟ ٱلصِّرَٰطَ فَأَنَّىٰ يُبْصِرُونَ", "(Matahati orang-orang yang menderhaka itu rosak) dan kalau Kami kehendaki, Kami berkuasa menghapuskan bentuk dan biji mata kepala mereka menjadi rata, sehingga masing-masing menerpa mencari-cari jalan (yang biasa mereka lalui). (Kiranya dijadikan demikian) maka bagaimanakah mereka dapat melihatnya?", R.raw.yaasin66));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَلَوْ نَشَآءُ لَمَسَخْنَٰهُمْ عَلَىٰ مَكَانَتِهِمْ فَمَا ٱسْتَطَٰعُوا۟ مُضِيًّا وَلَا يَرْجِعُونَ", "(Kekuatan akal fikiran mereka juga tidak sihat) dan kalau kami kehendaki, kami berkuasa mangubahkan keadaan jasmani mereka (menjadi kaku beku) di tempat yang mereka berada padanya; maka dengan itu, mereka tidak dapat mara ke hadapan dan juga tidak dapat undur ke belakang.", R.raw.yaasin67));
        arrayList.add(new VerseActivity("Yaasin", "﻿﻿وَمَن نُّعَمِّرْهُ نُنَكِّسْهُ فِى ٱلْخَلْقِ ۖ أَفَلَا يَعْقِلُونَ", "Dan (hendaklah diingat bahawa) sesiapa yang Kami panjangkan umurnya, Kami balikkan kembali kejadiannya (kepada keadaan serba lemah; hakikat ini memang jelas) maka mengapa mereka tidak mahu memikirkannya?", R.raw.yaasin68));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَمَا عَلَّمْنَٰهُ ٱلشِّعْرَ وَمَا يَنۢبَغِى لَهُۥٓ ۚ إِنْ هُوَ إِلَّا ذِكْرٌ وَقُرْءَانٌ مُّبِينٌ", "(Nabi Muhammad bukanlah penyair) dan Kami tidak mengajarkan syair kepadanya, dan kepandaian bersyair itu pula tidak sesuai baginya. Yang Kami wahyukan kepadanya itu tidak lain melainkan nasihat pengajaran dan Kitab Suci yang memberi penerangan;", R.raw.yaasin69));
        arrayList.add(new VerseActivity("Yaasin", "﻿لِّيُنذِرَ مَن كَانَ حَيًّا وَيَحِقَّ ٱلْقَوْلُ عَلَى ٱلْكَٰفِرِينَ﻿", "Supaya ia memberi peringatan kepada orang yang sedia hidup (hatinya), dan supaya nyata tetapnya hukuman (azab) terhadap orang-orang yang kufur ingkar.", R.raw.yaasin70));

        /*ayat 71-80*/
        arrayList.add(new VerseActivity("Yaasin", "﻿أَوَلَمْ يَرَوْا۟ أَنَّا خَلَقْنَا لَهُم مِّمَّا عَمِلَتْ أَيْدِينَآ أَنْعَٰمًا فَهُمْ لَهَا مَٰلِكُونَ", "Tidakkah mereka melihat dan memikirkan, bahawa Kami telah menciptakan untuk mereka binatang-binatang ternak, di antara jenis-jenis makhluk yang telah Kami ciptakan dengan kekuasaan Kami lalu mereka memilikinya?", R.raw.yaasin71));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَذَلَّلْنَٰهَا لَهُمْ فَمِنْهَا رَكُوبُهُمْ وَمِنْهَا يَأْكُلُونَ", "Dan Kami jinakkan dia untuk kegunaan mereka; maka sebahagian di antaranya menjadi kenderaan mereka, dan sebahagian lagi mereka makan.", R.raw.yaasin72));
        arrayList.add(new VerseActivity("Yaasin", "وَلَهُمْ فِيهَا مَنَٰفِعُ وَمَشَارِبُ ۖ أَفَلَا يَشْكُرُونَ", "Dan mereka beroleh berbagai faedah dan kegunaan pada binatang ternak itu dan juga beroleh minuman; maka mengapa mereka tidak mahu bersyukur?", R.raw.yaasin73));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَٱتَّخَذُوا۟ مِن دُونِ ٱللَّهِ ءَالِهَةً لَّعَلَّهُمْ يُنصَرُونَ", "Dan tergamak mereka menyembah beberapa tuhan yang lain dari Allah, (dengan harapan semoga mereka mendapat pertolongan (dari makhluk-makhluk itu).", R.raw.yaasin74));
        arrayList.add(new VerseActivity("Yaasin", "﻿لَا يَسْتَطِيعُونَ نَصْرَهُمْ وَهُمْ لَهُمْ جُندٌ مُّحْضَرُونَ", "Benda-benda yang mereka sembah itu tidak dapat sama sekali menolong mereka, sedang benda-benda itu sendiri menjadi tentera yang akan dibawa hadir (pada hari kiamat, untuk memberi azab seksa) kepada mereka.", R.raw.yaasin75));
        arrayList.add(new VerseActivity("Yaasin", "﻿فَلَا يَحْزُنكَ قَوْلُهُمْ ۘ إِنَّا نَعْلَمُ مَا يُسِرُّونَ وَمَا يُعْلِنُونَ", "Maka janganlah engkau (wahai Muhammad) berdukacita disebabkan tuduhan-tuduhan mereka (terhadapmu). Sesungguhnya Kami sedia mengetahui apa yang mereka sembunyikan dan apa yang mereka nyatakan.", R.raw.yaasin76));
        arrayList.add(new VerseActivity("Yaasin", "﻿أَوَلَمْ يَرَ ٱلْإِنسَٰنُ أَنَّا خَلَقْنَٰهُ مِن نُّطْفَةٍ فَإِذَا هُوَ خَصِيمٌ مُّبِينٌ", "Tidakkah manusia itu melihat dan mengetahui, bahawa Kami telah menciptakan dia dari (setitis) air benih? Dalam pada itu (setelah Kami sempurnakan kejadiannya dan tenaga kekuatannya) maka dengan tidak semena-mena menjadilah ia seorang pembantah yang terang jelas bantahannya (mengenai kekuasaan Kami menghidupkan semula orang-orang yang mati),", R.raw.yaasin77));
        arrayList.add(new VerseActivity("Yaasin", "﻿وَضَرَبَ لَنَا مَثَلًا وَنَسِىَ خَلْقَهُۥ ۖ قَالَ مَن يُحْىِ ٱلْعِظَٰمَ وَهِىَ رَمِيمٌ", "Serta ia mengemukakan satu misal perbandingan kepada Kami (tentang kekuasaan itu), dan ia pula lupakan keadaan Kami menciptakannya sambil ia bertanya: \"Siapakah yang dapat menghidupkan tulang-tulang yang telah hancur seperti debu?\"", R.raw.yaasin78));
        arrayList.add(new VerseActivity("Yaasin", "﻿قُلْ يُحْيِيهَا ٱلَّذِىٓ أَنشَأَهَآ أَوَّلَ مَرَّةٍ ۖ وَهُوَ بِكُلِّ خَلْقٍ عَلِيمٌ", "Katakanlah: \"Tulang-tulang yang hancur itu akan dihidupkan oleh Tuhan yang telah menciptakannya pada awal mula wujudnya; dan Ia Maha Mengetahui akan segala keadaan makhluk-makhluk (yang diciptakanNya);", R.raw.yaasin79));
        arrayList.add(new VerseActivity("Yaasin", "ٱلَّذِى جَعَلَ لَكُم مِّنَ ٱلشَّجَرِ ٱلْأَخْضَرِ نَارًا فَإِذَآ أَنتُم مِّنْهُ تُوقِدُونَ﻿", "\"Tuhan yang telah menjadikan api (boleh didapati) dari pohon-pohon yang hijau basah untuk kegunaan kamu, maka kamu pun selalu menyalakan api dari pohon-pohon itu\".", R.raw.yaasin80));

        /*ayat 81-90*/
        arrayList.add(new VerseActivity("Yaasin", "أَوَلَيْسَ ٱلَّذِى خَلَقَ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضَ بِقَٰدِرٍ عَلَىٰٓ أَن يَخْلُقَ مِثْلَهُم ۚ بَلَىٰ وَهُوَ ٱلْخَلَّٰقُ ٱلْعَلِيمُ", "Tidakkah diakui dan tidakkah dipercayai bahawa Tuhan yang telah menciptakan langit dan bumi (yang demikian besarnya) - berkuasa menciptakan semula manusia sebagaimana Ia menciptakan mereka dahulu? Ya! Diakui dan dipercayai berkuasa! Dan Dia lah Pencipta yang tidak ada bandinganNya, lagi Yang Maha Mengetahui.", R.raw.yaasin81));
        arrayList.add(new VerseActivity("Yaasin", "﻿إِنَّمَآ أَمْرُهُۥٓ إِذَآ أَرَادَ شَيْـًٔا أَن يَقُولَ لَهُۥ كُن فَيَكُونُ", "Sesungguhnya keadaan kekuasaanNya apabila Ia menghendaki adanya sesuatu, hanyalah Ia berfirman kepada (hakikat) benda itu: \" Jadilah engkau! \". Maka ia terus menjadi.", R.raw.yaasin82));
        arrayList.add(new VerseActivity("Yaasin", "﻿﻿فَسُبْحَٰنَ ٱلَّذِى بِيَدِهِۦ مَلَكُوتُ كُلِّ شَىْءٍ وَإِلَيْهِ تُرْجَعُونَ", "Oleh itu akuilah kesucian Allah (dengan mengucap: Subhaanallah!) - Tuhan yang memiliki dan menguasai tiap-tiap sesuatu, dan kepadaNyalah kamu semua dikembalikan.", R.raw.yaasin83));

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
                Intent i = new Intent(SurahYaasinMalay.this, SurahYaasinEnglish.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}