package be.upglassback.core.dto;

public class ModelDto {

    private int idModel;
    private String modelName;
    private String code;
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


}
