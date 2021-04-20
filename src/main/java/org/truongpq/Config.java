package org.truongpq;

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
