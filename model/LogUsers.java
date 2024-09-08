package com.felipe.costa.model;

import  java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection= "logusers")
public class LogUsers {

    @Id
    private String id;
    private String typeLog;
    private String message;

    @Indexed
    private String usersId;

    private LocalDateTime dataHora;


    public LogUsers() {
        //super();
    }

    public LogUsers(String id, String typeLog, String message, LocalDateTime dataHora, String usersId) {
        //super();


        this.id = id;
        this.typeLog = typeLog;
        this.message = message;
        this.dataHora = dataHora;
        this.usersId = usersId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }


}

