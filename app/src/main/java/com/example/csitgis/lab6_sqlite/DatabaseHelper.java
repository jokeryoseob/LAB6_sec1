package com.example.csitgis.lab6_sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME ="student_db";
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Student.CREATE_TABLE);

    }
    @Override

    @Override
    public void onUpgrade(SQLiteDatabase db,int i, int il) {
        db.execSQL("DROP TABLE IF EXISTS " + Student.TABLE_NAME);
        onCreate(db);
    }
    public void inserStudent(String id, String student){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Student.COLUMM_ID, id);
        values.put(Student.COLUMN_NAME, student);

        db.insert(Student.TABLE_NAME, null, values);
        db.close();
    }
}

