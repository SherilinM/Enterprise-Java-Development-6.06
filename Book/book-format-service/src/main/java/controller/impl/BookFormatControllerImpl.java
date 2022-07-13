package controller.impl;

import controller.interfaces.BookFormatController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import repository.BookFormatRepository;
import repository.BookRepository;

import java.awt.print.Book;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookFormatControllerImpl implements BookFormatController {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookFormatRepository formatRepository;

    private final Logger logger = LoggerFactory.getLogger(BookFormatControllerImpl.class);

    @GetMapping("/book-formats/{ISBN}")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getFormats(@PathVariable Long ISBN) {
        Book book = bookRepository.findById(ISBN).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND,"Book-format not found"));
        List<main.java.model.BookFormat> formatList = book.getBookFormatList();
        List<String> formatEnumList = new ArrayList<>();
        for (Format format:formatList){
            formatEnumList.add(format.getName().toString());
        }
        return formatEnumList;
    }

}
