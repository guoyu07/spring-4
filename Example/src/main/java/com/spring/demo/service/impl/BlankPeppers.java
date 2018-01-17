package com.spring.demo.service.impl;

import com.spring.demo.service.CompactDisc;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jun.chen on 2018/1/17.
 */

@Component
@Primary
public class BlankPeppers implements CompactDisc {

  private String title;
  private String artist;
  private List<String> tracks;

  public BlankPeppers(String title, String artist, List<String> tracks) {
    this.title = title;
    this.artist = artist;
    this.tracks = tracks;
  }


//  public void setTitle(String title) {
//    this.title = title;
//  }
//
//  public void setArtist(String artist) {
//    this.artist = artist;
//  }
//
//  public void setTracks(List<String> tracks) {
//    this.tracks = tracks;
//  }

  @Override
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
    for (String track : tracks) {
      System.out.println("-Track: " + track);
    }
  }
}
