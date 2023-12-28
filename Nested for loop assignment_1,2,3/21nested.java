/*

  1 2 3 4
  4 5 6 
  6 7
  7

 */

class demo21 {
     public static void main(String args[]) {
        int n = 4;
        int no = 1;

        for (int i = 1; i <= n; i++) {
           
            for (int j = i; j <= n; j++) {                
                System.out.print(" " +no );
                // no = no1;
                no++;
            }
            no--;
            

            System.out.println();

        }
    }
}
