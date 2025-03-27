
import java.util.Arrays;
import java.util.List;

public class Funcional {
    List<Double> notas = Arrays.asList(1.2, 2.8, 3.7, 4.0, 5.0, 6.0);

    public Funcional() {
    }

    public void contarNotas(){
        System.out.println("Notas: "+notas);
        int notasMayores =(int) notas.stream()
                .filter( nota -> nota >= 4)
                .count();
        System.out.println("Notas mayores o iguales a 4: " + notasMayores);
        int notasEntre =(int) notas.stream()
                .filter( nota -> nota >= 3.6&& nota < 4)
                .count();
        System.out.println("Notas entre 3.6 y 4: " + notasEntre);
        int notasMenores =(int) notas.stream()
                .filter( nota -> nota < 3.6)
                .count();
        System.out.println("Notas menores a 3.6: " + notasMenores);
    }
}
