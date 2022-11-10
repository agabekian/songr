package com.meanwhile.armenSongr.controllers;

import com.meanwhile.armenSongr.models.Album;
import com.meanwhile.armenSongr.models.Song;
import com.meanwhile.armenSongr.repos.AlbumRepo;
import com.meanwhile.armenSongr.repos.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    SongRepo songRepo;
    @Autowired
    AlbumRepo albumRepo;

    @GetMapping("/songs")
    public String getSongs(Model m) {
        List<Song> songs = songRepo.findAll();
        m.addAttribute("songs", songs);
        return "AllTheSongs";
    }

    @PostMapping("/songs")
    public RedirectView createNewSong (String title, int length, int trackNumber, String inputAlbumName) {
        Album album = albumRepo.findByTitle(inputAlbumName);
        Song newSong = new Song(title, length, trackNumber, album);
        songRepo.save(newSong);
        return new RedirectView("/");
    }
}
