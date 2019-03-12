package com.tae.sqlexample;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.tae.sqlexample.DataBase.AppDatabase;

public class DataBaseClient {

    private Context context;
    private static DataBaseClient dataBaseClient;
    private AppDatabase appDatabase;

    public DataBaseClient(Context context) {
        this.context = context;
        appDatabase = Room.databaseBuilder(context,
                AppDatabase.class, "bookdatabase")
                .allowMainThreadQueries()
                .build();
    }

    public static synchronized DataBaseClient getDataBaseClient (Context context) {
        if (dataBaseClient==null) {
            dataBaseClient= new DataBaseClient(context);
        }
        return dataBaseClient;
    }

    public AppDatabase getAppDatabase () {
        return appDatabase;
    }

}

