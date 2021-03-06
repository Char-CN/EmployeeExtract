
package com.sap.document.sap.soap.functions.mc_style;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EtResult" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZshrJfpernr" minOccurs="0"/&gt;
 *         &lt;element name="ImDate" type="{urn:sap-com:document:sap:rfc:functions}date10" minOccurs="0"/&gt;
 *         &lt;element name="ImDays" type="{urn:sap-com:document:sap:rfc:functions}numeric2" minOccurs="0"/&gt;
 *         &lt;element name="ItPernr" type="{urn:sap-com:document:sap:soap:functions:mc-style}TableOfZhrsHtPernr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "etResult",
    "imDate",
    "imDays",
    "itPernr"
})
@XmlRootElement(name = "ZdefmHrJfper")
public class ZdefmHrJfper {

    @XmlElement(name = "EtResult")
    protected TableOfZshrJfpernr etResult;
    @XmlElement(name = "ImDate")
    protected String imDate;
    @XmlElement(name = "ImDays")
    protected String imDays;
    @XmlElement(name = "ItPernr")
    protected TableOfZhrsHtPernr itPernr;

    /**
     * 获取etResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TableOfZshrJfpernr }
     *     
     */
    public TableOfZshrJfpernr getEtResult() {
        return etResult;
    }

    /**
     * 设置etResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZshrJfpernr }
     *     
     */
    public void setEtResult(TableOfZshrJfpernr value) {
        this.etResult = value;
    }

    /**
     * 获取imDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImDate() {
        return imDate;
    }

    /**
     * 设置imDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImDate(String value) {
        this.imDate = value;
    }

    /**
     * 获取imDays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImDays() {
        return imDays;
    }

    /**
     * 设置imDays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImDays(String value) {
        this.imDays = value;
    }

    /**
     * 获取itPernr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TableOfZhrsHtPernr }
     *     
     */
    public TableOfZhrsHtPernr getItPernr() {
        return itPernr;
    }

    /**
     * 设置itPernr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfZhrsHtPernr }
     *     
     */
    public void setItPernr(TableOfZhrsHtPernr value) {
        this.itPernr = value;
    }

}
