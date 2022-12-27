import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] matrix = new int[1000][1000];
        Scanner scanner = new Scanner(new File("newfile.txt"));
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int dir = scanner.nextInt();
        scanner.nextLine();
        String proga = scanner.nextLine();
        Robot rob1 = new Robot(x, y, dir, matrix);
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int dir2 = scanner.nextInt();
        scanner.nextLine();
        String proga2 = scanner.nextLine();
        Robot rob2 = new Robot(x2, y2, dir2, matrix);

    }
}


