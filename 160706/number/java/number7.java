import java.util.ArrayList;

public class number7{
  public static void main(String[] args){
    int n = 20;
    ArrayList non_prime_number_array = new ArrayList();
    ArrayList prime_number_array = new ArrayList();
    quality_factor(n,non_prime_number_array,prime_number_array);
  }

  public static void quality_factor(int n,ArrayList a,ArrayList b){
    get_non_prime_number(n,a);
    get_prime_number(n,b);
    for(int i = 0; i < a.size(); i++){
      ArrayList prime_factorisation_array = new ArrayList();
      String prime_factorisation_str = (int)a.get(i) + "=";
      for(int j = 0; j < b.size(); j++){
        int non_prime_number = (int)a.get(i);
        int prime_number = (int)b.get(j);
        get_prime_factorisation(non_prime_number,prime_number,prime_factorisation_array);
      }
      for(int k = 0; k < prime_factorisation_array.size(); k++){
        if(k == prime_factorisation_array.size() - 1){
          prime_factorisation_str += prime_factorisation_array.get(k);
        }else{
          prime_factorisation_str += prime_factorisation_array.get(k) + "*";
        }
      }
      System.out.println(prime_factorisation_str);
    }
  }

  public static void get_prime_factorisation(int non_prime_number, int prime_number,ArrayList prime_factorisation_array){
    if(non_prime_number%prime_number == 0){
      prime_factorisation_array.add(prime_number);
      int next_number = non_prime_number/prime_number;
      int sum = 0;
      is_prime_number(next_number,sum);
      if(sum == 1){
        prime_factorisation_array.add(next_number);
      }else{
        get_prime_factorisation(next_number,prime_number,prime_factorisation_array);
      }
    }
  }

  public static void is_prime_number(int n, int k){
    for(int i = 2; i <= n; i++){
      if(n%i == 0){
        k = k + 1;
      }
    }
  }

  public static void get_prime_number(int n,ArrayList array){
    for(int i = 2; i <= n; i++){
      int k = 0;
      for(int j = 2; j <= i; j++){
        if(i%j == 0){
          k = k + 1;
        }
      }

      if(k == 1){
        array.add(i);
      }
    }
  }

  public static void get_non_prime_number(int n,ArrayList array){
    for(int i = 2; i <= n; i++){
      int k = 0;
      for(int j = 2; j <= i; j++){
        if(i%j == 0){
          k = k + 1;
        }
      }

      if(k != 1){
        array.add(i);
      }
    }
  }
}