package net.javaguides.banking.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class AccountDto {
	private Long id;
	private String accountHolderName;
	private double balance;
	
	
	
}
