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
		Financing fnc = FinancingFactory.createFinancing(totalAmountExpected, incomeExpected, monthsExpected);

		// Assert
		Assertions.assertEquals(totalAmountExpected, fnc.getTotalAmount());
		Assertions.assertEquals(incomeExpected, fnc.getIncome());
		Assertions.assertEquals(monthsExpected, fnc.getMonths());
	}

	@Test
	public void constructorShouldThrowExceptionWhenCreateObjectIsInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange
			double totalAmountExpected = 100000.0;
			double incomeExpected = 2000.0;
			Integer monthsExpected = 20;

			// Action
			Financing fnc = FinancingFactory.createFinancing(totalAmountExpected, incomeExpected, monthsExpected);
		});

	}

	@Test
	public void setTotalAmountShouldUpdateTotalAmountWhenValidData() {
		// Arrange
		double totalAmountExpected = 50000.0;
		double updatedTotalAmount = 100000.0;
		double incomeExpected = 2000.0;
		Integer monthsExpected = 80;

		Financing fnc = FinancingFactory.createFinancing(totalAmountExpected, incomeExpected, monthsExpected);

		// Action
		fnc.setTotalAmount(updatedTotalAmount);

		// Assert
		Assertions.assertEquals(updatedTotalAmount, fnc.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldUpdateTotalAmountWhenIsInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {

			// Arrange

			double totalAmountExpected = 100000.0;
			double updatedTotalAmount = 110000.0;
			double incomeExpected = 2000.0;
			Integer monthsExpected = 80;

			Financing fnc = FinancingFactory.createFinancing(totalAmountExpected, incomeExpected, monthsExpected);

			// Action
			fnc.setTotalAmount(updatedTotalAmount);

		});

	}

	@Test
	public void setIncomeShouldUpdateIncomeWhenValidData() {
		// Arrange
		double totalAmountExpected = 50000.0;
		double incomeExpected = 2000.0;
		Integer monthsExpected = 80;

		Financing fnc = FinancingFactory.createFinancing(totalAmountExpected, incomeExpected, monthsExpected);

		// Action
		double updatedIncome = 3000.0;
		fnc.setIncome(updatedIncome);

		// Assert
		Assertions.assertEquals(updatedIncome, fnc.getIncome());
	}

	@Test
	public void setIncomeShouldUpdateIncomeWhenIsInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange
			double totalAmountExpected = 50000.0;
			double incomeExpected = 2000.0;
			Integer monthsExpected = 80;

			Financing fnc = FinancingFactory.createFinancing(totalAmountExpected, incomeExpected, monthsExpected);

			// Action
			double updatedIncome = -1000.0; // Example of invalid data
			fnc.setIncome(updatedIncome);
		});
	}
	
	
	@Test
    public void setMonthsShouldUpdateMonthsWhenValidData() {
        // Arrange
        double totalAmountExpected = 50000.0;
        double incomeExpected = 2000.0;
        Integer monthsExpected = 80;

        Financing fnc = FinancingFactory.createFinancing(totalAmountExpected, incomeExpected, monthsExpected);

        // Action
        Integer updatedMonths = 120;
        fnc.setMonths(updatedMonths);

        // Assert
        Assertions.assertEquals(updatedMonths, fnc.getMonths());
    }

    @Test
    public void setMonthsShouldThrowExceptionWhenIsInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            // Arrange
            double totalAmountExpected = 100000.0;
            double incomeExpected = 2000.0;
            Integer monthsExpected = 80;

            Financing fnc = FinancingFactory.createFinancing(totalAmountExpected, incomeExpected, monthsExpected);

            // Action
            Integer updatedMonths = 20; // Example of invalid data
            fnc.setMonths(updatedMonths);
        });
    }
	

}
