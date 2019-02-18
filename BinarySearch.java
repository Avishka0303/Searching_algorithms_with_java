import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int data[],int key){

        int first=0;
        int last=data.length-1;

        while(first<=last){
            int mid=(first+last)/2;
            if(key>data[mid]) {
                first=mid+1;
            }else if(key<data[mid]){
                last=mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }

    public static void main(String []args){

        //creating  array for random numbers.
        final int size=1000;
        int data[]=new int[size];

        //initializing array with random numbers
        for(int i=0;i<size;i++){
            data[i]=(int)(Math.random()*100);
        }

        //print the random data set.
        System.out.println("Data elements before sorting.\n");
        displayArray(data);

        //after sorting
        System.out.println("\nData elements before sorting.\n");
        Arrays.sort(data);
        displayArray(data);

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to search for : ");
        int key=input.nextInt();

        // call to searching algorithm and start time counting.
        long timeInitial=System.nanoTime();
        int found=binarySearch(data,key);
        long timeOut=System.nanoTime();

        //calculate the processing time.
        long processing_Time=timeOut-timeInitial;

        if(found>0){
            System.out.println("Found key at position : "+found);
        }else{
            System.out.println("The element is not in the set. ");
        }

        System.out.println("\nProcessing time(without any threads) in ns : "+processing_Time);

    }

    public static void displayArray(int data[]){
        int size=data.length;
        for(int i=0;i<size;i++){
            if(i%10==0) System.out.println();
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
