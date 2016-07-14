public class string4{
  public static void main(String[] args){
    String input_string = "123456";
    get_new_string(input_string);
  }

  public static void get_new_string(String input_string){
    String output_string = "";
    for(int i = input_string.length() - 1 ; i >= 0; i--){
      output_string += input_string.charAt(i);
    }
    System.out.println(output_string);
  }
}