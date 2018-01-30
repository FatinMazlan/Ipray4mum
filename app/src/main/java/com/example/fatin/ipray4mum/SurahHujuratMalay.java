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

public class SurahHujuratMalay extends AppCompatActivity {
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
        arrayList.add(new VerseActivity("Hujurat", "يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟ لَا تُقَدِّمُوا۟ بَيْنَ يَدَىِ ٱللَّهِ وَرَسُولِهِۦ ۖ وَٱتَّقُوا۟ ٱللَّهَ ۚ إِنَّ ٱللَّهَ سَمِيعٌ عَلِيمٌ", "Wahai orang-orang yang beriman! Janganlah kamu memandai-mandai (melakukan sesuatu perkara) sebelum (mendapat hukum atau kebenaran) Allah dan RasulNya; dan bertaqwalah kamu kepada Allah; sesungguhnya Allah Maha Mendengar, lagi Maha Mengetahui.", R.raw.hujurat1));
        arrayList.add(new VerseActivity("Hujurat", "﻿يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟ لَا تَرْفَعُوٓا۟ أَصْوَٰتَكُمْ فَوْقَ صَوْتِ ٱلنَّبِىِّ وَلَا تَجْهَرُوا۟ لَهُۥ بِٱلْقَوْلِ كَجَهْرِ بَعْضِكُمْ لِبَعْضٍ أَن تَحْبَطَ أَعْمَٰلُكُمْ وَأَنتُمْ لَا تَشْعُرُونَ", "Wahai orang-orang yang beriman! Janganlah kamu mengangkat suara kamu melebihi suara Nabi, dan janganlah kamu menyaringkan suara (dengan lantang) semasa bercakap dengannya sebagaimana setengah kamu menyaringkan suaranya semasa bercakap dengan setengahnya yang lain. (Larangan yang demikian) supaya amal-amal kamu tidak hapus pahalanya, sedang kamu tidak menyedarinya.", R.raw.hujurat2));
        arrayList.add(new VerseActivity("Hujurat", "﻿إِنَّ ٱلَّذِينَ يَغُضُّونَ أَصْوَٰتَهُمْ عِندَ رَسُولِ ٱللَّهِ أُو۟لَٰٓئِكَ ٱلَّذِينَ ٱمْتَحَنَ ٱللَّهُ قُلُوبَهُمْ لِلتَّقْوَىٰ ۚ لَهُم مَّغْفِرَةٌ وَأَجْرٌ عَظِيمٌ", "Sesungguhnya orang-orang yang merendahkan suaranya semasa mereka berada di sisi Rasulullah (s.a.w), - merekalah orang-orang yang telah dibersihkan Allah hati mereka untuk bertaqwa; mereka beroleh keampunan dan pahala yang besar.", R.raw.hujurat3));
        arrayList.add(new VerseActivity("Hujurat", "﻿إِنَّ ٱلَّذِينَ يُنَادُونَكَ مِن وَرَآءِ ٱلْحُجُرَٰتِ أَكْثَرُهُمْ لَا يَعْقِلُونَ", "Sesungguhnya orang-orang yang memanggilmu dari luar bilik-bilik (tempat ahlimu, wahai Muhammad), kebanyakan mereka tidak mengerti (adab dan tata tertib).", R.raw.hujurat4));
        arrayList.add(new VerseActivity("Hujurat", "وَلَوْ أَنَّهُمْ صَبَرُوا۟ حَتَّىٰ تَخْرُجَ إِلَيْهِمْ لَكَانَ خَيْرًا لَّهُمْ ۚ وَٱللَّهُ غَفُورٌ رَّحِيمٌ", "Dan kalaulah mereka bersabar menunggu sehingga engkau keluar menemui mereka, tentulah cara yang demikian lebih baik bagi mereka; dan (ingatlah), Allah Maha Pengampun, lagi Maha Mengasihani.", R.raw.hujurat5));
        arrayList.add(new VerseActivity("Hujurat", "يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوٓا۟ إِن جَآءَكُمْ فَاسِقٌۢ بِنَبَإٍ فَتَبَيَّنُوٓا۟ أَن تُصِيبُوا۟ قَوْمًۢا بِجَهَٰلَةٍ فَتُصْبِحُوا۟ عَلَىٰ مَا فَعَلْتُمْ نَٰدِمِينَ", "Wahai orang-orang yang beriman! Jika datang kepada kamu seorang fasik membawa sesuatu berita, maka selidikilah (untuk menentukan) kebenarannya, supaya kamu tidak menimpakan sesuatu kaum dengan perkara yang tidak diingini - dengan sebab kejahilan kamu (mengenainya) - sehingga menjadikan kamu menyesali apa yang kamu telah lakukan.", R.raw.hujurat6));
        arrayList.add(new VerseActivity("Hujurat", "﻿وَٱعْلَمُوٓا۟ أَنَّ فِيكُمْ رَسُولَ ٱللَّهِ ۚ لَوْ يُطِيعُكُمْ فِى كَثِيرٍ مِّنَ ٱلْأَمْرِ لَعَنِتُّمْ وَلَٰكِنَّ ٱللَّهَ حَبَّبَ إِلَيْكُمُ ٱلْإِيمَٰنَ وَزَيَّنَهُۥ فِى قُلُوبِكُمْ وَكَرَّهَ إِلَيْكُمُ ٱلْكُفْرَ وَٱلْفُسُوقَ وَٱلْعِصْيَانَ ۚ أُو۟لَٰٓئِكَ هُمُ ٱلرَّٰشِدُونَ", "Dan ketahuilah! Bahawasanya dalam kalangan kamu ada Rasulullah (maka janganlah kemahuan atau pendapat kamu mendahului pentadbirannya); kalaulah ia menurut kehendak kamu dalam kebanyakan perkara, tentulah kamu akan mengalami kesukaran; akan tetapi (Rasulullah tidak menurut melainkan perkara yang diwahyukan kepadanya, dan kamu wahai orang-orang yang beriman hendaklah bersyukur kerana) Allah menjadikan iman suatu perkara yang kamu cintai serta di perhiaskannya dalam hati kamu, dan menjadikan kekufuran dan perbuatan fasik serta perbuatan derhaka itu: perkara-perkara yang kamu benci; mereka yang bersifat demikian ialah orang-orang yang tetap menurut jalan yang lurus; -", R.raw.hujurat7));
        arrayList.add(new VerseActivity("Hujurat", "فَضْلًا مِّنَ ٱللَّهِ وَنِعْمَةً ۚ وَٱللَّهُ عَلِيمٌ حَكِيمٌ", "(Mereka dijadikan berkeadaan demikian) sebagai limpah kurnia dan nikmat pemberian dari Allah; dan (ingatlah), Allah Maha Mengetahui, lagi Maha Bijaksana.", R.raw.hujurat8));
        arrayList.add(new VerseActivity("Hujurat", "﻿وَإِن طَآئِفَتَانِ مِنَ ٱلْمُؤْمِنِينَ ٱقْتَتَلُوا۟ فَأَصْلِحُوا۟ بَيْنَهُمَا ۖ فَإِنۢ بَغَتْ إِحْدَىٰهُمَا عَلَى ٱلْأُخْرَىٰ فَقَٰتِلُوا۟ ٱلَّتِى تَبْغِى حَتَّىٰ تَفِىٓءَ إِلَىٰٓ أَمْرِ ٱللَّهِ ۚ فَإِن فَآءَتْ فَأَصْلِحُوا۟ بَيْنَهُمَا بِٱلْعَدْلِ وَأَقْسِطُوٓا۟ ۖ إِنَّ ٱللَّهَ يُحِبُّ ٱلْمُقْسِطِينَ", "Dan jika dua puak dari orang-orang yang beriman berperang, maka damaikanlah di antara keduanya; jika salah satunya berlaku zalim terhadap yang lain, maka lawanlah puak yang zalim itu sehingga ia kembali mematuhi perintah Allah; jika ia kembali patuh maka damaikanlah di antara keduanya dengan adil (menurut hukum Allah), serta berlaku adillah kamu (dalam segala perkara); sesungguhnya Allah mengasihi orang-orang yang berlaku adil.", R.raw.hujurat9));
        arrayList.add(new VerseActivity("Hujurat", "﻿إِنَّمَا ٱلْمُؤْمِنُونَ إِخْوَةٌ فَأَصْلِحُوا۟ بَيْنَ أَخَوَيْكُمْ ۚ وَٱتَّقُوا۟ ٱللَّهَ لَعَلَّكُمْ تُرْحَمُونَ", "Sebenarnya orang-orang yang beriman itu adalah bersaudara, maka damaikanlah di antara dua saudara kamu (yang bertelingkah) itu; dan bertaqwalah kepada Allah supaya kamu beroleh rahmat.", R.raw.hujurat10));

/*ayat 11-20*/
        arrayList.add(new VerseActivity("Hujurat", "يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟ لَا يَسْخَرْ قَوْمٌ مِّن قَوْمٍ عَسَىٰٓ أَن يَكُونُوا۟ خَيْرًا مِّنْهُمْ وَلَا نِسَآءٌ مِّن نِّسَآءٍ عَسَىٰٓ أَن يَكُنَّ خَيْرًا مِّنْهُنَّ ۖ وَلَا تَلْمِزُوٓا۟ أَنفُسَكُمْ وَلَا تَنَابَزُوا۟ بِٱلْأَلْقَٰبِ ۖ بِئْسَ ٱلِٱسْمُ ٱلْفُسُوقُ بَعْدَ ٱلْإِيمَٰنِ ۚ وَمَن لَّمْ يَتُبْ فَأُو۟لَٰٓئِكَ هُمُ ٱلظَّٰلِمُونَ", "Wahai orang-orang yang beriman! Janganlah sesuatu puak (dari kaum lelaki) mencemuh dan merendah-rendahkan puak lelaki yang lain, (kerana) harus puak yang dicemuhkan itu lebih baik daripada mereka; dan janganlah pula sesuatu puak dari kaum perempuan mencemuh dan merendah-rendahkan puak perempuan yang lain, (kerana) harus puak yang dicemuhkan itu lebih baik daripada mereka; dan janganlah setengah kamu menyatakan keaiban setengahnya yang lain; dan janganlah pula kamu panggil-memanggil antara satu dengan yang lain dengan gelaran yang buruk. (Larangan-larangan yang tersebut menyebabkan orang yang melakukannya menjadi fasik, maka) amatlah buruknya sebutan nama fasik (kepada seseorang) sesudah ia beriman. Dan (ingatlah), sesiapa yang tidak bertaubat (daripada perbuatan fasiknya) maka merekalah orang-orang yang zalim.", R.raw.hujurat11));
        arrayList.add(new VerseActivity("Hujurat", "يَٰٓأَيُّهَا ٱلَّذِينَ ءَامَنُوا۟ ٱجْتَنِبُوا۟ كَثِيرًا مِّنَ ٱلظَّنِّ إِنَّ بَعْضَ ٱلظَّنِّ إِثْمٌ ۖ وَلَا تَجَسَّسُوا۟ وَلَا يَغْتَب بَّعْضُكُم بَعْضًا ۚ أَيُحِبُّ أَحَدُكُمْ أَن يَأْكُلَ لَحْمَ أَخِيهِ مَيْتًا فَكَرِهْتُمُوهُ ۚ وَٱتَّقُوا۟ ٱللَّهَ ۚ إِنَّ ٱللَّهَ تَوَّابٌ رَّحِيمٌ", "Wahai orang-orang yang beriman! Jauhilah kebanyakan dari sangkaan (supaya kamu tidak menyangka sangkaan yang dilarang) kerana sesungguhnya sebahagian dari sangkaan itu adalah dosa; dan janganlah kamu mengintip atau mencari-cari kesalahan dan keaiban orang; dan janganlah setengah kamu mengumpat setengahnya yang lain. Adakah seseorang dari kamu suka memakan daging saudaranya yang telah mati? (Jika demikian keadaan mengumpat) maka sudah tentu kamu jijik kepadanya. (Oleh itu, patuhilah larangan-larangan yang tersebut) dan bertaqwalah kamu kepada Allah; sesungguhnya Allah Penerima taubat, lagi Maha mengasihani.", R.raw.hujurat12));
        arrayList.add(new VerseActivity("Hujurat", "﻿يَٰٓأَيُّهَا ٱلنَّاسُ إِنَّا خَلَقْنَٰكُم مِّن ذَكَرٍ وَأُنثَىٰ وَجَعَلْنَٰكُمْ شُعُوبًا وَقَبَآئِلَ لِتَعَارَفُوٓا۟ ۚ إِنَّ أَكْرَمَكُمْ عِندَ ٱللَّهِ أَتْقَىٰكُمْ ۚ إِنَّ ٱللَّهَ عَلِيمٌ خَبِيرٌ", "Wahai umat manusia! Sesungguhnya Kami telah menciptakan kamu dari lelaki dan perempuan, dan Kami telah menjadikan kamu berbagai bangsa dan bersuku puak, supaya kamu berkenal-kenalan (dan beramah mesra antara satu dengan yang lain). Sesungguhnya semulia-mulia kamu di sisi Allah ialah orang yang lebih taqwanya di antara kamu, (bukan yang lebih keturunan atau bangsanya). Sesungguhnya Allah Maha Mengetahui, lagi Maha Mendalam PengetahuanNya (akan keadaan dan amalan kamu).", R.raw.hujurat13));
        arrayList.add(new VerseActivity("Hujurat", "﻿۞ قَالَتِ ٱلْأَعْرَابُ ءَامَنَّا ۖ قُل لَّمْ تُؤْمِنُوا۟ وَلَٰكِن قُولُوٓا۟ أَسْلَمْنَا وَلَمَّا يَدْخُلِ ٱلْإِيمَٰنُ فِى قُلُوبِكُمْ ۖ وَإِن تُطِيعُوا۟ ٱللَّهَ وَرَسُولَهُۥ لَا يَلِتْكُم مِّنْ أَعْمَٰلِكُمْ شَيْـًٔا ۚ إِنَّ ٱللَّهَ غَفُورٌ رَّحِيمٌ", "Orang-orang \" A'raab\" berkata: \" Kami telah beriman\". Katakanlah (wahai Muhammad): \"Kamu belum beriman, (janganlah berkata demikian), tetapi sementara iman belum lagi meresap masuk ke dalam hati kamu berkatalah sahaja: ' kami telah Islam '. Dan (ingatlah), jika kamu taat kepada Allah RasulNya (zahir dan batin), Allah tidak akan mengurangkan sedikitpun dari pahala amal-amal kamu, kerana sesungguhnya Allah Maha Pengampun, lagi Maha Mengasihani\".", R.raw.hujurat14));
        arrayList.add(new VerseActivity("Hujurat", "﻿إِنَّمَا ٱلْمُؤْمِنُونَ ٱلَّذِينَ ءَامَنُوا۟ بِٱللَّهِ وَرَسُولِهِۦ ثُمَّ لَمْ يَرْتَابُوا۟ وَجَٰهَدُوا۟ بِأَمْوَٰلِهِمْ وَأَنفُسِهِمْ فِى سَبِيلِ ٱللَّهِ ۚ أُو۟لَٰٓئِكَ هُمُ ٱلصَّٰدِقُونَ", "Sesungguhnya orang-orang yang sebenar-benarnya beriman hanyalah orang-orang yang percaya kepada Allah dan RasulNya, kemudian mereka (terus percaya dengan) tidak ragu-ragu lagi, serta mereka berjuang dengan harta benda dan jiwa mereka pada jalan Allah; mereka itulah orang-orang yang benar (pengakuan imannya).", R.raw.hujurat15));
        arrayList.add(new VerseActivity("Hujurat", "﻿قُلْ أَتُعَلِّمُونَ ٱللَّهَ بِدِينِكُمْ وَٱللَّهُ يَعْلَمُ مَا فِى ٱلسَّمَٰوَٰتِ وَمَا فِى ٱلْأَرْضِ ۚ وَٱللَّهُ بِكُلِّ شَىْءٍ عَلِيمٌ", "Katakanlah (kepada orang-orang \"A'raab\" itu wahai Muhammad): \"Patutkah kamu hendak memberitahu kepada Allah tentang agama kamu (dengan berkata: ` kami telah beriman ')? Padahal Allah mengetahui segala yang ada di langit dan yang ada di bumi, dan Allah Maha Mengetahui akan tiap-tiap sesuatu\".", R.raw.hujurat16));
        arrayList.add(new VerseActivity("Hujurat", "يَمُنُّونَ عَلَيْكَ أَنْ أَسْلَمُوا۟ ۖ قُل لَّا تَمُنُّوا۟ عَلَىَّ إِسْلَٰمَكُم ۖ بَلِ ٱللَّهُ يَمُنُّ عَلَيْكُمْ أَنْ هَدَىٰكُمْ لِلْإِيمَٰنِ إِن كُنتُمْ صَٰدِقِينَ", "Mereka mengira dirinya berbudi kepadamu (wahai Muhammad) dengan sebab mereka telah Islam (tidak melawan dan tidak menentang). Katakanlah (kepada mereka): \"Janganlah kamu mengira keislaman kamu itu sebagai budi kepadaku, bahkan (kalaulah sah dakwaan kamu itu sekalipun maka) Allah jualah yang berhak membangkit-bangkitkan budiNya kepada kamu, kerana Dia lah yang memimpin kamu kepada iman (yang kamu dakwakan itu), kalau betul kamu orang-orang yang benar (pengakuan imannya).", R.raw.hujurat17));
        arrayList.add(new VerseActivity("Hujurat", "﻿إِنَّ ٱللَّهَ يَعْلَمُ غَيْبَ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضِ ۚ وَٱللَّهُ بَصِيرٌۢ بِمَا تَعْمَلُونَ", "\"Sesungguhnya Allah mengetahui segala rahsia langit dan bumi, dan Allah Maha Melihat akan segala yang kamu kerjakan\".", R.raw.hujurat18));

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
                Intent i = new Intent(SurahHujuratMalay.this, SurahHujuratEnglish.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}