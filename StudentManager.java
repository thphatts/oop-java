import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Nhập Tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập GPA: ");
        double gpa = Double.parseDouble(sc.nextLine()); 

        Student s = new Student(id, name, gpa);
        list.add(s);
        System.out.println(">> Thêm thành công!");
    }

    public void showAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("DANH SÁCH SINH VIÊN:");
        for (Student s : list) {
            System.out.println(s.toString());
        }
    }

    // === UPDATE (Sửa theo ID) ===
    public void updateStudent() {
        System.out.print("Nhập ID cần sửa: ");
        String id = sc.nextLine();
        
        Student foundStudent = null;
        for (Student s : list) {
            if (s.getId().equalsIgnoreCase(id)) {
                foundStudent = s;
                break;
            }
        }

        if (foundStudent != null) {
            System.out.print("Nhập tên mới: ");
            String newName = sc.nextLine();
            System.out.print("Nhập GPA mới: ");
            double newGpa = Double.parseDouble(sc.nextLine());

            foundStudent.setName(newName);
            foundStudent.setGpa(newGpa);
            System.out.println(">> Cập nhật thành công!");
        } else {
            System.out.println(">> Không tìm thấy sinh viên có ID: " + id);
        }
    }

    // === DELETE (Xóa theo ID) ===
    public void deleteStudent() {
        System.out.print("Nhập ID cần xóa: ");
        String id = sc.nextLine();
        
        // Sử dụng lambda (Java 8+) hoặc vòng lặp để xóa
        boolean removed = list.removeIf(s -> s.getId().equalsIgnoreCase(id));
        
        if (removed) {
            System.out.println(">> Đã xóa thành công!");
        } else {
            System.out.println(">> Không tìm thấy ID để xóa.");
        }
    }
}