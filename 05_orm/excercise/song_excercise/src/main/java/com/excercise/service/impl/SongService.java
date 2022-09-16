package com.excercise.service.impl;

import com.excercise.model.Song;
import com.excercise.repository.ISongRepository;
import com.excercise.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {

    @Autowired
    ISongRepository iSongRepository;

    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }

    @Override
    public void save(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public void update(Song song) {
        iSongRepository.update(song);
    }
//
    @Override
    public Song findById(int id) {
        return iSongRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        iSongRepository.delete(id);
    }
}
