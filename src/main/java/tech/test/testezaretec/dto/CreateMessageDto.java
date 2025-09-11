package tech.test.testezaretec.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateMessageDto(
    @NotBlank(message = "O número de telefone é obrigatório")
    String phone_number, 
    
    @NotBlank(message = "O conteúdo da mensagem é obrigatório")
    @Size(max = 500, message = "O conteúdo deve ter no máximo 500 caracteres")
    String content) {
}
