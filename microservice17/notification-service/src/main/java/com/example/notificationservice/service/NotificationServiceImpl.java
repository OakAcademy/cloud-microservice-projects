package com.example.notificationservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.notificationservice.dto.NotificationDTO;
import com.example.notificationservice.entity.Notification;
import com.example.notificationservice.repository.NotificationRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {
	 private final NotificationRepository repository;
	    private final ModelMapper modelMapper;
	   
	    

	    @Override
	    public NotificationDTO getById(String id) {
	        Notification noti=repository.findById(id) .orElseThrow(() -> new IllegalArgumentException());;
	        NotificationDTO dto=modelMapper.map(noti,NotificationDTO.class);
	        return dto;
	    }

	    @Override
	    public NotificationDTO delete(String id) {
	        Notification noti=repository.findById(id) .orElseThrow(() -> new IllegalArgumentException());;
	        NotificationDTO dto=modelMapper.map(noti,NotificationDTO.class);
	        repository.delete(noti);
	        return dto;
	    }

	    @Override
	    public List<NotificationDTO> getAll() {
	        List<Notification> list=repository.findAll();
	        List<NotificationDTO> accountlist=list.stream().map(account-> modelMapper.map(account, NotificationDTO.class)).collect(Collectors.toList());
	        return accountlist;
	    }

		@Override
		public NotificationDTO save(NotificationDTO noti) {
	        Notification account = modelMapper.map(noti, Notification.class);
	        account = repository.save(account);
	        noti.setId(account.getId());
	        return noti;
	    }
}
