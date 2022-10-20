package dayfour;

public class Diamond {
    public static void main(String[] args) {
        int  n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //P1         , P2           , P3
                if(i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||i+j==(n)+(n-1)/2){
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
