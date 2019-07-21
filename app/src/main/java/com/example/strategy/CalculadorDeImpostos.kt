package com.example.strategy

class CalculadorDeImpostos {

	fun realizaCalculo(orcamento: Orcamento, qualquerImposto: Imposto): Double {
		return qualquerImposto.calcularImpoto(orcamento)
	}

}