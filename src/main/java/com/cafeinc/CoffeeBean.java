package com.cafeinc;

import java.util.List;

/**
 * Represents a coffee bean with origin, flavor profile, and suggested brew method.
/*/
public class CoffeeBean {
    private String region;
    private String country;
    private String name;
    private List<String> representativeAreas;
    private String flavorProfile;
    private String recommendedBrewMethods;
    private String servingStyles;

    public CoffeeBean(String region, String country, String name, List<String> representativeAreas,
                 String flavorProfile, String recommendedBrewMethods, String servingStyles) {
        this.region = region;
        this.country = country;
        this.name = name;
        this.representativeAreas = representativeAreas;
        this.flavorProfile = flavorProfile;
        this.recommendedBrewMethods = recommendedBrewMethods;
        this.servingStyles = servingStyles;
    }

    public String getRegion() { return region; }
    public String getCountry() { return country; }
    public String getName() { return name; }
    public List<String> getRepresentativeAreas() { return representativeAreas; }
    public String getFlavorProfile() { return flavorProfile; }
    public String getRecommendedBrewMethods() { return recommendedBrewMethods; }
    public String getServingStyles() { return servingStyles; }
}