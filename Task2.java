import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> mapWord = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a word: ");
        String word = sc.nextLine();
        sc.close();

        BufferedReader br = new BufferedReader(new FileReader("File.txt"));
        String text;
        while ((text = br.readLine()) != null) {
            for (int i = 0; i < (text.split("\\s+")).length; i++) {
                mapWord.putIfAbsent(text.split("\\s+")[i].toLowerCase(), 0);
                mapWord.put(text.split("\\s+")[i].toLowerCase(), mapWord.get(text.split("\\s+")[i].toLowerCase()) + 1);
            }
        }
        br.close();

        for (Map.Entry<String, Integer> entry : mapWord.entrySet()) {
            if (entry.getKey().equals(word)) {
                System.out.println(entry.getKey() + " meets: " + entry.getValue() + " times");
            }
        }
    }
}
