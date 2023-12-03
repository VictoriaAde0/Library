package com.libraryapp.libProject.repository;
import com.libraryapp.libProject.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LibRepository extends JpaRepository<Library, Long> {
}
