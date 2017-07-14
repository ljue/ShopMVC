package entities;

import javax.persistence.*;

/**
 * Created by Людмила on 14.07.2017.
 */
@Entity
@Table(name = "Translation", schema = "myshop_schema")
public class TranslationEntity {
    private int translationId;
    private String translationName;

    @Id
    @Column(name = "TranslationId", nullable = false)
    public int getTranslationId() {
        return translationId;
    }

    public void setTranslationId(int translationId) {
        this.translationId = translationId;
    }

    @Basic
    @Column(name = "TranslationName", nullable = false, length = 50)
    public String getTranslationName() {
        return translationName;
    }

    public void setTranslationName(String translationName) {
        this.translationName = translationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TranslationEntity that = (TranslationEntity) o;

        if (translationId != that.translationId) return false;
        if (translationName != null ? !translationName.equals(that.translationName) : that.translationName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = translationId;
        result = 31 * result + (translationName != null ? translationName.hashCode() : 0);
        return result;
    }
}
