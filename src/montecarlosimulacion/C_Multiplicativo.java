/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlosimulacion;

/**
 *
 * @author Hans Gomez
 */
public class C_Multiplicativo {
    //int a=5;
    //int xn=4;
    //int mod= 8;
    double arreglo1[] = new double[20000];
    boolean booleano[] = new boolean[20000];

    double Xi[] = new double[20000];
    double Yi [] = new double [20000];
    
    public void Multiplicativo(int a, int X0, int mod) {
        if (X0 > 0 && a > 0 && mod > 0) {
            double convertir;
            if (a != X0) {
                for (int i = 1; i <= mod; i++) {
                    X0 = (X0 * a) % mod;
                    convertir = (double) X0 / mod;
                    Xi[i] = convertir;
                    X0 = (X0 * a) % mod;
                    convertir = (double) X0 / mod;
                    Yi[i] = convertir;
                    
                     if(Yi[i] < Math.pow(Xi[i], 2)){
                        booleano[i]=true;
                    }
                    else{
                        booleano[i]=false;
                    }
                    System.out.println(Xi[i] + "  "+ Yi[i] + "  "+booleano[i]);
                   
                }
            } else {
                System.out.println("La semilla es igual a A");
            }
        } else {
            System.out.println("Los valores tienen que ser mayores que 0 Enteros");
        }
    }
}
