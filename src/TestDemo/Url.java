package TestDemo;

import java.util.*;

public class Url {
    public UrlProtocol Protocol;
    public String Hostport;
    public List<String> Segments = new ArrayList<String>();
    public Map<String, String> QueryString = new HashMap<>();

    public Url(String url) throws Exception {
        if (url == null || url == "") {
            throw new Exception("Error");
        }
        String lurl = url.toLowerCase();
        if (lurl.startsWith("http://")) {
            Init(UrlProtocol.HTTP, url.substring(7), "80");
        } else if (lurl.startsWith("https://")) {
            Init(UrlProtocol.HTTPS, url.substring(8), "443");
        } else {
            Protocol = UrlProtocol.OTHER;
        }
    }

    private void Init(UrlProtocol protocol, String pureUrl, String defaultPort) {
        //TODO: 完成解析
    }
}
