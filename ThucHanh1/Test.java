package Tuan5.ThucHanh1;
import java.io.File;
import java.io.IOException;

public class Test {

    public class main {
        public static void main(String[] args) throws IOException {
            File file = new File("demo.txt");
            file.createNewFile();
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());

        }
    }
}


//-Lớp File đc kế thừa từ lớp Object
//-Lớp File đc thực thi từ interface Serializable
