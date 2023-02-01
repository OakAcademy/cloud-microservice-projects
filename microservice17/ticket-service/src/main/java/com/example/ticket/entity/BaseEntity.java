package com.example.ticket.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	@CreatedDate
	@Column(name = "created_at")
	private Date createdAt;
	@Column(name = "updated_at")
	private Date updated_At;
}