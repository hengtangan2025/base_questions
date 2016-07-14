public class number10{
  public static void main(String[] args){
    int n = 4;
    int m = 2;
    print_trapezoid(n,m);
  }

  public static void print_trapezoid(int n,int m){
    String str = "";
    if(n >= m){
      for(int i = 0; i <= m; i++){
        str += "x";
      }

      for(int j = m; j <= n; j++){
        System.out.println(str);
        str += "x";
      }
    }else{
      for(int i = 0; i <= n; i++){
        str += "x";
      }

      for(int j = n; j <= m; j++){
        System.out.println(str);
        str += "x";
      }
    }
  }
}