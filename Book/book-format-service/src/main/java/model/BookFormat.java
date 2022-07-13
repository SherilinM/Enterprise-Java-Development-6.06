package main.java.model;

import main.java.enums.Format;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class BookFormat {

    @Id
    private String isbn;

    @Enumerated(EnumType.STRING)
    private Format formats;

    public BookFormat() {
    }

    public BookFormat(String isbn, Format formats) {
        setIsbn(isbn);
        setFormats(formats);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Format getFormats() {
        return formats;
    }

    public void setFormats(Format formats) {
        this.formats = formats;
    }
}
