package pe.edu.i202210585.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class country {
    @Id
    private String Code;
    private String Name;
    private String continent;
    private String Region;
    private Double SurfaceArea;
    private Integer IndepYear;
    private int Population;
    private Double LifeExpectancy;
    private Double GNP;
    private Double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private Integer Capital;
    private String Code2;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<city> citys;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<countrylanguage> languages;

    public country() {
    }

    public country(String code, String name, String continent, String region, Double surfaceArea, Integer indepYear, int population, Double lifeExpectancy, Double GNP, Double GNPOld, String localName, String governmentForm, String headOfState, Integer capital, String code2) {
        Code = code;
        Name = name;
        this.continent = continent;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        LocalName = localName;
        GovernmentForm = governmentForm;
        HeadOfState = headOfState;
        Capital = capital;
        Code2 = code2;
    }

    public country(String code, String name, String continent, String region, Double surfaceArea, Integer indepYear, int population, Double lifeExpectancy, Double GNP, Double GNPOld, String localName, String governmentForm, String headOfState, Integer capital, String code2, List<city> citys, List<countrylanguage> languages) {
        Code = code;
        Name = name;
        this.continent = continent;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        LocalName = localName;
        GovernmentForm = governmentForm;
        HeadOfState = headOfState;
        Capital = capital;
        Code2 = code2;
        this.citys = citys;
        this.languages = languages;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Double getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(Integer indepYear) {
        IndepYear = indepYear;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public Double getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(Double lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public Double getGNP() {
        return GNP;
    }

    public void setGNP(Double GNP) {
        this.GNP = GNP;
    }

    public Integer getCapital() {
        return Capital;
    }

    public void setCapital(Integer capital) {
        Capital = capital;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String headOfState) {
        HeadOfState = headOfState;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        GovernmentForm = governmentForm;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public Double getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(Double GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(String code2) {
        Code2 = code2;
    }

    public List<city> getCitys() {
        return citys;
    }

    public void setCitys(List<city> citys) {
        this.citys = citys;
    }

    public List<countrylanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(List<countrylanguage> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "country{" +
                "Code='" + Code + '\'' +
                ", Name='" + Name + '\'' +
                ", continent='" + continent + '\'' +
                ", Region='" + Region + '\'' +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", Population=" + Population +
                ", LifeExpectancy=" + LifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", LocalName='" + LocalName + '\'' +
                ", GovernmentForm='" + GovernmentForm + '\'' +
                ", HeadOfState='" + HeadOfState + '\'' +
                ", Capital=" + Capital +
                ", Code2='" + Code2 + '\'' +
                ", citys=" + citys +
                ", languages=" + languages +
                '}';
    }
}
