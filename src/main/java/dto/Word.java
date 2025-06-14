package dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Word {
    @JsonIgnore
    private final List<TextPosition> letters = new ArrayList<>();
    private String word;
    private float x;
    private float y;

    public Word() {
    }

    public boolean add(TextPosition textPosition) {
        return letters.add(textPosition);
    }

    public List<TextPosition> getLetters() {
        return letters;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
