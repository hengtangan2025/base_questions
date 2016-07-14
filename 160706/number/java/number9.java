public class number9{
  public static void main(String[] args){
    int n = 4;
    print_square(n);
  }

  public static void print_square(int n){
    String str = "";
    String left_str = "";
    for(int i = 0; i <= n; i++){
      str += "x";
    }

    for(int i = 0; i < n; i++){
      System.out.println(left_str + str);
      left_str += " ";
    }
  }
}