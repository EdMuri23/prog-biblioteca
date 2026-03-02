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

    /**BUSCAR_LIBRO
     *
     * @param codigoLibro
     * @return
     */
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

    /**LOCALIZAR_LIBRO
     *
     * @param codigoLibro
     * @return
     */
    private int localizarLibro(int codigoLibro) {
        boolean libroLocalizado = false;
        int posicion = -1;
        int i = 0;

        while (i < CANT_MAX_LIBROS && !libroLocalizado) {
            if (catalogo[i] != null && catalogo[i].getId() == codigoLibro) {
                libroLocalizado = true;
                posicion = i;
            }
            i++;
        }
        return posicion;
    }

    /**BUSCAR_PRIMER_HUECO_LIBRE
     * metodo privado que busca la primera posición libre del array catalogo
     * @return -1 si no hay hueco libre o la posición libre
     */
    private int buscarPrimerHuecoLibre () {
        boolean huecoEncontrado = false;
        int posicionPrimerHuecoLibre = -1;
        int i = 0;

        while (i < CANT_MAX_LIBROS && !huecoEncontrado) {
            if (catalogo[i] == null) {
                posicionPrimerHuecoLibre = i;
                huecoEncontrado = true;
            }
            i++;
        }
        return posicionPrimerHuecoLibre;
    }

    /** REGISTRAR_LIBRO:
     * Recibe y añade un libro no duplicado
     * @param book
     * @return true (registrado correctamente) o false (no registrado)
     */
    public boolean registrarLibro(Libro book) {
        boolean registrado = false;
        Libro l = null;
        int posicion = -1;

        l = buscarLibro(book.getId());

        //1º Llamamos a buscarSocio para comprobar si el Libro ya esta en el Catalogo
        if (l != null) {
            //Si no existe buscamos el primer hueco vacio del array catalogo
            posicion = buscarPrimerHuecoLibre();
            //2º Comprobamos que si hay hueco libre
            if (posicion != -1) {
                //Guardamos el libro en el catalogo
                catalogo[posicion] = book;
                //Declaramos que si se ha registrado el libro correctamente
                registrado = true;
            }
        }

        return registrado;
    }

    /** BORRAR_LIBRO
     *
     * @param idLibro
     * @return
     */
    public Libro borrarLibro(int idLibro) {
        int posicionLibro = -1;
        Libro book = null;

        posicionLibro = localizarLibro(idLibro);

        if (posicionLibro >= 0 && posicionLibro < CANT_MAX_LIBROS) {
            book = catalogo[posicionLibro];
            catalogo[posicionLibro] = null;
        }

        return book;
    }

    //Gets
}
