 /*
   1
   8 9
   9 64 25
   64 25 216 49

  */
 
//  class nest {
//     public static void main(String args[]) {
//         int n = 4;

//         for (int i = 1; i <= n; i++) {
//             int temp = i;
           
//             for (int j = 1; j <= i; j++) {                
//                 if((i+j)%2==1){
//                         System.out.print(" "+(temp*temp*temp));
//                 }
//                 else{
//                      System.out.print(" "+(temp*temp));
//                 }
//                 temp++;

//             }
            

//             System.out.println();

//         }
//     }
    
// }


public static void main(String [ ] args){
int row=4;
for(int i =1;i<=row;i++){

int temp= i ;
for(int j=1; j<=i; j++){
if(i%2!=0){
if(j%2==0){
System.out.print(temp*temp*temp+"\t");
}else{
System.out.print(temp*temp+"\t");
}
}else{
if(j%2!=0){
System.out.print(temp*temp*temp+"\t");
}else{
System.out.print(temp*temp+"\t");
}
}
temp++;
}
System.out.println();
}
}
}
