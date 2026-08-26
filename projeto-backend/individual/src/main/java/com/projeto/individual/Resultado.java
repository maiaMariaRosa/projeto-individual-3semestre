package com.projeto.individual;

public class Resultado {
    private Integer idResultado;
    private String personalidade;
    private String descricao;
    private String imagem;

    public Resultado(Integer idResultado, String personalidade, String descricao, String imagem) {
        this.idResultado = idResultado;
        this.personalidade = personalidade;
        this.descricao = descricao;
        this.imagem = imagem;
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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
