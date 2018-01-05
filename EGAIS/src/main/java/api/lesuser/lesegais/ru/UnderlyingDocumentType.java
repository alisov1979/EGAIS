
package api.lesuser.lesegais.ru;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnderlyingDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnderlyingDocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="contractLease"/>
 *     &lt;enumeration value="contractPermanent"/>
 *     &lt;enumeration value="contractPlantsSale"/>
 *     &lt;enumeration value="contractForestWorks"/>
 *     &lt;enumeration value="contractHardWoodDeal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnderlyingDocumentType", namespace = "http://api.lesuser.lesegais.ru/")
@XmlEnum
public enum UnderlyingDocumentType {


    /**
     * ƒоговор аренды лесного участка
     * 
     */
    @XmlEnumValue("contractLease")
    CONTRACT_LEASE("contractLease"),

    /**
     * ƒоговор о праве пользовани€ лесным участком
     * 
     */
    @XmlEnumValue("contractPermanent")
    CONTRACT_PERMANENT("contractPermanent"),

    /**
     * ƒоговор купли-продажи лесных насаждений
     * 
     */
    @XmlEnumValue("contractPlantsSale")
    CONTRACT_PLANTS_SALE("contractPlantsSale"),

    /**
     * √осударственный контракт или задание
     * 
     */
    @XmlEnumValue("contractForestWorks")
    CONTRACT_FOREST_WORKS("contractForestWorks"),

    /**
     * ƒекларации о сделке с древесиной
     * 
     */
    @XmlEnumValue("contractHardWoodDeal")
    CONTRACT_HARD_WOOD_DEAL("contractHardWoodDeal");
    private final String value;

    UnderlyingDocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnderlyingDocumentType fromValue(String v) {
        for (UnderlyingDocumentType c: UnderlyingDocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
