package br.edu.ifsp.prw3.avaliacao03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode =
        EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class Avaliacao03Application {

	public static void main(String[] args) {
		SpringApplication.run(Avaliacao03Application.class, args);
	}

}
