package com.example.fragmentanddatabasetraining2.data.entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "school_table")
data class School(
    @PrimaryKey(autoGenerate = false)
    val sname: String
):Parcelable
