package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
 
public class JavaTest {
    @Test
    @DisplayName(テスト用)
    public void testStr1() throws Exception {
    	BaseBall07 main = new BaseBall07();
    	String test = "テスト1";
        String result = main.test1(test);
        assertEquals(result, test);
    }
//    
//    @Test
//    public void testStr2() throws Exception {
//    	BaseBall07 main = new BaseBall07();
//    	String test = "テスト2";
//        String result = main.test2(test);
//        assertEquals(result, test);
//    }
//    
    @Test
    public void testCalc() throws Exception {
    	BaseBall07 main = new BaseBall07();
    	int test = 5;
    	int expect = 15;
        int result = main.calc3times(test);
        assertEquals(result, expect);
    }
    
}