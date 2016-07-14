public class string2{
  public static void main(String[] args){
    String[] input_array = {"abc","decf","gci","jk"};
    array_to_string(input_array);
  }

  public static void array_to_string(String[] input_array){
    String output_str = "";
    for(int i = 0; i < input_array.length; i++){
      output_str += input_array[i];
    }
    System.out.println(output_str);
  }
}