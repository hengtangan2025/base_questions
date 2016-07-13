public class array4{
  public static void main(String[] args){
    int[] a = {2,3,1,5,4,7,0};
    sort_print_number(a);
  }

  public static void sort_print_number(int[] a){
    sort(a);
    for(int i = 0; i < a.length; i++){
      System.out.println(a[i]);
    }
  }

  public static void sort(int[] array){
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array.length - 1 - i; j++){
        if(array[j] > array[j + 1]){
          int number = array[j + 1];
          array[j + 1] = array[j];
          array[j] = number;
        }
      }
    }
  }
}