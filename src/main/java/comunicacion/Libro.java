package comunicacion;

public class Libro extends Escrito {
    private String coAutor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String coAutor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.coAutor = coAutor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public String getCo_autor() {
        return coAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getEdicion() {
        return edicion;
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
        return String.format("%s\n%s\n%s\n%s", resumen(), coAutor, editorial, edicion);
    }
}
