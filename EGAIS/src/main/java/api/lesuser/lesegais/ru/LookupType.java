
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LookupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LookupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="woodClass"/>
 *     &lt;enumeration value="woodTnvedClass"/>
 *     &lt;enumeration value="woodBreed"/>
 *     &lt;enumeration value="partyType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LookupType", namespace = "http://api.lesuser.lesegais.ru/")
@XmlEnum
public enum LookupType {


    /**
     * ����� ��������� (������� �� ����������� ����2 ��������� ���������� ����� � �����)
     * 
     */
    @XmlEnumValue("woodClass")
    WOOD_CLASS("woodClass"),

    /**
     * ����� ��������� �� ���������� ����� ��� ������ � ������������ ����������
     * 
     */
    @XmlEnumValue("woodTnvedClass")
    WOOD_TNVED_CLASS("woodTnvedClass"),

    /**
     * ������ (������� ������)
     * 
     */
    @XmlEnumValue("woodBreed")
    WOOD_BREED("woodBreed"),

    /**
     * ��� ���������������� (�����������)
     * 
     */
    @XmlEnumValue("partyType")
    PARTY_TYPE("partyType");
    private final String value;

    LookupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LookupType fromValue(String v) {
        for (LookupType c: LookupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
