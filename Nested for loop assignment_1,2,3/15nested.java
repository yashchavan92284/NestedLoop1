/*
  3C 3C 3C 3C
  3C 3C 3C
  3C 3C
  3C
 */

class demo15 {
    public static void main(String args[]) {
        int n = 4;
        String ch = "3C";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" " + ch);

            }
            System.out.println();
        }

    }

}

// OR
// class Solution4 {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = i; j <= 4; j++) {
//                 System.out.print("3C ");
//             }
//             System.out.println();
//         }
//     }
// }
