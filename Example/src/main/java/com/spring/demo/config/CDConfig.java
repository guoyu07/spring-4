package com.spring.demo.config;

import com.spring.demo.service.CompactDisc;
import com.spring.demo.service.impl.BlankPeppers;
import com.spring.demo.service.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by jun.chen on 2018/1/17.
 */

@Configuration
public class CDConfig {

  @Bean
  public CompactDisc compactDisc(String title, String artist, List<String> tracks) {
    return new BlankPeppers(title,artist, tracks);
  }

}
