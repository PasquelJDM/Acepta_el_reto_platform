import java.util.Scanner;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        boolean flag = true;
        String[] characters;
        Vector<String> perimeters = new Vector<>();
        try (Scanner reader = new Scanner(System.in)) {
            while (flag) {
                characters = reader.nextLine().split(" ", 2);
                if (Integer.valueOf(characters[0]) < 0 || Integer.valueOf(characters[1]) < 0) {
                    flag = false;
                    continue;
                }
                perimeters.add(perimeter(Integer.valueOf(characters[0]), Integer.valueOf(characters[1])));
            }
        }
        showPerimeters(perimeters);
    }

    private static String perimeter(int length, int high) {
        return length * 2 + high * 2 + "";
    }

    private static void showPerimeters(Vector<String> perimeters) {
        for (String perimeter : perimeters) {
            System.out.println(perimeter);
        }
    }
}
