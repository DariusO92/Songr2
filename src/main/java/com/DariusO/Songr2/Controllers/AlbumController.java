package com.DariusO.Songr2.Controllers;

import com.DariusO.Songr2.Album;
import com.DariusO.Songr2.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/")
    public String getAlbum(Model m){
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("album", albums);

        return "albums";
    }

    @PostMapping("/")
    public RedirectView createAlbums(String title, Integer songCount, String artist, double albumLengthSeconds, String imgUrl){
        Album newAlbum = new Album(title,artist,songCount,albumLengthSeconds,imgUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/");
    }

    }


