package com.lucaslima.challenges.usernamevalidaton.secondattempt.rules;

public class OnlyContainLetterNumberUnderscoreRule extends Rule {

    @Override
    public boolean isValid(String username) {
        return username.matches("^[a-zA-Z0-9_]*$") ? hasNext(username) : false;
    }
}
