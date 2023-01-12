package gr.projectFuruture.acmeFlix2.transfer;

import java.math.BigDecimal;

public interface PuchasesAndTotalCostPerCustomerDto {
	String getCustomerName();

	Integer getPurchases();

	BigDecimal getCost();

}
