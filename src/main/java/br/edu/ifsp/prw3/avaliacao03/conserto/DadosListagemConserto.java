package br.edu.ifsp.prw3.avaliacao03.conserto;

public record DadosListagemConserto(String dataEntrada,
                                    String dataSaida,
                                    String nomeMecanico,
                                    String marca,
                                    String modelo) {

    public DadosListagemConserto(Conserto conserto){
        this(conserto.getDataEntrada(),
                conserto.getDataSaida(),
                conserto.getMecanico().getNomeMecanico(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo());
    }
}
