import java.util.ArrayList;
public class array9{
  public static void main(String[] args){
    ArrayList output_array = new ArrayList();
    String[] a1 = {"a","b","c","d"};
    String[] a2 = {"c","d","e"};
    array_intersection(a1,a2,output_array);
    System.out.println(output_array);
  }

  public static void array_intersection(String[] a1,String[] a2,ArrayList output_array){
    for(int i = 0; i < a1.length; i++){
      for(int j = 0; j < a2.length; j++){
        if(a1[i] == a2[j]){
          output_array.add(a1[i]);
        }
      }
    }
  }
}