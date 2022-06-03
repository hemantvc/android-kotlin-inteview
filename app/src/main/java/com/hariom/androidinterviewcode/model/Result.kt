package com.hariom.androidinterviewcode.model

import androidx.room.Entity
import androidx.room.PrimaryKey
;/**
    This model used in both cases
    1. Fetch data from server
    2. Room db model
 */
@Entity(tableName = "quote")
data class Result(
    @PrimaryKey(autoGenerate = true)
      val id : Int,
      val _id: String,
    val author: String,
    val authorSlug: String,
    val content: String,
//    val dateAdded: String,
//    val dateModified: String,
//    val length: Int,
//    val tags: List<String>
)