import java.util.*;

public class CountAscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {4,1,2,3,1,2,5,2};
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(countMap.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int number = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                System.out.print(number);
                System.out.print("  ");
            }
        }
    }
}
