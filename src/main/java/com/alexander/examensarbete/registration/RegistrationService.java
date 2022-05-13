package com.alexander.examensarbete.registration;

import com.alexander.examensarbete.model.User;
import com.alexander.examensarbete.model.UserRole;
import com.alexander.examensarbete.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final UserService userService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isEmailCorrect = emailValidator.test(request.getEmail());
        if(!isEmailCorrect){
            throw new IllegalStateException("Email not valid");
        }
        return userService.signUpUser(
                new User(
                        request.getUsername(),
                        request.getPassword(),
                        request.getEmail(),
                        UserRole.USER
                )
        );
    }
}
