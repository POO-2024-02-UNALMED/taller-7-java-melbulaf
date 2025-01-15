package comunicacion;

public class Tesis extends Escrito {
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.argumentos = argumentos != null ? argumentos : new String[0];
        this.idea = idea;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina*2;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n%d\n%s\n%s", resumen(),idea, argumentos.length, conclusion, referencias);
    }
}