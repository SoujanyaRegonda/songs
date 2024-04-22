package com.example.song.service;

import com.example.song.model.Song;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.song.repository.SongRepository;
import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;
import java.util.*;

@Service
public class SongH2Service implements SongRepository {
    @Autowired
    private JdbcTemplate db;

    @Override
    public ArrayList<Song> getAllSongs() {
        return (ArrayList<Song>) db.query("SELECT * FROM playlist", new SongRowMapper());
    }

    @Override
    public Song getSongById(int songId) {
        return new Song(1, "Butta Bomma", "Ramajogayya Sastry", "Armaan Malik", "Thaman");

    }

    @Override
    public Song addSong(Song song) {
        return new Song(1, "Butta Bomma", "Ramajogayya Sastry", "Armaan Malik", "Thaman");
    }

    @Override
    public Song updateSong(int songId, Song song) {
        return new Song(1, "Butta Bomma", "Ramajogayya Sastry", "Armaan Malik", "Thaman");

    }

    @Override
    public Song deleteSong(int songId) {

    }

}