package com.lucaslima.challenges.usernamevalidaton.firstattempt.rules;

public class LengthRule implements Rule {

    @Override
    public boolean isValid(String username) {
        var length = username.length();
        return length >= 4 && length <= 25;
    }
}
