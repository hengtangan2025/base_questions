public class math_one_to_five{
  public static void main(String[] args){
    int input_number = 1652;
    int times = 10;
    int score = 59;
    int months = 20;
    int length = math1(input_number);
    System.out.println("====第1题====");
    System.out.println(length);
    System.out.println("====第2题====");
    math2(input_number);
    System.out.println("====第3题====");
    math3(times);
    System.out.println("====第4题====");
    String score_level = math4(score);
    System.out.println(score_level);
    System.out.println("====第5题====");
    math5(months);
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

  public static void math3(int n){
    double last_bounce_height = 100*Math.pow(0.5,n);
    double bounce_height_sum = 100;
    for(int i = 1; i < n; i++){
      bounce_height_sum += 100*Math.pow(0.5,i)*2;
    }
    System.out.println("它在第" + n + "次落地时，共经过" + bounce_height_sum + "米,第" + n + "次反弹" + last_bounce_height + "米高");
  }

  public static String math4(int n){
    String output = n >= 90?"A":n >= 60?"B":"C";
    return output;
  }

  public static Integer rabbit_sum(int n){
    if(n == 1 || n == 2){
      return 1;
    }else{
      return rabbit_sum(n - 1) + rabbit_sum(n - 2);
    }
  }

  public static void math5(int n){
    int number = rabbit_sum(n);
    System.out.println("在" + n + "个月后，兔子的总数为" + number + "对");
  }
}