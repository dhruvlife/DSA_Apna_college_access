import java.util.*;
public class loop {
    public static void main(String[] args) {
        System.out.println("hii , wellcome to loop :");
        System.out.println("the answer is given by programm is sum up to n numbers");
        System.out.println("enter your element to get sum to which number to which");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter to get sum start number :");
        int a = sc.nextInt();
        System.out.println("up to which:");
        int b = sc.nextInt();

        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
            System.out.println("sum is:" + sum);
        } else {
            System.out.println("you give element in higher "+a+" to lower "+b);
            for (int i = b; i <= a; i++) {
                sum = sum + i;
            }
            System.out.println("sum is:" + sum);
        }
    }
}
