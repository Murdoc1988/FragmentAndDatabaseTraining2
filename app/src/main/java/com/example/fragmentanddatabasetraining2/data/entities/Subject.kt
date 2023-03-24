package com.example.fragmentanddatabasetraining2.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subject_table")
data class Subject(

    @PrimaryKey(autoGenerate = false)
    val subname: String,
)