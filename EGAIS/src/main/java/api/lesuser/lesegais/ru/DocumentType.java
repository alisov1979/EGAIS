
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contractLease"/>
 *     &lt;enumeration value="contractRight"/>
 *     &lt;enumeration value="contractForestWorks"/>
 *     &lt;enumeration value="contractPlantsSale"/>
 *     &lt;enumeration value="contractHardwoodDeal"/>
 *     &lt;enumeration value="contractForestDeclaration"/>
 *     &lt;enumeration value="contractReport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentType")
@XmlEnum
public enum DocumentType {


    /**
     * ������� ������ ������ ��������
     * 
     */
    @XmlEnumValue("contractLease")
    CONTRACT_LEASE("contractLease"),

    /**
     * ����� �������� ��� ����������� ����������� ������� ���������
     * 
     */
    @XmlEnumValue("contractRight")
    CONTRACT_RIGHT("contractRight"),

    /**
     * �����������, ��������� � ����� 5 ������ 19 ������� ������� ���������� ���������
     * 
     */
    @XmlEnumValue("contractForestWorks")
    CONTRACT_FOREST_WORKS("contractForestWorks"),

    /**
     * ������� �����-������� ������ ����������
     * 
     */
    @XmlEnumValue("contractPlantsSale")
    CONTRACT_PLANTS_SALE("contractPlantsSale"),

    /**
     * ���������� � ������ � ����������
     * 
     */
    @XmlEnumValue("contractHardwoodDeal")
    CONTRACT_HARDWOOD_DEAL("contractHardwoodDeal"),

    /**
     * ������ ����������
     * 
     */
    @XmlEnumValue("contractForestDeclaration")
    CONTRACT_FOREST_DECLARATION("contractForestDeclaration"),

    /**
     * ����� �� ������������� �����
     * 
     */
    @XmlEnumValue("contractReport")
    CONTRACT_REPORT("contractReport");
    private final String value;

    DocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentType fromValue(String v) {
        for (DocumentType c: DocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
