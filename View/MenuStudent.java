package View;

import Manager.StudentManager;
import Model.Student;

import java.util.Scanner;

public class MenuStudent {
    StudentManager studentManager = new StudentManager();
    Scanner InputInt = new Scanner(System.in);
    Scanner InputString = new Scanner(System.in);

    public void showMainMenu() {

        int choice;
        do {
            System.out.println("====Menu Student Manager ==== \n1.Thêm mới sinh viên\n2.Sửa học sinh\n3.Xóa sinh viên\n4.Hiển thị tất cả \n0.Thoát chương trình");
            System.out.println("Nhập lựa chọn của bạn");
            choice = InputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    showAll();
                    break;

            }
        }
        while (choice != 0);


    }

    public void showMenuAdd() {
        System.out.println("==== Đây là Menu mới");
        System.out.println("Nhập tên đi");
        String name = InputString.nextLine();
        System.out.println("Nhập tuổi");
        int age = InputInt.nextInt();
        System.out.println("Nhập địa chỉ đi");
        String address = InputString.nextLine();
        Student student = new Student(name, age, address);
        studentManager.add(student);
        System.out.println("Thêm thành công");
    }

    public void showAll() {
        System.out.println(studentManager.findAll());
    }

    public void delete() {
        System.out.println("Nhập id muốn xóa ");
        int index = InputInt.nextInt();
        studentManager.delete(index);
        System.out.println("Xóa thành công");
    }
    public void update(){
        System.out.println("===Menu Edit=== ");
        System.out.println("Nhap id muon sua");
        int idEdit = InputInt.nextInt();
        System.out.println("Nhập tên đi");
        String name = InputString.nextLine();
        System.out.println("Nhập tuổi");
        int age = InputInt.nextInt();
        System.out.println("Nhập địa chỉ đi");
        String address = InputString.nextLine();
        Student student = new Student(idEdit,name,age,address);
        studentManager.update(idEdit ,student);
    }
}
