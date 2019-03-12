package com.tae.sqlexample.Entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class BookEntity {
 
   @PrimaryKey
   public long id;
 
   public String title;
 
   public String author;
}