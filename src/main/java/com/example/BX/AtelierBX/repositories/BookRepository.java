package com.example.BX.AtelierBX.repositories;
import com.example.BX.AtelierBX.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    // custom query to search to blog post by title or content
    List<Book> findByTitleContainingOrAuthorContainingOrDescriptionContaining(String text, String textAgain, String textAgainAgain);

}
