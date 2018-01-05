
package api.lesuser.lesegais.ru;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ќтвет на запрос данных справочника.
 *                 ¬ ответе заполн€етс€ один из списков согласно запрошенному типу.
 * 
 * <p>Java class for ResponseGetLookupValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseGetLookupValues">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.lesuser.lesegais.ru/}ResponseGetValuesPaged">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="federalDistrict" type="{http://lookup.lesuser.lesegais.ru/}FederalDistrict" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constituentEntity" type="{http://lookup.lesuser.lesegais.ru/}ConstituentEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forestry" type="{http://lookup.lesuser.lesegais.ru/}Forestry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subForestry" type="{http://lookup.lesuser.lesegais.ru/}SubForestry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tract" type="{http://lookup.lesuser.lesegais.ru/}Tract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stateAuthority" type="{http://lookup.lesuser.lesegais.ru/}StateAuthority" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="landType" type="{http://lookup.lesuser.lesegais.ru/}LandType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="woodlotIdType" type="{http://lookup.lesuser.lesegais.ru/}WoodlotIdType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="woodBreed" type="{http://lookup.lesuser.lesegais.ru/}WoodBreed" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="woodSort" type="{http://lookup.lesuser.lesegais.ru/}WoodSort" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="woodClass" type="{http://lookup.lesuser.lesegais.ru/}WoodClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personDocumentType" type="{http://lookup.lesuser.lesegais.ru/}PersonDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyType" type="{http://lookup.lesuser.lesegais.ru/}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rightGrantingType" type="{http://lookup.lesuser.lesegais.ru/}RightGrantingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="system" type="{http://lookup.lesuser.lesegais.ru/}System" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="updateReason" type="{http://lookup.lesuser.lesegais.ru/}UpdateReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="country" type="{http://lookup.lesuser.lesegais.ru/}Country" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseGetLookupValues", namespace = "http://api.lesuser.lesegais.ru/", propOrder = {
    "federalDistrict",
    "constituentEntity",
    "forestry",
    "subForestry",
    "tract",
    "stateAuthority",
    "landType",
    "woodlotIdType",
    "woodBreed",
    "woodSort",
    "woodClass",
    "personDocumentType",
    "partyType",
    "rightGrantingType",
    "system",
    "updateReason",
    "country"
})
public class ResponseGetLookupValues
    extends ResponseGetValuesPaged
{

    protected List<FederalDistrict> federalDistrict;
    protected List<ConstituentEntity> constituentEntity;
    protected List<Forestry> forestry;
    protected List<SubForestry> subForestry;
    protected List<Tract> tract;
    protected List<StateAuthority> stateAuthority;
    protected List<LandType> landType;
    protected List<WoodlotIdType> woodlotIdType;
    protected List<WoodBreed> woodBreed;
    protected List<WoodSort> woodSort;
    protected List<WoodClass> woodClass;
    protected List<PersonDocumentType> personDocumentType;
    protected List<PartyType> partyType;
    protected List<RightGrantingType> rightGrantingType;
    protected List<System> system;
    protected List<UpdateReason> updateReason;
    protected List<Country> country;

    /**
     * Gets the value of the federalDistrict property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the federalDistrict property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFederalDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FederalDistrict }
     * 
     * 
     */
    public List<FederalDistrict> getFederalDistrict() {
        if (federalDistrict == null) {
            federalDistrict = new ArrayList<FederalDistrict>();
        }
        return this.federalDistrict;
    }

    /**
     * Gets the value of the constituentEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constituentEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstituentEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstituentEntity }
     * 
     * 
     */
    public List<ConstituentEntity> getConstituentEntity() {
        if (constituentEntity == null) {
            constituentEntity = new ArrayList<ConstituentEntity>();
        }
        return this.constituentEntity;
    }

    /**
     * Gets the value of the forestry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forestry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForestry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Forestry }
     * 
     * 
     */
    public List<Forestry> getForestry() {
        if (forestry == null) {
            forestry = new ArrayList<Forestry>();
        }
        return this.forestry;
    }

    /**
     * Gets the value of the subForestry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subForestry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubForestry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubForestry }
     * 
     * 
     */
    public List<SubForestry> getSubForestry() {
        if (subForestry == null) {
            subForestry = new ArrayList<SubForestry>();
        }
        return this.subForestry;
    }

    /**
     * Gets the value of the tract property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tract property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tract }
     * 
     * 
     */
    public List<Tract> getTract() {
        if (tract == null) {
            tract = new ArrayList<Tract>();
        }
        return this.tract;
    }

    /**
     * Gets the value of the stateAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateAuthority }
     * 
     * 
     */
    public List<StateAuthority> getStateAuthority() {
        if (stateAuthority == null) {
            stateAuthority = new ArrayList<StateAuthority>();
        }
        return this.stateAuthority;
    }

    /**
     * Gets the value of the landType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LandType }
     * 
     * 
     */
    public List<LandType> getLandType() {
        if (landType == null) {
            landType = new ArrayList<LandType>();
        }
        return this.landType;
    }

    /**
     * Gets the value of the woodlotIdType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the woodlotIdType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWoodlotIdType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WoodlotIdType }
     * 
     * 
     */
    public List<WoodlotIdType> getWoodlotIdType() {
        if (woodlotIdType == null) {
            woodlotIdType = new ArrayList<WoodlotIdType>();
        }
        return this.woodlotIdType;
    }

    /**
     * Gets the value of the woodBreed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the woodBreed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWoodBreed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WoodBreed }
     * 
     * 
     */
    public List<WoodBreed> getWoodBreed() {
        if (woodBreed == null) {
            woodBreed = new ArrayList<WoodBreed>();
        }
        return this.woodBreed;
    }

    /**
     * Gets the value of the woodSort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the woodSort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWoodSort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WoodSort }
     * 
     * 
     */
    public List<WoodSort> getWoodSort() {
        if (woodSort == null) {
            woodSort = new ArrayList<WoodSort>();
        }
        return this.woodSort;
    }

    /**
     * Gets the value of the woodClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the woodClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWoodClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WoodClass }
     * 
     * 
     */
    public List<WoodClass> getWoodClass() {
        if (woodClass == null) {
            woodClass = new ArrayList<WoodClass>();
        }
        return this.woodClass;
    }

    /**
     * Gets the value of the personDocumentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personDocumentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonDocumentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonDocumentType }
     * 
     * 
     */
    public List<PersonDocumentType> getPersonDocumentType() {
        if (personDocumentType == null) {
            personDocumentType = new ArrayList<PersonDocumentType>();
        }
        return this.personDocumentType;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getPartyType() {
        if (partyType == null) {
            partyType = new ArrayList<PartyType>();
        }
        return this.partyType;
    }

    /**
     * Gets the value of the rightGrantingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightGrantingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightGrantingType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RightGrantingType }
     * 
     * 
     */
    public List<RightGrantingType> getRightGrantingType() {
        if (rightGrantingType == null) {
            rightGrantingType = new ArrayList<RightGrantingType>();
        }
        return this.rightGrantingType;
    }

    /**
     * Gets the value of the system property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the system property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link System }
     * 
     * 
     */
    public List<System> getSystem() {
        if (system == null) {
            system = new ArrayList<System>();
        }
        return this.system;
    }

    /**
     * Gets the value of the updateReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateReason }
     * 
     * 
     */
    public List<UpdateReason> getUpdateReason() {
        if (updateReason == null) {
            updateReason = new ArrayList<UpdateReason>();
        }
        return this.updateReason;
    }

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Country }
     * 
     * 
     */
    public List<Country> getCountry() {
        if (country == null) {
            country = new ArrayList<Country>();
        }
        return this.country;
    }

}
