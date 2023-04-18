package portal.eventlistener;

import org.springframework.stereotype.Component;

import portal.kafka.KafkaProducer;
import portal.model.Stock;

@Component
public class StockEventListener {

    private final KafkaProducer kafkaProducer;

    public StockEventListener(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public void onNewStockData(Stock stock) {
        kafkaProducer.sendStock(stock);
    }

    public void onDataReceiveError(String errorMessage) {
        // handle error
    }

    public void onJnaModuleUpdate() {
        // handle module update
    }

    public void onFepUpdate() {
        // handle fep update
    }
}
