public class binarySearch {

    public static int binarysearch(int num[], int key){

        int start = 0;  
        int end = num.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            //compare

            if(num[mid] == key){

                return mid;
            }

            if(num[mid]<key) {
                //right
                start = mid+1;

            } else {
                end = end -1;
            }
        }

        return -1;

    }
    public static void main(String[] args){

        //Array should be sorted

        int num[] = { 2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        
        System.out.println("index of key is :" + binarysearch(num, key));

    }
}
