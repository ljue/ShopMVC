package entities;

import javax.persistence.*;

/**
 * Created by Людмила on 14.07.2017.
 */
@Entity
@Table(name = "Camera", schema = "myshop_schema")
public class CameraEntity {
    private int cameraId;
    private String cameraName;

    @Id
    @Column(name = "CameraId", nullable = false)
    public int getCameraId() {
        return cameraId;
    }

    public void setCameraId(int cameraId) {
        this.cameraId = cameraId;
    }

    @Basic
    @Column(name = "CameraName", nullable = false, length = 50)
    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CameraEntity that = (CameraEntity) o;

        if (cameraId != that.cameraId) return false;
        if (cameraName != null ? !cameraName.equals(that.cameraName) : that.cameraName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cameraId;
        result = 31 * result + (cameraName != null ? cameraName.hashCode() : 0);
        return result;
    }
}
