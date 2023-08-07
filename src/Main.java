import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    public static void main(String[] args) {
        exercise1();
        System.out.println("");
        exercise2();
        System.out.println("");
        exercise3();
        exercise4();



    }
    public static void exercise1 (){
        for (int num :nums ) {
            if(num%2!=0){
                System.out.print(num);
            }
        }
    }
    public static void exercise2 (){
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num :nums ) {
            if(num%2==0&&prevNum!=num){
                System.out.print(num);
                prevNum=num;
            }
        }
    }
    public static void exercise3(){
        Set<String> uniqueWords= new HashSet<>(strings);
        System.out.println(uniqueWords);
    }
    public static void exercise4(){
        int a=1;
        Map<String,Integer> repeats= new HashMap<>();
        for(int i = 0; i < strings.size() ; i++ ) {
            if(!repeats.containsKey(strings.get(i))) {
                repeats.put(strings.get(i),a++);
            }
        }
        System.out.println(repeats);
    }
}