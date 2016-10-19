package com.andreitoledo.cobranca.util.boleto.bopepo;

import java.awt.Desktop;
import java.io.File;
import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.andreitoledo.cobranca.model.Cedente;
import com.andreitoledo.cobranca.model.Cobranca;
import com.andreitoledo.cobranca.model.ContaBancaria;
import com.andreitoledo.cobranca.model.Sacado;
import com.andreitoledo.cobranca.util.boleto.EmissorBoleto;
import com.andreitoledo.cobranca.util.modulo11.GeradorDigitoVerificador;

public class BopepoEmissorBoletoTest {

	private EmissorBoleto emissorBoleto;
	
	@Before
	public void init() {
		GeradorDigitoVerificador geradorDigitoVerificador = new GeradorDigitoVerificador();
		emissorBoleto = new BopepoEmissorBoleto(geradorDigitoVerificador);
	}
	
	@Test
	public void deve_gerar_boleto_em_arquivo() throws Exception {
		Cedente cedenteSistema = new Cedente();
		cedenteSistema.setNome("AT Systems");
		cedenteSistema.setCnpj("10.687.566/0001-97");
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setAgencia(1111);
		contaBancaria.setDigitoAgencia("0");
		contaBancaria.setNumero(2222);
		contaBancaria.setDigitoConta("9");
		contaBancaria.setCodigoCarteira(6);
		cedenteSistema.setContaBancaria(contaBancaria);
		
		Cobranca cobrancaSistema = new Cobranca();
		cobrancaSistema.setCodigo(1L);
		cobrancaSistema.setDataVencimento(new Date());
		cobrancaSistema.setValor(new BigDecimal("200.22"));
		
		Sacado sacado = new Sacado();
		sacado.setNome("Maria Santos");
		cobrancaSistema.setSacado(sacado);
		
		File boleto = this.emissorBoleto.gerarBoletoEmArquivo("boletoTeste1.pdf", cedenteSistema, cobrancaSistema);
		Desktop desktop = Desktop.getDesktop();
		desktop.open(boleto);
	}
	
}
