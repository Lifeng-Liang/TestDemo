package test.TestDemo;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test(expected = Exception.class)
    public void testNull() throws Exception {
        TestDemo.Main.convert(null);
    }

    @Test(expected = Exception.class)
    public void testEmpty() throws Exception {
        TestDemo.Main.convert("");
    }

    @Test
    public void testUrl() throws Exception {
        AssertIs("http://www.sina.com/test/1/2/3/", "External/HTTP/www.sina.com:80/test/1/");
        AssertIs("http://www.sina.com/", "External/HTTP/www.sina.com:80//");
        AssertIs("http://www.sina.com", "External/HTTP/www.sina.com:80//");
        AssertIs("http://www.sina.com/test/1", "External/HTTP/www.sina.com:80/test/1/");
        AssertIs("http://www.sina.com/test/1/", "External/HTTP/www.sina.com:80/test/1/");
        AssertIs("http://www.sina.com/test", "External/HTTP/www.sina.com:80/test/");
        AssertIs("http://www.sina.com:900/test", "External/HTTP/www.sina.com:900/test/");
    }

    @Test
    public void testHttpsUrl() throws Exception {
        AssertIs("https://www.sina.com/test/1/2/3/", "External/HTTPS/www.sina.com:443/test/1/");
        AssertIs("https://www.sina.com/", "External/HTTPS/www.sina.com:443//");
        AssertIs("https://www.sina.com", "External/HTTPS/www.sina.com:443//");
        AssertIs("https://www.sina.com/test/1", "External/HTTPS/www.sina.com:443/test/1/");
        AssertIs("https://www.sina.com/test/1/", "External/HTTPS/www.sina.com:443/test/1/");
        AssertIs("https://www.sina.com/test", "External/HTTPS/www.sina.com:443/test/");
        AssertIs("https://www.sina.com:900/test", "External/HTTPS/www.sina.com:900/test/");
    }

    private void AssertIs(String url, String exp) throws Exception {
        var n = TestDemo.Main.convert(url);
        assertEquals(exp, n);
    }
}
