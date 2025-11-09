public class recursion {
    // public static void printNumbers(int n){
    //     if(n==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumbers(n+1);
    // }
    // public static void main(String[] args) {
    //     int n = 1;
    //     printNumbers(n);
    // }



    // public static void sumNum(int n,int sum,int i){
    //     if(i==n){
    //         sum=sum+i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum = sum+i;
    //     sumNum(n, sum, i+1);
        
    // }
    // public static void main(String[] args) {
    //     sumNum(4, 0, 1);
    // }






    public static int  factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        // int fact1 = factorial(n-1);
        // int fact = n*fact1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }


    // public static void printFibo(int a,int b,int n){
    //     if(n==0){
    //         return; 
    //     }
    //     int c = a+b;
    //     System.out.println(c);
    //     printFibo(b, c, n-1);
    // }
    // public static void main(String[] args) {
    //     int a = 0;
    //     int b = 1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n = 7;
    //     printFibo(a, b, n-2);
    // }


    // public static int calcPower(int x,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     else if (x==0) {
    //         return 0;
    //     }
    //     int pm1 = calcPower(x, n-1);
    //     int power = x*pm1;
    //     return power;
    // }
    // public static void main(String[] args) {
    //     int x = 2 ; 
    //     int n = 4;
    //     int ans = calcPower(x, n);
    //     System.out.println(ans);
    // }


    

//     public static void towerOfHanoi(int n,String src, String helper,String dest){
//         if(n==1){
//             System.out.println("transfer disk " + n + " from "+src+" to "+dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }
//     public static void main(String[] args) {
//         int n = 2;
//         towerOfHanoi(n, "S", "H", "D");
//     }
     
}
