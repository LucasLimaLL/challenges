package com.lucaslima.challenges.usernamevalidaton.firstattempt.rules;

public class OnlyContainLetterNumberUnderscoreRule implements Rule {

    @Override
    public boolean isValid(String username) {
        return username.matches("^[a-zA-Z0-9_]*$");
    }
}
