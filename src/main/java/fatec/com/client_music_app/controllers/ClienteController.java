package fatec.com.client_music_app.controllers;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fatec.com.client_music_app.models.Client;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ArrayList<Client> clientes = new ArrayList<>();

    public ClienteController() {
        clientes.add(new Client(1L, "Ana Souza", "ana@email.com", "111.111.111-11", "15999999999", "Rua A, 123"));
        clientes.add(new Client(2L, "Bruno Lima", "bruno@email.com", "222.222.222-22", "15888888888", "Rua B, 45"));
        clientes.add(new Client(3L, "Carlos Dias", "carlos@email.com", "333.333.333-33", "15777777777", "Rua C, 67"));
        clientes.add(new Client(4L, "Daniela Costa", "daniela@email.com", "444.444.444-44", "15666666666", "Rua D, 89"));
        clientes.add(new Client(5L, "Eduardo Alves", "eduardo@email.com", "555.555.555-55", "15555555555", "Rua E, 100"));
    }

    @GetMapping
    public ArrayList<Client> getClientes() {
        return clientes;
    }
}