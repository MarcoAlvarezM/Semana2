/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el día deseado "));
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Es lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Es martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Es miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Es jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Es viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Es sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Es domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El dato es erroneo");
            
        }
        if (dia>=1&&dia<=5){
                JOptionPane.showMessageDialog(null, "Es un dia laboral");
            } else if (dia==6||dia==7){
                JOptionPane.showMessageDialog(null, "Es un dia libre");
        }
        */
           /*
        int edad;
        // Este es un programa que analiza su edad
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su edad:"));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "SIIIII PUEDO VOTAR ");
            JOptionPane.showMessageDialog(null, "SIIIII PUEDO TOMAR ");
            JOptionPane.showMessageDialog(null, "SIIIII PUEDO Manejar ");
            if (edad > 30) {
                JOptionPane.showMessageDialog(null, "SIIIII PUEDe ser presidente ");
            }else 
                 JOptionPane.showMessageDialog(null, "NOOOOOO PUEDe ser presidente ");
        } else {
            JOptionPane.showMessageDialog(null, "Es menor de edad ");
        }
        JOptionPane.showMessageDialog(null, "Programa termino ");
         
if (1>2){
            JOptionPane.showMessageDialog(null, "SIIIII ES MMMAYYYOOOORRR " );
        }
        JOptionPane.showMessageDialog(null, "Esto siempre se va a ejecutar " );
*/
 /*
        String variable="Hola";
                
        if (variable.compareTo("Hola")==0){
            JOptionPane.showMessageDialog(null, "SOOONNNN IGUALES " );
        }*/
 /*
        int a = 1;
        int b = 2;*/
 /*
        if (a <= b)
            JOptionPane.showMessageDialog(null, "Si se cumple " );
        JOptionPane.showMessageDialog(null, "Esto siempre se va a ejecutar " );
         */
 /*
        if (a == 1 && b == 3){
            JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
            JOptionPane.showMessageDialog(null, " 1Las dos condiciones se cumplen " );
            JOptionPane.showMessageDialog(null, " 2Las dos condiciones se cumplen " );
            JOptionPane.showMessageDialog(null, " 3Las dos condiciones se cumplen " );
            JOptionPane.showMessageDialog(null, " 4Las dos condiciones se cumplen " );
            
        }*/
 /*
        if (a == 1 && b == 2){
            JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
        }*/
 /*
        if (a == 1 || b == 3){
            JOptionPane.showMessageDialog(null, " Puede que una condicion se cumplen " );
        }*/
 /*
        boolean variableBooleana=true;
        if (true){
             JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
        }
        
        if ( !false ){
             JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
        }
        
        if (variableBooleana){
             JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
        }
        
          if (!variableBooleana){
             JOptionPane.showMessageDialog(null, " Las dos condiciones se cumplen " );
        }*/
        
 /*
       String nombre;
        byte edad;
        double salario;
        char genero;
        int hola="sad";
        nombre = JOptionPane.showInputDialog(null, "Digite el nombre:");
        edad = Byte.parseByte(JOptionPane.showInputDialog(null,
                "Digite la edad:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite el salario:"));
        genero = JOptionPane.showInputDialog(null,
                "Digite la inicial del género:").charAt(0);
        JOptionPane.showMessageDialog(null, nombre + " tiene \n" + edad
                + " años. \n Recibe un salario de $" + salario + " y su género es "
                + genero + ".");
        System.out.println("");*/
 /*
        String nombreParaSalario;
        nombreParaSalario = JOptionPane.showInputDialog(null, "Digite el nombre:");
        Double salarioMensual = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite su salario semanal:"));
        Double salarioBruto =salarioMensual*4;
        Double salarioNeto = salarioBruto*0.0934;
        JOptionPane.showMessageDialog(null, "El empleado " 
                + nombreParaSalario + " tienen un salario neto de " 
                + salarioNeto);
         */
         /*
         int num1;
         int num2;
         int num3;
         int num4;
         int mayor = 0;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero"));
        if (num1>mayor){
            mayor=num1;
        if (num2>mayor)
            mayor=num2;
        if (num3>mayor)
            mayor=num3;        
        if (num4>mayor)
            mayor=num4;
        JOptionPane.showMessageDialog(null, mayor);
        */
         //declaracion variables
         int tiempo;
         int horas_semana;
         double precio_hora;
         double salario_bruto;
         //ingreso de datos
         tiempo = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos años tiene laborando en la empresa?"));
         horas_semana = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas que labora: "));
         precio_hora = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite cuanto le pagan la hora: "));
         //calculos
         salario_bruto=(horas_semana*precio_hora);
         if (tiempo>=10)
             salario_bruto=salario_bruto+(salario_bruto*0.20);
            if (salario_bruto>2000){
                salario_bruto=salario_bruto-(salario_bruto*0.15);
            }else if (salario_bruto>1000)
             salario_bruto=salario_bruto-(salario_bruto*0.10);
         //Salida de datos
         JOptionPane.showMessageDialog(null, "Salario neto: "+salario_bruto);
            
        }    
        
    }

