package com.projeto.indivual;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Usuario {
    private Integer idUsuario;
    private String nickname;
    private Integer fk_metrica;

    public Usuario(Integer idUsuario, String nickname, Integer fk_metrica) {
        this.idUsuario = idUsuario;
        this.nickname = nickname;
        this.fk_metrica = fk_metrica;
    }

    public Usuario() {
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
