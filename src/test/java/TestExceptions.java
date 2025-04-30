
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class TestExceptions {

        @Test
        public void exceptionAssert(){
            try{
                Assertions.assertTrue(false);
            } catch(AssertionFailedError e){
                e.printStackTrace();
                System.err.println("Исключение AssertionFailedError обработано");
            }
        }
        
        @Test
        public void exceptionNPE(){
            try{
                System.out.println((char[])null);
            } catch(NullPointerException e){
                e.printStackTrace();
                System.err.println("Исключение NullPointerException обработано");
            }
        }  
}
