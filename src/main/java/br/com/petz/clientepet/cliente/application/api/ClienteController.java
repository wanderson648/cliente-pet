package br.com.petz.clientepet.cliente.application.api;

import br.com.petz.clientepet.cliente.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {

    private final ClienteService clienteService;

    @Override
    public ClienteResponse postCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - postCliente");
        return clienteService.criaCliente(clienteRequest);
    }

    @Override
    public List<ClienteListResponse> getTodosClientes() {
        log.info("[inicia] ClienteController - getTodosClientes");
        List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
        log.info("[finaliza] ClienteController - getTodosClientes");
        return clientes;
    }

    @Override
    public ClienteDetalhadoResponse getClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteController - getClienteAtravesId");
        log.info("[idCliente] - {}", idCliente);
        ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteAtravesId(idCliente);
        log.info("[finaliza] ClienteController - getClienteAtravesId");
        return clienteDetalhado;
    }

    @Override
    public void deleteClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteController - deleteClienteAtravesId");
        log.info("[idCliente] - {}", idCliente);
        clienteService.deletaClienteAtravesId(idCliente);
        log.info("[finaliza] ClienteController - deleteClienteAtravesId");
    }

    @Override
    public void patchAlteraCliente(UUID idCliente,
                                   @Valid ClienteAteracaoRequest clienteAteracaoRequest) {
        log.info("[inicia] ClienteController - patchAlteraCliente");
        log.info("[idCliente] - {}", idCliente);
        log.info("[finaliza] ClienteController - patchAlteraCliente");
    }


}
