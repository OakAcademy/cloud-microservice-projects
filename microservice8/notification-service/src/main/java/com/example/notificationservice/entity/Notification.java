package com.example.notificationservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="notifications")
@EqualsAndHashCode(of={"id"})
@NoArgsConstructor
@AllArgsConstructor

public class Notification {
    @Getter
    @Setter
    @Column(name = "ticketId")
    private String ticketId;
    @Getter
    @Setter
    @Column(name = "accountId")
    private String accountId;

    @Getter
    @Setter
    @Column(name = "description")
    private String description;
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    @Getter
    private String id;}
