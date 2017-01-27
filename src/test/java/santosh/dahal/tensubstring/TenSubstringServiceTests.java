package santosh.dahal.tensubstring;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;
import santosh.dahal.tensubstring.service.TenSubstringService;

public class TenSubstringServiceTests {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheckTenSubstring() {
		TenSubstringService tenSubstringService = new TenSubstringService();
		int num = 9191126;
		assertEquals(true,tenSubstringService.checkTenSubstring(num));
//		fail("Not yet implemented");
	}
	
	@Test
	public void testPattern() {
		TenSubstringService tenSubstringService = new TenSubstringService();
		String num = "9191126";
		assertEquals(false,tenSubstringService.checkPattern(num));
		assertEquals(true,tenSubstringService.checkPattern("\"9191126\""));
//		fail("Not yet implemented");
	}

}
