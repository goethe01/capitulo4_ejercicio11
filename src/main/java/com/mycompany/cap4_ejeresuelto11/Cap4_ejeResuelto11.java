package com.mycompany.cap4_ejeresuelto11;
import java.util.Scanner;
public class Cap4_ejeResuelto11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("dame el primer valor");
        num1 = entrada.nextInt();
        System.out.println("dame el segundo valor");
        num2 = entrada.nextInt();
        System.out.println("dame el tercer valor");
        num3 = entrada.nextInt();
        
        if((num1>num2) && (num1>num3)){
        System.out.println("EL VALOR MAYOR ENTRE: "+num1+", "+ num2+ " Y "+ num3 + " ES: "+num1);
        }else if((num2>num3) && (num2>num1)){
        System.out.println("EL VALOR MAYOR ENTRE: "+num1+", "+ num2+ " Y "+ num3 + " ES: "+num2);
        }else{
        System.out.println("EL VALOR MAYOR ENTRE: "+num1+", "+ num2+ " Y "+ num3 + " ES: "+num3);
        }
    }
}
