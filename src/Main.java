import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Задание №1");
        List<Integer> nums2 = new ArrayList<>(List.of());
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums2.add(nums.get(i));
            }
        }
        System.out.println(nums2);

        System.out.println("Задание №2");
        Collections.sort(nums2);
        System.out.println(nums2);

        System.out.println("Задание № 3");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> strings1= new HashSet<>(strings);
        System.out.println(strings1);

        System.out.println("Задание № 4");
        Map<String, Integer> repeats = new HashMap<String, Integer>();
        int i=1;
        for (String string : strings) {if(!repeats.containsKey(string)) {
            repeats.put(string,i++);
        }
        }
        System.out.println(repeats);
        }
    }

