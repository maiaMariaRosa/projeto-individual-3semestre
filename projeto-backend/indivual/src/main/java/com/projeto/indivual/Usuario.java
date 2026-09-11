package com.projeto.indivual;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

public class Usuario {
    private Integer idUsuario;
    private String nickname;
    private Integer idade;
    private Integer fk_metrica;
    private Date dataNascimento;

    public Usuario(Integer idUsuario, String nickname, Integer idade, Integer fk_metrica, Date dataNascimento) {
        this.idUsuario = idUsuario;
        this.nickname = nickname;
        this.idade = idade;
        this.fk_metrica = fk_metrica;
        this.dataNascimento = dataNascimento;
    }

    public Usuario() {
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer setIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getFk_metrica() {
        return fk_metrica;
    }

    public void setFk_metrica(Integer fk_metrica) {
        this.fk_metrica = fk_metrica;
    }
}
