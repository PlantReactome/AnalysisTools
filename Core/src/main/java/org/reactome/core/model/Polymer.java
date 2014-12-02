package org.reactome.core.model;

// Generated Jul 8, 2011 1:48:55 PM by Hibernate Tools 3.4.0.CR1

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Polymer generated by hbm2java
 */
@XmlRootElement
public class Polymer extends PhysicalEntity {

    private Integer maxUnitCount;
    private Integer minUnitCount;
    private String totalProt;
    private String maxHomologues;
    private String inferredProt;
    private List<PhysicalEntity> repeatedUnit;
    private List<Species> species;

    public Polymer() {
    }

    public List<PhysicalEntity> getRepeatedUnit() {
        return repeatedUnit;
    }

    public void setRepeatedUnit(List<PhysicalEntity> repeatedUnit) {
        this.repeatedUnit = repeatedUnit;
    }

    public List<Species> getSpecies() {
        return species;
    }

    public void setSpecies(List<Species> species) {
        this.species = species;
    }

    public Integer getMaxUnitCount() {
        return this.maxUnitCount;
    }

    public void setMaxUnitCount(Integer maxUnitCount) {
        this.maxUnitCount = maxUnitCount;
    }

    public Integer getMinUnitCount() {
        return this.minUnitCount;
    }

    public void setMinUnitCount(Integer minUnitCount) {
        this.minUnitCount = minUnitCount;
    }

    public String getTotalProt() {
        return this.totalProt;
    }

    public void setTotalProt(String totalProt) {
        this.totalProt = totalProt;
    }

    public String getMaxHomologues() {
        return this.maxHomologues;
    }

    public void setMaxHomologues(String maxHomologues) {
        this.maxHomologues = maxHomologues;
    }

    public String getInferredProt() {
        return this.inferredProt;
    }

    public void setInferredProt(String inferredProt) {
        this.inferredProt = inferredProt;
    }

}