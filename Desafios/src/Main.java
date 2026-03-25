import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double s,n,soma;
        n=1;
        soma = 0;

        for (double i =1;i<=39;i=i+2){
            s=i/n;
            n=n*2;
            soma = soma+s;

        }System.out.printf("%.2f%n",soma);


        sc.close();
    }
}