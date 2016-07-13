public class array1{
  public static void main(String[] args){
    int[] a = {1,2,3};
    print_reverse_array(a);
  }

  public static void print_reverse_array(int[] a){
    String print_str = "[";
    for(int i = 0; i < a.length; i++){
      if(i == a.length - 1){
        print_str = print_str + a[a.length - i - 1] + "]";
      }else{
        print_str = print_str + a[a.length - i - 1] + ",";
      }
    }
    System.out.println(print_str);
  }
}

