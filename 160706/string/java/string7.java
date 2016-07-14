public class string7{
  public static void main(String[] args){
    String input_string = "123456";
    int n = 2;
    get_new_string(input_string,n);
  }

  public static void get_new_string(String input_string,int n){
    String output_string = "";
    for(int i = 0; i < input_string.length(); i++){
      int k = i - n;
      if(k < 0){
        k = input_string.length() + k;
      }
      output_string += input_string.charAt(k);
    }
    System.out.println(output_string);
  }
}