public class Searching {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        int target = 8;
        int start = 0;
        int end = arr.length-1;
        boolean found = false;
        while(start<=end){
            int mid = (start+end)/2;
            if(target==arr[mid]){
                System.out.println("index is " +mid);
                found = true;
                break;
            }
            else if(target>arr[mid]){
                start = mid+1;
            } 
            else{
                end = mid-1;
            }
        }
        if(!found){
            System.out.println("not found");
        }
    }
}






// binary search ko sirf hum sorted array mei implement kr skte hai

// find mid  = (strt + end)/2

// target>arr[mid] - start = mid+1

// target<arr[mid] - end = mid-1

// target==arr[mid]  -  ans mid