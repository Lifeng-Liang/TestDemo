package TestDemo;

import java.util.ArrayList;
import java.util.List;

public class UrlRule
{
    public Boolean IsMatch;
    public List<String> Renames = new ArrayList<String>();

    public  UrlRule(Boolean isMatch) {
        this.IsMatch = isMatch;
    }
}
