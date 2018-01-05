
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuplicateStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DuplicateStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="master"/>
 *     &lt;enumeration value="duplicate"/>
 *     &lt;enumeration value="error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DuplicateStatus", namespace = "http://common.lesuser.lesegais.ru/")
@XmlEnum
public enum DuplicateStatus {


    /**
     * Отдельная запись
     * 
     */
    @XmlEnumValue("single")
    SINGLE("single"),

    /**
     * Мастер-запись
     * 
     */
    @XmlEnumValue("master")
    MASTER("master"),

    /**
     * Дубликат
     * 
     */
    @XmlEnumValue("duplicate")
    DUPLICATE("duplicate"),

    /**
     * Потенциальный дубликат
     * 
     */
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    DuplicateStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DuplicateStatus fromValue(String v) {
        for (DuplicateStatus c: DuplicateStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
