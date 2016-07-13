public class array8{
  public static void main(String[] args){
    int[] a = {1,2,3,4,5,6};
    array_to_hash(a);
  }

  public static void array_to_hash(int[] a){
    String print_str = "{";
    for(int i = 0; i < a.length; i++){
      if(i%2 == 0){
        if(i == a.length - 2){
          print_str = print_str + a[i] + "=>" + a[i + 1] + "}";
        }else{
          print_str = print_str + a[i] + "=>" + a[i + 1] + ",";
        }
      }
    }
    System.out.println(print_str);
  }
}