import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a,fatorial;
        fatorial=1;
        for (int i = n;i!=0;i--){

            fatorial= fatorial*i;


        }System.out.println(fatorial);


        sc.close();
    }
}