public class string9{
  public static void main(String[] args){
    String input_string = "123456";
    print_char(input_string);
  }

  public static void print_char(String input_string){
    for(int i = 0; i < input_string.length(); i++){
      System.out.println(input_string.charAt(i));
    }    
  }
}