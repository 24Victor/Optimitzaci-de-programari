import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
/** 
 * @author Victor Zheng
 * @version 1.0
 * @since 30-01-2023
 */

public class CompteCorrentTest {
    @Test
    public void testConstructor() {
        int saldoInicial = 100;
        String contrasenya = "contrasenya";
        CompteCorrent compte = new CompteCorrent(saldoInicial, contrasenya);
        assertEquals(saldoInicial, compte.getSaldo(contrasenya));
        assertEquals(contrasenya, compte.getContrasenya());
    }

    @Test
    public void testDepositaSinContrasenya() {
        int saldoInicial = 100;
        String contrasenya = "contrasenya";
        CompteCorrent compte = new CompteCorrent(saldoInicial, contrasenya);
        
        int cantidadDepositada = 50;
        compte.diposita(cantidadDepositada);
        
        int saldoEsperado = saldoInicial + cantidadDepositada;
        assertEquals(saldoEsperado, compte.getSaldo(contrasenya));
    }

    @Test
    public void testRetira() {
        int saldoInicial = 100;
        String contrasenya = "contrasenya";
        CompteCorrent compte = new CompteCorrent(saldoInicial, contrasenya);
            
        int cantidadRetirada = 50;
        String contrasenyaCorrecta = "contrasenya";
        String contrasenyaIncorrecta = "otraContrasenya";
            
        // Retirem cantiat valida amb contrasenya correcta
        int saldoEsperado = saldoInicial - cantidadRetirada;
        assertEquals(cantidadRetirada, compte.retira(cantidadRetirada, contrasenyaCorrecta));
        assertEquals(saldoEsperado, compte.getSaldo(contrasenyaCorrecta));
            
        // Intentem retirar cantitat invalida amb contrasenya correcta
        assertEquals(-1, compte.retira(saldoInicial + 1, contrasenyaCorrecta));
        assertEquals(saldoEsperado, compte.getSaldo(contrasenyaCorrecta));
            
        // Intentem retirar cantitat valida amb contrasenya incorrecta
        assertEquals(-2, compte.retira(cantidadRetirada, contrasenyaIncorrecta));
        assertEquals(saldoEsperado, compte.getSaldo(contrasenyaCorrecta));
    }

    @Test
    public void testGetSaldo() {
        int saldoInicial = 100;
        String contrasenya = "contrasenya";
        CompteCorrent compte = new CompteCorrent(saldoInicial, contrasenya);

        // Probem obtenir el saldo amb contrasenya correcta
        assertEquals(saldoInicial, compte.getSaldo(contrasenya));

        // Probem obtenir el saldo amb contrasenya incorrecta
        assertEquals(-2, compte.getSaldo("contrasenyaIncorrecta"));
    }

    @Test
    public void testSetContrasenya() {
        int saldoInicial = 100;
        String contrasenya = "contrasenya";
        CompteCorrent compte = new CompteCorrent(saldoInicial, contrasenya);
    
        // Canviem la contrasenya amb l'antiga contrasenya correcta
        String novaContrasenya = "novaContrasenya";
        assertEquals(0, compte.setContrasenya(contrasenya, novaContrasenya));
        assertEquals(novaContrasenya, compte.getContrasenya());
    
        // Intentem canviar la contrasenya amb l'antiga contrasenya incorrecta
        assertEquals(-2, compte.setContrasenya("contrasenyaIncorrecta", "novaContrasenya"));
        assertEquals(novaContrasenya, compte.getContrasenya()); // Verificar que la contraseña no se haigue actualizat
    }
}