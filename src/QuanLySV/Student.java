package QuanLySV;


import java.util.List;
import java.util.Scanner;

public class Student {
    private int id;
    private String studentName;
    private String email;
    private float GPA;

    public Student() {
    }

    public Student(int id, String studentName, String email, float GPA) {
        this.id = id;
        this.studentName = studentName;
        this.email = email;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    public void inputData(Scanner scanner, List<Student> listStudents){
        this.id = inputId(scanner, listStudents);
        this.studentName = inputStudentName(scanner);
        this.email = inputEmail(scanner);
        this.GPA = inputGPA(scanner);
    }

    public int inputId(Scanner scanner, List<Student> listStudents){
        int maxId = 0;
        if (listStudents.size() == 0){
            maxId = 0;
        }else{
            for (int i = 0; i < listStudents.size(); i++) {
                if (listStudents.get(i).getId() > maxId){
                    maxId = listStudents.get(i).getId();
                }
            }
        }
        maxId += 1;
        return maxId;
    }
    public String inputStudentName(Scanner scanner){
        System.out.println("Nhập tên sinh viên:");
        return scanner.nextLine();
    }
    public String inputEmail(Scanner scanner){
        System.out.println("Nhập email:");
        return scanner.nextLine();
    }
    public float inputGPA(Scanner scanner){
        System.out.println("Nhập điểm trung bình:");
        return Float.parseFloat(scanner.nextLine());
    }
    public String toString (){
        return "Mã SV: " + this.id + " - Tên SV: " + this.studentName
                + " - Email: " + this.email + " - ĐTB: " + this.GPA;
    }
}