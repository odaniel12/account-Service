package com.bank.client.service;

import com.bank.client.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface    ClientService {
    public Flux<Client> findAllService();
    public Mono<Client> findByClientService(String idClient);
    public Mono<Client> saveClientService(Client client);
    public Mono<Void> deleteClientService(String idClient);

}
