 /*
   10
   9 8
   7 6 5
   4 3 2 1
  
 */

 
 class demo13 {
    public static void main(String args[]){
        int n= 4;
        int no = 10;
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(" "+no);
                no--;
            }
            System.out.println();
        }

    }
    
}
