package com.example.SampleWeb.repositories;

import com.example.SampleWeb.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
