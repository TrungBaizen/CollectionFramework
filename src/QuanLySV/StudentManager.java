package QuanLySV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> listStudents = new ArrayList<>();
        do {
            System.out.println("****** STUDENT ******");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm 1 sinh viên vào danh sách");
            System.out.println("3. xoá sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên có GPA > 8");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (Student student: listStudents
                    ) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    Student student = new Student();
                    student.inputData(scanner, listStudents);
                    listStudents.add(student);
                    break;
                case 3:
                    System.out.println("NHập mã sv cần xoá:");
                    int inputId = Integer.parseInt(scanner.nextLine());
                    for (Student obj: listStudents
                    ) {
                        if(obj.getId() == inputId){
                            listStudents.remove(obj);
                            break;
                        }
                    }
                    break;
                case 4:
                    for (Student obj: listStudents
                    ) {
                        if (obj.getGPA() > 8){
                            System.out.println(obj);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }while (true);
    }
}