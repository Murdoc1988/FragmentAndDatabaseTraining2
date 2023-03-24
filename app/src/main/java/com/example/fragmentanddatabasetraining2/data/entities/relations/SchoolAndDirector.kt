package com.example.fragmentanddatabasetraining2.data.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.fragmentanddatabasetraining2.data.entities.Director
import com.example.fragmentanddatabasetraining2.data.entities.School


data class SchoolAndDirector(

    @Embedded
    val school: School,
    @Relation(
        parentColumn = "sname",
        entityColumn = "dsname"
    )
    val director: Director

)