package com.example.fragmentanddatabasetraining2

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.fragmentanddatabasetraining2.data.SchoolDatabase.Companion.getInstance
import com.example.fragmentanddatabasetraining2.data.Repository
import com.example.fragmentanddatabasetraining2.data.entities.Director
import com.example.fragmentanddatabasetraining2.data.entities.School
import com.example.fragmentanddatabasetraining2.data.entities.Student
import kotlinx.coroutines.launch

class MainViewModel(application: Application): AndroidViewModel(application) {


    private val database = getInstance(application)
    private val repository = Repository(database)

    val schoolList = repository.schoolList
    val studentList = repository.studentList
    val directorList = repository.directorList
    val subjectStringList = repository.getSubjectStringList()





    //adds

    //School
    fun addSchool(school: School){
        viewModelScope.launch {
            repository.addSchool(school)
        }
    }

    //Students
    fun addStudent(student: Student){
        viewModelScope.launch {
            repository.addStudent(student)
        }
    }

    //Director
    fun addDirector(director: Director){
        viewModelScope.launch {
            repository.addDirector(director)
        }
    }

    //GETs
    //SubjectStringList
}