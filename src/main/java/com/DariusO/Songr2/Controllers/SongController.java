package com.DariusO.Songr2.Controllers;


import com.DariusO.Songr2.Repository.AlbumRepository;
import com.DariusO.Songr2.Repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/Song")
}
