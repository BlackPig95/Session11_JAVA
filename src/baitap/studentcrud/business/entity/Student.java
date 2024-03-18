package baitap.studentcrud.business.entity;

public class Student
{
    private int studentId;
    private String name;
    private double averageScore;

    public Student()
    {
    }

    public Student(int studentId, String name, double averageScore)
    {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getAverageScore()
    {
        return averageScore;
    }

    public void setAverageScore(double averageScore)
    {
        this.averageScore = averageScore;
    }

    public void display()
    {
        System.out.println("ID: " + this.studentId);
        System.out.println("Name: " + this.name);
        System.out.println("Score: " + this.averageScore);
    }
}
