package com.example.fragmentanddatabasetraining2.data.entities.relations

import androidx.room.Entity

@Entity(tableName = "studentsubject_cross_ref", primaryKeys = ["stname", "subname"])
data class StudentSubjectCrossRef(
    val stname: String,
    val subname: String
)
