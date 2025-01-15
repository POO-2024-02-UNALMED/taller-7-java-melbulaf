package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s", resumen(), ensenanza);
    }
}