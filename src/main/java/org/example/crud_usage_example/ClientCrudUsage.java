package org.example.crud_usage_example;

import org.example.entity.Client;
import org.example.hibernate_util.HibernateUtil;
import org.example.service.ClientCrudService;

public class ClientCrudUsage {
    public static void main(String[] args) {
        ClientCrudService clientCrudService = new ClientCrudService();
        Client newClient = new Client();
        newClient.setName("Misha");
        clientCrudService.create(newClient);

        Client client = clientCrudService.read(1L);
        System.out.println("Client Name: " + client.getName());

        client.setName("Leo");
        clientCrudService.update(client);

        clientCrudService.delete(newClient);
        HibernateUtil.getInstance().close();
    }
}
