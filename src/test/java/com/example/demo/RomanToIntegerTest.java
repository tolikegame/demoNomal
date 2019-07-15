package com.example.demo;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest(classes = DemoJunitApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RomanToIntegerTest {

    @Autowired
    RomanToInteger romanToInteger;

    @Test
    public void testRomanToInt(){
        int result = romanToInteger.romanToInt("I");
        Assert.assertEquals(result,1);
    }

    @Before
    public void before(){
        System.out.println("before invoke test method");
    }
    @After
    public void after(){
        System.out.println("after invoke test method");
    }
    @Test
    public void caseI(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("I") ;
        assertEquals(1,result);
    }

    @Test
    public void caseII(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("II") ;
        assertEquals(2,result);
    }

    @Test(timeout = 3000)
    public void caseTimout(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.timout() ;
    }

    @Test(expected = Exception.class)
    public void caseException() throws Exception {
        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.thorwSomething();
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }
}
