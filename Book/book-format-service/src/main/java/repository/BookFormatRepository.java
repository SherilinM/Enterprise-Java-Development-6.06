package repository;

import model.BookFormat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookFormatRepository extends JpaRepository <BookFormat, String> {

    @Query
    public List<String> findByIsbn(@Param("isbn")String isbn);
}