package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class GMAIL {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		selenium.start();
	}

	@Test
	public void testGMAIL() throws Exception {
		selenium.open("/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		selenium.type("id=FirstName", "LOVE");
		selenium.type("id=LastName", "RINTY");
		selenium.type("id=GmailAddress", "RINTYLOVE");
		selenium.click("css=span.atgmail");
		selenium.click("id=GmailAddress");
		selenium.type("id=GmailAddress", "RINTYLOBE");
		selenium.click("id=Passwd");
		selenium.type("id=Passwd", "BABABA");
		selenium.type("id=PasswdAgain", "BABABA");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
