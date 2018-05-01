package com.udemy.cursomc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.udemy.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	/*
	 * implementacao abaixo realizada para atender necessidade interna de calculo de vencimento
	 * poderia ser por exemplo integracao com um webservice de boleto
	 */
	
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}

}
