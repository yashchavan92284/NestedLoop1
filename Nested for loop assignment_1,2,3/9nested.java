/* c b a
   c b a
   c b a
 */


class demo8 {
     public static void main(String args[]){
        
        int n = 3;
        for(int i = 1;i<=n;i++){
            char c = 'c';
            for(int j = 1; j<=n;j++){
                System.out.print(" "+c);
                c--;
            }
            
            System.out.println();
        }

    }
    
}
