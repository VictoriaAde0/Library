package com.libraryapp.libProject.controller;
import com.libraryapp.libProject.dto.Libdto;
import com.libraryapp.libProject.model.Library;
import com.libraryapp.libProject.service.LibService;
import com.libraryapp.libProject.repository.LibRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class LibController {

    private final LibService libService;

    public LibController(LibService libService){
        this.libService = libService;
    }


    @PostMapping(value = "/book/add")
    public Object createLib(@RequestBody Libdto libdto) {
        return libService.createLib(libdto);
    }

    @GetMapping("/book")
    public Object  getLib() {

        return libService.getLib();
    }

    @PutMapping("/{id}")
    public Object updateLib(@RequestBody Libdto libdto, @PathVariable Long id) {

        return libService.updateLib(libdto, id);
    }


    @DeleteMapping("/{id}")
    public Object deleteBook(@PathVariable long id) {
        return libService.deleteBook(id);
    }
}