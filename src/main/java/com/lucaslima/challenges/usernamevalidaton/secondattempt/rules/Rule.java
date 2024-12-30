package com.lucaslima.challenges.usernamevalidaton.secondattempt.rules;

public abstract class Rule {

    private Rule next;

    public static Rule of(Rule first, Rule... chain) {
        Rule head = first;
        for (Rule nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean isValid(String username);

    protected boolean hasNext(String username) {
        if (next == null) {
            return true;
        }
        return next.isValid(username);
    }
}
