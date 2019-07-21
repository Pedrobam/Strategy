package com.example.strategy

import org.junit.Test
import org.junit.Assert.*

class CalculadorDeImpostosTest {

	@Test
	fun icmsTest() {
		val orcamento = Orcamento(1000.0)
		val icms = CalculadorDeImpostos().realizaCalculo(orcamento, ICMS())
		assertEquals(100.0, icms, 0.000001)
	}

	@Test
	fun issTest() {
		val orcamento = Orcamento(1000.0)
		val iss = CalculadorDeImpostos().realizaCalculo(orcamento, ISS())
		assertEquals(600.0, iss, 0.000001)
	}

}