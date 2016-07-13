public class array3{
  public static void main(String[] args){
    int[] a = {1,2,3};
    reverse_print_number(a);
  }

  public static void reverse_print_number(int[] a){
    reverse(a);
    for(int i = 0; i < a.length; i++){
      System.out.println(a[i]);
    }
  }

  public static void reverse(int[] array){
    for(int i = 0; i < array.length; i++){
      for(int j = 0;j < array.length - i - 1; j++){
        if(array[j] < array[j + 1]){
          int number = array[j + 1];
          array[j + 1] = array[j];
          array[j] = number;
        }
      }
    }
  }
}