
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос данных справочника документов-оснований.
 *                 В ответе заполняется один из списков согласно запрошенному типу.
 * 
 * <p>Java class for ResponseGetContractUnderlyingDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseGetContractUnderlyingDocuments">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}ResponseGetValuesPaged">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="contractLease" type="{http://data.lesuser.lesegais.ru/}ContractLease" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractPermanent" type="{http://data.lesuser.lesegais.ru/}ContractRight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractPlantsSale" type="{http://data.lesuser.lesegais.ru/}ContractPlantsSale" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractForestWorks" type="{http://data.lesuser.lesegais.ru/}ContractForestWorks" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractHardWoodDeal" type="{http://data.lesuser.lesegais.ru/}DealDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseGetContractUnderlyingDocuments", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "contractLease",
    "contractPermanent",
    "contractPlantsSale",
    "contractForestWorks",
    "contractHardWoodDeal"
})
public class ResponseGetContractUnderlyingDocuments
    extends ResponseGetValuesPaged
{

    protected List<ContractLease> contractLease;
    protected List<ContractRight> contractPermanent;
    protected List<ContractPlantsSale> contractPlantsSale;
    protected List<ContractForestWorks> contractForestWorks;
    protected List<DealDeclaration> contractHardWoodDeal;

    /**
     * Gets the value of the contractLease property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractLease property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractLease().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractLease }
     * 
     * 
     */
    public List<ContractLease> getContractLease() {
        if (contractLease == null) {
            contractLease = new ArrayList<ContractLease>();
        }
        return this.contractLease;
    }

    /**
     * Gets the value of the contractPermanent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractPermanent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractPermanent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractRight }
     * 
     * 
     */
    public List<ContractRight> getContractPermanent() {
        if (contractPermanent == null) {
            contractPermanent = new ArrayList<ContractRight>();
        }
        return this.contractPermanent;
    }

    /**
     * Gets the value of the contractPlantsSale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractPlantsSale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractPlantsSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractPlantsSale }
     * 
     * 
     */
    public List<ContractPlantsSale> getContractPlantsSale() {
        if (contractPlantsSale == null) {
            contractPlantsSale = new ArrayList<ContractPlantsSale>();
        }
        return this.contractPlantsSale;
    }

    /**
     * Gets the value of the contractForestWorks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractForestWorks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractForestWorks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractForestWorks }
     * 
     * 
     */
    public List<ContractForestWorks> getContractForestWorks() {
        if (contractForestWorks == null) {
            contractForestWorks = new ArrayList<ContractForestWorks>();
        }
        return this.contractForestWorks;
    }

    /**
     * Gets the value of the contractHardWoodDeal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractHardWoodDeal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractHardWoodDeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DealDeclaration }
     * 
     * 
     */
    public List<DealDeclaration> getContractHardWoodDeal() {
        if (contractHardWoodDeal == null) {
            contractHardWoodDeal = new ArrayList<DealDeclaration>();
        }
        return this.contractHardWoodDeal;
    }

}
