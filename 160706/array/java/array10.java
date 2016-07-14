import java.util.ArrayList;
public class array10{
  public static void main(String[] args){
    ArrayList a1 = new ArrayList();
    a1.add("a");
    a1.add("b");
    a1.add("c");
    ArrayList a2 = new ArrayList();
    a2.add("b");
    a2.add("c");
    a2.add("d");
    array_merge(a1,a2);
  }

  public static void array_merge(ArrayList a1,ArrayList a2){
    ArrayList merge_array = new ArrayList();
    for(int i = 0; i < a1.size(); i++){
      merge_array.add(a1.get(i));
    }

    for(int j = 0; j < a2.size(); j++){
      merge_array.add(a2.get(j));
    }
    
    System.out.println(merge_array);
  }
}