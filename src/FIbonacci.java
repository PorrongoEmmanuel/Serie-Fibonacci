
public class FIbonacci {
   public int fibonaccirecursivo(int n){
       if(n==1 & n==2){
           //caso base
           return 1;
       }else{
           //domion (problema-1)
           return fibonaccirecursivo(n-1)+fibonaccirecursivo(n-2);
       }
   }
}
