package com.projeto.indivual;

public class Resultado {
    private Integer idResultado;
    private String personalidade;
    private String descricao;

    public Resultado(Integer idResultado, String personalidade, String descricao, String imagem) {
        this.idResultado = idResultado;
        this.personalidade = personalidade;
        this.descricao = descricao;
    }

    public Resultado() {
    }

    public Integer getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Integer idResultado) {
        this.idResultado = idResultado;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}