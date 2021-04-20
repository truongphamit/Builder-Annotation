package org.truongpq;

public class ConfigBuilder {

    private Config object = new Config();

    public Config build() {
        return object;
    }

    public ConfigBuilder setToken(java.lang.String value) {
        object.setToken(value);
        return this;
    }

}
