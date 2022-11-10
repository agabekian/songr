package com.meanwhile.armenSongr.repos;

import com.meanwhile.armenSongr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository <Song, Long>{
    public Song findByTitle(String title);
}
