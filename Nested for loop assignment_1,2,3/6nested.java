/*  
  12 12 12
  11 11 11
  10 10 10
*/

class demo5 {
    public static void main(String args[]) {

        int n = 3;
        int no = 12;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print(" " + no);

            }
            no = no - 1;

            System.out.println();
        }
    }
}
