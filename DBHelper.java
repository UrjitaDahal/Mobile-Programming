package com.example.lab7database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "Company.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE Employee(" +
                        "Eid INTEGER PRIMARY KEY," +
                        "Name TEXT," +
                        "Address TEXT," +
                        "Salary REAL)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
        db.execSQL("DROP TABLE IF EXISTS Employee");
        onCreate(db);
    }

    public boolean insertEmployee(int id, String name, String address, double salary) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Eid", id);
        cv.put("Name", name);
        cv.put("Address", address);
        cv.put("Salary", salary);
        long res = db.insert("Employee", null, cv);
        return res != -1;
    }

    public boolean updateEmployee(int id, String name, String address, double salary) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Name", name);
        cv.put("Address", address);
        cv.put("Salary", salary);
        int res = db.update("Employee", cv, "Eid=?", new String[]{String.valueOf(id)});
        return res > 0;
    }

    public boolean deleteEmployee(int id) {
        SQLiteDatabase db = getWritableDatabase();
        int res = db.delete("Employee", "Eid=?", new String[]{String.valueOf(id)});
        return res > 0;
    }

    public Cursor getAllEmployees() {
        SQLiteDatabase db = getReadableDatabase();
        return db.rawQuery("SELECT * FROM Employee", null);
    }
}
