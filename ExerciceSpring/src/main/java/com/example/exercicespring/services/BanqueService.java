package com.example.exercicespring.services;

import com.example.exercicespring.Repository.BanqueRepository;
import com.example.exercicespring.Repository.ClientRepository;
import com.example.exercicespring.entites.Banque;
import com.example.exercicespring.entites.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanqueService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private BanqueRepository banqueRepository;

    public List<Client> getAllClients() {
        return (List<Client>) clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(Long id, Client client) {
        Client existingClient = clientRepository.findById(id).orElse(null);
        if (existingClient != null) {
            existingClient.setNom(client.getNom());
            existingClient.setPrenom(client.getPrenom());
            existingClient.setBanque(client.getBanquee());
            existingClient.setListeComptes(client.getListeComptes());
            return clientRepository.save(existingClient);
        }
        return null;
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    public List<Banque> getAllBanques() {
        return (List<Banque>) banqueRepository.findAll();
    }

    public Banque getBanqueById(Long id) {
        return banqueRepository.findById(id).orElse(null);
    }

    public Banque createBanque(Banque banque) {
        return banqueRepository.save(banque);
    }

    public Banque updateBanque(Long id, Banque banque) {
        Banque existingBanque = banqueRepository.findById(id).orElse(null);
        if (existingBanque != null) {
            existingBanque.setNom(banque.getNom());
            existingBanque.setId(banque.getId());
            return banqueRepository.save(existingBanque);
        }
        return null;
    }

    public void deleteBanque(Long id) {
        banqueRepository.deleteById(id);
    }

}

