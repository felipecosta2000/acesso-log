package com.felipe.costa.service;

import org.jasypt.util.password.BasicPasswordEncryptor;
import org.springframework.stereotype.Service;


@Service
public class CriptografiaService {

    public String criptografarService(String password) {
        BasicPasswordEncryptor objeto = new BasicPasswordEncryptor();
        String hashSenha = objeto.encryptPassword(password);
        return hashSenha;
    }


    public Boolean checkPassword(String password, String hashPassword) {
        BasicPasswordEncryptor objeto = new BasicPasswordEncryptor();
        return objeto.checkPassword(password, hashPassword);
    }

}

