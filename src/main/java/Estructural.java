import java.util.ArrayList;
import java.util.Scanner;
public class Estructural {
    ArrayList<Double> notas = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Estructural() {
    }

    public int cantidadNotas() {
        int cantidad = 0;
        System.out.print("Ingrese la cantidad de notas: ");
        try{
            cantidad = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un número válido");
            scan.next();
            cantidadNotas();
        }
        return cantidad;
    }
    public ArrayList<Double> notasRandom(){
        int size = cantidadNotas();
        for (int i = 0; i < size; i++) {
            notas.add((double)Math.round(((Math.random() * 6) + 1) * 10d) / 10d);
        }
        System.out.println("notas: "+notas);
        return notas;
    }
    public void compararNotas(ArrayList<Double> notas) {
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < notas.size(); i++) {
           if (notas.get(i) >=4) {
               count++ ;
           }
           else if (notas.get(i) <4&&notas.get(i) >=3.6) {
                count2++;
           }
           else {
                count3++;
           }
        }
        System.out.println("Cantidad de notas mayores o iguales a 4: " + count);
        System.out.println("Cantidad de notas menores a 4 y mayores o iguales a 3.6: " + count2);
        System.out.println("Cantidad de notas menores a 3.6: " + count3);
    }




}
