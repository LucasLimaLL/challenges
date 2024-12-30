package com.lucaslima.challenges.usernamevalidaton.secondattempt.rules;

public class StartLetterRule extends Rule {
    @Override
    public boolean isValid(String username) {

        return Character.isLetter(username.charAt(0)) ? hasNext(username) : false;
    }
}
