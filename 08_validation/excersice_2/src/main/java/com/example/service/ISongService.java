package com.example.service;

import com.example.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ISongService {


    Page<Song> findAll(Pageable pageable);

    void save(Song song);

    Optional<Song> findById(int id);


}
