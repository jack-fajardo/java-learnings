import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        for (int a = 1 ; a <= n ; a++) {
            for (int b = 1 ; b <= n ; b++) {    
                if (b <= (n - a)) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("#");
                }
            }
            System.out.println();
        }
        
    }
}
