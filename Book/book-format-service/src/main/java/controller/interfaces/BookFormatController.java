package controller.interfaces;

import main.java.controller.dto.BookFormatDto;
import java.util.List;

public interface BookFormatController {
    List<String> getFormats(Long ISBN);
    BookFormatDto postFormat(BookFormatDto bookFormatDto);
}
