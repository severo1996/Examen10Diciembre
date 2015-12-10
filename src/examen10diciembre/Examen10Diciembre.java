package examen10diciembre;

import javax.swing.JOptionPane;

public class Examen10Diciembre {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean p = false;    
     public static int PedirNumero(){                    
        
        return Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
       
     }
     public static int PedirNumerocontador(){
         return Integer.parseInt(JOptionPane.showInputDialog("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): "));
     } 
   
    public static void main(String arg[]) {
        int numero =PedirNumero();
        int ndig = 0;
        
        if(numero<=0){
        PedirNumerocontador();}
        
       
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
            numero = contador;

            if (numero == contador) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int counter = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (i % i1 == 0) {
                                counter++;
                            }
                            i1 += 2;
                            if (counter == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (counter == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
