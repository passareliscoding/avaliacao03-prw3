package br.edu.ifsp.prw3.avaliacao03.usuario;

import jakarta.validation.constraints.NotBlank;

public record dadosAutenticacao(
        @NotBlank
        String login,
        @NotBlank
        String senha
) {
}
