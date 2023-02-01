package com.example.notificationservice.service;

import java.util.List;

import com.example.notificationservice.dto.NotificationDTO;

public interface NotificationService {
	 NotificationDTO save(NotificationDTO noti);
	    NotificationDTO getById(String id);
	    NotificationDTO delete(String id);
	    List<NotificationDTO> getAll();
}
