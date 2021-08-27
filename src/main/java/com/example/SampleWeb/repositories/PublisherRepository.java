package com.example.SampleWeb.repositories;

import com.example.SampleWeb.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
