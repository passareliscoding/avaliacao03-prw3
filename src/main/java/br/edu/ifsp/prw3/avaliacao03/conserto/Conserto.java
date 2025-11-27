package br.edu.ifsp.prw3.avaliacao03.conserto;

import br.edu.ifsp.prw3.avaliacao03.mecanico.Mecanico;
import br.edu.ifsp.prw3.avaliacao03.veiculo.Veiculo;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Table(name = "consertos")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Conserto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @EqualsAndHashCode.Include
    @Column(nullable = false, unique = true, updatable = false)
    private final String uuid = UUID.randomUUID().toString();

    @NotBlank
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
    private String dataEntrada;

    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
    private String dataSaida;

    @Embedded
    @Valid
    private Mecanico mecanico;

    @Embedded
    @Valid
    private Veiculo veiculo;

    private Boolean ativo;

    public Conserto(DadosCadastroConserto dados){
        this.ativo = true;
        this.dataEntrada = dados.dataEntrada();
        this.dataSaida = dados.dataSaida();
        this.mecanico = new Mecanico(dados.mecanico());
        this.veiculo = new Veiculo(dados.veiculo());
    }

    public void atualizar(DadosAtualizacaoConserto dados){
        if(dados.dataSaida() != null) {
            this.dataSaida = dados.dataSaida();
        }
        if(dados.nomeMecanico() != null) {
            this.mecanico.setNomeMecanico(dados.nomeMecanico());
        }
        if(dados.anosExp() != null) {
            this.mecanico.setAnosExp(dados.anosExp());
        }
    }

    public void excluir(){
        this.ativo = false;
    }

}
