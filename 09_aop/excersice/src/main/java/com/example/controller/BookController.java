package com.example.controller;

import com.example.model.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @GetMapping("/list")
    public String showList(Model model){
        List<Book> books = iBookService.findAll();
        model.addAttribute("books", books);
        return "index";
    }


    @GetMapping("/{id}/loan")
    public String getLoanBook(@PathVariable int id, RedirectAttributes redirectAttributes){
     Book book = iBookService.findById(id);
        if(book.getTotal() == 0){
            return "errorPage";
        }else {
            iBookService.loanBook(book);
        }
        redirectAttributes.addFlashAttribute("mess", "Mượn sách thành công");
        return "redirect:/book/list";
    }

    @GetMapping("/{id}/return")
    public String getReturnBook(@PathVariable int id, RedirectAttributes redirectAttributes){
        Book book = iBookService.findById(id);
        if( book.getTotal()== book.getOriginalNumber()){
            return "errorPage";
        }
        else {
            iBookService.saveBook(book);
        }
        redirectAttributes.addFlashAttribute("mess","Trả sách thành công");
        return "redirect:/book/list";
    }


}
