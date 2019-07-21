package com.example.strategy

class ICMS : Imposto{
	override fun calcularImpoto(orcamento: Orcamento): Double {
		return orcamento.valor * 0.1
	}
}