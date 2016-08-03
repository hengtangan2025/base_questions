import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class file_six_to_ten{
  public static void main(String[] args) throws IOException{
    System.out.println("====第6题====");
    String path = "test1.txt";
    file6(path);
    System.out.println("====第7题====");
    file7("j1","j2");
    System.out.println("====第8题====");
    file8("../java");
    System.out.println("====第9题====");
    file9("../java/test1.txt");
    System.out.println("====第10题====");
    file10("test10.txt","10");
  }

  public static void file6(String path){
    File file = new File(path);
    if(file.exists() && file.isFile()){
      long size = file.length() - 1;
      System.out.println(size);
    }else{
      System.out.println("null");
    }
  }

  public static void file7(String a,String b) throws IOException{
    String a_content = write_two_file_together(a,"");
    String a_and_b_content = write_two_file_together(b,a_content);
    FileWriter writeFile = new FileWriter("fout");
    PrintWriter resualtFile = new PrintWriter(writeFile);
    resualtFile.println(a_and_b_content);
    writeFile.close();
  }

  public static String write_two_file_together(String filename,String string){
    File file = new File(filename);
    BufferedReader reader = null;
    try{
      reader = new BufferedReader(new FileReader(file));
      String getcontent = null;
      int line = 1;
      while((getcontent = reader.readLine()) != null){
        string += getcontent + "\n";
        line++;
      }
      reader.close();
      return string;
    } catch(IOException e){
      e.printStackTrace();
    } finally{
      if(reader != null){
        try{
          reader.close();
        } catch(IOException e1){

        }
      }
    }
    return filename;
  }

  public static void file8(String folderpath){
    try{
      File file = new File(folderpath);
      if(file.exists()){
        System.out.println("存在");
      }else{
        System.out.println("不存在");
      }
    } catch(Exception e){
      System.out.println("出错了");
      e.printStackTrace();
    }
  }

  public static void file9(String path){
    List<String> str_array = new ArrayList();
    try{
      String str = "pwd " + path;
      Process process = Runtime.getRuntime().exec(str);
      InputStreamReader ir = new InputStreamReader(process.getInputStream());
      LineNumberReader input = new LineNumberReader(ir);
      String line;
      int exitValue = process.waitFor();
      if(0 != exitValue){
        System.out.println("出错了" + exitValue);
      }else{
        while((line = input.readLine()) != null){
          System.out.println(line);
          str_array.add(line);
        }
      }
    } catch(Throwable e){
      System.out.println("出错了" + e );
    }
  }

  public static void file10(String filename,String str){
    try{
      String filePath = filename;
      File filePath10 = new File(filePath.toString());
      if(!filePath10.exists()){
        filePath10.createNewFile();
      }
      FileWriter writeFile = new FileWriter(filePath10);
      PrintWriter resualtFile = new PrintWriter(writeFile);
      resualtFile.println(str);
      writeFile.close();

      System.out.println("创建成功");
    } catch(Exception e){
      System.out.println("新建目录操作出错");
      e.printStackTrace();
    }

    System.out.println("等待5秒后删除");
    try{
      Thread.currentThread().sleep(5000);
    } catch(Exception e){

    }

    try{
      File deleteFile = new File(filename);
      deleteFile.delete();
      System.out.println("已删除");
    } catch(Exception e){
      System.out.println("删除时出错了");
      e.printStackTrace();
    }
  }
}