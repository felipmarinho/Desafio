package br.com.felipefmarinho.seat.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipefmarinho.seat.modelo.RespostaTiquetesSenha;

@RestController
@RequestMapping("/solicitacoes")
public class SolicitacaoResource {
	
	@PostMapping("/tiquetesSenhas")
	public ResponseEntity<RespostaTiquetesSenha> adicionarOrdenacaoTiquetesNaoAtendidos(@RequestBody RespostaTiquetesSenha respostaTiquetesSenha){// RetornoSenhas retornoSenhas) {
		System.out.println(respostaTiquetesSenha.imprmirResultado());
		return ResponseEntity.status(HttpStatus.OK).body(respostaTiquetesSenha);
	}
}
