public class number2{
  public static void main(String[] args){
    int n = 88;
    print_number(n);
  }

  public static void print_number(int n){
    if(n <= 100){
      for(int i = 100; i >= n; i--){
        System.out.println(i);
      }
    }else{
      for(int j = 100; j <= n; j++){
        System.out.println(j);
      }
    }
  }
}