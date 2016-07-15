import java.util.HashMap;

public class array8{
  public static void main(String[] args){
    int[] a = {1,2,3,4,5,6};
    array_to_hash(a);
  }

  public static void array_to_hash(int[] a){
    HashMap hash = new HashMap();
    for(int i = 0; i < a.length; i++){
      if(i%2 == 0){
        hash.put(a[i],a[i + 1]);
      }
    }
    System.out.println(hash);
  }
}