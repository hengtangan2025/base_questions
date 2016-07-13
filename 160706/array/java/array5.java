public class array5{
  public static void main(String[] args){
    int[] a = {2,3,1,5,4,7,0};
    sort(a);
    print_reverse_array(a);
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

  public static void print_reverse_array(int[] a){
    String print_str = "[";
    for(int i = 0; i < a.length; i++){
      if(i == a.length - 1){
        print_str = print_str + a[i] + "]";
      }else{
        print_str = print_str + a[i] + ",";
      }
    }
    System.out.println(print_str);
  }
}