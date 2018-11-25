package TestDemo;

public class Result {
    public String Text;
    public int SectionCount;

    public Result(String prefix) {
        Text = prefix;
    }

    public void Append(Object part) {
        Text += part + "/";
        SectionCount++;
    }
}
