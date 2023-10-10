package br.com.petz.clientepet.application.service;

import br.com.petz.clientepet.application.api.ClienteRequest;
import br.com.petz.clientepet.application.api.ClienteResponse;
import br.com.petz.clientepet.application.repository.ClienteRepository;
import br.com.petz.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
    public final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteApplicationService - criaCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
    }
}
