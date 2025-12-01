import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n====== MENU QUẢN LÝ ======");
                System.out.println("1. Thêm sinh viên");
                System.out.println("2. Hiển thị danh sách");
                System.out.println("3. Sửa sinh viên");
                System.out.println("4. Xóa sinh viên");
                System.out.println("0. Thoát");
                System.out.print("Chọn chức năng: ");
                
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1: manager.addStudent(); break;
                    case 2: manager.showAll(); break;
                    case 3: manager.updateStudent(); break;
                    case 4: manager.deleteStudent(); break;
                    case 0: 
                        System.out.println("Đã thoát chương trình!");
                        System.exit(0);
                    default:  
                        System.out.println("Lựa chọn không hợp lệ!");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}