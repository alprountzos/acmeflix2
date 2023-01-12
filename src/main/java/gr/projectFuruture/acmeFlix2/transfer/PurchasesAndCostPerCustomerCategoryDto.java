package gr.projectFuruture.acmeFlix2.transfer;

import java.math.BigDecimal;

public interface PurchasesAndCostPerCustomerCategoryDto {
	String getCategory();

	Long getPurchases();

	BigDecimal getCost();
}
