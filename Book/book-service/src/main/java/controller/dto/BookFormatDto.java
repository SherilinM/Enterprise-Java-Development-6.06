package main.java.controller.dto;

import com.sun.istack.NotNull;

public class BookFormatDto {

    @NotNull
    private String isbn;

    @NotNull
    private String[] formats;

    public BookFormatDto() {
    }

    public BookFormatDto( String isbn, String[] formats) {
        setIsbn(isbn);
        setFormats(formats);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String[] getFormats() {
        return formats;
    }

    public void setFormats(String[] formats) {
        this.formats = formats;
    }
}
