package org.ajug.web.domain;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.ajug.web.config.DateAdapter;

public class Snippet {
    
    private String id;
    private String title;
    private String code;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date created;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date modified;

    public Snippet(String title, String code) {
    		this.id = java.util.UUID.randomUUID().toString();
        this.title = title;
        this.code = code;
        this.created = new Date();
        this.modified = new Date();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
    
}