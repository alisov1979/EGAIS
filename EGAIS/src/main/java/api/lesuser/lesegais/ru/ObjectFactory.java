
package api.lesuser.lesegais.ru;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the api.lesuser.lesegais.ru package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LesUserRequestHeader_QNAME = new QName("http://api.lesuser.lesegais.ru/", "LesUserRequestHeader");
    private final static QName _RequestDeleteDocument_QNAME = new QName("http://api.lesuser.lesegais.ru/", "RequestDeleteDocument");
    private final static QName _RequestUpdateDocument_QNAME = new QName("http://api.lesuser.lesegais.ru/", "RequestUpdateDocument");
    private final static QName _ResponseUpdateDocument_QNAME = new QName("http://api.lesuser.lesegais.ru/", "ResponseUpdateDocument");
    private final static QName _ResponseInsertParty_QNAME = new QName("http://api.lesuser.lesegais.ru/", "ResponseInsertParty");
    private final static QName _RequestGetDocument_QNAME = new QName("http://api.lesuser.lesegais.ru/", "RequestGetDocument");
    private final static QName _LesUserFault_QNAME = new QName("http://api.lesuser.lesegais.ru/", "LesUserFault");
    private final static QName _RequestGetParty_QNAME = new QName("http://api.lesuser.lesegais.ru/", "RequestGetParty");
    private final static QName _ResponseGetParty_QNAME = new QName("http://api.lesuser.lesegais.ru/", "ResponseGetParty");
    private final static QName _ResponseGetModifiedDocuments_QNAME = new QName("http://api.lesuser.lesegais.ru/", "ResponseGetModifiedDocuments");
    private final static QName _ResponseGetLookupValues_QNAME = new QName("http://api.lesuser.lesegais.ru/", "ResponseGetLookupValues");
    private final static QName _LesUserResponseHeader_QNAME = new QName("http://api.lesuser.lesegais.ru/", "LesUserResponseHeader");
    private final static QName _RequestGetContractUnderlyingDocuments_QNAME = new QName("http://api.lesuser.lesegais.ru/", "RequestGetContractUnderlyingDocuments");
    private final static QName _RequestGetPartyValues_QNAME = new QName("http://api.lesuser.lesegais.ru/", "RequestGetPartyValues");
    private final static QName _ResponseDeleteDocument_QNAME = new QName("http://api.lesuser.lesegais.ru/", "ResponseDeleteDocument");
    private final static QName _ResponseGetPartyValues_QNAME = new QName("http://api.lesuser.lesegais.ru/", "ResponseGetPartyValues");
    private final static QName _ResponseGetDocument_QNAME = new QName("http://api.lesuser.lesegais.ru/", "ResponseGetDocument");
    private final static QName _RequestInsertParty_QNAME = new QName("http://api.lesuser.lesegais.ru/", "RequestInsertParty");
    private final static QName _RequestInsertDocument_QNAME = new QName("http://api.lesuser.lesegais.ru/", "RequestInsertDocument");
    private final static QName _RequestGetLookupValues_QNAME = new QName("http://api.lesuser.lesegais.ru/", "RequestGetLookupValues");
    private final static QName _ResponseGetContractUnderlyingDocuments_QNAME = new QName("http://api.lesuser.lesegais.ru/", "ResponseGetContractUnderlyingDocuments");
    private final static QName _ResponseInsertDocument_QNAME = new QName("http://api.lesuser.lesegais.ru/", "ResponseInsertDocument");
    private final static QName _RequestGetModifiedDocuments_QNAME = new QName("http://api.lesuser.lesegais.ru/", "RequestGetModifiedDocuments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: api.lesuser.lesegais.ru
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestGetPartyValues }
     * 
     */
    public RequestGetPartyValues createRequestGetPartyValues() {
        return new RequestGetPartyValues();
    }

    /**
     * Create an instance of {@link RequestUpdateDocument }
     * 
     */
    public RequestUpdateDocument createRequestUpdateDocument() {
        return new RequestUpdateDocument();
    }

    /**
     * Create an instance of {@link ResponseUpdateDocument }
     * 
     */
    public ResponseUpdateDocument createResponseUpdateDocument() {
        return new ResponseUpdateDocument();
    }

    /**
     * Create an instance of {@link CommonRequestSection }
     * 
     */
    public CommonRequestSection createCommonRequestSection() {
        return new CommonRequestSection();
    }

    /**
     * Create an instance of {@link RequestDeleteDocument }
     * 
     */
    public RequestDeleteDocument createRequestDeleteDocument() {
        return new RequestDeleteDocument();
    }

    /**
     * Create an instance of {@link ResponseGetLookupValues }
     * 
     */
    public ResponseGetLookupValues createResponseGetLookupValues() {
        return new ResponseGetLookupValues();
    }

    /**
     * Create an instance of {@link ResponseGetModifiedDocuments }
     * 
     */
    public ResponseGetModifiedDocuments createResponseGetModifiedDocuments() {
        return new ResponseGetModifiedDocuments();
    }

    /**
     * Create an instance of {@link ExecutionMessage }
     * 
     */
    public ExecutionMessage createExecutionMessage() {
        return new ExecutionMessage();
    }

    /**
     * Create an instance of {@link RequestGetParty }
     * 
     */
    public RequestGetParty createRequestGetParty() {
        return new RequestGetParty();
    }

    /**
     * Create an instance of {@link ResponseGetParty }
     * 
     */
    public ResponseGetParty createResponseGetParty() {
        return new ResponseGetParty();
    }

    /**
     * Create an instance of {@link ResponseInsertParty }
     * 
     */
    public ResponseInsertParty createResponseInsertParty() {
        return new ResponseInsertParty();
    }

    /**
     * Create an instance of {@link RequestGetDocument }
     * 
     */
    public RequestGetDocument createRequestGetDocument() {
        return new RequestGetDocument();
    }

    /**
     * Create an instance of {@link RequestGetContractUnderlyingDocuments }
     * 
     */
    public RequestGetContractUnderlyingDocuments createRequestGetContractUnderlyingDocuments() {
        return new RequestGetContractUnderlyingDocuments();
    }

    /**
     * Create an instance of {@link CommonResponseSection }
     * 
     */
    public CommonResponseSection createCommonResponseSection() {
        return new CommonResponseSection();
    }

    /**
     * Create an instance of {@link ResponseDeleteDocument }
     * 
     */
    public ResponseDeleteDocument createResponseDeleteDocument() {
        return new ResponseDeleteDocument();
    }

    /**
     * Create an instance of {@link RequestGetLookupValues }
     * 
     */
    public RequestGetLookupValues createRequestGetLookupValues() {
        return new RequestGetLookupValues();
    }

    /**
     * Create an instance of {@link ResponseGetContractUnderlyingDocuments }
     * 
     */
    public ResponseGetContractUnderlyingDocuments createResponseGetContractUnderlyingDocuments() {
        return new ResponseGetContractUnderlyingDocuments();
    }

    /**
     * Create an instance of {@link RequestInsertDocument }
     * 
     */
    public RequestInsertDocument createRequestInsertDocument() {
        return new RequestInsertDocument();
    }

    /**
     * Create an instance of {@link RequestInsertParty }
     * 
     */
    public RequestInsertParty createRequestInsertParty() {
        return new RequestInsertParty();
    }

    /**
     * Create an instance of {@link ResponseGetPartyValues }
     * 
     */
    public ResponseGetPartyValues createResponseGetPartyValues() {
        return new ResponseGetPartyValues();
    }

    /**
     * Create an instance of {@link ResponseGetDocument }
     * 
     */
    public ResponseGetDocument createResponseGetDocument() {
        return new ResponseGetDocument();
    }

    /**
     * Create an instance of {@link ResponseInsertDocument }
     * 
     */
    public ResponseInsertDocument createResponseInsertDocument() {
        return new ResponseInsertDocument();
    }

    /**
     * Create an instance of {@link RequestGetModifiedDocuments }
     * 
     */
    public RequestGetModifiedDocuments createRequestGetModifiedDocuments() {
        return new RequestGetModifiedDocuments();
    }

    /**
     * Create an instance of {@link ExecutionError }
     * 
     */
    public ExecutionError createExecutionError() {
        return new ExecutionError();
    }

    /**
     * Create an instance of {@link LesUserAbstractRequest }
     * 
     */
   // public LesUserAbstractRequest createLesUserAbstractRequest() {
  //      return new LesUserAbstractRequest();
  //  }

    /**
     * Create an instance of {@link SecuritySection }
     * 
     */
    public SecuritySection createSecuritySection() {
        return new SecuritySection();
    }

    /**
     * Create an instance of {@link LesUserStateChangeRequest }
     * 
     */
    public LesUserStateChangeRequest createLesUserStateChangeRequest() {
        return new LesUserStateChangeRequest();
    }

    /**
     * Create an instance of {@link ResponseGetValuesPaged }
     * 
     */
    public ResponseGetValuesPaged createResponseGetValuesPaged() {
        return new ResponseGetValuesPaged();
    }

    /**
     * Create an instance of {@link LesUserAbstractDocumentRefRequest }
     * 
     */
    public LesUserAbstractDocumentRefRequest createLesUserAbstractDocumentRefRequest() {
        return new LesUserAbstractDocumentRefRequest();
    }

    /**
     * Create an instance of {@link LesUserAbstractResponse }
     * 
     */
    public LesUserAbstractResponse createLesUserAbstractResponse() {
        return new LesUserAbstractResponse();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link APIConstants }
     * 
     */
    public APIConstants createAPIConstants() {
        return new APIConstants();
    }

    /**
     * Create an instance of {@link DealMarkingsList }
     * 
     */
    public DealMarkingsList createDealMarkingsList() {
        return new DealMarkingsList();
    }

    /**
     * Create an instance of {@link WoodlotElementVolumeInfoList }
     * 
     */
    public WoodlotElementVolumeInfoList createWoodlotElementVolumeInfoList() {
        return new WoodlotElementVolumeInfoList();
    }

    /**
     * Create an instance of {@link WoodlotElementVolumeInfo }
     * 
     */
    public WoodlotElementVolumeInfo createWoodlotElementVolumeInfo() {
        return new WoodlotElementVolumeInfo();
    }

    /**
     * Create an instance of {@link DocumentRef }
     * 
     */
    public DocumentRef createDocumentRef() {
        return new DocumentRef();
    }

    /**
     * Create an instance of {@link DealDeclarationReportSearchResult }
     * 
     */
    public DealDeclarationReportSearchResult createDealDeclarationReportSearchResult() {
        return new DealDeclarationReportSearchResult();
    }

    /**
     * Create an instance of {@link DealDeclarationReportFilter }
     * 
     */
    public DealDeclarationReportFilter createDealDeclarationReportFilter() {
        return new DealDeclarationReportFilter();
    }

    /**
     * Create an instance of {@link DealReport }
     * 
     */
    public DealReport createDealReport() {
        return new DealReport();
    }

    /**
     * Create an instance of {@link SubLeaseList }
     * 
     */
    public SubLeaseList createSubLeaseList() {
        return new SubLeaseList();
    }

    /**
     * Create an instance of {@link SubLease }
     * 
     */
    public SubLease createSubLease() {
        return new SubLease();
    }

    /**
     * Create an instance of {@link DealDeclarationBase }
     * 
     */
    public DealDeclarationBase createDealDeclarationBase() {
        return new DealDeclarationBase();
    }

    /**
     * Create an instance of {@link VolumeInfo }
     * 
     */
    public VolumeInfo createVolumeInfo() {
        return new VolumeInfo();
    }

    /**
     * Create an instance of {@link ContractLease }
     * 
     */
    public ContractLease createContractLease() {
        return new ContractLease();
    }

    /**
     * Create an instance of {@link ContractPlantsSale }
     * 
     */
    public ContractPlantsSale createContractPlantsSale() {
        return new ContractPlantsSale();
    }

    /**
     * Create an instance of {@link ContractReport }
     * 
     */
    public ContractReport createContractReport() {
        return new ContractReport();
    }

    /**
     * Create an instance of {@link DeclarationPeriod }
     * 
     */
    public DeclarationPeriod createDeclarationPeriod() {
        return new DeclarationPeriod();
    }

    /**
     * Create an instance of {@link DealReportList }
     * 
     */
    public DealReportList createDealReportList() {
        return new DealReportList();
    }

    /**
     * Create an instance of {@link DealDeclarationReport }
     * 
     */
    public DealDeclarationReport createDealDeclarationReport() {
        return new DealDeclarationReport();
    }

    /**
     * Create an instance of {@link PartialDealDeclarationMarkings }
     * 
     */
    public PartialDealDeclarationMarkings createPartialDealDeclarationMarkings() {
        return new PartialDealDeclarationMarkings();
    }

    /**
     * Create an instance of {@link DealDeclarationFilter }
     * 
     */
    public DealDeclarationFilter createDealDeclarationFilter() {
        return new DealDeclarationFilter();
    }

    /**
     * Create an instance of {@link ContractShortInfo }
     * 
     */
    public ContractShortInfo createContractShortInfo() {
        return new ContractShortInfo();
    }

    /**
     * Create an instance of {@link DealDeclarationFilterBase }
     * 
     */
    public DealDeclarationFilterBase createDealDeclarationFilterBase() {
        return new DealDeclarationFilterBase();
    }

    /**
     * Create an instance of {@link ReportingPeriod }
     * 
     */
    public ReportingPeriod createReportingPeriod() {
        return new ReportingPeriod();
    }

    /**
     * Create an instance of {@link ContractRight }
     * 
     */
    public ContractRight createContractRight() {
        return new ContractRight();
    }

    /**
     * Create an instance of {@link CommonContract }
     * 
     */
    public CommonContract createCommonContract() {
        return new CommonContract();
    }

    /**
     * Create an instance of {@link WoodlotElementList }
     * 
     */
    public WoodlotElementList createWoodlotElementList() {
        return new WoodlotElementList();
    }

    /**
     * Create an instance of {@link PartialDealDeclarationReport }
     * 
     */
    public PartialDealDeclarationReport createPartialDealDeclarationReport() {
        return new PartialDealDeclarationReport();
    }

    /**
     * Create an instance of {@link CompositionHardwood }
     * 
     */
    public CompositionHardwood createCompositionHardwood() {
        return new CompositionHardwood();
    }

    /**
     * Create an instance of {@link WoodlotId }
     * 
     */
    public WoodlotId createWoodlotId() {
        return new WoodlotId();
    }

    /**
     * Create an instance of {@link DocumentBase }
     * 
     */
    public DocumentBase createDocumentBase() {
        return new DocumentBase();
    }

    /**
     * Create an instance of {@link ContractForestDeclaration }
     * 
     */
    public ContractForestDeclaration createContractForestDeclaration() {
        return new ContractForestDeclaration();
    }

    /**
     * Create an instance of {@link UnderLyingDocumentShortInfo }
     * 
     */
    public UnderLyingDocumentShortInfo createUnderLyingDocumentShortInfo() {
        return new UnderLyingDocumentShortInfo();
    }

    /**
     * Create an instance of {@link CompositionHardwoodList }
     * 
     */
    public CompositionHardwoodList createCompositionHardwoodList() {
        return new CompositionHardwoodList();
    }

    /**
     * Create an instance of {@link ContractForestDeclarationReportBase }
     * 
     */
    public ContractForestDeclarationReportBase createContractForestDeclarationReportBase() {
        return new ContractForestDeclarationReportBase();
    }

    /**
     * Create an instance of {@link DealDeclarationMarkingsFilter }
     * 
     */
    public DealDeclarationMarkingsFilter createDealDeclarationMarkingsFilter() {
        return new DealDeclarationMarkingsFilter();
    }

    /**
     * Create an instance of {@link DealDeclarationSearchResult }
     * 
     */
    public DealDeclarationSearchResult createDealDeclarationSearchResult() {
        return new DealDeclarationSearchResult();
    }

    /**
     * Create an instance of {@link DealMarkingsElement }
     * 
     */
    public DealMarkingsElement createDealMarkingsElement() {
        return new DealMarkingsElement();
    }

    /**
     * Create an instance of {@link DealDeclarationMarkings }
     * 
     */
    public DealDeclarationMarkings createDealDeclarationMarkings() {
        return new DealDeclarationMarkings();
    }

    /**
     * Create an instance of {@link WoodlotElement }
     * 
     */
    public WoodlotElement createWoodlotElement() {
        return new WoodlotElement();
    }

    /**
     * Create an instance of {@link WoodlotIdList }
     * 
     */
    public WoodlotIdList createWoodlotIdList() {
        return new WoodlotIdList();
    }

    /**
     * Create an instance of {@link DealDeclaration }
     * 
     */
    public DealDeclaration createDealDeclaration() {
        return new DealDeclaration();
    }

    /**
     * Create an instance of {@link PartialDealDeclaration }
     * 
     */
    public PartialDealDeclaration createPartialDealDeclaration() {
        return new PartialDealDeclaration();
    }

    /**
     * Create an instance of {@link SaleContractShortInfo }
     * 
     */
    public SaleContractShortInfo createSaleContractShortInfo() {
        return new SaleContractShortInfo();
    }

    /**
     * Create an instance of {@link DealDeclarationMarkingsSearchResult }
     * 
     */
    public DealDeclarationMarkingsSearchResult createDealDeclarationMarkingsSearchResult() {
        return new DealDeclarationMarkingsSearchResult();
    }

    /**
     * Create an instance of {@link DealDeclarationList }
     * 
     */
    public DealDeclarationList createDealDeclarationList() {
        return new DealDeclarationList();
    }

    /**
     * Create an instance of {@link ContractForestWorks }
     * 
     */
    public ContractForestWorks createContractForestWorks() {
        return new ContractForestWorks();
    }

    /**
     * Create an instance of {@link VolumeInfoList }
     * 
     */
    public VolumeInfoList createVolumeInfoList() {
        return new VolumeInfoList();
    }

    /**
     * Create an instance of {@link ObjectBase }
     * 
     */
    public ObjectBase createObjectBase() {
        return new ObjectBase();
    }

    /**
     * Create an instance of {@link Tract }
     * 
     */
    public Tract createTract() {
        return new Tract();
    }

    /**
     * Create an instance of {@link StateAuthority }
     * 
     */
    public StateAuthority createStateAuthority() {
        return new StateAuthority();
    }

    /**
     * Create an instance of {@link ConstituentEntity }
     * 
     */
    public ConstituentEntity createConstituentEntity() {
        return new ConstituentEntity();
    }

    /**
     * Create an instance of {@link WoodSort }
     * 
     */
    public WoodSort createWoodSort() {
        return new WoodSort();
    }

    /**
     * Create an instance of {@link RightGrantingType }
     * 
     */
    public RightGrantingType createRightGrantingType() {
        return new RightGrantingType();
    }

    /**
     * Create an instance of {@link FederalDistrict }
     * 
     */
    public FederalDistrict createFederalDistrict() {
        return new FederalDistrict();
    }

    /**
     * Create an instance of {@link System }
     * 
     */
    public System createSystem() {
        return new System();
    }

    /**
     * Create an instance of {@link WoodlotIdType }
     * 
     */
    public WoodlotIdType createWoodlotIdType() {
        return new WoodlotIdType();
    }

    /**
     * Create an instance of {@link LandType }
     * 
     */
    public LandType createLandType() {
        return new LandType();
    }

    /**
     * Create an instance of {@link Party }
     * 
     */
    public Party createParty() {
        return new Party();
    }

    /**
     * Create an instance of {@link WoodBreed }
     * 
     */
    public WoodBreed createWoodBreed() {
        return new WoodBreed();
    }

    /**
     * Create an instance of {@link WoodClass }
     * 
     */
    public WoodClass createWoodClass() {
        return new WoodClass();
    }

    /**
     * Create an instance of {@link Forestry }
     * 
     */
    public Forestry createForestry() {
        return new Forestry();
    }

    /**
     * Create an instance of {@link SubForestry }
     * 
     */
    public SubForestry createSubForestry() {
        return new SubForestry();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link UpdateReason }
     * 
     */
    public UpdateReason createUpdateReason() {
        return new UpdateReason();
    }

    /**
     * Create an instance of {@link PersonDocumentType }
     * 
     */
    public PersonDocumentType createPersonDocumentType() {
        return new PersonDocumentType();
    }

    /**
     * Create an instance of {@link PartyType }
     * 
     */
    public PartyType createPartyType() {
        return new PartyType();
    }

    /**
     * Create an instance of {@link LegalForm }
     * 
     */
    public LegalForm createLegalForm() {
        return new LegalForm();
    }

    /**
     * Create an instance of {@link RequestGetPartyValues.Filter }
     * 
     */
    public RequestGetPartyValues.Filter createRequestGetPartyValuesFilter() {
        return new RequestGetPartyValues.Filter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonRequestSection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "LesUserRequestHeader")
    public JAXBElement<CommonRequestSection> createLesUserRequestHeader(CommonRequestSection value) {
        return new JAXBElement<CommonRequestSection>(_LesUserRequestHeader_QNAME, CommonRequestSection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestDeleteDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "RequestDeleteDocument")
    public JAXBElement<RequestDeleteDocument> createRequestDeleteDocument(RequestDeleteDocument value) {
        return new JAXBElement<RequestDeleteDocument>(_RequestDeleteDocument_QNAME, RequestDeleteDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestUpdateDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "RequestUpdateDocument")
    public JAXBElement<RequestUpdateDocument> createRequestUpdateDocument(RequestUpdateDocument value) {
        return new JAXBElement<RequestUpdateDocument>(_RequestUpdateDocument_QNAME, RequestUpdateDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseUpdateDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "ResponseUpdateDocument")
    public JAXBElement<ResponseUpdateDocument> createResponseUpdateDocument(ResponseUpdateDocument value) {
        return new JAXBElement<ResponseUpdateDocument>(_ResponseUpdateDocument_QNAME, ResponseUpdateDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseInsertParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "ResponseInsertParty")
    public JAXBElement<ResponseInsertParty> createResponseInsertParty(ResponseInsertParty value) {
        return new JAXBElement<ResponseInsertParty>(_ResponseInsertParty_QNAME, ResponseInsertParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "RequestGetDocument")
    public JAXBElement<RequestGetDocument> createRequestGetDocument(RequestGetDocument value) {
        return new JAXBElement<RequestGetDocument>(_RequestGetDocument_QNAME, RequestGetDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecutionMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "LesUserFault")
    public JAXBElement<ExecutionMessage> createLesUserFault(ExecutionMessage value) {
        return new JAXBElement<ExecutionMessage>(_LesUserFault_QNAME, ExecutionMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "RequestGetParty")
    public JAXBElement<RequestGetParty> createRequestGetParty(RequestGetParty value) {
        return new JAXBElement<RequestGetParty>(_RequestGetParty_QNAME, RequestGetParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "ResponseGetParty")
    public JAXBElement<ResponseGetParty> createResponseGetParty(ResponseGetParty value) {
        return new JAXBElement<ResponseGetParty>(_ResponseGetParty_QNAME, ResponseGetParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetModifiedDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "ResponseGetModifiedDocuments")
    public JAXBElement<ResponseGetModifiedDocuments> createResponseGetModifiedDocuments(ResponseGetModifiedDocuments value) {
        return new JAXBElement<ResponseGetModifiedDocuments>(_ResponseGetModifiedDocuments_QNAME, ResponseGetModifiedDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetLookupValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "ResponseGetLookupValues")
    public JAXBElement<ResponseGetLookupValues> createResponseGetLookupValues(ResponseGetLookupValues value) {
        return new JAXBElement<ResponseGetLookupValues>(_ResponseGetLookupValues_QNAME, ResponseGetLookupValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonResponseSection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "LesUserResponseHeader")
    public JAXBElement<CommonResponseSection> createLesUserResponseHeader(CommonResponseSection value) {
        return new JAXBElement<CommonResponseSection>(_LesUserResponseHeader_QNAME, CommonResponseSection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetContractUnderlyingDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "RequestGetContractUnderlyingDocuments")
    public JAXBElement<RequestGetContractUnderlyingDocuments> createRequestGetContractUnderlyingDocuments(RequestGetContractUnderlyingDocuments value) {
        return new JAXBElement<RequestGetContractUnderlyingDocuments>(_RequestGetContractUnderlyingDocuments_QNAME, RequestGetContractUnderlyingDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetPartyValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "RequestGetPartyValues")
    public JAXBElement<RequestGetPartyValues> createRequestGetPartyValues(RequestGetPartyValues value) {
        return new JAXBElement<RequestGetPartyValues>(_RequestGetPartyValues_QNAME, RequestGetPartyValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDeleteDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "ResponseDeleteDocument")
    public JAXBElement<ResponseDeleteDocument> createResponseDeleteDocument(ResponseDeleteDocument value) {
        return new JAXBElement<ResponseDeleteDocument>(_ResponseDeleteDocument_QNAME, ResponseDeleteDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetPartyValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "ResponseGetPartyValues")
    public JAXBElement<ResponseGetPartyValues> createResponseGetPartyValues(ResponseGetPartyValues value) {
        return new JAXBElement<ResponseGetPartyValues>(_ResponseGetPartyValues_QNAME, ResponseGetPartyValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "ResponseGetDocument")
    public JAXBElement<ResponseGetDocument> createResponseGetDocument(ResponseGetDocument value) {
        return new JAXBElement<ResponseGetDocument>(_ResponseGetDocument_QNAME, ResponseGetDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestInsertParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "RequestInsertParty")
    public JAXBElement<RequestInsertParty> createRequestInsertParty(RequestInsertParty value) {
        return new JAXBElement<RequestInsertParty>(_RequestInsertParty_QNAME, RequestInsertParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestInsertDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "RequestInsertDocument")
    public JAXBElement<RequestInsertDocument> createRequestInsertDocument(RequestInsertDocument value) {
        return new JAXBElement<RequestInsertDocument>(_RequestInsertDocument_QNAME, RequestInsertDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetLookupValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "RequestGetLookupValues")
    public JAXBElement<RequestGetLookupValues> createRequestGetLookupValues(RequestGetLookupValues value) {
        return new JAXBElement<RequestGetLookupValues>(_RequestGetLookupValues_QNAME, RequestGetLookupValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseGetContractUnderlyingDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "ResponseGetContractUnderlyingDocuments")
    public JAXBElement<ResponseGetContractUnderlyingDocuments> createResponseGetContractUnderlyingDocuments(ResponseGetContractUnderlyingDocuments value) {
        return new JAXBElement<ResponseGetContractUnderlyingDocuments>(_ResponseGetContractUnderlyingDocuments_QNAME, ResponseGetContractUnderlyingDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseInsertDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "ResponseInsertDocument")
    public JAXBElement<ResponseInsertDocument> createResponseInsertDocument(ResponseInsertDocument value) {
        return new JAXBElement<ResponseInsertDocument>(_ResponseInsertDocument_QNAME, ResponseInsertDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestGetModifiedDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.lesuser.lesegais.ru/", name = "RequestGetModifiedDocuments")
    public JAXBElement<RequestGetModifiedDocuments> createRequestGetModifiedDocuments(RequestGetModifiedDocuments value) {
        return new JAXBElement<RequestGetModifiedDocuments>(_RequestGetModifiedDocuments_QNAME, RequestGetModifiedDocuments.class, null, value);
    }

}
