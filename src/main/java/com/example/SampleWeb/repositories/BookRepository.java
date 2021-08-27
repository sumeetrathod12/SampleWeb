package com.example.SampleWeb.repositories;

import com.example.SampleWeb.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
