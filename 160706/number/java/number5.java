public class number5{
  public static void main(String[] args){
    int n = 200;
    print_number(n);
  }

  public static void print_number(int n){
    for(int i = 2; i <= n; i++){
      int k = 0;
      for(int j = 1; j <= (int)Math.sqrt(i); j++){
        if(i%j == 0){
          k = k + 1;
          if(k == 2){
            break;
          }
        }
      }

      if(k == 1){
        System.out.println(i);
      }
    }
  }
}