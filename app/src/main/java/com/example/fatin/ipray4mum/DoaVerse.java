package com.example.fatin.ipray4mum;

/**
 * Created by Fatin on 23/01/2018.
 */

public class DoaVerse {
    private String verse;
    private String transE;
    private String transM;
    private int ayat;

    public DoaVerse(String verse, String transE, String transM, int ayat)
    {
        this.verse = verse;
        this.transE = transE;
        this.transM = transM;
        this.ayat = ayat;
    }

    public String getVerse()
    {
        return verse;
    }

    public void setVerse(String verse)
    {
        this.verse = verse;
    }

    public String getTransE()
    {
        return transE;
    }

    public void setTransE(String transE)
    {
        this.transE = transE;
    }

    public String getTransM()
    {
        return transM;
    }

    public void setTransM(String transM)
    {
        this.transE = transM;
    }

    public int getAyat()
    {
        return ayat;
    }

    public void setAyat(int ayat)
    {
        this.ayat = ayat;
    }

    @Override
    public String toString() {
        return "Verse [Verse=" + verse + ", Trans="	+ transE + ", Trans=" + transM + " ]";
    }
}