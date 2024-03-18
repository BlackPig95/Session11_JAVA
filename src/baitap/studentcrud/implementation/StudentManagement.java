package baitap.studentcrud.implementation;

import baitap.studentcrud.business.design.IStudentManagement;
import baitap.studentcrud.business.entity.Student;

import java.util.ArrayList;
import java.util.Collections;

public class StudentManagement implements IStudentManagement
{
    private static final ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public void showAll()
    {
        if (studentList.isEmpty())
        {
            System.out.println("Không có sinh viên dể hiển thị");
            return;
        }
        for (Student student : studentList)
            student.display();
    }

    @Override
    public void addStudent(Student student)
    {
        studentList.add(student);
    }

    @Override
    public void removeStudent(int id)
    {
        if (findStudentById(id) != null)
            studentList.remove(id);
    }

    @Override
    public Student findStudentById(int id)
    {
        if (studentList.isEmpty())
        {
            System.out.println("Không có sinh viên nào trong danh sách");
            return null;
        }
        for (Student student : studentList)
        {
            if (student.getStudentId() == id)
                return student;
        }
        System.out.println("Không tìm thấy sinh viên");
        return null;
    }

    @Override
    public ArrayList<Double> getAverageScore()
    {
        ArrayList<Double> studentScores = new ArrayList<>();
        for (Student s : studentList)
        {
            studentScores.add(s.getAverageScore());
        }
        return studentScores;
    }

    @Override
    public void sortByScore()
    {
        studentList.sort((student1, student2) ->
        {
            if (student1.getAverageScore() - student2.getAverageScore() > 0)
                return 1;
            else if (student1.getAverageScore() - student2.getAverageScore() == 0)
                return 0;
            else return -1;
        });
    }
//    public void sortByScore()
//    {
//        studentList.sort((student1, student2) -> student1.getAverageScore().compareTo(student2.getAverageScore()));
//    }
}
