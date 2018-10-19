package com.example.csitgis.lab6_sqlite;

public class Student {
    public static final String TABLE_NAME = "student";

    public static final String COLUMM_ID  ="std_id";
    public static final String COLUMN_NAME ="std_name";

    private String id;
    private String name ;

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
            + COLUMM_ID + "TEXT,"
            + COLUMN_NAME + "TEXT"
            + ")" ;
    public Student(String id, String name) {
        this.id= id;
        this.name = name;
    }
    public Student() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name= name; }

}
