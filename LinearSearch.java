public class LinearSearch {

    public static int min(int [] data){
        int minimum=data[0];
        for(int i=0;i<data.length;i++){
            if(data[i]<minimum){
                minimum=data[i];
            }
        }
        return minimum;
    }

    public static void main(String []args){

        //creating  array for random numbers.
        int size=10;
        int data[]=new int[size];

        //initializing array with random numbers
        for(int i=0;i<size;i++){
            data[i]=(int)(Math.random()*100);
        }

        //print the random data set.
        System.out.println("Data elements before sorting.\n");
        displayArray(data);


        // call to searching algorithm and start time counting.
        long timeInitial=System.nanoTime();
        int minimum=min(data);
        long timeOut=System.nanoTime();

        //calculate the processing time.
        long processing_Time=timeOut-timeInitial;

        //to get the minimum data
        System.out.println("\n\nthe minimum value is "+minimum);
        System.out.println("\nProcessing time(without any threads) in ns : "+processing_Time);

    }

    public static void displayArray(int data[]){
        int size=data.length;
        for(int i=0;i<size;i++){
            System.out.println(data[i]);
        }
    }
}
