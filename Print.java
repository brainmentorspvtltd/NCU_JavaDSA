package recursion;
class Print{
    //map-1
    // static void recursivePrint(int i ,int n) {
    //     System.out.println(i);
    //     recursivePrint(i+1, n);

    // } 
    //map-2
    // static void recursivePrint(int i ,int n) {
    //   if(i<=n){
    //     System.out.println(i);
    //     recursivePrint(i+1, n);
    //   }

    // } 

    // static void recursivePrint(int i ,int n) {
    //     if(i>n){
    //         return;
    //     }  
    //         System.out.println(i);
    //         recursivePrint(i+1, n);
          
    
    //     } 

        // static void print(int n){
        //     if(n==1){
        //         System.out.println(n);
        //         return;
        //     }
        //     System.out.println(n);
        //     print(n-1);
        //     System.out.println(n);

        // }
        
        
        
        static int fib(int n ){

            if(n==0){
                return 0;
            }
            if(n==1){
                return 1;
            }
            return fib(n-1)+fib(n-2);
        }
        
        static int fibo(int n){
           if(n==0){
               return 0;
           }
           if(n==1){
               return 1;
           }
            int left=fibo(n-1);
          int right= fibo(n-2);
            int result=left+right;
            return result;
        }
        static int pattern(int n){
            if(n==1){
                return 7;
            }
            return n+(n+1)*(n+2)*pattern(n-1);
        }
        static int sum(int n){
            if(n==1)
            return 1;
            return sum(n-1)+n;
        }
//inorder pre post
//3211211
        static void printTreepre(int n){

            if(n==0){
                return;
            }
            System.out.println(n);
            printTreepre(n-1);
            printTreepre(n-1);
        } 
//12123121
static void printTreein(int n){

    if(n==0){
        return;
    }
    
    printTreein(n-1);
    System.out.println(n);
    printTreein(n-1);
} 
//1121123
static void printTreepost(int n){

    if(n==0){
        return;
    }
    
    printTreepost(n-1);
    printTreepost(n-1);
    
    System.out.println(n);
} 

static void printMatrix(int arr[][],int row ,int col){
    if(row==arr.length && col==arr.length-1){
        return;
    }
    if(row==arr.length){
        row=0;
        col=col+1;
    }
    System.out.println(arr[row][col]);
    printMatrix(arr, row+1, col);
}
    public static void main(String[] args) {
       // int n=4;
       // System.out.println(fibo(6));
      int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
      printMatrix(arr, 0,0);
        //System.out.println( sum(n));
      // System.out.println( pattern(n));
      //  print(n);
       // recursivePrint(1,n);
        // for(int i=1;true;i++){
        //         System.out.println(i);
        //     }

        
        // for(int i=1;i<=n;i++){
        //     System.out.println(i);
        // }
    }

}