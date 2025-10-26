package dev.enrico.clientes.clientes.dto;

public class FieldMesssage {
    private String fieldName;
    private String message;

    public FieldMesssage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
