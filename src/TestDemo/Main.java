package TestDemo;

import java.util.List;

import TestDemo.RuleParser.IRenameRule;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length == 1) {
            System.out.println(convert(args[0]));
        } else {
            System.out.println("Usage : TestDemo http://www.baidu.com/news/1/2/3");
        }
    }

    public static String convert(String url) throws Exception {
        return convert(url, null);
    }

    public static String convert(String url, UrlRule rule) throws Exception {
        Url u = new Url(url);
        Result result = new Result("External/");
        List<IRenameRule> rules = RuleParser.Parse(rule);
        for (IRenameRule r : rules) {
            r.Rename(u, result);
        }
        return result.Text;
    }
}
