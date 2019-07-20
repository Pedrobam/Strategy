package com.example.strategy

class CalculadorDeImpostos {

	fun realizaCalculo(orcamento: Orcamento, imposto: String): Double {
		if ("ICMS" == imposto) {
			return orcamento.valor * 0.1
		} else if ("ISS" == imposto) {
			return orcamento.valor * 0.6
		}
		return 0.0
	}
}