package main.java.controller.dto;

import org.jetbrains.annotations.NotNull;

public class BookDto {

    @Id
    @NotNull
private String isbn;

    @NotNull
    private String title;

    @NotNull
    private String author;

    @NotNull
    private String genre;

    @NotNull
    private String[] formats;

    public BookDto() {
    }

    public BookDto( String isbn, String title, String author, String genre) {
        setIsbn(isbn);
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String[] getFormats() {
        return formats;
    }

    public void setFormats(String[] formats) {
        this.formats = formats;
    }
}
