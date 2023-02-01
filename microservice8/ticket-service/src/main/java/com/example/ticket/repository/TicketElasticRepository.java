package com.example.ticket.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.ticket.entity.elastic.TicketModel;

public interface TicketElasticRepository extends ElasticsearchRepository<TicketModel, String> {

}

