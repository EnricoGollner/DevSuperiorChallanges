package dev.enrico.clientes.clientes.dto;

import dev.enrico.clientes.clientes.entities.Client;
import jakarta.validation.constraints.*;
import org.apache.logging.log4j.message.Message;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class ClientDTO {
    private Long id;
    @NotBlank(message = "Campo requerido")
    @Size(max = 80, message = "O nome deve ter no máximo 80 caracteres")
    private String name;
    @CPF(message = "CPF inválido")
    private String cpf;
    @PositiveOrZero(message = "A renda informada deve ser maior ou igual a zero")
    private Double income;
    @PastOrPresent(message = "A data de nascimento não pode ser uma data futura")
    private LocalDate birthDate;
    @PositiveOrZero(message = "A quantidade de filhos deve ser maior ou igual a zero")
    private Integer children;

    public ClientDTO(){
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client client) {
        id = client.getId();
        name = client.getName();
        cpf = client.getCpf();
        income = client.getIncome();
        birthDate = client.getBirthDate();
        children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
