
#### Account Servisi (Account Yaratma)
```
 http://localhost:8501/account

{
	"username" : "OAK",
    "name" : "OAK",
    "surname" : "Academy",
    "email" : "oaklearningacademy@gmail.com",
    "birthDate" : "1999-01-01"
}
```

#### Ticket Servisi (Ticket Yaratma)

```
 http://localhost:8502/ticket

{
	"description" : "Test Ticket 1",
    "notes" : "Test Ticket 1 - Docker Compose Hatasi",
    "assignee" : "OAK",
    "priorityType" : "URGENT",
    "ticketStatus" : "OPEN",
    "ticketDate" : "1999-01-01"
}
```