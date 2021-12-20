import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("1. sayiyi giriniz");
        n1=input.nextInt();
        System.out.println("2.sayiyi giriniz");
        n2=input.nextInt();
        System.out.println("3. sayiyi giriniz");
        n3=input.nextInt();
        if(n1<n2&&n1<n3){
            if(n2<n3){
                System.out.println(n1+"<"+n2+"<"+n3);
            }else{
                System.out.println(n1+"<"+n3+"<"+n2);
            }
        }
        if(n2<n1&&n2<n3){
            if(n1<n3){
                System.out.println(n2+"<"+n1+"<"+n3);
            }else {
                System.out.println(n2+"<"+n3+"<"+n1);
            }

        }
        if (n3<n1&&n3<n2){
            if(n1<n2){
                System.out.println(n3+"<"+n1+"<"+n2);
            }else{
                System.out.println(n3+"<"+n2+"<"+n1);
            }
        }


    }
}
