package portal.kafka;

import org.apache.kafka.common.serialization.Deserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

public class JsonDeserializer<T> extends ObjectMapper implements Deserializer<T> {

    private Class<T> type;

    public JsonDeserializer(Class<T> type) {
        this.type = type;
    }

    @Override
    public void configure(Map<String, ?> props, boolean isKey) {}

    @Override
    public T deserialize(String topic, byte[] bytes) {
        try {
            return readValue(bytes, type);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {}
}
