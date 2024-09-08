package com.felipe.costa.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.felipe.costa.dto.UsersDto;

import com.felipe.costa.model.LogUsers;
import com.felipe.costa.model.Users;

import com.felipe.costa.repository.LogUsersRepository;
import com.felipe.costa.repository.UsersRepository;



@Service
public class UsersService {

    @Autowired
    private CriptografiaService criptografiaService;
    @Autowired
    private com.felipe.costa.repository.UsersRepository usersRepository;
    @Autowired
    private com.felipe.costa.repository.LogUsersRepository logUsersRepository;


    public Object saveUsers(com.felipe.costa.dto.UsersDto dto) throws Exception{
        try {
            com.felipe.costa.model.Users users = dto.toUsersCreate();
            users.setPassword(criptografiaService.criptografarService(users.getPassword()));
            users.setStatus("ACTIVATE");
            users.setToken("NONE");
            users.setDataMovimentacao(LocalDateTime.now());
            com.felipe.costa.model.Users respostaSave = usersRepository.save(users);
            com.felipe.costa.model.LogUsers log = dto.toLogUsers(respostaSave.getId());
            log.setTypeLog("INFO");
            log.setMessage("Users Save");
            log.setDataHora(LocalDateTime.now());
            logUsersRepository.save(log);
            return respostaSave;
        }catch(Exception ex) {
            com.felipe.costa.model.LogUsers log = dto.toLogUsers("000000000000000000099999");
            log.setTypeLog("ERROR");
            log.setMessage("Error :" + ex.getMessage() + "," + dto.getEmail());
            log.setDataHora(LocalDateTime.now());
            logUsersRepository.save(log);
            throw new Exception(ex.getMessage());
        }
    }


    public Object loginUsers (com.felipe.costa.dto.UsersDto dto) throws Exception{
        try {
            com.felipe.costa.model.Users users = dto.toUsersLogin();
            com.felipe.costa.model.Users login = usersRepository.findByEmail(users.getEmail());
            Boolean resposta = criptografiaService.checkPassword(users.getPassword(),  login.getPassword());
            if (resposta) {
                com.felipe.costa.model.LogUsers log = dto.toLogUsers(login.getId());
                log.setTypeLog("INFO");
                log.setMessage("Users Login");
                log.setDataHora(LocalDateTime.now());

                logUsersRepository.save(log);
            }else {
                throw new Exception("Error na Criptografia");
            }
            return login;
        }catch(Exception ex) {
            com.felipe.costa.model.LogUsers log = dto.toLogUsers("000000000000000000088888");
            log.setTypeLog("ERROR");
            log.setMessage("Error :" + ex.getMessage());
            log.setDataHora(LocalDateTime.now());
            logUsersRepository.save(log);
            throw new Exception(ex.getMessage());
        }

    }



}

