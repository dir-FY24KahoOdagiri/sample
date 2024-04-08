package sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
     System.out.println("処理開始");
     
     try {
         //ここに例外が発生する可能性のあるコードを書きます
         System.out.println("割り算開始");
         int a = 10/0;
         System.out.println(a);
     }catch (ArithmeticException e ) {
         //ArtheticExceptionが発生した場合の処理を書きます
         System.out.println("AritheticEceptionが発生;"+e.getMessage());
     }finally{
         //例外の有無にかかわらず、実行されるコードを書きます（オプション）
         System.out.println("割り算終了");
     }
    
     System.out.println("処理終了");
     
         
    
     
         
         
     }
    }


