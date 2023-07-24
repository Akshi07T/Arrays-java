
public class largestNumber {

    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE; //-INFINITY

        for(int i = 0; i < num.length; i++){

            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int num[] = { 2,5,7,4,8,9};
        
        System.out.println("Largest number is : " + getLargest(num));


    }
}
