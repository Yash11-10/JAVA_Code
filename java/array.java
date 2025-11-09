import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        
        int [] marks = new int[3];
        marks[0]=1;
        marks[1]=3;
        marks[2]=32;
        System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = sc.nextInt();
        int number[] = new int[size];
            System.out.println("enter the numbers");
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(number[i]+" ");
            // System.out.println(Arrays.toString(number));
        }
    }    
}





    // public static void main(String[] args) {
    //     float [] m = new float[5];
    //     m[0]=2;
    //     m[1]=4;
    //     m[2]=3;
    //     m[3]=6;
    //     m[4]=5;
    //     float sum = (m[0]+m[1]+m[2]+m[3]+m[4])/5;
    //     System.out.println(sum);
    // }





    // public static void main(String[] args) {
    //     boolean isPresent = false;
    //     int [] array = {3,8,5,4,9,6,7};
    //     int num = 8;
    //     for(int i=0;i<=array.length-1;i++){
    //         if(num==array[i]){
    //             isPresent = true ;
    //         }
    //     }
    //     if(isPresent){
    //         System.out.println("present");
    //     }
    //     else{
    //         System.out.println("not present");
    //     }
    // }


    // public static void main(String[] args) {
    //         int [] array = {3,8,5,4,9,6,7};
    //         int max=array[0];
    //         for(int i=0;i<array.length;i++){
    //             if(array[i]>max){
    //                 max=array[i];   
    //             }
    //         }
    //         System.out.println(max);   


    // }




    // public static void main(String[] args) {
        // int [] array = {3,8,5,4,9,6,7};
    //     boolean isSorted = true;
    //     for(int i=0;i<array.length-1;i++){
    //         if(array[i]>array[i+1]){
    //             isSorted = false;
    //             break;
    //         }
    //     }
    //     if(isSorted){
    //         System.out.println("sorted");
    //     }
    //     else{
    //         System.out.println("not sorted");
    //     } 
    // }   
    
    

                              // sorting   
                              
                              


    // public static void main(String[] args) {
    //     int [] array = {3,8,5,-1,4,9,6,7};
    //     Arrays.sort(array);
    //     System.out.println(Arrays.toString(array));
    // }   
    
    


// bubble sort esmei hum sbse bda element sbse peeche shift kr dete hai or pair wise swapping kr rhe hai

// public static void main(String[] args) {
    //     int [] array = {4,5,7,8,9,3,6};
    //     for(int i=0;i<array.length-1;i++){
    //         for(int j=0;j<array.length-1-i;j++){
    //             if(array[j]>array[j+1]){
    //                 int temp = array[j];
    //                 array[j]=array[j+1];
    //                 array[j+1]=temp;
    //             }
    //         }
    //     }
    //     System.out.println("sorted array is :");
    //     System.out.println(Arrays.toString(array));
    // }

 

// selection sort esmei hm sbse chota element sbse aage shift kr dete hai.or esmei swapping sirf ek baar hoti hai;
    // public static void main(String[] args) {
    //     int [] array = {4,5,7,8,9,3,6,1};
    //     for (int i=0;i<array.length-1;i++){
    //         int smallest = i;
    //         for(int j=i+1;j<array.length;j++){
    //             if(array[smallest]>array[j]){
    //                 smallest = j;
    //             }
    //         }
    //         int temp = array[smallest];
    //         array[smallest] = array[i];
    //         array[i] = temp;
    //     }
    //     System.out.println(Arrays.toString(array));
    // }





// insertion sort esmei hum array to ko do parts mei divide krte hai. unsorted mei se ek element utahya or sorted vale mei rkh dia uski shi position pe.



    // public static void main(String[] args) {
    //     int [] array = {4,5,7,2,8,9,3,6,1};
        
    // }




    // public static void main(String[] args) {
    //     float arr[] = {1,2,48,4,2};
    //     float sum = 0;
    //     for(int i=0;i<arr.length;i++){
    //         sum = sum + arr[i];
    //     }
    //     System.out.println(sum);

    // }




    // public static void main(String[] args) {
    //     boolean isPresent = false;
    //     int n = 3;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of array");
    //     int size = sc.nextInt();
    //     int arr [] = new int[size];
    //     System.out.println("enter the elements");
    //     for(int i=0;i<arr.length;i++){
    //         arr[i] = sc.nextInt();
    //         if (arr[i]==n) {
    //             isPresent=true;
    //         }
    //     }
    //     // System.out.println(Arrays.toString(arr));
    //     if(isPresent){
    //         System.out.println("present");
    //     }
    //     else{
    //         System.out.println("not present");
    //     }
    // }



    
// }





