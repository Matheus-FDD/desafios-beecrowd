import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double s,n;
        n=0;
        for (double i =1;i<=100;i++){
            s=1/i;
            n=n+s;
        }System.out.printf("%.2f%n", n);


        sc.close();
    }
}