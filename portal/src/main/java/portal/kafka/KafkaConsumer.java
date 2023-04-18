package portal.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import portal.model.Stock;

@Service
public class KafkaConsumer {

	private final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    public KafkaConsumer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @KafkaListener(topics = "${kafka.topic}")
    public void processMessage(ConsumerRecord<String, Message> record) {
        Message message = record.value();
        if (message.getType().equals("STOCK_DATA")) {
            Stock stock = (Stock) message.getData();
            logger.info("STOCK_DATA receive : [ " + stock + " ]");
            // stock 데이터 처리 로직
        } else if (message.getType().equals("ERROR")) {
            // 에러 처리 로직
        	logger.info("Can't receive by Error  : [ " + message.getData() + " ]");
        } else if (message.getType().equals("JNA_UPDATE")) {
            // JNA 모듈 업데이트 처리 로직
        	logger.info("JNA Module updated : [ " + message.getData() + " ]");
        } else if (message.getType().equals("FEP_UPDATE")) {
            // FEP 솔루션 업데이트 처리 로직
        	logger.info("FEP Solution updated : [ " + message.getData() + " ]");
        }
    }
}

