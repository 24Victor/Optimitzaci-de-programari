import static org.junit.Assert.assertEquals;
import org.junit.Test;
/** 
 * @author Victor Zheng
 * @version 1.0
 * @since 30-01-2023
 */
public class CheckNumberTest {
       
    @Test
    public void testValorPositiu(){
        CheckNumber check = new CheckNumber(50);
        double val = check.comprovaSigne();
        assertEquals(1.0, val, 0.0);
    }
    @Test
    public void testValorNegatiu(){
        CheckNumber check = new CheckNumber(-30);
        double val = check.comprovaSigne();
        assertEquals (-1.0, val,0.0);
    }
    @Test
    public void testValorZero(){
        CheckNumber check = new CheckNumber(0);
        double val = check.comprovaSigne();
        assertEquals(0.0, val, 0.0);
    }
}