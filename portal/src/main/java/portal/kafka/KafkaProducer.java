package portal.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import portal.model.Stock;

@Service
public class KafkaProducer {

    private static final String TOPIC = "my-topic";

    @Autowired
    private KafkaTemplate<String, Stock> kafkaStockTemplate;
    
    @Autowired
    private KafkaTemplate<String, Message> kafkaMessageTemplate;
    
    public void sendStock(Stock stock) {
    	ListenableFuture<SendResult<String, Stock>> future = kafkaStockTemplate.send(TOPIC, stock);
        future.addCallback(new ListenableFutureCallback<SendResult<String, Stock>>() {
            @Override
            public void onSuccess(SendResult<String, Stock> result) {
                System.out.println("Sent message=[" + stock +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            }

            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Unable to send message=[" + stock + "] due to : " + ex.getMessage());
            }
        });    
    }

    public void sendMessage(Message message) {
    	ListenableFuture<SendResult<String, Message>> future = kafkaMessageTemplate.send(TOPIC, message);
        future.addCallback(new ListenableFutureCallback<SendResult<String, Message>>() {
            @Override
            public void onSuccess(SendResult<String, Message> result) {
                System.out.println("Sent message=[" + message +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            }

            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Unable to send message=[" + message + "] due to : " + ex.getMessage());
            }
        });    
    }
    
}
