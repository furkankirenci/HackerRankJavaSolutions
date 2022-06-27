import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        while (scan.hasNextLine()) {
            String str = scan.nextLine();
            counter++;
            System.out.println(counter + " " + str);
        }
    }
}
