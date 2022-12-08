package com.github.nibiroo.service;

import com.github.nibiroo.model.Client;
import com.github.nibiroo.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsServices {

    private ClientsRepository repository;

    // Autowired indicates a point where automatic injection should be applied. This can be used in methods, attributes and constructors.
    @Autowired
    public ClientsServices( ClientsRepository repository ) {
        this.repository = repository;
    }

    public void saveClients(Client client) {
        validateClient(client);
        ClientsRepository clientsRepository = new ClientsRepository();
        clientsRepository.persist(client);
    }

    public void validateClient(Client client) {
        // Apply validate

    }
}
