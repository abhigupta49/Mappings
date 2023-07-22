package com.AbhishekKumar.Mappings.repository;

import com.AbhishekKumar.Mappings.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,Long> {

    Book findByBookId(Long bId);
}
