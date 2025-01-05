package com.restaurant.restaurant.management.dtoConverter;

import com.restaurant.restaurant.management.dto.ClientResponseDto;
import com.restaurant.restaurant.management.models.Client;

public class ClientMapper {
    public static ClientResponseDto toDto(Client client) {
        ClientResponseDto dto = new ClientResponseDto();
        dto.setIdClient(client.getIdClient());
        dto.setClientName(client.getClientName());
        dto.setEmail(client.getEmail());
        dto.setPhoneNumber(client.getPhoneNumber());
        return dto;
    }

    public static Client toEntity(ClientResponseDto dto) {
        Client client = new Client();
        client.setIdClient(dto.getIdClient());
        client.setClientName(dto.getClientName());
        client.setEmail(dto.getEmail());
        client.setPhoneNumber(dto.getPhoneNumber());
        return client;
    }
}