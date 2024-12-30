package com.lucaslima.challenges.usernamevalidaton.secondattempt;

import com.lucaslima.challenges.usernamevalidaton.UsernameValidationUseCase;
import com.lucaslima.challenges.usernamevalidaton.secondattempt.rules.LengthRule;
import com.lucaslima.challenges.usernamevalidaton.secondattempt.rules.Rule;
import com.lucaslima.challenges.usernamevalidaton.secondattempt.rules.StartLetterRule;

public class SecondUsernameValidationService implements UsernameValidationUseCase {


    @Override
    public boolean isValid(String username) {
        var rule = Rule.of(new StartLetterRule(), new LengthRule());
        return rule.isValid(username);
    }
}
