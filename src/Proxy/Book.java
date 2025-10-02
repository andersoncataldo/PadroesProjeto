package Proxy;

public class Book {
    private String titulo;
    private String isbn;

    public Book(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getIsbn() {
        return isbn;
    }
}
