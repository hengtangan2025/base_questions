public class string5{
  public static void main(String[] args){
    String a = "123456";
    String b = "1234567";
    print_longer_string(a,b);
  }

  public static void print_longer_string(String a, String b){
    int a_length = a.length();
    int b_length = b.length();
    if(a_length > b_length){
      System.out.println(a);
    }

    if(a_length < b_length){
      System.out.println(b);
    }

    if(a_length == b_length){
      System.out.println("两个字符串的长度相等");
    }
  }
}