import java.util.ArrayList;
import java.util.Arrays;
public class array10{
  public static void main(String[] args){
    String[] a = { "a", "b", "d" , "e"};
    String[] b = { "d", "e", "f" };
    String[] c = new String[a.length + b.length];
    array_merge(a,b,c);
  }

  public static void array_merge(String[] a,String[] b,String[] c){
    for (int i = 0; i < a.length; i++) {
     c[i] = a[i];
    }

    for (int j = 0; j < b.length; j++) {
     c[a.length + j] = b[j];
    }
    Arrays.sort(c);
    ArrayList output_array = new ArrayList();
    output_array.add(c[0]);
    for(int k = 1; k < c.length; k++) {
      if(c[k] != c[k - 1]){
        output_array.add(c[k]);
      }
    }

    System.out.println(output_array);
  }
}