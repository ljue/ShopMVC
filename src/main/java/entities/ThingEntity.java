package entities;

import javax.persistence.*;

/**
 * Created by Людмила on 14.07.2017.
 */
@Entity
@Table(name = "Thing", schema = "myshop_schema")
public class ThingEntity {
    private long thingId;
    private String thingName;
    private int count;
    private int cost;
    private int size;
    private int visibility;
    private CameraEntity cameraByCamera;
    private TranslationEntity translationEntity;




    @Id
    @Column(name = "ThingId", nullable = false)
    public long getThingId() {
        return thingId;
    }

    public void setThingId(long thingId) {
        this.thingId = thingId;
    }

    @Basic
    @Column(name = "ThingName", nullable = false, length = 50)
    public String getThingName() {
        return thingName;
    }

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    @Basic
    @Column(name = "Count", nullable = false)
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Basic
    @Column(name = "Cost", nullable = false)
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "Size", nullable = false)
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Basic
    @Column(name = "Visibility", nullable = false)
    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThingEntity that = (ThingEntity) o;

        if (thingId != that.thingId) return false;
        if (count != that.count) return false;
        if (cost != that.cost) return false;
        if (size != that.size) return false;
        if (visibility != that.visibility) return false;
        if (thingName != null ? !thingName.equals(that.thingName) : that.thingName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (thingId ^ (thingId >>> 32));
        result = 31 * result + (thingName != null ? thingName.hashCode() : 0);
        result = 31 * result + count;
        result = 31 * result + cost;
        result = 31 * result + size;
        result = 31 * result + visibility;
        return result;
    }

    @OneToOne
    @JoinColumn(name = "Camera", referencedColumnName = "CameraId", nullable = false)
    public CameraEntity getCameraByCamera() {
        return cameraByCamera;
    }

    public void setCameraByCamera(CameraEntity cameraByCamera) {
        this.cameraByCamera = cameraByCamera;
    }

    @OneToOne
    @JoinColumn(name = "Camera", referencedColumnName = "TranslationId", nullable = false)
    public TranslationEntity getTranslationEntity() {
        return translationEntity;
    }

    public void setTranslationEntity(TranslationEntity translationEntity) {
        this.translationEntity = translationEntity;
    }

}
