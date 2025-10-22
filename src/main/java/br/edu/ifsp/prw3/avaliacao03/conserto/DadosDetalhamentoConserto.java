package br.edu.ifsp.prw3.avaliacao03.conserto;

public record DadosDetalhamentoConserto(Long id,
                                        String dataEntrada,
                                        String dataSaida,
                                        String nomeMecanico,
                                        String anosExp,
                                        String marca,
                                        String modelo,
                                        String ano,
                                        String cor,
                                        Boolean ativo) {

    public DadosDetalhamentoConserto(Conserto conserto){
        this(conserto.getId(),
                conserto.getDataEntrada(),
                conserto.getDataSaida(),
                conserto.getMecanico().getNomeMecanico(),
                conserto.getMecanico().getAnosExp(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo(),
                conserto.getVeiculo().getAno(),
                conserto.getVeiculo().getCor(),
                conserto.getAtivo());
    }
}
