package com.example.fragmentanddatabasetraining2.data.entities

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "director_table")
data class Director(

    @PrimaryKey(autoGenerate = false)
    val dname: String,
    val dsname: String

)
