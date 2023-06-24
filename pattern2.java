public class pattern2 {
    public static void main(String[] args) {
        int c = 100;
        for (int i=0; i < c; i++) {
            for (int j = 0; j < c; j++)
            {
                if (i==0 || j==0 || i==c-1|| j==c-1)
                {
                    System.out.print("!");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
// hi gaurav 