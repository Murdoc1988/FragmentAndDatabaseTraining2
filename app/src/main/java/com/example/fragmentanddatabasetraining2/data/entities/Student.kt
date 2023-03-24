package com.example.fragmentanddatabasetraining2.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student_table")
data class Student(

    @PrimaryKey(autoGenerate = false)
    val stname: String,
    val stsem: Int,
    val stsname: String
)
