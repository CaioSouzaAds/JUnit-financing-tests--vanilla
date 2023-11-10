package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		// Arrange
		double totalAmountExpected = 100000.0;
		double incomeExpected = 2000.0;
		Integer monthsExpected = 80;
		
		// Action
		Financing fnc = FinancingFactory.createFinancing(
				totalAmountExpected, incomeExpected, monthsExpected);
		
		// Assert
		Assertions.assertEquals(totalAmountExpected, fnc.getTotalAmount());
		Assertions.assertEquals(incomeExpected, fnc.getIncome());
		Assertions.assertEquals(monthsExpected, fnc.getMonths());
	}

}
