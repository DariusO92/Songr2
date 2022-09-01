package com.DariusO.Songr2.Repository;

import com.DariusO.Songr2.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
