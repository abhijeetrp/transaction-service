package com.maveric.transactionservice.model;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.management.ConstructorParameters;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Document(collection = "Transaction")
public class Transaction {

    @Id
    private String _id;
    private String accountId;
    private String type;
    private Number amount;
    private String createdAt;

}
