import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Main{
    public static void main(String[] args) {
      //get the 3 arrays
    int[] arr1 = createArray();
    int[] arr2 = createArray();
    int[] arr3 = createArray();

    //pass the array to the function to find the missing numbers
    ArrayList<Integer> missingNums = findMissingNums(arr1, arr2, arr3);

    //pass to function to find greatest prime
    int greatPrime = findPrimeNum(missingNums);

    //display info
    System.out.println("The arrays are:\n" + Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(arr3));
    System.out.println("The missing numbers are:\n" + missingNums);
    if(greatPrime == 0){
      //function returns 0 if no prime number is found
      System.out.println("There is no prime number");
    }else{
      System.out.println("The Greatest prime number is:\n" + greatPrime);
    }

  }

  //method to create array
  private static int[] createArray(){
    Random rd = new Random(); // create random object
    int max = 50;
    int min = 0;
    int[] arr = new int[15]; // instatiate int depending on amount

    //fill array
    for(int i = 0; i < arr.length; i++){
      arr[i] = rd.nextInt((max-min)+1)+min;
    }

    return arr;
  }

  private static ArrayList<Integer> findMissingNums(int[] arr1, int[] arr2, int[] arr3){
  //create an array list to hold the 3 arrays
  ArrayList<Integer> fullList = new ArrayList<Integer>();
  //add the arrays to the list
  for(int i = 0; i < 15; i++){
    fullList.add(arr1[i]);       
    fullList.add(arr2[i]);
    fullList.add(arr3[i]);
  }

    ArrayList<Integer> missingNums = new ArrayList<Integer>(); //instatiate array to hold missing numbers
    //sort the array
    Collections.sort(fullList);

    //find the distinct values
    Set<Integer> uniqueValues = new HashSet<Integer>(fullList);
    Integer[] uniqueArr = uniqueValues.toArray(new Integer[uniqueValues.size()]); //convert to array to manipulate easier

    int j = fullList.get(0); //ctr to compare against numbers, set starting point of ctr to the lists first number

    //for loop to find missing numbers
    for(int i = 0; i < uniqueArr.length;){
      if(j == uniqueArr[i]){
        //if j is the unique array number that number exist so we just increment like normal
        j++;
        i++;
      }else{
        //if j does not equal the unique arr that number doesn't exist so we want to save and and catch up to what ever number the unique array is at so we only increment j
        missingNums.add(j);
        j++;
      }
    }


    return missingNums;

  }

  private static int findPrimeNum(ArrayList<Integer> fullList){
 

    for(int i = fullList.size()-1; i > 0; i--){
      int num = fullList.get(i);
        boolean flag = false;
        for(int j = 2; j <= num/2; j++){
            // condition for nonprime number
            if(num % j == 0){
                flag = true;
                break;
            }
        }
        if (!flag){
            return num;
        }

    }

      return 0;
    }//end of find prime number
    
    
}