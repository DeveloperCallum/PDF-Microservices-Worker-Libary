package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dto.deserializer.ExtractionMethodDeserializer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonPropertyOrder(value = {"extract_method", "x1", "y1", "x2", "y2"})
public class Selection implements Serializable {
    @JsonProperty("extract_method")
    @JsonDeserialize(using = ExtractionMethodDeserializer.class)
    private ExtractionMethod extractMethod;
    private float x1;
    private float x2;
    private float y1;
    private float y2;

    @JsonProperty("use_x_for_line_assignment")
    private boolean useXForLines = false;

    @JsonProperty("override_line_assignment")
    private boolean overrideLineAssignment = false;

    @JsonProperty("step_size")
    private int stepSize = -1; //disabled.

    private final Map<Integer,List<Word>> lines = new HashMap<>();
    public Selection() {
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }

    public boolean useXForLines() {
        return useXForLines;
    }

    public void setUseXForLines(boolean useXForLines) {
        this.useXForLines = useXForLines;
    }

    public Map<Integer, List<Word>> getLines() {
        return lines;
    }

    public ExtractionMethod getExtractMethod() {
        return extractMethod;
    }

    public void setExtractMethod(ExtractionMethod extractMethod) {
        this.extractMethod = extractMethod;
    }

    public boolean overrideLineAssignment() {
        return overrideLineAssignment;
    }

    public void setOverrideLineAssignment(boolean overrideLineAssignment) {
        this.overrideLineAssignment = overrideLineAssignment;
    }

    public int getStepSize() {
        return stepSize;
    }

    public void setStepSize(int stepSize) {
        this.stepSize = stepSize;
    }

    @Override
    public String toString() {
        return "Selection{" +
                "extractMethod=" + extractMethod +
                ", x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                '}';
    }

    public void addWord(Word word, int n, int step) {
        int key = util.util.HelperFunctions.stepFunction(n, step);
        List<Word> lineData = lines.getOrDefault(key, new ArrayList<Word>());
        lineData.add(word);

        lines.put(key, lineData);
    }
}
