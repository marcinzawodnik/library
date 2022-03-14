package com.example.demo.book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo  extends CrudRepository<Book, Long> {
}
