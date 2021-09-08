package br.com.bolsavalores.stackquotesapi;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "QUOTE")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String symbol;
    private Double openValue;
    private Double closeValue;
    private Date timestamp;
}
