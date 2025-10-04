/*
Ejercicio 24
Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.
Ejemplo:
1 - Programador junior
2 - Prog. senior
3 - Jefe de proyecto
Introduzca el cargo del empleado (1 - 3): 2
¿Cuántos días ha estado de viaje visitando clientes? 5
Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
----------------------------------
| Sueldo base 1200,00            |
| Dietas ( 5 viajes) 150,00      |
|--------------------------------|
| Sueldo bruto 1350,00           |
| Retención IRPF (20%) 270,00    |
|--------------------------------|
| Sueldo neto 1080,00            |
----------------------------------
 */

import java.util.Scanner;

public class Ej024 {
    public static void main(String[] args) {

        final double SALARIO_JUNIOR = 950;
        final double SALARIO_SENIOR = 1200;
        final double SALARIO_JEFE_PROYECTO = 1600;
        final int DIETAS = 30;
        final int PCT_IRPF_SOLTERO = 25;
        final int PCT_IRPF_CASADO = 20;

        double salarioBase = 0;
        double importeDietas = 0;
        double salarioBruto = 0;
        double salarioNeto = 0;
        double importeRetencionIRPF = 0;
        int valorRetencionIRPF = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("| --------------------------------- |");
        System.out.println("| CÁLCULO DE NÓMINA DE TRABAJADORES |");
        System.out.println("| --------------------------------- |");
        System.out.println("| 1.- Programador Junior            |");
        System.out.println("| 2.- Programador Senior            |");
        System.out.println("| 3.- Jefe de Proyecto              |");
        System.out.println("| --------------------------------- |");

        System.out.print("Introduce el cargo del empleado (1 - 3): ");
        int tipoTrabajador = sc.nextInt();

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        int cantidadDietas = sc.nextInt();

        sc.nextLine(); // limpiar el buffer antes de leer texto
        System.out.print("Introduce el estado civil (soltero, casado): ");
        String estadoCivil = sc.nextLine().toLowerCase();

        switch (tipoTrabajador) {
            case 1 -> salarioBase = SALARIO_JUNIOR;
            case 2 -> salarioBase = SALARIO_SENIOR;
            case 3 -> salarioBase = SALARIO_JEFE_PROYECTO;
            default -> {
                System.out.println("Tipo de trabajador no válido");
                sc.close();
                return;
            }
        }

        importeDietas = cantidadDietas * DIETAS;
        salarioBruto = salarioBase + importeDietas;

        switch (estadoCivil) {
            case "soltero" -> {
                importeRetencionIRPF = salarioBruto * (PCT_IRPF_SOLTERO / 100.0);
                valorRetencionIRPF = PCT_IRPF_SOLTERO;
            }
            case "casado" -> {
                importeRetencionIRPF = salarioBruto * (PCT_IRPF_CASADO / 100.0);
                valorRetencionIRPF = PCT_IRPF_CASADO;
            }
            default -> {
                System.out.println("Estado civil no válido");
                sc.close();
                return;
            }
        }

        salarioNeto = salarioBruto - importeRetencionIRPF;

        System.out.println("| --------------------------------- |");
        System.out.printf("| Sueldo base:          %8.2f €  |\n", salarioBase);
        System.out.printf("| Dietas (%2d viajes):   %8.2f €  |\n", cantidadDietas, importeDietas);
        System.out.println("|-----------------------------------|");
        System.out.printf("| Sueldo bruto:         %8.2f €  |\n", salarioBruto);
        System.out.printf("| Retención IRPF (%2d%%): %8.2f €  |\n", valorRetencionIRPF, importeRetencionIRPF);
        System.out.println("|-----------------------------------|");
        System.out.printf("| Sueldo neto:          %8.2f €  |\n", salarioNeto);
        System.out.println("| --------------------------------- |");

        sc.close();
    }
}


