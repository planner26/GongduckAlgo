

import java.util.Arrays;
import java.util.Comparator;

public class PG42746 {

  public static void main(String[] args) {

    int a = BSearch(new int[]{2, 3, 4, 5, 7, 8},7);

    System.out.println(a);
  }


  // 반복문을 이용
  static int BSearch(int arr[], int target) {
    int low = 0;
    int high = arr.length - 1;
    int mid;

    while (low <= high) {
      mid = (low + high) / 2;

      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

  // 재귀를 이용
  int BSearchRecursive(int arr[], int target, int low, int high) {
    if (low > high) {
      return -1;
    }

    int mid = (low + high) / 2;
    if (arr[mid] == target) {
      return mid;
    } else if (arr[mid] > target) {
      return BSearchRecursive(arr, target, low, mid - 1);
    } else {
      return BSearchRecursive(arr, target, mid + 1, high);
    }
  }

}


