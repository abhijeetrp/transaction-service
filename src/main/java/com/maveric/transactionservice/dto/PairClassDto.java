package com.maveric.transactionservice.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
public class PairClassDto {
    private TransactionDto transactionDto;
    private BalanceDto balanceDto;
}