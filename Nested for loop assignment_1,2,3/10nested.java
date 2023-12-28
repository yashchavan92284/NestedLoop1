/*
  1 2 3 4
  2 3 4 5
  3 4 5 6
  4 5 6 7

 */

class demo9 {
    public static void main(String args[]){
        int n = 4;
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=n;j++){
                System.out.print(" "+(i+j-1));
               
            }
            System.out.println();
        }
    }
    
}
