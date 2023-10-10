package br.com.petz.clientepet.application.service;

import br.com.petz.clientepet.application.api.ClienteRequest;
import br.com.petz.clientepet.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteApplicationService - criaCliente");
        log.info("[finaliza] ClienteApplicationService - criaCliente");
        return null;
    }
}
