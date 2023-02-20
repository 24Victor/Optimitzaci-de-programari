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
    Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1200, 0);
    Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 800, 0);
    Treballador treballador3 = new Treballador(null, Treballador.BASE,800, 10);

    Treballador[] treballadors = { treballador1, treballador2, treballador3};


    @Test
    public void testDirector() {
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1200, 0);
        Treballador trebllador2 = new Treballador(null, Treballador.SUBDIRECTOR, 800, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 800, 10);

        float expected = 1000 + 800 + 800 + (10 * 20);
        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);
        assertEquals(expected, resultat, 0.0);
    }
    
    @Test
    public void testSubdirector() {
       Treballador treballador3 = new Treballador(null, Treballador.BASE, 800, 10);
       float expected = 600 + (10 * 20);
       float resultat = CostPersonal.CostTreballador(treballador3);

       assertEquals(expected, resultat, 0.0);
    }

    @Test
    public void testBase() {
        Treballador treballador1 = new Treballador(null, Treballador.BASE, 800, 10);
        float expected1 = 800 + (10 * 20);
        float resultat1 = 1000;
        assertEquals(expected1, resultat1, 0.0);

        Treballador treballadors2;
        float resultat2 = 0;
        float expected2 = 0;
        assertEquals(expected2, resultat2, 0.0);

        Treballador []treballadors3 = { treballador1, treballador2, treballador3 };
        float resultat3 = 1200 + 800 + 800 + (10 * 20);
        float expected3 = 3000;
        assertEquals(resultat3, expected3, 0.0);

    }

    @Test
    public void testCalculaCostDelPersonal2(){
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1200, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 800, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE,800, 10);
    
        Treballador[] treballadors = { treballador1, treballador2, treballador3};

        float expected = 1000 + 800 + 800 + (10 * 20);
        float resultat = CostPersonal.CalculaCostDelPersonal2(treballadors);
        assertEquals(expected, resultat, 0.0);
    }
}

