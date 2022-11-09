package com.meanwhile.armenSongr.repos;

import com.meanwhile.armenSongr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

// make a repo for the data value. THIS IS A SERVICE - Singelton design principle == SPRING BEAN!!
// TODO: Turn into a JPA Repo
public interface AlbumRepo extends JpaRepository<Album, Long> {
  // The reason we are using an interface, is so we can create CUSTOM CRUD queries

  // DARK MAGIC that we made happen with a specific function name
  public Album findByArtist(String artist);

}
