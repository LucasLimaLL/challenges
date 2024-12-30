package com.lucaslima.challenges.usernamevalidaton.firstattempt;

import com.lucaslima.challenges.usernamevalidaton.UsernameValidationUseCase;
import com.lucaslima.challenges.usernamevalidaton.firstattempt.rules.CannotEndWithUnderscoreRule;
import com.lucaslima.challenges.usernamevalidaton.firstattempt.rules.LengthRule;
import com.lucaslima.challenges.usernamevalidaton.firstattempt.rules.OnlyContainLetterNumberUnderscoreRule;
import com.lucaslima.challenges.usernamevalidaton.firstattempt.rules.Rule;
import com.lucaslima.challenges.usernamevalidaton.firstattempt.rules.StartLetterRule;

import java.util.List;

public class FirstUsernameValidationService implements UsernameValidationUseCase {

    private final List<Rule> rules;

    public FirstUsernameValidationService() {
        this.rules = List.of(new StartLetterRule(), new LengthRule(), new OnlyContainLetterNumberUnderscoreRule(), new CannotEndWithUnderscoreRule());
    }

    @Override
    public boolean isValid(String username) {
        return this
                .rules
                .stream()
                .filter(rule -> rule.isValid(username)).count() == this.rules.size();
    }
}
