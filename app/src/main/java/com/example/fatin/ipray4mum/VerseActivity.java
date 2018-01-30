package com.example.fatin.ipray4mum;

/**
 * Created by Fatin on 06/12/2017.
 */

public class VerseActivity {
    private String title;
    private String verse;
    private String trans;
    private int ayat;

    public VerseActivity(String title, String verse, String trans, int ayat)
    {
        this.title = title;
        this.verse = verse;
        this.trans = trans;
        this.ayat = ayat;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getVerse()
    {
        return verse;
    }

    public void setVerse(String verse)
    {
        this.verse = verse;
    }

    public String getTrans()
    {
        return trans;
    }

    public void setTrans(String trans)
    {
        this.trans = trans;
    }

    public int getAyat()
    {
        return ayat;
    }

    public void setAyat(int ayat)
    {
        this.ayat = ayat;
    }
}
