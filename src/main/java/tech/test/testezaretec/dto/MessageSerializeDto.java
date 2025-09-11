package tech.test.testezaretec.dto;

import java.io.Serializable;
import java.util.UUID;

import tech.test.testezaretec.enums.MessageStatus;

public record MessageSerializeDto(
    UUID id,
    String phone_number,
    String content,
    MessageStatus status
) implements Serializable {}
