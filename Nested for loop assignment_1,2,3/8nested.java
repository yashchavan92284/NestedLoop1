 /*  d d d d
     c c c c
     b b b b
     a a a a
  */
 
 class demo7 {
    public static void main(String args[]){
        char c = 'd';
        int n = 4;
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n;j++){
                System.out.print(" "+c);
            }
            c--;
            System.out.println();
        }

    }
}
