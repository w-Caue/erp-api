package com.javadev.erp.model;

import com.javadev.erp.model.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
