package com.abhinab_blitz.hr_portal.dto;

public record ApiErrorResponseDto(
        String timestamp,
        int status,
        String error,
        String message,
        String path) {
}
