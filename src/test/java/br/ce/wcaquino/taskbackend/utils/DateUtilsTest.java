package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Test;

import org.junit.Assert;

public class DateUtilsTest {
	

   @Test	
   public void deveRetornarTrueParaDatasFuturas() {
	   LocalDate date = LocalDate.of(2032, 01, 01);
	   Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
   }
   
   @Test
   public void deveRetornarFalseParaDatasPassadas() {
	   LocalDate date = LocalDate.of(2022, 01, 01);
	   Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
   }
   
   @Test
   public void deveRetornarFalseParaDataAtual() {
	   LocalDate date = LocalDate.now();
	   Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
   }
}
