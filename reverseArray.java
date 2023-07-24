public class reverseArray {

    public static void reversearray(int num[]){
        int start = 0;
        int end = num.length -1;

        while(start<end){
            //swap
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;


        }

    }
    public static void main(String[] args){
        int num[] = {2, 4, 6, 8, 9};

        reversearray(num);
        for(int i =0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }
}
