package controller.interfaces;

import controller.dto.BookDto;

public interface IBookController {

    public BookDto getBook(String isbn);
}
