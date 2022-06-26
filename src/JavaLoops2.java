import java.util.*;
import java.io.*;

public class JavaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0,b=0,n=0;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();

            for (int j = 1 ; j <= n; j++ ){
                int total = 0;
                for(int x = 0 ; x < j; x++){
                    total += Math.pow(2,x) * b;
                }
                total += a;
                System.out.print((total)+ " ");
            }
            System.out.println();
        }
        in.close();
    }
}
