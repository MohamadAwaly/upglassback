package be.upglassback.core.entities;

import be.upglassback.core.entities.compoundID.WindowOrderPK;
import be.upglassback.core.enums.OperationTypeEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@NamedQueries(value = {
        @NamedQuery(name = "WindowsOrder.byORder", query = "select wo from WindowOrder wo "
                + "where wo.order = :order")
})
@Entity
@IdClass(WindowOrderPK.class)
@Table(name = "windows_orders")
public class WindowOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "orders", nullable = false)
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    @Id
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "windows", nullable = false)
    private Window window;

    @Column(name = "unite_price", nullable = false)
    private int unitePrice;

    @Column(name = "qty", nullable = false)
    private int qty;

    @Column(name = "operation_type", nullable = false, length = 255)
    @Enumerated(EnumType.STRING)
    private OperationTypeEnum operationTypeEnum;

    public void setWindow(Window window) {
        this.window = window;
    }

    public Order getOrder() {
        return order;
    }

    public Window getWindow() {
        return window;
    }

    public int getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(int unitePrice) {
        this.unitePrice = unitePrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public OperationTypeEnum getOperationTypeEnum() {
        return operationTypeEnum;
    }

    public void setOperationTypeEnum(OperationTypeEnum operationTypeEnum) {
        this.operationTypeEnum = operationTypeEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        WindowOrder that = (WindowOrder) o;
        return unitePrice == that.unitePrice && qty == that.qty && Objects.equals(order, that.order)
                && Objects.equals(window, that.window) && operationTypeEnum == that.operationTypeEnum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, window, unitePrice, qty, operationTypeEnum);
    }
}
