package com.example.fragmentanddatabasetraining2.data

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.fragmentanddatabasetraining2.data.entities.Director
import com.example.fragmentanddatabasetraining2.data.entities.School
import com.example.fragmentanddatabasetraining2.data.entities.Student
import com.example.fragmentanddatabasetraining2.data.entities.Subject

class Repository(private val schoolDatabase: SchoolDatabase) {


    //getter
    //List of schools
    val schoolList: LiveData<List<School>> get() = schoolDatabase.schoolDao.getSchool()

    //List of students
    val studentList: LiveData<List<Student>> get() = schoolDatabase.schoolDao.getStudents()

    //List of directors
    val directorList: LiveData<List<Director>> get() = schoolDatabase.schoolDao.getDirector()

    //List of subject
    val subjectList: LiveData<List<Subject>> get() = schoolDatabase.schoolDao.getSubject()

    fun getSubjectStringList():ArrayList<String> {
        var subjectListArray = arrayListOf<String>()

        for (i in 1..schoolDatabase.schoolDao.countSubjects()) {
            subjectListArray[i] =
                schoolDatabase.schoolDao.getSubject().value?.get(i)?.subname.toString()
        }
        return  subjectListArray
    }


    //insert/add

    //addSchool
    suspend fun addSchool(school: School){
        try{
            schoolDatabase.schoolDao.insertSchool(school)
        }catch (e: Exception) {
            Log.e("Repository", "Failed to insert ${school.sname} into SchoolDatabase: $e")
        }
    }

    //addStudent
    suspend fun addStudent(student: Student){
        try{
            schoolDatabase.schoolDao.insertStudent(student)
        }catch (e: Exception) {
            Log.e("Repository", "Failed to insert ${student.stname} into SchoolDatabase: $e")
        }
    }

    //addDirector
    suspend fun addDirector(director: Director){
        try{
            schoolDatabase.schoolDao.insertDirector(director)
            Log.e("Repository", "123 Director Added")
        }catch(e: Exception){
            Log.e("Repository", "Failed to insert ${director.dname} into SchoolDatabase: $e")
        }
    }

    //addSubject
    suspend fun addSubject(subject: Subject){
        try {
            schoolDatabase.schoolDao.insertSubject(subject)
        }catch (e: Exception){
            Log.e("Repository", "Failed to insert ${subject.subname} into SchoolDatabase: $e")
        }
    }


}

