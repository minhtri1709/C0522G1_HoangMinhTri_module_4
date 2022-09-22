package com.example.service.impl;


import com.example.model.Book;
import com.example.repository.IBookRepository;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {

    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return iBookRepository.getById(id);
    }

    @Override
    public Book loanBook(Book book) {
        book.setTotal(book.getTotal()-1);
        return iBookRepository.save(book);
    }

    @Override
    public Book saveBook(Book book) {
        book.setTotal(book.getTotal()+1);
        return iBookRepository.save(book);
    }


}
