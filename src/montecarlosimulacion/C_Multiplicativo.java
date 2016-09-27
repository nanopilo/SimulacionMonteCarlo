/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlosimulacion;

import java.text.DecimalFormat;

/**
 *
 * @author Hans Gomez
 */
public class C_Multiplicativo {
    //int a=3;
    //int xn=17;
    //int mod=100;
    
    double Xi[] = new double[20000];
    double Yi [] = new double [20000];
    boolean booleano[] = new boolean[20000];
    DecimalFormat df = new DecimalFormat("0.0000"); 
    private int coeficienteA,coeficienteB,coeficienteC ;
    private int exponencialX;
    private int valorX;
    private String cadenaPolinomio;

    public int getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(int coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public int getCoeficienteB() {
        return coeficienteB;
    }

    public void setCoeficienteB(int coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public int getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteC(int coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    public int getExponencialX() {
        return exponencialX;
    }

    public void setExponencialX(int exponencialX) {
        this.exponencialX = exponencialX;
    }

    public int getValorX() {
        return valorX;
    }

    public void setValorX(int valorX) {
        this.valorX = valorX;
    }
    
    public void Multiplicativo(int a, int X0, int mod) {
        cadenaPolinomio=""+coeficienteA+"("+valorX+")^"+exponencialX+"+"+coeficienteB+"("+valorX+")"+coeficienteC+"";
        System.out.println(cadenaPolinomio);
        double X1=(double)X0/100;
        if (X0 > 0 && a > 0 && mod > 0) {
           
            if (a != X0) {
              System.out.println("    "+"X2"+"     "+"Y");
                for (int i = 1; i <= mod; i++) {
                    
                    X0 = (X0 * a) % mod;
                    double convertir = (double) X0 / mod;
                    Xi[i] = Math.pow(convertir, 2);
                    
                    X0 = (X0 * a) % mod;
                    convertir = (double) X0 / mod;
                    Yi[i] = convertir;
                    
                    if(Yi[i]<Xi[i]){
                        booleano[i]=true;
                        //se agrega a los puntos debajo de la curva
                    }else{
                        booleano[i]=false;
                        //se agrega a los puntos encima de la curva

                    }
                    if (X1 !=convertir){
                           
//                           if(i%2==0){
//                               Xi[i]=convertir;
//                           }
//                           else{
//                               Yi[i]=convertir;
//                           }
                        
                        System.out.println("  "+df.format(Xi[i])+"   "+Yi[i]+ "  "+booleano[i]);
                       
                       }else{
                           System.out.println("No tiene periodo maximo");
                           break;
                       }
                }
               
                }else {
            System.out.println("IGUALDAD");
        
            }
        
        } else {
            System.out.println("LOS VALORES TIENEN QUE SER MAYOR A 0");
}
}
    
}
