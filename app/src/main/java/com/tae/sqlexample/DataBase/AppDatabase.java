package com.tae.sqlexample.DataBase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.tae.sqlexample.DAO.BookDao;
import com.tae.sqlexample.Entity.BookEntity;

@Database(entities = {BookEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
   public abstract BookDao bookDao();
}