public class number4{
  public static void main(String[] args){
    int n = 101;
    int m = 103;
    print_number(n,m);
  }

  public static void print_number(int n,int m){
    if(n >= m){
      for(int i = m; i <= n; i++){
        System.out.println(i);
      }
    }else{
      for(int j = n; j <= m; j++){
        System.out.println(j);
      }
    }
  }
}