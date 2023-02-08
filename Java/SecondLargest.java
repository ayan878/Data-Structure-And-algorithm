//Find 2ndLargest Number in Array
public class SecondLargest{

static void secondlargest {
 
    int largest = arr[0];
    int secondLargest = arr[0];
    
    System.out.println("The given array is:" );
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+"\t");
    }
    for (int i = 0; i < arr.length; i++) {
 
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
 
      } else if (arr[i] > secondLargest) {
        secondLargest = arr[i];
 
      }
    }
 
   // System.out.println("\nSecond largest number is:" + secondLargest);
 
  
   
    public static void main(String[] args) {
        int Array[]=new int[10];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Ten Number:");
        for(int i=0; i<Array.length; i++){
            Array[i]=sc.nextInt();
        }
         SecondLargest large =new SecondLargest();
         System.out.println("Second Largest:" +large.secondLargest(Array));
    }
}
}
