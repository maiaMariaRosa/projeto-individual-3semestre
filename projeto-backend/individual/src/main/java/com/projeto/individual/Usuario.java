package com.projeto.individual;

public class Usuario {
    private Integer idNickname;
    private String nickname;
    private String jaAssistiu;

    public Usuario(Integer idNickname, String nickname, String jaAssistiu) {
        this.idNickname = idNickname;
        this.nickname = nickname;
        this.jaAssistiu = jaAssistiu;
    }

    public Usuario() {
    }

    public Integer getIdNickname() {
        return idNickname;
    }

    public void setIdNickname(Integer idNickname) {
        this.idNickname = idNickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getJaAssistiu() {
        return jaAssistiu;
    }

    public void setJaAssistiu(String jaAssistiu) {
        this.jaAssistiu = jaAssistiu;
    }
}
