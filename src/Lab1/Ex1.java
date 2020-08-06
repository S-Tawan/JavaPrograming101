package Lab1;

import java.util.Scanner;

class Student {
    private Long Id;
    private String fullName;
    private String nickName;
    private String department;
    private String faculty;
    private String university;

    public Student(Long id, String fullName, String nickName, String department, String faculty, String university) {
        Id = id;
        this.fullName = fullName;
        this.nickName = nickName;
        this.department = department;
        this.faculty = faculty;
        this.university = university;
    }

    public Student() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return

                "My name is '" + fullName + '\'' +
                        "\nMy nick name is '" + nickName + '\'' +
                        "\nMy student id is" + Id +
                        "\nI am studying at department of '" + department + '\'' +
                        "\nFaculty of '" + faculty + '\'' +
                        "\n'" + university + '\'';
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Name-Surname : ");
        student.setFullName(scanner.nextLine());
        System.out.print("Student ID : ");
        student.setId(Long.valueOf(scanner.nextLine()));
        System.out.print("Department : ");
        student.setDepartment(scanner.nextLine());
        System.out.print("Faculty : ");
        student.setFaculty(scanner.nextLine());
        System.out.println("University : ");
        student.setUniversity(scanner.nextLine());

        System.out.println();
    }
}
