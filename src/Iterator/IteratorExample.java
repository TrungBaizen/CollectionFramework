package Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        // Tạo một danh sách (List)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Lặp qua các phần tử của danh sách bằng Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Xóa phần tử "Banana" khỏi danh sách bằng Iterator
        iterator = list.iterator(); // Cần phải tạo một Iterator mới
        while (iterator.hasNext()) {
            if (iterator.next().equals("Banana")) {
                iterator.remove();
            }
        }

        // In ra danh sách sau khi xóa
        System.out.println("Danh sách sau khi xóa:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
