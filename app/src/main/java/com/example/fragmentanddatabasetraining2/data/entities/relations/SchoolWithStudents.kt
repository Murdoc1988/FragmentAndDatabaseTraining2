package com.example.fragmentanddatabasetraining2.data.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.fragmentanddatabasetraining2.data.entities.School
import com.example.fragmentanddatabasetraining2.data.entities.Student


data class SchoolWithStudents(

    @Embedded
    val school: School,
    @Relation(
        parentColumn = "sname",
        entityColumn = "stname"
    )
    val students: List<Student>
)
