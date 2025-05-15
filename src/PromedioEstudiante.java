import java.util.Scanner;

public class PromedioEstudiante {
    public static void main(String[] args) {

//Crear el objeto Scanner y pedir la media (nota estudiante)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la nota media del estudiante");
        double media = scanner.nextDouble();
// el double lee número decimal
//Evalúo la nota usando if, else if, y else
        if (media >=7.0){
            System.out.println("El estudiante fue aprobado con un promedio de: " + media);
        }else if (media >= 5.0 && media <= 6.9){
            System.out.println("El estudiante esta recuperando tuvo este promedio " + media);
        }else {
            System.out.println("El estudiante reprobo");
        }
//Se usa operadores de comparación (>=) y estructura if / else if / else.
    scanner.close();
//Cierro el Scanner

    }
}
