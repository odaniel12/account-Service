package com.bank.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor

@Data
@Document(collection = "client")
public class Client {
    @Id
    public String idClient;
    public String name;
    public String lastname;
    public String dni;
    public String direction;
    public String ruc;

}
