package com.example.fragmentanddatabasetraining2.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.fragmentanddatabasetraining2.data.entities.Director
import com.example.fragmentanddatabasetraining2.data.entities.School
import com.example.fragmentanddatabasetraining2.data.entities.Student
import com.example.fragmentanddatabasetraining2.data.entities.Subject
import com.example.fragmentanddatabasetraining2.data.entities.relations.StudentWithSubjects
import com.example.fragmentanddatabasetraining2.data.entities.relations.*

@Dao
interface SchoolDao {

    //inserts

    //School
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    //Director
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    //Student
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    //Subject
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudentSubjectCrossRef(crossRef: StudentSubjectCrossRef)

    /*//@Transaction
    @Query("SELECT * FROM school_table WHERE sname = :sname")
    suspend fun getSchoolAndDirectorWithSchoolname(sname: String): LiveData<List<SchoolAndDirector>>

    //@Transaction
    @Query("SELECT * FROM school_table WHERE sname = :sname")
    suspend fun getSchoolWithStudents(sname: String): LiveData<List<SchoolWithStudents>>

    //@Transaction
    @Query("SELECT * FROM subject_table WHERE subName = :subjectName")
    suspend fun getStudentsOfSubject(subjectName: String): LiveData<List<SubjectWithStudents>>

    //@Transaction
    @Query("SELECT * FROM student_table WHERE stname = :studentName")
    fun getSubjectsOfStudents(studentName: String): LiveData<List<StudentWithSubjects>>*/


    //SELECTs

    //Student
    @Query("SELECT * FROM student_table")
    fun getStudents():LiveData<List<Student>>

    //School
    @Query("SELECT * FROM school_table")
    fun getSchool():LiveData<List<School>>

    //Director
    @Query("SELECT * FROM director_table")
    fun getDirector():LiveData<List<Director>>

    //Subject
    @Query("SELECT * FROM subject_table")
    fun getSubject():LiveData<List<Subject>>


    //COUNTs
    //Subject
    @Query("SELECT COUNT(subname) FROM subject_table ")
    fun countSubjects():Int
}