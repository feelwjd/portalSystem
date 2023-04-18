package portal.eventlistener;

import portal.fep.FepLibrary;
import portal.kafka.KafkaProducer;
import portal.kafka.Message;
import portal.model.Stock;
import com.sun.jna.Pointer;

public class StockDataEventTrigger {

    private FepLibrary fepLibrary;

    private KafkaProducer kafkaProducerService;

    public StockDataEventTrigger(FepLibrary fepLibrary, KafkaProducer kafkaProducerService) {
        this.fepLibrary = fepLibrary;
        this.kafkaProducerService = kafkaProducerService;
    }

    public void registerEventTrigger() {
        fepLibrary.fepSetCallback(new FepLibrary.FepCallback() {
            @Override
            public void invoke(Pointer pStock) {
                // FEP에서 수신한 새로운 주식 데이터를 파싱
                Stock stock = parseStockData(pStock);

                // Kafka Producer를 사용하여 메시지를 보내기
                kafkaProducerService.sendStock(stock);
            }
        });
        fepLibrary.fepRegisterEvent("NewStockData");
    }

    private Stock parseStockData(Pointer pStock) {
		return null;
        // FEP에서 수신한 주식 데이터를 파싱하는 로직
        // ...
    }
}
