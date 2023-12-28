/*
  F
  E F
  D E F
  C D E F
  B C D E F
  A B C D E F
  
 */
class demo18 {
    public static void main(String args[]) {
        int n = 6;
        char ch = 'F';

        for (int i = 1; i <= n; i++) {
            char ch1 = ch;
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + ch1);
                ch1++;
            }
            System.out.println();
            ch--;
        }
}
}

//     class Solution7 {
//         public static void main(String[] args) {
//             int rows = 6;
//             for (int i = 1; i <= rows; i++) {
//                 int ch = 65 + rows - i;
//                 for (int j = 1; j <= i; j++) {

//                     System.out.print((char) ch + " ");
//                     ch++;
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }
