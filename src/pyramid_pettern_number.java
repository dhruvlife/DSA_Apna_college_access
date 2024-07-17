public class pyramid_pettern_number {
    public static void main(String[]args){

            int n = 8;
            for (int i=1;i<=n;i++){

                for (int j=n;j>i;j--){
                    System.out.print(" ");
                }
                for (int j=i;j>=1;j--){
                    System.out.print(j+"");
                }
                for (int j=2;j<=i;j++){
                    System.out.print(j+"");
                }
                for (int j=i;j<n;j++){
                    System.out.print(" ");
                }


                System.out.println();
            }
    }
}
