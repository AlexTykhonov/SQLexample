package com.tae.sqlexample.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.tae.sqlexample.Entity.BookEntity;

import java.util.List;

@Dao
public interface BookDao {
 
   @Query("SELECT * FROM bookEntity")
   List<BookEntity> getAll();
 
   @Query("SELECT * FROM bookEntity WHERE id = :id")
   BookEntity getById(long id);
 
   @Insert
   void insert(BookEntity bookEntity);
 
   @Update
   void update(BookEntity bookEntity);
 
   @Delete
   void delete(long id);
 
}