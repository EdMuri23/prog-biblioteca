public class Libro {

    //Atributos
    private int id;
    private String titulo;
    private String autor;
    private int numPaginas;


    /** CONSTRUCTOR:
     * @param id
     * @param titulo
     * @param autor
     * @param numPaginas
     */
    public Libro(int id, String titulo, String autor, int numPaginas) {
        int numHojas; //Variable del metodo

        //Parametros
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;

        numHojas = numPaginas/2;
    }

    //Gets

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @return
     */
    public String getAutor() {
        return autor;
    }

    /**
     *
     * @return
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    //
    @Override //Override porque las clases cojen los metodos del padre clase, por eso hay que sobreescribir su funcionamiento
    public String toString() {
        StringBuilder infoLibro = new StringBuilder ("Libro: ");

        infoLibro.append (String.format("\n id: %d", id));
        infoLibro.append (String.format("\n titulo: %s\n", titulo));
        infoLibro.append (String.format("\n autor: %s\n", autor));
        infoLibro.append (String.format("\n numPaginas: %d\n", numPaginas));

        return infoLibro.toString();
    }
}
