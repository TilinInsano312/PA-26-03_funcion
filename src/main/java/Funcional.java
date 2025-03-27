
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Funcional {
    Scanner scan = new Scanner(System.in);

    public Funcional() {
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

    public List<Double> generarNotas(int cantidad) {
        return new Random().doubles(cantidad, 1 , 7) .boxed().toList();
    }

    public void contarNotas(List<Double> notas) {

        System.out.println("Notas: "+notas);
        int notasMayores =(int) notas.stream()
                .filter( nota -> nota >= 4)
                .count();
        System.out.println("Cantidad de notas mayores o iguales a 4: " + notasMayores);
        int notasEntre =(int) notas.stream()
                .filter( nota -> nota >= 3.6&& nota < 4)
                .count();
        System.out.println("Cantidad de notas entre 3.6 y 4: " + notasEntre);
        int notasMenores =(int) notas.stream()
                .filter( nota -> nota < 3.6)
                .count();
        System.out.println("Cantidad de notas menores a 3.6: " + notasMenores);
    }
}
