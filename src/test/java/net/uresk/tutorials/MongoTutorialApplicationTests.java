package net.uresk.tutorials;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tests4geeks.tutorials.MongoTutorialApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MongoTutorialApplication.class)
@WebAppConfiguration
public class MongoTutorialApplicationTests {

	@Test
	public void contextLoads() {
	}

}
