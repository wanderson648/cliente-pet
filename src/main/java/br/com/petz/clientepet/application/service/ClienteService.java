package br.com.petz.clientepet.application.service;

import br.com.petz.clientepet.application.api.ClienteDetalhadoResponse;
import br.com.petz.clientepet.application.api.ClienteListResponse;
import br.com.petz.clientepet.application.api.ClienteRequest;
import br.com.petz.clientepet.application.api.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
