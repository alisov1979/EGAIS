
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="draft"/>
 *     &lt;enumeration value="signed"/>
 *     &lt;enumeration value="editing"/>
 *     &lt;enumeration value="deleted"/>
 *     &lt;enumeration value="error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectStatus", namespace = "http://common.lesuser.lesegais.ru/")
@XmlEnum
public enum ObjectStatus {


    /**
     * Черновик
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * Подписан
     * 
     */
    @XmlEnumValue("signed")
    SIGNED("signed"),

    /**
     * Редактируется
     * 
     */
    @XmlEnumValue("editing")
    EDITING("editing"),

    /**
     * Удален
     * 
     */
    @XmlEnumValue("deleted")
    DELETED("deleted"),

    /**
     * Ошибка
     * 
     */
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    ObjectStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjectStatus fromValue(String v) {
        for (ObjectStatus c: ObjectStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
