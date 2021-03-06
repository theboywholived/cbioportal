package org.cbioportal.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class MutSig implements Serializable {
    
    private Integer cancerStudyId;
    private String cancerStudyIdentifier;
    private Integer entrezGeneId;
    private String hugoGeneSymbol;
    private Integer rank;
    private Integer numbasescovered;
    private Integer nummutations;
    private BigDecimal pValue;
    private BigDecimal qValue;

    public Integer getCancerStudyId() {
        return cancerStudyId;
    }

    public void setCancerStudyId(Integer cancerStudyId) {
        this.cancerStudyId = cancerStudyId;
    }

    public String getCancerStudyIdentifier() {
        return cancerStudyIdentifier;
    }

    public void setCancerStudyIdentifier(String cancerStudyIdentifier) {
        this.cancerStudyIdentifier = cancerStudyIdentifier;
    }

    public Integer getEntrezGeneId() {
        return entrezGeneId;
    }

    public void setEntrezGeneId(Integer entrezGeneId) {
        this.entrezGeneId = entrezGeneId;
    }

    public String getHugoGeneSymbol() {
        return hugoGeneSymbol;
    }

    public void setHugoGeneSymbol(String hugoGeneSymbol) {
        this.hugoGeneSymbol = hugoGeneSymbol;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getNumbasescovered() {
        return numbasescovered;
    }

    public void setNumbasescovered(Integer numbasescovered) {
        this.numbasescovered = numbasescovered;
    }

    public Integer getNummutations() {
        return nummutations;
    }

    public void setNummutations(Integer nummutations) {
        this.nummutations = nummutations;
    }

    public BigDecimal getpValue() {
        return pValue;
    }

    public void setpValue(BigDecimal pValue) {
        this.pValue = pValue;
    }

    public BigDecimal getqValue() {
        return qValue;
    }

    public void setqValue(BigDecimal qValue) {
        this.qValue = qValue;
    }
}