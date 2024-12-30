package com.lucaslima.challenges.usernamevalidaton.firstattempt.rules;

public class StartLetterRule implements Rule {

    @Override
    public boolean isValid(String username) {
        return Character.isLetter(username.charAt(0));
    }
}
