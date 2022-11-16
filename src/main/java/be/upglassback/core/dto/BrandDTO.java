package be.upglassback.core.dto;

import javax.persistence.Column;

public class BrandDTO {

    private int idBrand;
    private String brandName;

    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
