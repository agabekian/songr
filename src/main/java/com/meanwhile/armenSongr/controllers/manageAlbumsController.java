package com.meanwhile.armenSongr.controllers;

import com.meanwhile.armenSongr.models.Album;
import com.meanwhile.armenSongr.repos.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class manageAlbumsController {
    //TODO: WIRE up the salom Repository with Autowired
    @Autowired
    AlbumRepo albumRepo;

    @GetMapping("/")
    public String getAllAlbums(Model m) {
        List<Album> listAlbums = albumRepo.findAll();
        m.addAttribute("albums", listAlbums);
        return "displayAlbums";
    }

    @PostMapping("/")
    public RedirectView createAlbum(String artist, String title, int songCount, double length, String imageUrl) {
        // create a new store
        Album newAlbum = new Album(artist, title, songCount, length, imageUrl);
        // add it to the DB
        albumRepo.save(newAlbum);
        return new RedirectView("/");
    }
}
