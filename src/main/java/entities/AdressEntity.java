package entities;

import javax.persistence.*;

/**
 * Created by Людмила on 14.07.2017.
 */
@Entity
@Table(name = "Adress", schema = "myshop_schema", catalog = "")
public class AdressEntity {
    private long adressId;
    private CountryEntity countryByCountry;
    private RegionEntity regionByRegion;
    private CityEntity cityByCity;

    @Id
    @Column(name = "AdressId", nullable = false)
    public long getAdressId() {
        return adressId;
    }

    public void setAdressId(long adressId) {
        this.adressId = adressId;
    }

    @OneToOne
    @JoinColumn(name = "Country", referencedColumnName = "id", nullable = false)
    public CountryEntity getCountryByCountry() {
        return countryByCountry;
    }

    public void setCountryByCountry(CountryEntity countryByCountry) {
        this.countryByCountry = countryByCountry;
    }

    @OneToOne
    @JoinColumn(name = "Region", referencedColumnName = "id", nullable = false)
    public RegionEntity getRegionByRegion() {
        return regionByRegion;
    }

    public void setRegionByRegion(RegionEntity regionByRegion) {
        this.regionByRegion = regionByRegion;
    }

    @OneToOne
    @JoinColumn(name = "City", referencedColumnName = "id", nullable = false)
    public CityEntity getCityByCity() {
        return cityByCity;
    }

    public void setCityByCity(CityEntity cityByCity) {
        this.cityByCity = cityByCity;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdressEntity that = (AdressEntity) o;

        if (adressId != that.adressId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (adressId ^ (adressId >>> 32));
    }
}
