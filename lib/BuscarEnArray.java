import java.util.Scanner;
public class BuscarEnArray{
    public static void main(String[]args){  
        //cridar a llegirArray passant-li ‘numeros’.
        int [] numeros = new int[7];
        llegirArray(numeros);

         /*Debug */
        imprimirArray(numeros);

        //cridar a llegirEnter i guardar el resultat en ‘numBuscat’.
        int numBuscat;
        numBuscat = llegirEnter();

        //cridar a buscarCoincidencia passant-li ‘numeros’ i ‘numBuscat’, i guardant el resultat en ‘posTrobat’.
        int posTrobat;
        posTrobat = buscarCoincidencia(numBuscat, numeros);

        //cridar a imprimirMissatge passant-li ‘posTrobat’.
        imprimirMissatge(posTrobat);
    }

        /*llegirArray: 
        Donat un array, llegeix 7 números enters i els guarda dins d’ell.*/
        public static void llegirArray (int[] unArray){ 
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < unArray.length; i++){
                unArray[i] = sc.nextInt();
            }
            return;
        }

        /*llegirEnter: 
        Llegeix un número des de l’entrada i el retorna com a resultat.*/
        public static int llegirEnter(){
            return 1;

        }

        /*buscarCoincidencia :
        Donats un número i un array, busca el número donat dins de l’array donat.
        Si el troba retorna la posició en què l'ha trobat. Si no el troba retorna -1.*/
        public static int buscarCoincidencia(int n, int[] unArray){
            return -1;
    
        }

        /*imprimirMissatge: *
        Si la cridem amb l'argument -1  imprimeix el missatge «No hi és».
        Si a la funció li passem qualsevol altre número, imprimeix el missatge 
        «S’ha trobat a la posició x» (Essent x el número passat a la funció)*/
        public static void imprimirMissatge(int p){
            return;
        }

        //Imprimir tots els elements d'un array
        public static void imprimirArray(int[] unArray){
            System.out.println("Elements del array");
            for(int x = 0; x < unArray.length; x++){
                System.out.println(unArray[x]);
            }
            return;
        }
}