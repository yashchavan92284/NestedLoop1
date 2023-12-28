/*
  10 10 10 10
  11 11 11
  12 12
  13
  
 */

class demo16{
    public static void main(String args[]){
        int n = 4;
        int num = 10;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(" "+num);
                
            }
            System.out.println();
            num++;
        }

    }
}





// class Solution5 {
//     public static void main(String[] args) {
//         int row = 4;
//         int num = row*(row+1)/2;
//         for (int i = 1; i <= row; i++) {
//             for (int j = i; j <= row; j++) {
//                 System.out.print(" "+num);
//             }
//             num++;
//             System.out.println();
//         }
//     }
// }
