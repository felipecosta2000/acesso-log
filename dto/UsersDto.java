package com.felipe.costa.dto;

import java.time.LocalDateTime;

import com.felipe.costa.model.LogUsers;
import com.felipe.costa.model.Users;

public class UsersDto {

    private String id;
    private String name;
    private String email;
    private String status;
    private String token;
    private String password;
    private LocalDateTime dataMovimentacao;

    private String idLog;
    private String typeLog;
    private String message;
    private String usersId;
    private LocalDateTime dataHora;




    public UsersDto() {
        //super();
    }


    //Users
    public UsersDto(String id, String name, String email, String status, String token, String password,
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


    //Log
    public UsersDto(String idLog, String typeLog, String message, String usersId, LocalDateTime dataHora) {
        //super();
        this.idLog = idLog;
        this.typeLog = typeLog;
        this.message = message;
        this.usersId = usersId;
        this.dataHora = dataHora;
    }



    //gravacao
    public Users toUsersCreate() {
        Users users = new Users();
        users.setEmail(this.email);
        users.setName(this.name);
        users.setPassword(this.password);
        return users;


    }

    public Users toUsersLogin() {
        Users users = new Users();
        users.setEmail(this.email);
        users.setPassword(this.password);
        return users;

    }

    public LogUsers toLogUsers(String usersId) {
        LogUsers log = new LogUsers();

        log.setMessage(this.message);
        log.setTypeLog(this.typeLog);
        log.setUsersId(this.usersId);

        return log;
    }

    //public UsersDto() {

   // }

    @Override
    public String toString() {
        return "UsersDto [id=" + id + ", name=" + name + ", email=" + email + ", status=" + status + ", token=" + token
                + ", password=" + password + ", dataMovimentacao=" + dataMovimentacao + ", idLog=" + idLog
                + ", typeLog=" + typeLog + ", message=" + message + ", usersId=" + usersId + ", dataHora=" + dataHora
                + "]";
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


    public String getIdLog() {
        return idLog;
    }


    public void setIdLog(String idLog) {
        this.idLog = idLog;
    }


    public String getTypeLog() {
        return typeLog;
    }


    public void setTypeLog(String typeLog) {
        this.typeLog = typeLog;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public String getUsersId() {
        return usersId;
    }


    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }


    public LocalDateTime getDataHora() {
        return dataHora;
    }


    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

}

