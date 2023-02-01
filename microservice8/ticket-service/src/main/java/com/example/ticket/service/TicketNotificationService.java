package com.example.ticket.service;

import com.example.ticket.entity.Ticket;

public interface TicketNotificationService {
void sendToQueue(Ticket ticket);
}