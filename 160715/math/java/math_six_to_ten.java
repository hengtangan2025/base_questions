public class math_six_to_ten{
  public static void main(String[] args){
    int input_number = 64;
    int n = 3;
    System.out.println("====第6题===="); 
    math6(input_number,n);
    int side_sum = 5;
    System.out.println("====第7题===="); 
    math7(side_sum);
  }

  public static Integer number_length(int input_number,int n){
    int get_number = 0;
    int a = 0;
    while(get_number < input_number){
      get_number = (int) Math.pow(n,a);
      a++;
    }
    return a - 1;
  }

  public static void math6(int input_number,int n){
    int number_sum = input_number;
    int output_number = 0;
    int length = number_length(input_number,n);

    for(int i = length; i >= 1; i--){
      int max_number = (int)Math.pow(n,i - 1);
      int xishu = number_sum/max_number;
      number_sum = number_sum % max_number;
      output_number += xishu * (int)Math.pow(10,i - 1);
    }

    System.out.println(input_number + "的" + n + "进制数是" + output_number); 
  }

  public static void math7(int n){
    double a = 2;
    System.out.println(a/Math.pow(2,n));
  }
}