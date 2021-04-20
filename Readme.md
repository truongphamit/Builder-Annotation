#### Example

```java
@Builder
public class Config {
    private String token;
    private Integer caId;

    public String getToken() {
        return token;
    }

    @BuilderProperty
    public void setToken(String token) {
        this.token = token;
    }


    public Integer getCaId() {
        return caId;
    }

    public void setCaId(Integer caId) {
        this.caId = caId;
    }
}
```

...It will generate the following Builder code:

```java
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
```