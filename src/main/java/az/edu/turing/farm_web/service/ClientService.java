package az.edu.turing.farm_web.service;

import az.edu.turing.farm_web.domain.entity.Client;
import az.edu.turing.farm_web.domain.entity.ERole;
import az.edu.turing.farm_web.domain.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client createClient(Client client) {
        client.setRole(ERole.CLIENT);
        return clientRepository.save(client);
    }

    public Client updateClient(Long id, Client client) {
        Client existingClient = getClientById(id);
        if (existingClient != null) {
            // Update logic if needed
            return clientRepository.save(existingClient);
        }
        return null;
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
