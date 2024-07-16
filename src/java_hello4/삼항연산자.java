package java_hello4;

public class 삼항연산자 {
   public static void main(String[] args) {
      
      //삼항연산자
      int result= true?1:0; //true면 앞에꺼
      System.out.println(result);
      
      result= false?1:0; //false면 뒤에꺼
      System.out.println(result);
      
      result=(1>10)?1:0;
      System.out.println(result);
      
      boolean bool=(1>10)?true:false;
      System.out.println(bool);
      
      bool=(1<10)?true:false;
      System.out.println(bool);
      

   }
}
