package baitap.studentcrud.business.design;

import baitap.studentcrud.business.entity.Student;

import java.util.ArrayList;

public interface IStudentManagement
{
    void showAll();

    void addStudent(Student student);

    void removeStudent(int id);

    Student findStudentById(int id);

    ArrayList<Double> getAverageScore();

    void sortByScore();
}
