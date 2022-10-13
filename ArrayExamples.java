

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int[] copiedArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) { // just copying the number over
      // ex. (4, 3, 2, 1) = 4 gets replaced with idx 3 (1), 3 gets replaced 
      // with 2, so (1, 2, ) but then 2 is just copied over and 1 is also 
      // kept in the same spot. so (1, 2, 2, 1)
      arr[i] = arr[arr.length - i - 1];
    }
    for (int j = 0; j < arr.length; j += 1){
      arr[j] = copiedArray[j];
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }


}

