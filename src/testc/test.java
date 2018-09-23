package testc;


import java.io.IOException;

import org.junit.jupiter.api.Test;

import wcproject.WCproject;
import wcproject.count;

class test {
	count co=new count();
	
	@Test
	void testchars() throws IOException {
		co.countchars("E:\\aaa.txt");
	} 

	@Test
	void testlines() throws IOException {
		co.countlines("E:\\aaa.txt");
	} 
	
	@Test
	void testwords() throws IOException {
		co.countwords("E:\\aaa.txt");
	} 
}

