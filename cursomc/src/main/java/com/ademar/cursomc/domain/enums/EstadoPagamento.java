package com.ademar.cursomc.domain.enums;

public enum EstadoPagamento {
    PENDENTE(1, "Pendente"), QUITADO(2, "Quitado"), CANCELADO(3, "Cancelado");

    private int codigo;
    private String mensagem;

    private EstadoPagamento(int codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }

    private EstadoPagamento() {

    }

    public int getCodigo() {
        return codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public static EstadoPagamento toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (EstadoPagamento x : EstadoPagamento.values()) {
            if (codigo.equals(x.getCodigo())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + codigo);
    }
}
