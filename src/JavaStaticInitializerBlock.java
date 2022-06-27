import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static int flag() {
        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        int H = scan.nextInt();
        if (B >= 0 && H >= 0) {
            return (B * H);
        } else
            return 0;
    }

    public static void main(String[] args) {
        int a = flag();
        if (a != 0) {
            System.out.println(a);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
