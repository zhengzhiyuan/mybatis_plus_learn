package com.zzy.msl.domain.adv;

import java.util.Date;

public class AttributionFirstF {
    private Long id;
    private String uuid;
    private String firstF;
    private Date touchedAt;
    private Date serverTouchedAt;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public String getFirstF() {
        return firstF;
    }
    public void setFirstF(String firstF) {
        this.firstF = firstF;
    }
    public Date getTouchedAt() {
        return touchedAt;
    }
    public void setTouchedAt(Date touchedAt) {
        this.touchedAt = touchedAt;
    }
    public Date getServerTouchedAt() {
        return serverTouchedAt;
    }
    public void setServerTouchedAt(Date serverTouchedAt) {
        this.serverTouchedAt = serverTouchedAt;
    }
    
    
}
