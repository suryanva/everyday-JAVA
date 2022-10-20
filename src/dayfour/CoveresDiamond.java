package dayfour;

public class CoveresDiamond {
    public static void main(String[] args) {
        int  n = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // S1,   S2   , S3      ,S4       , P1         , P2           , P3          ,P4
                if(i==0||j==0||i==(n-1)||j==(n-1)||i+j<=(n-1)/2||i-j>=(n-1)/2||j-i>=(n-1)/2||i+j>=(n)+(n-1)/2){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
    }
}
