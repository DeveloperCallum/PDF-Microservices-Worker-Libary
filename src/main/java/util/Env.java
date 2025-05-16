package util;

import java.util.function.Consumer;
import java.util.function.Function;

public class Env {
    public static <T> T getEnvOrDefault(String envVar, Function<String,T> callback, T defaultValue) {
        return System.getenv(envVar) != null ? callback.apply(System.getenv(envVar)) : defaultValue;
    }
}