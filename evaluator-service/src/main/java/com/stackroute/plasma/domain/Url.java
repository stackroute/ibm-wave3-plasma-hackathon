package com.stackroute.plasma.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Url.class)
public class Url {
    @JsonProperty("url")
    private String url;
    @JsonProperty("concept")
    private String concept;
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("doc")
    private String doc;

    public Url(String url, String concept, String domain, String doc) {
        this.url = url;
        this.concept = concept;
        this.domain = domain;
        this.doc = doc;
    }

    public Url() {
    }

    public String getUrl() {
        return url;
    }

    public String getConcept() {
        return concept;
    }

    public String getDomain() {
        return domain;
    }

    public String getDoc() {
        return doc;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
    //    public String getConcept() {
//        return concept;
//    }
//
//    public void setConcept(String concept) {
//        this.concept = concept;
//    }
//
//    public String getDomain() {
//        return domain;
//    }
//
//    public void setDomain(String domain) {
//        this.domain = domain;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public void  setDoc(Document doc)
//    {
//        this.doc =  doc;
//    }
//
    @Override
    public String toString() {
        return "Url{" +
                "url='" + url + '\'' +
                ", concept='" + concept + '\'' +
                ", domain='" + domain + '\'' +
                ", doc=" + doc +
                '}';
    }
}