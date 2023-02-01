package com.example.notificationservice;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.example.messagging.TicketNotification;
import com.example.notificationservice.entity.Notification;
import com.example.notificationservice.repository.NotificationRepository;

@EnableBinding(Sink.class)
public class NotificationDistributionService {
	private final NotificationRepository rt;

    public NotificationDistributionService(NotificationRepository rt) {
        this.rt = rt;
    }
    @StreamListener(Sink.INPUT)
    public void onNotification(TicketNotification ticketNotification){
        System.out.println("———————————————————————————————————————————");
        System.out.println("Notification Alindi Kullanicilara gönderiliyor.");
        System.out.println("Notification -> " + ticketNotification.toString());
        Notification nt=new Notification();
        Notification nt2=new Notification();
        nt.setAccountId(ticketNotification.getTicketId());
        nt.setDescription(ticketNotification.getTicketDescription());
        nt.setTicketId(ticketNotification.getTicketId());
        nt2=rt.save(nt);

    }
}
