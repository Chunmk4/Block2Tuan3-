package Tuan5.Bai4;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
//        String filename = "new_file.txt";
        String filename1 = "chungchun";
//        File file = new File(filename);
        File file1 = new File(filename1);
        String filepath = file1.getAbsolutePath();

        // Kiểm tra nếu file đã tồn tại
        if (file1.exists()) {
            System.out.println("File đã tồn tại");
            // Kiểm tra xem file có phải là thư mục?
            if (file1.isDirectory()) {
                System.out.println("Đây là một thư mục");
            } else {
                System.out.println("Đây là một file");
            }
            // Hiển thị đường dẫn
            System.out.println("Đường dẫn của file là: " + filepath);
        } else {
            // Tạo file mới
             try {
                if (file1.createNewFile()) {
                    System.out.println("File mới đã được tạo");
                } else {
                    System.out.println("Không thể tạo file mới");
                }
            } catch (IOException e) {
                System.out.println("Lỗi khi tạo file mới: " + e.getMessage());
            }
        }
    }
}
