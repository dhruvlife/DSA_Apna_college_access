public class degree180pettern {
    public static void main(String []args){

        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int k=1;k<=n;k++){
            for (int l=n-k;l<n;l++){
                System.out.print(" ");
            }
            for (int m=1;m<=n-k;m++){
                System.out.print("*");
            }


            System.out.println("");
        }
    }
}
