public class CompteCorrent {
    private int saldo;
    private String contrasenya;
    // Constructor
    public CompteCorrent(int saldoInicial, String cs) {
        this.saldo = saldoInicial;
        this.contrasenya = cs;
    }

    // Rebem els diners
    public int diposita(int pasta) {
        this.saldo = this.saldo + pasta;
        return this.saldo;
    }

    // Si la contrasenya és correcta i tenim prou diners, els restem del saldo i retornem el valor de la pasta que hem retirat.
    // Si no tenim prou saldo, retornem un -1.
    // Si la contrasenya no és correcte, retornem un -2.
    public int retira(int pasta, String cs) {
        if (this.contrasenya.equals(cs) && this.saldo >= pasta) {
            this.saldo = this.saldo - pasta;
            return pasta;
        } else if (!this.contrasenya.equals(cs)) {
            return -2;
        } else {
            return -1;
        }
    }

    // Retornem el saldo
    public int getSaldo(String cs) {
        if (this.contrasenya.equals(cs)) {
            return this.saldo;
        } else {
            return -2;
        }
    }

    // Modifiquem la contrasenya, retornem 0 si va bé i -2 si l’antiga és incorrecta
    public int setContrasenya(String antiga, String nova) {
        if (this.contrasenya.equals(antiga)) {
            this.contrasenya = nova;
            return 0;
        } else {
            return -2;
        }
    }

    public String getContrasenya() {
        return this.contrasenya;
    }
}