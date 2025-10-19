package br.edu.ifsp.prw3.avaliacao03.mecanico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {
    private String nomeMecanico;
    private int anosExp;

    public Mecanico(DadosMecanico dados){
        this.nomeMecanico = dados.nomeMecanico();
        this.anosExp = dados.anosExp();
    }
}
