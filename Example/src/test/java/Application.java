import com.spring.demo.config.BaseConfig;
import com.spring.demo.service.CompactDisc;
import com.spring.demo.service.impl.CDPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jun.chen on 2018/1/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/config/spring.xml"})
//@ContextConfiguration(classes = BaseConfig.class)
public class Application {

  @Autowired
  private CompactDisc cd;

  @Autowired
  private CDPlayer cdPlayer;

  @Test
  public void testHello() {
    cd.play();
  }

  @Test
  public void testPlay() {
    cdPlayer.play();
  }

}
