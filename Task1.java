import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> mapWord= new HashMap<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        for (int i = 0; i < (str.split("\\s+")).length; i++) {
            mapWord.putIfAbsent(str.split("\\s+")[i].toLowerCase(), 0);
            mapWord.put(str.split("\\s+")[i].toLowerCase(), mapWord.get(str.split("\\s+")[i].toLowerCase())+1);
        }

        for (Map.Entry<String, Integer> entry: mapWord.entrySet()) {
            System.out.println(entry.getKey()+" meets: "+ entry.getValue()+" times");
        }
    }
    
}
