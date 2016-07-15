import java.util.HashMap;

public class array7{
  public static void main(String[] args){
    int[] a = {1,2,3,2,1,3,4,4,3,6,7,8,9,4,3,6};
    print_number_sum_hash(a);
  }
  public static void print_number_sum_hash(int[] a){
    HashMap hash = new HashMap();
    for(int i = 0; i < a.length; i++){
      int number_sum = 0;
      for(int j = 0; j < a.length; j++){
        if(a[i] == a[j]){
          number_sum++;
        }
      }

      hash.put(a[i],number_sum);
    }
    System.out.println(hash);
  }
}