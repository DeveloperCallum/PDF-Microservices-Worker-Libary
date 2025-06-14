package dto.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import dto.ExtractionMethod;

import java.io.IOException;

public class ExtractionMethodDeserializer extends JsonDeserializer<ExtractionMethod> {
    @Override
    public ExtractionMethod deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec oc = jsonParser.getCodec();
        JsonNode node = oc.readTree(jsonParser);

        if (node == null) {
            return null;
        }

        String text = node.textValue().toLowerCase(); //none, column_indexing.

        return switch (text) {
            case "none" -> ExtractionMethod.NONE;
            case "column_indexing" -> ExtractionMethod.COLUMN_INDEXING;
            default -> throw new IllegalArgumentException("Unknown ExtractionMethod: " + text);
        };
    }
}
