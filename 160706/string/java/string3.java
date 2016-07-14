public class string3{
  public static void main(String[] args){
    String input_string = "123";
    int n = 3;
    get_new_string(input_string,n);
  }

  public static void get_new_string(String input_string,int n){
    String output_string = "";
    for(int i = 0; i < n; i++){
      output_string += input_string;
    }
    System.out.println(output_string);
  }
}