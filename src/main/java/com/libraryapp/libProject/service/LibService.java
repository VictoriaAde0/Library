package com.libraryapp.libProject.service;
import com.libraryapp.libProject.dto.Libdto;
import com.libraryapp.libProject.model.Library;
import com.libraryapp.libProject.repository.LibRepository;
import org.springframework.stereotype.Service;

@Service
public class LibService {
    private final LibRepository libRepository;

    public LibService(LibRepository libRepository){
        this.libRepository = libRepository;
    }

    public Object createLib(Libdto libdto) {
        Library library = new Library();
        library.setTitle(libdto.getTitle());
        library.setAuthor(libdto.getAuthor());

        return libRepository.save(library);
    }


    public Object getLib() {

        return libRepository.findAll();
    }



    public Object updateLib(Libdto libdto, Long id) {
        Library library = libRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        library.setTitle(libdto.getTitle());
        library.setAuthor(libdto.getAuthor());
        library.setIsbn(libdto.getIsbn());

        return libRepository.save(library);
    }

    public Object deleteBook(Long id) {
        Library library = libRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Deleted"));
        libRepository.delete(library);

        return "Book Deleted";
    }

}
