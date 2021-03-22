package lab2;

import java.util.Scanner;

public class lab252 {
    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = key.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*(n - i) + 1; k++){
                System.out.print("*");
            }
            System.out.print("\n");//hhh
        }
    }
}
