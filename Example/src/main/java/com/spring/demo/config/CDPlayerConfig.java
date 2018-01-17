package com.spring.demo.config;

import com.spring.demo.service.CompactDisc;
import com.spring.demo.service.impl.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by jun.chen on 2018/1/16.
 */

@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {

  @Bean
  public CDPlayer cdPlayer(CompactDisc cd) {
    CDPlayer cdPlayer = new CDPlayer();
    cdPlayer.setCompactDisc(cd);
    return cdPlayer;
  }


}
