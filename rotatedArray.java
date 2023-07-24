public class rotatedArray {
    public static int rotatedArrayIndex(int arr[], int target, int start, int end){
        int s = start;  
        int e= end;
        
        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                e = mid-1;
            } 

            else{
                s = mid+1;
            }

        }
        return -1;

        
    }
    public static void main(String[] args){
    int arr[] = {4,5,6,7,0,1,2};
    int target = 0;
    int start = 0;
    int end = arr.length-1;
    System.out.println(rotatedArrayIndex(arr, target, start, end));

    }
}
