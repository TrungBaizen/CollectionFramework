package Map;

import java.util.HashMap;
import java.util.Map;

public class MultiValueMapExample {
    public static void main(String[] args) {
        // Tạo một Map lồng nhau để lưu trữ nhiều value cho mỗi key
        Map<String, Map<String, Integer>> multiValueMap = new HashMap<>();

        // Thêm các value cho key "A"
        Map<String, Integer> valuesForA = new HashMap<>();
        valuesForA.put("Value1", 10);
        valuesForA.put("Value2", 20);
        multiValueMap.put("A", valuesForA);

        // Thêm các value cho key "B"
        Map<String, Integer> valuesForB = new HashMap<>();
        valuesForB.put("Value3", 30);
        valuesForB.put("Value4", 40);
        multiValueMap.put("B", valuesForB);

        // Lấy các value cho key "A"
        Map<String, Integer> valuesOfA = multiValueMap.get("A");
        System.out.println("Values of A: " + valuesOfA);

        // Lấy các value cho key "B"
        Map<String, Integer> valuesOfB = multiValueMap.get("B");
        System.out.println("Values of B: " + valuesOfB);
    }
}
