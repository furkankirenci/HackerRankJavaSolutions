import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String add1 = "";
            String add2 = "";
            //Complete this line
            int space = 15 - s1.length();
            String spacex = "";
            for (int j = 0; j < space; j++) {
                spacex += " ";
            }
            if (x / 10 == 0) {
                add1 = "00";
            } else if (x / 100 == 0) {
                add2 = "0";
            }

            System.out.println(s1 + spacex + add1 + add2 + x);
        }
        System.out.println("================================");

    }
}
