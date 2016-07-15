public class number9{
  public static void main(String[] args){
    int n = 4;
    print_diamond(n);
  }

  public static void print_diamond(int n){
    int max_length = n*2 - 1;
    for(int i = 1; i <= max_length; i++){
      String right_str = "";
      String str = "";
      String left_str = "";
      int x_length;
      int blank_length;
      if(i <= n){
        x_length = i*2 - 1;
        blank_length = (max_length - x_length)/2;
      }else{
        x_length = (max_length - i)*2 + 1;
        blank_length = (max_length - x_length)/2;
      }


      for(int j = 1; j <= x_length; j++){
        str += "x";
      }
      for(int k = 1; k <= blank_length; k++){
        right_str += " ";
        left_str += " ";
      }

      System.out.println(left_str + str + right_str);
    }
  }
}