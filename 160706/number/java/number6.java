public class number6{
  public static void main(String[] args){
    int n = 20;
    print_number(n);
  }

  public static void print_number(int n){
    for(int i = 2; i <= n; i++){
      int k = 0;
      for(int j = 2; j <= i; j++){
        if(i%j == 0){
          k = k + 1;
        }
      }

      if(k != 1){
        System.out.println(i);
      }
    }
  }
}