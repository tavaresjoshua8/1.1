package util;

public class Libro {
    private String titulo;
    private String autor;
    private int noPaginas;
    private String editorial;
    private long isbn;

    public Libro(String titulo, String autor, int noPaginas, String editorial, long isbn) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setNoPaginas(noPaginas);
        this.setEditorial(editorial);
        this.setIsbn(isbn);
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getNoPaginas() { return noPaginas; }
    public String getEditorial() { return editorial; }
    public long getIsbn() { return isbn; }
    
    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setNoPaginas(int noPaginas) { this.noPaginas = noPaginas; }
    public void setEditorial(String editorial) { this.editorial = editorial; }
    public void setIsbn(long isbn) { this.isbn = isbn; }

    @Override
    public String toString() {
        return titulo + "\n"
             + "Autor: " + autor + "\n"
             + "No. Paginas: " + noPaginas + "\n"
             + "Editorial: " + editorial + "\n"
             + "ISBN: " + isbn + "\n";
    }
}
