package br.edu.ifsp.prw3.avaliacao03.conserto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoConserto(
        @NotNull Long id,
        String dataSaida,
        String nomeMecanico,
        String anosExp
) {
}
