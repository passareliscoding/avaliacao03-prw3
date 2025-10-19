package br.edu.ifsp.prw3.avaliacao03.conserto;

import br.edu.ifsp.prw3.avaliacao03.mecanico.DadosMecanico;
import br.edu.ifsp.prw3.avaliacao03.veiculo.DadosVeiculo;

public record DadosCadastroConserto(String dataEntrada,
                                    String dataSaida,
                                    DadosMecanico mecanico,
                                    DadosVeiculo veiculo) {
}
