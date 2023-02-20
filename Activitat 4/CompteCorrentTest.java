import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
/** 
 * @author Victor Zheng
 * @version 1.0
 * @since 30-01-2023
 */

public class CompteCorrentTest {
    private int saldo;
    private String contrasenya;
    // Constructor
    public void CompteCorrent(int saldoInicial, String cs) {
        this.saldo = saldoInicial;
        this.contrasenya = cs;
    }
    
    // Rebem els diners
    public int diposita(int pasta) {
        // COMPLETAR
    }
        // Si la contrasenya és correcta i tenim prou diners, els restem del
        saldo i
        // retornem el valor de la pasta que hem retirat.
        // Si no tenim prou saldo, retornem un -1.
        // Si la contrasenya no és correcte, retornem un -2.

    public int retira(int pasta, String cs) {
        // COMPLETAR    
    }

    // Retornem el saldo
    public int getSaldo(String cs) {
        // COMPLETAR
    }

    // Modifiquem la contrasenya, retornem 0 si va bé i -2 si l’antiga és
    incorrecta

    public int setContrasenya(String antiga, String nova) {
        // COMPLETAR
    }
}