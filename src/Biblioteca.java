public class Biblioteca {

    //Atributos
    private Libro[] catalogo;
    private final int CANT_MAX_LIBROS;

    /** CONSTRUCTOR:
     * @param
     */
    public Biblioteca(int cantidad_maxima_libro) {
        this.CANT_MAX_LIBROS = cantidad_maxima_libro;

        //Parametros
        catalogo = new Libro[CANT_MAX_LIBROS];

    }

    private Libro buscarLibro(int codigoLibro) {
        boolean libroEncontrado = false;
        Libro Libro = null;
        int i = 0;

        while (i < CANT_MAX_LIBROS && !libroEncontrado) {
            if (catalogo[i] != null && catalogo[i].getId() == codigoLibro) {
                libroEncontrado = true;
                Libro = catalogo[i];
            }
            i++;
        }
        return Libro;
    }

    //Gets
}
