public class math_1_5{
  public static void main(String[] args){
    int input_number = 1652;
    int length = math1(input_number);
    System.out.println("====第1题====");
    System.out.println(length);
    System.out.println("====第2题====");
    math2(input_number);
  }

  public static Integer math1(int input_number){
    String input_str = String.valueOf(input_number);
    return input_str.length();
  }

  public static void math2(int input_number){
    String input_str = String.valueOf(input_number);
    for(int i = input_str.length() - 1; i >= 0; i--){
      System.out.println(input_str.charAt(i));
    }
  }
}