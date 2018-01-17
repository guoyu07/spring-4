package com.spring.demo.service.impl;

import com.spring.demo.service.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by jun.chen on 2018/1/16.
 */

@Component("perfect")
public class SgtPeppers implements CompactDisc {

  private final static String title = "Deluxe";
  private final static String artist = "Ed Sheeran";

  @Override
  public void play() {
    System.out.println(artist + " play " + title);
  }
}
