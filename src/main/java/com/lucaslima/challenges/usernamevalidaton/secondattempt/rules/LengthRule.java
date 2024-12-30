package com.lucaslima.challenges.usernamevalidaton.secondattempt.rules;

public class LengthRule extends Rule {

    @Override
    public boolean isValid(String username) {
        var length = username.length();
        return length >= 4 && length <= 25 ? hasNext(username) : false;
    }
}
