import java.util.Scanner;

public class p1main {
    public static void main(String []args){
//        System.out.println("hi tabl");
//        tabl();
//        calc();
        printpatternsquare();
    }
//    static void tabl(){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=10;i++){
//            int x;
//            x = i*n;
//            System.out.print(n+" ");
//            System.out.print(i+" ");
//            System.out.print(x+" ");
//            System.out.println("");
//        }
//    }
//    static void calc(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter n1");
//        float n1 = sc.nextInt();
//        System.out.println("enter n2");
//        float n2 = sc.nextInt();
//        System.out.print("choose + to 1");
//        System.out.print("choose - to 2");
//        System.out.print("choose * to 3");
//        System.out.print("choose / to 4");
//
//        int n = sc.nextInt();
//        switch (n){
//                case 1 :
//                System.out.print("you choose addition");
//                System.out.print("ans = "+n1+n2);
//                case 2:
//                    if(n1>n2){
//                        System.out.print("you choose substraction");
//                        System.out.print("ans = "+ (n1-n2));
//                    }else {
//                        System.out.print("you choose substraction");
//                        System.out.print("ans = "+(n2-n1));
//                    }
//                case 3 :
//                System.out.println("you choose multiplication");
//                System.out.println("ans = "+n1*n2);
//                case 4 :
//                System.out.println("you choose division");
//                System.out.println("ans = "+n1/n2);
//        }
//    }
//
//    static void printpatternsquare(){
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void printpatternsquare(){
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<n-i+1;j++){
//                System.out.print("7");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
////            for(int j=1;j<=i-1;j++){
////                System.out.print("*");
////            }
//            for(int j=1;j<n-i+1;j++){
//                System.out.print("5");
//            }
//            System.out.println("");
////            System.out.println("");
//        }
//
//    }
static void printpatternsquare(){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();

    for (int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i*2-1;j++){
            System.out.print(n);
        }
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}


}
