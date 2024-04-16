import java.util.Scanner;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = in.nextInt();
    int[] arr = new int[num];
    for(int i = 0; i < num; i++){
      System.out.print("Enter a number: ");
      int num2 = in.nextInt();
      arr[i] = num2;
    }
    int maxCount = 0;
    int mode = 0;
    for(int i = 0; i < arr.length; i++){
      int count = 0;
      for(int j = 0; j < arr.length; j++){
        if(arr[i] == arr[j]){
          count++;
        }
      }
      if(count > maxCount){
        maxCount = count;
        mode = arr[i];
      }
    }
    System.out.println(mode);
  }
}
