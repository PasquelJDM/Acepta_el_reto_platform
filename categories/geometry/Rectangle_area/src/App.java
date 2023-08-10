import java.util.Scanner;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        boolean flag = true;
        String[] characters;
        Vector<String> areas = new Vector<>();
        try (Scanner reader = new Scanner(System.in)) {
            while (flag) {
                characters = reader.nextLine().split(" ", 4);
                if (Integer.valueOf(characters[2]) < Integer.valueOf(characters[0])
                        || Integer.valueOf(characters[3]) < Integer.valueOf(characters[1])) {
                    flag = false;
                    continue;
                }
                areas.add(area(Integer.valueOf(characters[2]) - Integer.valueOf(characters[0]),
                        Integer.valueOf(characters[3]) - Integer.valueOf(characters[1])));

            }
        }
        showAreas(areas);
    }

    private static String area(int length, int high) {
        return length * high + "";
    }

    private static void showAreas(Vector<String> areas) {
        for (String area : areas) {
            System.out.println(area);
        }
    }
}
