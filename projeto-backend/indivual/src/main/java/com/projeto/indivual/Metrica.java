package com.projeto.indivual;

public class Metrica {
    private Integer idMetrica;
    private String opcao;

    public Metrica(Integer idMetrica, String opcao) {
        this.idMetrica = idMetrica;
        this.opcao = opcao;
    }

    public Metrica() {
    }

    public Integer getIdMetrica() {
        return idMetrica;
    }

    public void setIdMetrica(Integer idMetrica) {
        this.idMetrica = idMetrica;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }
}
