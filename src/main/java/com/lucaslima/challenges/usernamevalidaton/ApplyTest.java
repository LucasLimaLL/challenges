package com.lucaslima.challenges.usernamevalidaton;

import com.lucaslima.challenges.usernamevalidaton.firstattempt.FirstUsernameValidationService;
import com.lucaslima.challenges.usernamevalidaton.secondattempt.SecondUsernameValidationService;

import java.util.List;

public class ApplyTest {

    private final List<String> valids;
    private final List<String> invalids;

    public ApplyTest(List<String> valids, List<String> invalids) {
        this.valids = valids;
        this.invalids = invalids;
    }

    public void apply() {
        UsernameValidationUseCase first = new FirstUsernameValidationService();
        UsernameValidationUseCase second = new SecondUsernameValidationService();

        System.out.println("Valid usernames:");
        this.valids.forEach(username -> {
            System.out.println(username + " is valid using first attempt: " + first.isValid(username));
            System.out.println(username + " is valid using second attempt: " + second.isValid(username));
        });

        System.out.println("Invalid usernames:");
        this.invalids.forEach(username -> {
            System.out.println(username + " is valid using first attempt: " + first.isValid(username));
            System.out.println(username + " is valid using second attempt: " + second.isValid(username));
        });
    }
}
