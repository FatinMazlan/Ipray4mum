package com.example.fatin.ipray4mum;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Fatin on 13/12/2017.
 */

public class DataHelper extends SQLiteOpenHelper{
    //Database name
    private static final String DATABASE_NAME = "personalassistant.db";

    //Database version
    private static final int DATABASE_VERSION = 1;

    //Create constructor for DataHelper
    public DataHelper (Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    //Create table
    public void onCreate(SQLiteDatabase db){
        String sql = "create table user(no integer primary key, name text null, edd text null);";
        Log.d("Data","onCreate: " +sql);
        db.execSQL(sql);

        String sql2 = "create table quran(no integer primary key, title text null, int ayat null, int trimester null);";
        Log.d("Data","onCreate: "+sql2);
        db.execSQL(sql2);
    }

    //create method to upgrade database version if database exist
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){
    }
}