package TestDemo;

import java.util.ArrayList;
import java.util.List;

public class RuleParser {
    public static List<IRenameRule> Parse(UrlRule rule) throws Exception
    {
        List<IRenameRule> rules = new ArrayList<IRenameRule>();
        rules.add(new ProtocolRule());
        rules.add(new HostportRule());
        //TODO: 完成函数
        rules.add(new DoubleSlashRule());
        return rules;
    }

    public interface IRenameRule {
        void Rename(Url url, Result result);
    }

    public static class ProtocolRule implements IRenameRule {
        @Override
        public void Rename(Url url, Result result) {
            //TODO: 完成函数
        }
    }

    public static class HostportRule implements IRenameRule {
        @Override
        public void Rename(Url url, Result result) {
            //TODO: 完成函数
        }
    }

    public static class SegmentRule implements IRenameRule {
        private int _count;

        public SegmentRule(int count)
        {
            _count = count;
        }

        @Override
        public void Rename(Url url, Result result) {
            //TODO: 完成函数
        }
    }

    public static class ParameterRule implements IRenameRule {
        private String _key;

        public ParameterRule(String key) {
            _key = key;
        }

        @Override
        public void Rename(Url url, Result result) {
            //TODO: 完成函数
        }
    }

    // 如果只有 host 和 port，则在最后多添加一个 /
    public static class DoubleSlashRule implements IRenameRule {
        @Override
        public void Rename(Url url, Result result) {
            //TODO: 完成函数
        }
    }
}
