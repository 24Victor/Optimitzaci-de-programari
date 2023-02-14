import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
/** 
 * @author Victor Zheng
 * @version 1.0
 * @since 30-01-2023
 */
/** 
 * @author Victor Zheng
 * @version 1.0
 * @since 30-01-2023
 */

public class calculaCostPersonalTest {
    @Test
    public void testDirector() {
        int tipusTreballador = 0;
        Treballador treballador = new Treballador();
        
        try {
            treballador.setTipusTreballador(tipusTreballador);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertEquals(tipusTreballador, treballador.getTipusTreballador(), "Els dos valors de la nomina han de coincidir!!!");L
    }
    
    @Test
    public void testSubdirector() {

    }

    @Test
    public void testBase() {

    }
}

