package com.lucaslima.challenges.usernamevalidaton.firstattempt.rules;

public class CannotEndWithUnderscoreRule implements Rule {

    @Override
    public boolean isValid(String username) {
        return !username.endsWith("_");
    }
}
