package test.TestDemo;

import TestDemo.UrlRule;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

public class ExtendTest {
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /*
     * 使用 OOP 的方法重构后，代码比较清晰，其重要表现在可维护性和可扩展性上。
     * 这一次在这两个方面进一步进行一些训练。
     * 一是增加一个新的规则 host，命令形式为 host=true，如果host=false则不输出域名到结果中。
     * 另一个是扩展 segments 规则，原形式不变，增加 segments=last_2 类型的命令，表示取segments最后两项。
     * 此训练需要大家先编写单元测试，然后完成相关功能，ConvertTest 中的单元测试不用也不要修改，
     * 新单元测试都添加到这个 ExtendTest 中。
     */

}
