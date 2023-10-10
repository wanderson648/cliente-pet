package br.com.petz.clientepet.application.service;

import br.com.petz.clientepet.application.api.ClienteRequest;
import br.com.petz.clientepet.application.api.ClienteResponse;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
