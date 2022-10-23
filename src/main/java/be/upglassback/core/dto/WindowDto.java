package be.upglassback.core.dto;

import be.upglassback.core.entities.*;

import java.util.Collection;

public class WindowDto {


    private int idWindow;
    private String code;
    private String name;
    private int totalQty;
    private int unitSalePrice;

    private ModelDto model;

    private WindowsType windowsType;
    private Collection<WindowOptionWindow> windowOptionWindows;
    private Collection<WindowOrder> windowOrders;
    private Collection<BillingDocumentWindow> billingDocumentWindows;

    //Constructor
    public WindowDto() {
    }

    public int getIdWindow() {
        return idWindow;
    }

    public void setIdWindow(int idWindow) {
        this.idWindow = idWindow;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitSalePrice() {
        return unitSalePrice;
    }

    public void setUnitSalePrice(int unitSalePrice) {
        this.unitSalePrice = unitSalePrice;
    }

    public ModelDto getModel() {
        return model;
    }

    public void setModel(ModelDto model) {
        this.model = model;
    }

    public WindowsType getWindowsType() {
        return windowsType;
    }

    public void setWindowsType(WindowsType windowsType) {
        this.windowsType = windowsType;
    }

    public Collection<WindowOptionWindow> getCarOptionWindows() {
        return windowOptionWindows;
    }

    public void setCarOptionWindows(Collection<WindowOptionWindow> windowOptionWindows) {
        this.windowOptionWindows = windowOptionWindows;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public Collection<WindowOptionWindow> getWindowOptionWindows() {
        return windowOptionWindows;
    }

    public void setWindowOptionWindows(Collection<WindowOptionWindow> windowOptionWindows) {
        this.windowOptionWindows = windowOptionWindows;
    }

    public Collection<WindowOrder> getWindowOrders() {
        return windowOrders;
    }

    public void setWindowOrders(Collection<WindowOrder> windowOrders) {
        this.windowOrders = windowOrders;
    }

    public Collection<BillingDocumentWindow> getBillingDocumentWindows() {
        return billingDocumentWindows;
    }

    public void setBillingDocumentWindows(Collection<BillingDocumentWindow> billingDocumentWindows) {
        this.billingDocumentWindows = billingDocumentWindows;
    }


}
