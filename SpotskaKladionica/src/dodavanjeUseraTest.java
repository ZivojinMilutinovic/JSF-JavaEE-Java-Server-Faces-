import static org.junit.Assert.*;

import org.junit.Test;

public class dodavanjeUseraTest {

	@Test
	public void test() {
		KladionicarServiceImpl s=new KladionicarServiceImpl();
		assertNotNull(s.spisakKladionicara());
	}
	@Test
	public void test1() {
		UtakmicaServiceImpl s=new UtakmicaServiceImpl();
		assertNotNull(s.spisakUtakmica());
	}

}
