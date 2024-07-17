import java.util.Scanner;

public class table {
        static void tabl(){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("the table of number  "+n+" is:");
            for (int i=1;i<=10;i++){
            int j;
                j=i*n;
                System.out.println(" ");
                System.out.print(n+"  ");
                System.out.print(i+"  ");
                System.out.print(j+" ");

            }
        }
        public static void main(String args[]){
            System.out.println("wellcome to programm");
            System.out.println("enter num to print table : ");
            tabl();

        }
}
