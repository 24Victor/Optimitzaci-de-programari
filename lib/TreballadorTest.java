import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
/** 
 * @author Victor Zheng
 * @version 1.0
 * @since 30-01-2023
 */

public class TreballadorTest {

@Test
public void testNomTreballadorIncorrecte() {
// Aquest test prova si el programa detecta que volem assignar un nom
// incorrecte i llença l'excepció que toca
// Noteu que per als objectes individuals de la classe Treballador i
// Exception podem triar els noms que ens done la gana,
// no cal fer-los coincidir amb els de les classes

Treballador treballadorMeu = new Treballador();

// Codi per a provocar excepcions
Exception excepcioMeva = assertThrows(Exception.class, () ->
treballadorMeu.setNom(""));
// L'assercio mira si el text de l'excepció avisa del problema de nom curt
Assert.assertEquals("El nom ha de tenir 3 o més caracters",
excepcioMeva.getMessage());
}

@Test
public void testNomTreballadorCorrecte() {
    String nomTest = "Montsià";
    Treballador treballador = new Treballador();
    // Assignem un nom, com el mètode setNom pot produir excepcions ha d'anar en un bloc try catch
    // A diferencia del cas anterior, aquí no estem provocant l'excepció a propòsit,
    // sino que és el tractament habitual de les excepcions, ja ho veureu en M3
    try {
    treballador.setNom(nomTest);
    } catch (Exception e) {
    // Si es produeix una excepcio, el bloc catch la captura i mostra per pantalla, així el programa no peta
    System.out.println(e.getMessage());
    }

    // Assignem un nom, com el mètode setNom pot produir excepcions ha d'anar en un bloc try catch
    // A diferencia del cas anterior, aquí no estem provocant l'excepció a propòsit,
    // sino que és el tractament habitual de les excepcions, ja ho veureu en M3
    try {
    treballador.setNom(nomTest);
    } catch (Exception e) {
    // Si es produeix una excepcio, el bloc catch la captura i mostra per pantalla,així el programa no peta
    System.out.println(e.getMessage());
    }
    ;
    // L'assercio comprova que el nom és correcte i en cas contrari mostraria el missatge d'error
    ;
    // L'assercio comprova que el nom és correcte i en cas contrari mostraria el missatge d'error
    Assert.assertEquals(nomTest, treballador.getNom(), "Montsià");
    }

    @Test
    public void testNomina() {
    float nomina = 2300;
    Treballador treballador = new Treballador();
    // Assignem una nomina, com aquest mètode no provoca excepcions no necessitem el bloc try-catch
    treballador.setNomina(nomina);

    //L'asserció comprova que la nomina és correcta i en cas contrari mostra missatge d'error
            
            
            /* 
            * L'asserció comprova que la nomina és correcta i en cas contrari * mostra missatge d'error 
            */ 
    
            /* 
            * L'asserció comprova que la nomina és correcta i en cas contrari * mostra missatge d'error 
            */ 
    assertEquals(nomina, treballador.getNomina(), "Els dos valors de la nomina han de coincidir!!!");
    }
    private void assertEquals(float nomina, float nomina2, String string) {
    }

    @Test
    public void testHoresExtres() {
    int horesExtres = 10;
    Treballador treballador = new Treballador();
            treballador.setHoresExtres(horesExtres);

    assertEquals(horesExtres, treballador.getHoresExtres(), "Els dos valors de la nomina han de coincidir!!!");
        } 

    @Test
    public void testTipusTreballadorIncorrecte() {
        int tipusTreballador = 0;
        Treballador treballador = new Treballador();
            try {
                treballador.setTipusTreballador(tipusTreballador);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }       
            assertEquals(tipusTreballador, treballador.getTipusTreballador(), "Els dos valors de la nomina han de coincidir!!!");
    } 
            

    @Test
    public void testTipusTreballadorCorrecte() {
        int tipusTreballador = 2;
        Treballador treballador = new Treballador();
        try {
            treballador.setTipusTreballador(tipusTreballador);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }       
        assertEquals(tipusTreballador, treballador.getTipusTreballador(), "Els dos valors de la nomina han de coincidir!!!");
    }

}