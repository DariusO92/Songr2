package com.DariusO.Songr2.Repository;

import com.DariusO.Songr2.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album,Long > {
    public Album findByName(String title);


}
