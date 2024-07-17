public class halfpyramid {
    public static void main(String[]args){
        System.out.println(" .  .  .  -  -  -  .  .  .");
        System.out.println("half pyramid & half daimond pettern");
        System.out.println(" .  .  .  -  -  -  .  .  .");
        System.out.println("");
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                    System.out.print("* ");
            }
            System.out.println("");
        }
        //invert
        int m=4;
        for (int i=1;i<=m;i++){
            for (int j=m;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
//*i=j ,i<j
//**
//***