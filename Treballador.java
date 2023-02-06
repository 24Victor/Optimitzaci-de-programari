import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
/** 
 * @author Victor Zheng
 * @version 1.0
 * @since 30-01-2023
 */

    class Treballador { 

        @Test 
        public void testNomTreballadorIncorrecte() { 

            // Aquest test prova si el programa detecta que volem assignar un nom 
            // incorrecte i llença l'excepció que toca 
            // Noteu que per als objectes individuals de la classe Treballador i 
            // Exception podem triar els noms que ens done la gana, 
            // no cal fer-los coincidir amb els de les classes 
            Treballador treballadorMeu = new Treballador(); 

            // Codi per a provocar excepcions 
            Exception excepcioMeva = assertThrows(Exception.class, () -> treballadorMeu.setNom(""));

            // L'assercio mira si el text de l'excepció avisa del problema de nom curt 
            assertEquals("El nom ha de tenir 3 o més caracters", 
                excepcioMeva.getMessage()); 
        } 
        @Test
        public void testNomTreballadorCorrecte() { 

            String nomTest = "Montsià"; 
            Treballador treballador = new Treballador(); 

            // Assignem un nom, com el mètode setNom pot produir excepcions ha d'anar en un 
            // bloc try catch 
            // A diferencia del cas anterior, aquí no estem provocant l'excepció a propòsit, 
            // sino que és el tractament 
            // habitual de les excepcions, ja ho veureu en M3 
            try { 
            treballador.setNom(nomTest); 
            } catch (Exception e) { 
            // Si es produeix una excepcio, el bloc catch la captura i mostra per pantalla, 
            // així el programa no peta 
            System.out.println(e.getMessage()); 
            } 
            ; 

            // L'assercio comprova que el nom és correcte i en cas contrari mostraria el 
            // missatge d'error 
            assertEquals(nomTest, treballador.getNom(), "Els noms han de coincidir!!!"); 
            } 

        @Test 
        public void testNomina() { 

            float nomina = 2300; 
            Treballador treballador = new Treballador(); 

            // Assignem una nomina, com aquest mètode no provoca excepcions no necessitem el 
            // bloc try-catch 
            treballador.setNomina(nomina); 
            
            /* 
            * L'asserció comprova que la nomina és correcta i en cas contrari * mostra missatge d'error 
            */ 
            assertEquals(nomina, treballador.getNomina(), "Els dos valors de la nomina han de coincidir!!!"); 
        } 

        @Test 
        public void testHoresExtres() { 

            int horesExtres = 5;
            Treballador treballador = new Treballador(); 

            treballador.setHoresExtres(horesExtres);

            assertEquals(horesExtres, treballador.getHoresExtres(), "Els dos valors de la nomina han de coincidir!!!");
            
        } 

        @Test 
        public void testTipusTreballadorIncorrecte() { 

            int tipusTreballador = 8;
            Treballador treballador = new Treballador();

            treballador.setTipusTreballador(tipusTreballador)

            assertEquals(tipusTreballador, treballador.getTipusTreballador(), "Els dos valors de la nomina han de coincidir!!!")
        } 

        @Test 
        public void testTipusTreballadorCorrecte() { 

            int TipusTreballadorCorrecte = 10;
            Treballador treballador = new Treballador();

            treballador.setTipusTreballadorCorrecte(tipus)
            assertEquals(tipusTreballadorCorrecte, treballador.setTipusTreballadorCorrecte(), "Els dos valors de la nomina han de coincidir!!!")
        } 
        } 
    