import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class string10{
  public static void main(String[] args){
    String  input_string  = "123456";
    String  n  = "[^12]+";
    String  n1 = "[7-9]+";
    System.out.println(get_string_index(input_string,n));
    System.out.println(get_string_index(input_string,n1));
  }

  public static Integer get_string_index(String input_string,String n){
    Pattern pattern =  Pattern.compile(n);
    Matcher matcher = pattern.matcher(input_string);
    if(matcher.find()){
      String match_str = matcher.group();
      return match_str.indexOf(match_str.charAt(0));
    }else{
      return -1;
    } 
  }
}