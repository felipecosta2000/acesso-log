package com.felipe.costa.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection= "users")
public class Users {

    @Id
    private String id;
    private String name;
    @Indexed
    private String email;
    private String status;
    private String token;
    private String password;

    private LocalDateTime dataMovimentacao;

    public Users() {
        //super();
    }

    public Users(String id, String name, String email, String status, String token, String password,
                 LocalDateTime dataMovimentacao) {
        //super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.status = status;
        this.token = token;
        this.password = password;
        this.dataMovimentacao = dataMovimentacao;
    }

    @Override
    public String toString() {
        return "Users [id=" + id + ", name=" + name + ", email=" + email + ", status=" + status + ", token=" + token
                + ", password=" + password + ", dataMovimentacao=" + dataMovimentacao + "]";
    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getStatus() {
        return status;

    }

    public void setStatus(String status) {
        this.status = status;

    }

    public String getToken() {
        return token;

    }

    public void setToken(String token) {
        this.token = token;

    }

    public String getPassword() {
        return password;

    }

    public void setPassword(String password) {
        this.password = password;

    }

    public LocalDateTime getDataMovimentacao() {
        return dataMovimentacao;

    }

    public void setDataMovimentacao(LocalDateTime dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;

    }

}

