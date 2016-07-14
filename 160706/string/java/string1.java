public class string1{
  public static void main(String[] args){
    String input_string = "abcdecfgcijk";
    String str = "c";
    string_to_array(input_string,str);
  }

  public static void string_to_array(String input_string,String str){
    String [] output_array = input_string.split(str);
    print_array(output_array);
  }
  
  public static void print_array(String [] a){
    String print_str = "[";
    for(int i = 0; i < a.length; i++){
      if(i == a.length - 1){
        print_str = print_str + a[i] + "]";
      }else{
        print_str = print_str + a[i] + ",";
      }
    }
    System.out.println(print_str);
  }
}