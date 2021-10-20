import java.util.Random;

class Main{
    public static void main(String[] args) {
    int[][][] arr = create_array(3);
    for(int i = 0; i < 15; i++){
            //System.out.println(arr[i][0][0]);
        /*for(int j = 0; j < 15; j++){
            for(int c = 0; i < 15; c++){
                //System.out.println(arr[i][j][c]);
            }
        }*/
    }

  }

  //method to create array
  private static int[][][] create_array(int amount){
    Random rd = new Random(); // create random object
    int max = 50;
    int min = 0;
    int[] arr1 = new int[15]; // create int depending on amount
    int[] arr2 = new int[15];
    int[] arr3 = new int[15];
    for(int i = 0; i < arr1.length; i++){
      arr1[i] = rd.nextInt((max-min)+1)+min;
      arr2[i] = rd.nextInt((max-min)+1)+min;
      arr3[i] = rd.nextInt((max-min)+1)+min;
      //System.out.println(i);
    }
    System.out.println("--------------------------arr1");
    for(int i = 0; i < arr1.length; i++){
        System.out.println(arr1[i]); 
        System.out.println("i: " + i);
      }
      System.out.println("--------------------------arr2");
    for(int i = 0; i < arr1.length; i++){
        System.out.println(arr1[i]);
        System.out.println("i: " + i); 
    }
    System.out.println("--------------------------arr3");
    for(int i = 0; i < arr1.length; i++){
        System.out.println(arr1[i]);
        System.out.println("i: " + i); 
    }

    int[][][] finArr = {{arr1},{arr2},{arr3}};
    return finArr;
  }
}