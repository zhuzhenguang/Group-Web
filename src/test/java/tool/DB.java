package tool;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringContextTestCase;

@ContextConfiguration(locations = "/applicationContext-test.xml")
public class DB extends SpringContextTestCase {

	private static Logger logger = LoggerFactory.getLogger(DB.class);

	@Test
	public void testDB() {
		logger.info("create db");
	}
}
