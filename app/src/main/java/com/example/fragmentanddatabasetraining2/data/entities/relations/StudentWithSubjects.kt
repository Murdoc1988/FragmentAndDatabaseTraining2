package com.example.fragmentanddatabasetraining2.data.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.fragmentanddatabasetraining2.data.entities.Student
import com.example.fragmentanddatabasetraining2.data.entities.Subject

data class StudentWithSubjects(

    @Embedded
    val student: Student,
    @Relation(
        parentColumn = "stname",
        entityColumn = "subname",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)
