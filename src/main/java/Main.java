public class Main {
    public static void main(String[] args) {
        Estructural e = new Estructural();
        Funcional f = new Funcional();
        e.compararNotas(e.notasRandom());
        f.contarNotas(f.generarNotas(f.cantidadNotas()));
    }
}
