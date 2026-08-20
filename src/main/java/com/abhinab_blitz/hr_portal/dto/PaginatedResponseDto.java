package com.abhinab_blitz.hr_portal.dto;

import java.util.List;

public record PaginatedResponseDto<T>(
        List<T> content, // This would hold your PublicEmployeeResponseDtos
        int pageNumber,
        int pageSize,
        long totalElements,
        int totalPages,
        boolean isLast) {
}
