//import com.sun.istack.internal.logging.Logger;
import java.util.logging.Logger;
import org.junit.*;

public class MyFirstTest {

	private static Logger log = Logger.getLogger(MyFirstTest.class.getSimpleName());
	
	@BeforeClass
	public static void firstInit() {log.info("Première méthode appelée");}
	
	@AfterClass
	public static void lastDestroy() {log.info("Dernière méthode appelée");}
	
	@Before
	public void beforeTest() {log.info("Méthode appelée avant chaque test");}
	
	@After
	public void afterTest() {log.info("Méthode appelée après chaque test");}
	
	@Test
	public void premierTest() {
		log.info("Mon premier test");
		Assert.assertTrue(true);
	}
	
	@Test
	public void secondTest() {
		log.info("Mon deuxième test");
		Assert.assertFalse(false);
	}
	
}

