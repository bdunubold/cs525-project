package framework.rule;

public class RuleSetFactory{
    public static RuleSet getRuleSet() {
        return new BankAccountRuleSet();
    }
}
