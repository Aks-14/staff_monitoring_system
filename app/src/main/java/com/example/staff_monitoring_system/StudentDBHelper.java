package com.example.staff_monitoring_system;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class StudentDBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="sms.db";
    public static final int DATABASE_VERSION=1;


    public StudentDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public Cursor Details() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select SUBJECT,SEMESTER from DETAILS",null);
        return res;
    }
    public void Delete(){
        Cursor c= Details();
        if (c.getCount() > 10){
            SQLiteDatabase db = this.getWritableDatabase();
            db.execSQL("delete from DETAILS");

        }

    }

    public Cursor getinfofy(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor Fy_Student = db.rawQuery("select * from Student_FY ", null);
        return Fy_Student;
    }
    public Cursor getinfosy(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor Sy_Student = db.rawQuery("select * from Student_SY ", null);
        return Sy_Student;
    }
    public Cursor getinfoty(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor Ty_Student = db.rawQuery("select * from Student_TY ", null);
        return Ty_Student;
    }




}
