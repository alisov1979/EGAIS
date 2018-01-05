
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WoodBreedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WoodBreedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tnved"/>
 *     &lt;enumeration value="okpd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WoodBreedType", namespace = "http://lookup.lesuser.lesegais.ru/")
@XmlEnum
public enum WoodBreedType {


    /**
     * Для использования в экспортных сделках
     * 
     */
    @XmlEnumValue("tnved")
    TNVED("tnved"),

    /**
     * Для использования внутри России
     * 
     */
    @XmlEnumValue("okpd")
    OKPD("okpd");
    private final String value;

    WoodBreedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WoodBreedType fromValue(String v) {
        for (WoodBreedType c: WoodBreedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
