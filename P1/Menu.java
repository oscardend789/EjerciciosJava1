package P1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {
    public void Menus(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        //Se presenta un menu grafico con opciones para el usuario
         while (!salir) {
             System.out.println("\n Bienvenido al Menu Principal \n");
             System.out.println("1) HolaMundo");
             System.out.println("2) FuncionMath");
             System.out.println("3) EnterodeDosVariables");
             System.out.println("4) ConversorTiempo");
             System.out.println("5) Ecuaciones LIneales");
             System.out.println("6) Conjunto de Datos");
             System.out.println("7) Valor y Mayor Secuencia");
             System.out.println("8) Definir Fecha");
             System.out.println("9) Constante Pi");
             System.out.println("10) Valor e");
             System.out.println("11) Salir");
             try {
                 System.out.println("Escribe una de las opciones");
                 opcion = sn.nextInt();
                 switch (opcion) {
                     case 1:
                            System.out.println("Un Hola Mundo");  
                            Hola();
                         break;
                     case 2:
                         System.out.println("Bienvenido a las Funciones Math");
                            Mat();
                         break;
                     case 3:
                         System.out.println("Bienvenido a Entero de Dos Variables");
                            DosVar();
                         break;
                     case 4:
                         System.out.println("Bienvendio a Conversor de Segundos a Minutos y Horas");
                         tiempo();
                         break;
                     case 5:
                         System.out.println("Programa sobre ecuaciones Lineales");
                         EcuLineal();
                         break;
                     case 6:
                         System.out.println("Programa sobre Conjunto de Datos");
                         ConDatos();
                         break;
                     case 7:
                         System.out.println("Programa sobre Mayor Menor en Secuencia");
                         Secuencia();
                         break;
                     case 8:
                         System.out.println("Programa sobre entrada definiendo Fecha");
                         fecha();
                         break;
                     case 9:
                         System.out.println("Programa sobre Constante Pi");
                         ConPi();
                         break;
                     case 10:
                         System.out.println("Programa sobre valor e");
                         
                         break;
                     case 11:
                         salir = true;
                         break;
                     default:
                         System.out.println("Esa opcion no existe");
                 }
             } catch (InputMismatchException e) {
                 System.out.println("Debes insertar un número");
                 sn.next();
                 sn.close();
             }
         }
    }
    public void Hola(){
        HolaMundo h = new HolaMundo();
        h.Hola();
    }
    public void Mat(){
        FuncionMath m = new FuncionMath();
        m.FuMath();
    }
    public void DosVar(){
        EnteroDosVariables v = new EnteroDosVariables();
        v.DosVariables();
    }
    public void tiempo(){
        ConversorT t = new ConversorT();
        t.Convert();
    }
    public void EcuLineal(){
        EcuacionesLineales e = new EcuacionesLineales();
        e.EjecutarEcuaciones();
    }
    public void ConDatos(){
        ConjuntoDatos c = new ConjuntoDatos();
        c.Datos();
    }
    public void Secuencia(){
         MayorMenorSecuencia v = new MayorMenorSecuencia();
         v.Secuencia();
    }
    public void fecha(){
        IngresarFecha f = new IngresarFecha();
        f.Ingreso();
    }
    public void ConPi(){
        ConstantePi p = new ConstantePi();
        p.Calcular();
    }
}
