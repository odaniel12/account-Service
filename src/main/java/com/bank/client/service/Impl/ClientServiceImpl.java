package com.bank.client.service.Impl;

import com.bank.client.model.Client;
import com.bank.client.repository.ClientRepository;
import com.bank.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Flux<Client> findAllService() {
        return clientRepository.findAll();
    }

    @Override
    public Mono<Client> findByClientService(String idClient) {
        return clientRepository.findById(idClient);
    }

    @Override
    public Mono<Client> saveClientService(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Mono<Void> deleteClientService(String idClient) {
        return clientRepository.deleteById(idClient);
    }
}
