# spring-cloud-stream-rabbitMq

This service received data from a post request


**_POST http:IP:port/items_** 
```
{
	"name":"Table",
	"price":"100.00",
	"quantity":"12"
}
```

The producer/ItemController receive this request and create a message then send this message to a RabbitMQ

The consumer/ConsumerService Listen to the queue and when there is a new message, it consumes it and save it to the Database.

You can run `GET http:IP:port/items` to see all Items saved in database

Database: H2
MessageQueue: RabbitMQ
Tech: Spring Cloud Stream


The consumer and producer are normally two seperate applications but i merge the here for convenience 