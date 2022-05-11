package csvReader.andSender.rabbitProducer.services;

public interface IMessageProducer<T> {

    void produce(T message);

}
