package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/book")
public class BookApi {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    public BookApi(BookRepo bookRepo) {

        this.bookRepo = bookRepo;
    }

    @GetMapping
    public Iterable<Book> getBook() {

        return bookRepo.findAll();
    }


    @PostMapping
    public @ResponseBody String addNewBook (
            @RequestParam int isbn, @RequestParam String title , @RequestParam String authors) {
        Book b = new Book();
        b.setIsbn(isbn);
        b.setTitle(title);
        b.setAuthors(authors);
        bookRepo.save(b);
        return "Saved";
    }

    @DeleteMapping
    public void removeBook(@RequestParam Long id) {

        bookRepo.deleteById(id);
    }

    @PutMapping
    public void putBook(@RequestParam Long id, @RequestParam int isbn,
                      @RequestParam String title, @RequestParam String authors) {

        Optional<Book> b = bookRepo.findById(id);

        if(b.isPresent()){
            Book book = new Book(id, isbn,title,authors);
            bookRepo.save(book);
        }
    }
}
