
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeclarationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeclarationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="deal"/>
 *     &lt;enumeration value="legacy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeclarationType", namespace = "http://common.lesuser.lesegais.ru/")
@XmlEnum
public enum DeclarationType {


    /**
     * Новая
     * 
     */
    @XmlEnumValue("deal")
    DEAL("deal"),

    /**
     * Старая
     * 
     */
    @XmlEnumValue("legacy")
    LEGACY("legacy");
    private final String value;

    DeclarationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeclarationType fromValue(String v) {
        for (DeclarationType c: DeclarationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
