import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file_one_to_five{
  public static void main(String[] args){
    String filename1 = "test1.txt";
    String str = "123";
    System.out.println("====第1题====");
    file1(filename1,str);
    System.out.println("====第2题====");
    file2(filename1);
    System.out.println("====第3题====");
    file3(filename1);
    String filename2 = "test4.txt";
    int n = 5;
    System.out.println("====第4题====");
    file4(filename2,n);
    String filename3 = "test5.txt";
    System.out.println("====第5题====");
    file5(filename3);
  }

  public static void file1(String filename, String str){
    try{
      String filePath = filename;
      File filePath1 = new File(filePath.toString());
      if(!filePath1.exists()){
        filePath1.createNewFile();
      }
      FileWriter writeFile = new FileWriter(filePath1);
      PrintWriter resualtFile = new PrintWriter(writeFile);
      resualtFile.println(str);
      writeFile.close();

      System.out.println("创建成功");
    } catch(Exception e){
      System.out.println("新建目录操作出错");
      e.printStackTrace();
    }
  }

  public static void file2(String filename){
    File file = new File(filename);
    BufferedReader reader = null;
    try{
      reader = new BufferedReader(new FileReader(file));
      String getString = null;
      int line = 1;
      while((getString = reader.readLine()) != null){
        System.out.println(getString);
        line++;
      }
      reader.close();
    } catch(IOException e){
      e.printStackTrace();
    } finally{
      if(reader != null){
        try{
          reader.close();
        } catch(IOException e1) {

        }
      }
    }
  }

  public static void file3(String filename){
    try{
      File filePath = new File(filename.toString());
      if(!filePath.exists()){
        System.out.println("不存在");
      }else{
        System.out.println("存在");
      }
    } catch(Exception e){
      System.out.println("出错了");
      e.printStackTrace();
    }
  }

  public static void file4(String filename,int n){
    try{
      File filePath4 = new File(filename.toString());
      if(!filePath4.exists()){
        filePath4.createNewFile();
      }
      FileWriter writeFile = new FileWriter(filePath4);
      PrintWriter resualtFile = new PrintWriter(writeFile);
      String content = "";
      if(n > 1){
        for(int i = 1; i <= n; i++){
          content += (Integer.toString(i)+"\n");
        }
      }else{
        for(int i = 1; i >= n; i--){
          content += (Integer.toString(i)+"\n");
        }
      }
      resualtFile.println(content);
      writeFile.close();

      System.out.println("创建成功");
    } catch(Exception e){
      System.out.println("出错了");
      e.printStackTrace();
    }
  }

  public static void file5(String filename){
    try{
      File filePath5 = new File(filename.toString());
      if(!filePath5.exists()){
        filePath5.createNewFile();
      }
      FileWriter writeFile = new FileWriter(filePath5);
      PrintWriter resualtFile = new PrintWriter(writeFile);
      writeFile.close();
    } catch(Exception e){
      System.out.println("出错了");
      e.printStackTrace();
    }

    System.out.println("创建成功 5秒后删除");

    try {
      Thread.currentThread().sleep(5000);
    } catch(Exception e){

    }

    try{
      File deleteFile = new File(filename.toString());
      deleteFile.delete();
    } catch(Exception e){
      System.out.println("出错了");
      e.printStackTrace();
    }

    System.out.println("已删除");
  } 
} 