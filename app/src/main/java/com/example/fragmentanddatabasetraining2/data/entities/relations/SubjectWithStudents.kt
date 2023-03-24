package com.example.fragmentanddatabasetraining2.data.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.fragmentanddatabasetraining2.data.entities.Student
import com.example.fragmentanddatabasetraining2.data.entities.Subject

data class SubjectWithStudents(

    @Embedded
    val subject: Subject,
    @Relation(
        parentColumn = "subname",
        entityColumn = "stname",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)
