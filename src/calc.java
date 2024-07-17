import java.util.Scanner;

public class calc {
    static void fun2(){
        System.out.println("enjoy your calc");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your element 1 :");
        int b = sc.nextInt();
        System.out.println("enter your element 2 :");
        int c = sc.nextInt();

        System.out.println("choose opretion :");
        System.out.println("option 1 is :addition");
        System.out.println("option 2 is :substraction");
        System.out.println("option 3 is :multiplication");
        System.out.println("option 4 is :division");

        int a= sc.nextInt();
        switch (a){
            case 1:
                System.out.println("you choose addition");
                System.out.println("your answer is :"+b+c);
                break;
            case 2 :
                System.out.println("you choose addition");
                System.out.println( "your answer is :");
                System.out.print(b-c);
                break;
            case 3 :
                System.out.println("you choose addition");
                System.out.println("your answer is :"+b*c);
                break;
            case 4 :
                System.out.println("you choose addition");
                System.out.println("your answer is :"+b/c);
                break;
            default:
                System.out.println("you choose wrong ...");
        }
    }


    public static void main(String[] args)
    {
        System.out.println("wellcome to programm");
        System.out.println("select 1 to open calc");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){
            case 1:
                System.out.println("opening . . .");
                fun2();
                break;
            case 2:
                System.out.println("closing . . . . . . ");
                break;
        }
    }
}
