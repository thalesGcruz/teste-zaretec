package tech.test.testezaretec.entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import tech.test.testezaretec.enums.MessageStatus;

@Entity
@Table(name =  "message")
@Getter // declarar todos o gets
@NoArgsConstructor // declarar contructor sem argumentos
@AllArgsConstructor // declara contructor que recebe todos os argumentos
@EqualsAndHashCode(of = "id")
public class MessageEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "CHAR(36)")
    private UUID id;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "content")
    private String content;

    @Column(name = "status")
    private MessageStatus status;

    @CreationTimestamp
    private Instant created_at;  
    
    @UpdateTimestamp
    private Instant updated_at;

}
