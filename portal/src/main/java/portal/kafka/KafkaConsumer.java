package portal.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void consumeMessage(Message message) {
        logger.info("Received message: {}", message);
        String messageType = message.getType();
        Object messageData = message.getData();

        if (messageType.equals("login")) {
            // handle login message
            // ...
        } else if (messageType.equals("signup")) {
            // handle signup message
            // ...
        } else {
            // handle other message types
            // ...
        }
    }
}

