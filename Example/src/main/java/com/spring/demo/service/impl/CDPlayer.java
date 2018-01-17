package com.spring.demo.service.impl;

import com.spring.demo.service.CompactDisc;
import com.spring.demo.service.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jun.chen on 2018/1/16.
 */

@Component
public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

//  @Autowired
//  public CDPlayer(CompactDisc compactDisc) {
//    this.compactDisc = compactDisc;
//  }

  @Autowired
  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }
}
