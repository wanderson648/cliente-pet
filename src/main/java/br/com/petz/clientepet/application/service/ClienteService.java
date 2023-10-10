package br.com.petz.clientepet.application.service;

import br.com.petz.clientepet.application.api.ClienteListResponse;
import br.com.petz.clientepet.application.api.ClienteRequest;
import br.com.petz.clientepet.application.api.ClienteResponse;

import java.util.List;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
}
