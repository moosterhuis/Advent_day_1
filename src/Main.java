import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        int sum = 0;
        List<Integer> tops = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader("input.txt"));
            String line = reader.readLine();

            while (line != null) {
                if (line.isEmpty()) {
                    tops.add(sum);
                    sum = 0;
                } else {
                    int value = Integer.parseInt(line.toString());
                    sum += value;
                }
                line = reader.readLine();
            }
            Collections.sort(tops);
            Collections.reverse(tops);
            int top3total = tops.get(0) + tops.get(1) + tops.get(2);
            System.out.println("max: " + tops.get(0));
            System.out.println("som top 3: " + top3total);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}