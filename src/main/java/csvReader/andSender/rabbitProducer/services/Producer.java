package csvReader.andSender.rabbitProducer.services;

import csvReader.andSender.rabbitProducer.entity.PayloadTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Producer implements IMessageProducer<PayloadTemplate> {

    String exchange = "";
    String routingKey = "";

    @Autowired
    @Qualifier("rabbitTemplate")
    RabbitTemplate rabbitTemplate;


    @Override
    public void produce(PayloadTemplate message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }
}
