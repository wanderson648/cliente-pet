package br.com.petz.clientepet.application.api;

import lombok.Builder;
import lombok.Value;
import java.util.UUID;

@Value
@Builder
public class ClienteResponse {
    UUID idCliente;
}
