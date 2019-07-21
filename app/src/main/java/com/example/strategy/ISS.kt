package com.example.strategy

class ISS : Imposto {
	override fun calcularImpoto(orcamento: Orcamento): Double {
		return orcamento.valor * 0.6
	}
}