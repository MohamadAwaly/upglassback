package be.upglassback.core.dto;

import java.util.Date;

public class ModelDto {

    private int idModel;
    private String modelName;
    private String code;
    private BrandDTO brand;
    private BodyShellTypeDTO bodyShellType;


    //Constructor
    public ModelDto() {

    }

    public int getIdModel() {
        return idModel;
    }

    public void setIdModel(int idModel) {
        this.idModel = idModel;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public BrandDTO getBrand() {
        return brand;
    }

    public void setBrand(BrandDTO brand) {
        this.brand = brand;
    }

    public BodyShellTypeDTO getBodyShellType() {
        return bodyShellType;
    }

    public void setBodyShellType(BodyShellTypeDTO bodyShellType) {
        this.bodyShellType = bodyShellType;
    }
}
