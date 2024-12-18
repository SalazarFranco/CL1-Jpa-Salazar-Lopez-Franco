package pe.edu.i202210585.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class countrylanguage {
    @Id
    private String Language;
    private String isOfficial;
    private Double Percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private country country;

    public countrylanguage(){}

    public countrylanguage(String language, String isOfficial, Double percentage, pe.edu.i202210585.model.country country) {
        Language = language;
        this.isOfficial = isOfficial;
        Percentage = percentage;
        this.country = country;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }

    public pe.edu.i202210585.model.country getCountry() {
        return country;
    }

    public void setCountry(pe.edu.i202210585.model.country country) {
        this.country = country;
    }
}
