package com.alexander.examensarbete.registration.token;

import jdk.jshell.execution.LoaderDelegate;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ConfirmationToken {
    private long id;
    private String token;
    private LocalDateTime createdAt;
    private LocalDateTime expiredAt;
    private LocalDateTime confirmedAt;

    public ConfirmationToken(String token, LocalDateTime createdAt, LocalDateTime expiredAt, LocalDateTime confirmedAt) {
        this.token = token;
        this.createdAt = createdAt;
        this.expiredAt = expiredAt;
        this.confirmedAt = confirmedAt;
    }
}
