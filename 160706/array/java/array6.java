import java.util.Random; 

public class array6{
  public static void main(String[] args){
    int[] a = {1,2,3,4,5,6};
    print_random_array(a);
  }

  public static void print_random_array(int[] a){
    for(int i = 0; i < a.length; i++){
      Random rand = new Random();
      int randnum = rand.nextInt(i + 1);
      int number = a[randnum];
      a[randnum] = a[i];
      a[i] = number;
    }
    print_array(a);
  }

  public static void print_array(int[] a){
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