package portal.eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.kafka.core.KafkaTemplate;

public class EventListener implements ApplicationListener<MyEvent>{
	    
    @Override
    public void onApplicationEvent(MyEvent event) {
        // Perform some logic
        String processedData = event.getData() + " processed";
        

    }
}
