package com.lucaslima.challenges.usernamevalidaton.secondattempt.rules;

public class CannotEndWithUnderscoreRule extends Rule {

    @Override
    public boolean isValid(String username) {
        return !username.endsWith("_") ? hasNext(username) : false;
    }
}
