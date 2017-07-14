package entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Людмила on 14.07.2017.
 */
@Entity
@Table(name = "Order", schema = "myshop_schema")
public class OrderEntity {
    private long orderId;
    private long clientAdress;
    private Timestamp dateTimeOrder;
    private ClientEntity clientByClientId;
    private DeliveryStatusEntity deliveryStatusByDeliveryStatus;
    private BucketEntity bucketByBucket;
    private PayStatusEntity payStatusByPayStatus;
    private PayWayEntity payWayByPayWay;

    @Id
    @Column(name = "OrderId", nullable = false)
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "ClientAdress", nullable = false)
    public long getClientAdress() {
        return clientAdress;
    }

    public void setClientAdress(long clientAdress) {
        this.clientAdress = clientAdress;
    }

    @Basic
    @Column(name = "DateTimeOrder", nullable = false)
    public Timestamp getDateTimeOrder() {
        return dateTimeOrder;
    }

    public void setDateTimeOrder(Timestamp dateTimeOrder) {
        this.dateTimeOrder = dateTimeOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (orderId != that.orderId) return false;
        if (clientAdress != that.clientAdress) return false;
        if (dateTimeOrder != null ? !dateTimeOrder.equals(that.dateTimeOrder) : that.dateTimeOrder != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (orderId ^ (orderId >>> 32));
        result = 31 * result + (int) (clientAdress ^ (clientAdress >>> 32));
        result = 31 * result + (dateTimeOrder != null ? dateTimeOrder.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "ClientId", referencedColumnName = "Id", nullable = false)
    public ClientEntity getClientByClientId() {
        return clientByClientId;
    }

    public void setClientByClientId(ClientEntity clientByClientId) {
        this.clientByClientId = clientByClientId;
    }

    @OneToOne
    @JoinColumn(name = "DeliveryStatus", referencedColumnName = "DeliveryStatusId", nullable = false)
    public DeliveryStatusEntity getDeliveryStatusByDeliveryStatus() {
        return deliveryStatusByDeliveryStatus;
    }

    public void setDeliveryStatusByDeliveryStatus(DeliveryStatusEntity deliveryStatusByDeliveryStatus) {
        this.deliveryStatusByDeliveryStatus = deliveryStatusByDeliveryStatus;
    }

    @OneToOne
    @JoinColumn(name = "Bucket", referencedColumnName = "BucketId", nullable = false)
    public BucketEntity getBucketByBucket() {
        return bucketByBucket;
    }

    public void setBucketByBucket(BucketEntity bucketByBucket) {
        this.bucketByBucket = bucketByBucket;
    }


    @OneToOne
    @JoinColumn(name = "PayStatus", referencedColumnName = "PayStatusId", nullable = false)
    public PayStatusEntity getPayStatusByPayStatus() {
        return payStatusByPayStatus;
    }

    public void setPayStatusByPayStatus(PayStatusEntity payStatusByPayStatus) {
        this.payStatusByPayStatus = payStatusByPayStatus;
    }

    @OneToOne
    @JoinColumn(name = "PayWay", referencedColumnName = "PayWayId", nullable = false)
    public PayWayEntity getPayWayByPayWay() {
        return payWayByPayWay;
    }

    public void setPayWayByPayWay(PayWayEntity payWayByPayWay) {
        this.payWayByPayWay = payWayByPayWay;
    }

}
