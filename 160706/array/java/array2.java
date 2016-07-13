import java.util.ArrayList;

public class array2{
  public static void main(String[] args){
    ArrayList input_array = new ArrayList();
    input_array.add(1);
    input_array.add(2);
    ArrayList a1 = new ArrayList();
    a1.add(2);
    a1.add(3);
    ArrayList a2 = new ArrayList();
    a2.add(3);
    a2.add(4);
    a2.add(5);
    input_array.add(a1);
    input_array.add(a2);

    ArrayList result_array = new ArrayList();
    ArrayList output_array = new ArrayList();
    flatten((ArrayList)input_array,result_array);
    System.out.println(result_array);
  }

  public static void flatten(ArrayList input_array, ArrayList result_array){
    for(int i = 0; i < input_array.size(); i++){
      if(input_array.get(i) instanceof ArrayList){
        flatten((ArrayList)input_array.get(i),result_array);
      }else{
        result_array.add(input_array.get(i));
      }
    }
  }
}