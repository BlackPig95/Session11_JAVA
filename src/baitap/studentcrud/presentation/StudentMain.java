package baitap.studentcrud.presentation;

import baitap.studentcrud.business.entity.Student;
import baitap.studentcrud.implementation.StudentManagement;

public class StudentMain
{
    public static void main(String[] args)
    {
        StudentManagement studentManagement = new StudentManagement();
        Student student = new Student();
        student.setStudentId(1);
        student.setAverageScore(1.5);
        student.setName("A");
        studentManagement.addStudent(student);
        studentManagement.showAll();
    }
}
