
package fr.interop_fibre;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeErreur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="messageErreur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detailErreur" type="{http://interop-fibre.fr}DetailErreurType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codeErreur",
    "messageErreur",
    "detailErreur"
})
@XmlRootElement(name = "InfoErreurType")
public class InfoErreurType {

    protected int codeErreur;
    @XmlElement(required = true)
    protected String messageErreur;
    @XmlElementRef(name = "detailErreur", type = JAXBElement.class, required = false)
    protected JAXBElement<DetailErreurType> detailErreur;

    /**
     * Obtient la valeur de la propriété codeErreur.
     * 
     */
    public int getCodeErreur() {
        return codeErreur;
    }

    /**
     * Définit la valeur de la propriété codeErreur.
     * 
     */
    public void setCodeErreur(int value) {
        this.codeErreur = value;
    }

    /**
     * Obtient la valeur de la propriété messageErreur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageErreur() {
        return messageErreur;
    }

    /**
     * Définit la valeur de la propriété messageErreur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageErreur(String value) {
        this.messageErreur = value;
    }

    /**
     * Obtient la valeur de la propriété detailErreur.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DetailErreurType }{@code >}
     *     
     */
    public JAXBElement<DetailErreurType> getDetailErreur() {
        return detailErreur;
    }

    /**
     * Définit la valeur de la propriété detailErreur.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DetailErreurType }{@code >}
     *     
     */
    public void setDetailErreur(JAXBElement<DetailErreurType> value) {
        this.detailErreur = value;
    }

}
