public class passingArrAsArgument {
    public static void updates(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]= marks[i]+1;
        }
    }
    public static void main(String args[]){

        int marks[] = { 97, 99, 98};
        updates(marks);

        //print marks
        for(int i =0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    }