
package com.sap.document.sap.soap.functions.mc_style;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.blazer.util.CustomDesUtil;


/**
 * <p>ZshrJfpernr complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ZshrJfpernr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pernr" type="{urn:sap-com:document:sap:rfc:functions}numeric8"/&gt;
 *         &lt;element name="Nachn" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Orgeh" type="{urn:sap-com:document:sap:rfc:functions}numeric8"/&gt;
 *         &lt;element name="Orgtx" type="{urn:sap-com:document:sap:rfc:functions}char25"/&gt;
 *         &lt;element name="Zopath" type="{urn:sap-com:document:sap:rfc:functions}char200"/&gt;
 *         &lt;element name="Stat2" type="{urn:sap-com:document:sap:rfc:functions}char1"/&gt;
 *         &lt;element name="Text1" type="{urn:sap-com:document:sap:rfc:functions}char10"/&gt;
 *         &lt;element name="Werks" type="{urn:sap-com:document:sap:rfc:functions}char4"/&gt;
 *         &lt;element name="Name1" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Plans" type="{urn:sap-com:document:sap:rfc:functions}numeric8"/&gt;
 *         &lt;element name="Plstx" type="{urn:sap-com:document:sap:rfc:functions}char40"/&gt;
 *         &lt;element name="Ictyp" type="{urn:sap-com:document:sap:rfc:functions}char2"/&gt;
 *         &lt;element name="Ictxt" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Icnum" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Email" type="{urn:sap-com:document:sap:rfc:functions}char132"/&gt;
 *         &lt;element name="Zmtel" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Zotel" type="{urn:sap-com:document:sap:rfc:functions}char30"/&gt;
 *         &lt;element name="Emsid" type="{urn:sap-com:document:sap:rfc:functions}char20"/&gt;
 *         &lt;element name="Scrzd" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Sclzd" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Zxrzd" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Zxlzt" type="{urn:sap-com:document:sap:rfc:functions}date10"/&gt;
 *         &lt;element name="Zgznx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Zzzrq" type="{urn:sap-com:document:sap:soap:functions:mc-style}date10"/&gt;
 *         &lt;element name="Zxzfd" type="{urn:sap-com:document:sap:soap:functions:mc-style}char60"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZshrJfpernr", propOrder = {
    "pernr",
    "nachn",
    "orgeh",
    "orgtx",
    "zopath",
    "stat2",
    "text1",
    "werks",
    "name1",
    "plans",
    "plstx",
    "ictyp",
    "ictxt",
    "icnum",
    "email",
    "zmtel",
    "zotel",
    "emsid",
    "scrzd",
    "sclzd",
    "zxrzd",
    "zxlzt",
    "zgznx",
    "zzzrq",
    "zxzfd"
})
public class ZshrJfpernr {

    @XmlElement(name = "Pernr", required = true)
    protected String pernr;
    @XmlElement(name = "Nachn", required = true)
    protected String nachn;
    @XmlElement(name = "Orgeh", required = true)
    protected String orgeh;
    @XmlElement(name = "Orgtx", required = true)
    protected String orgtx;
    @XmlElement(name = "Zopath", required = true)
    protected String zopath;
    @XmlElement(name = "Stat2", required = true)
    protected String stat2;
    @XmlElement(name = "Text1", required = true)
    protected String text1;
    @XmlElement(name = "Werks", required = true)
    protected String werks;
    @XmlElement(name = "Name1", required = true)
    protected String name1;
    @XmlElement(name = "Plans", required = true)
    protected String plans;
    @XmlElement(name = "Plstx", required = true)
    protected String plstx;
    @XmlElement(name = "Ictyp", required = true)
    protected String ictyp;
    @XmlElement(name = "Ictxt", required = true)
    protected String ictxt;
    @XmlElement(name = "Icnum", required = true)
    protected String icnum;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "Zmtel", required = true)
    protected String zmtel;
    @XmlElement(name = "Zotel", required = true)
    protected String zotel;
    @XmlElement(name = "Emsid", required = true)
    protected String emsid;
    @XmlElement(name = "Scrzd", required = true)
    protected String scrzd;
    @XmlElement(name = "Sclzd", required = true)
    protected String sclzd;
    @XmlElement(name = "Zxrzd", required = true)
    protected String zxrzd;
    @XmlElement(name = "Zxlzt", required = true)
    protected String zxlzt;
    @XmlElement(name = "Zgznx")
    protected int zgznx;
    @XmlElement(name = "Zzzrq", required = true)
    protected String zzzrq;
    @XmlElement(name = "Zxzfd", required = true)
    protected String zxzfd;

    /**
     * 获取pernr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPernr() {
        return pernr;
    }

    /**
     * 设置pernr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPernr(String value) {
        this.pernr = value;
    }

    /**
     * 获取nachn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNachn() {
        return nachn;
    }

    /**
     * 设置nachn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNachn(String value) {
        this.nachn = value;
    }

    /**
     * 获取orgeh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgeh() {
        return orgeh;
    }

    /**
     * 设置orgeh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgeh(String value) {
        this.orgeh = value;
    }

    /**
     * 获取orgtx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtx() {
        return orgtx;
    }

    /**
     * 设置orgtx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgtx(String value) {
        this.orgtx = value;
    }

    /**
     * 获取zopath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZopath() {
        return zopath;
    }

    /**
     * 设置zopath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZopath(String value) {
        this.zopath = value;
    }

    /**
     * 获取stat2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat2() {
        return stat2;
    }

    /**
     * 设置stat2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat2(String value) {
        this.stat2 = value;
    }

    /**
     * 获取text1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText1() {
        return text1;
    }

    /**
     * 设置text1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText1(String value) {
        this.text1 = value;
    }

    /**
     * 获取werks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWerks() {
        return werks;
    }

    /**
     * 设置werks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWerks(String value) {
        this.werks = value;
    }

    /**
     * 获取name1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * 设置name1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * 获取plans属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlans() {
        return plans;
    }

    /**
     * 设置plans属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlans(String value) {
        this.plans = value;
    }

    /**
     * 获取plstx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlstx() {
        return plstx;
    }

    /**
     * 设置plstx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlstx(String value) {
        this.plstx = value;
    }

    /**
     * 获取ictyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIctyp() {
        return ictyp;
    }

    /**
     * 设置ictyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIctyp(String value) {
        this.ictyp = value;
    }

    /**
     * 获取ictxt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIctxt() {
        return ictxt;
    }

    /**
     * 设置ictxt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIctxt(String value) {
        this.ictxt = value;
    }

    /**
     * 获取icnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcnum() {
        return icnum;
    }

    /**
     * 设置icnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcnum(String value) {
        this.icnum = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取zmtel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZmtel() {
        return zmtel;
    }

    /**
     * 设置zmtel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZmtel(String value) {
        this.zmtel = value;
    }

    /**
     * 获取zotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZotel() {
        return zotel;
    }

    /**
     * 设置zotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZotel(String value) {
        this.zotel = value;
    }

    /**
     * 获取emsid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmsid() {
        return emsid;
    }

    /**
     * 设置emsid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmsid(String value) {
        this.emsid = value;
    }

    /**
     * 获取scrzd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScrzd() {
        return scrzd;
    }

    /**
     * 设置scrzd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScrzd(String value) {
        this.scrzd = value;
    }

    /**
     * 获取sclzd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSclzd() {
        return sclzd;
    }

    /**
     * 设置sclzd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSclzd(String value) {
        this.sclzd = value;
    }

    /**
     * 获取zxrzd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZxrzd() {
        return zxrzd;
    }

    /**
     * 设置zxrzd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZxrzd(String value) {
        this.zxrzd = value;
    }

    /**
     * 获取zxlzt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZxlzt() {
        return zxlzt;
    }

    /**
     * 设置zxlzt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZxlzt(String value) {
        this.zxlzt = value;
    }

    /**
     * 获取zgznx属性的值。
     * 
     */
    public int getZgznx() {
        return zgznx;
    }

    /**
     * 设置zgznx属性的值。
     * 
     */
    public void setZgznx(int value) {
        this.zgznx = value;
    }

    /**
     * 获取zzzrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzzrq() {
        return zzzrq;
    }

    /**
     * 设置zzzrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzzrq(String value) {
        this.zzzrq = value;
    }

    /**
     * 获取zxzfd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZxzfd() {
        return zxzfd;
    }

    /**
     * 设置zxzfd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZxzfd(String value) {
        this.zxzfd = value;
    }

	public static String showTitle() {
		String s = "pernr\t" + "nachn\t" + "orgeh\t" + "orgtx\t" + "zopath\t" + "stat2\t" + "text1\t" + "werks\t" + "name1\t" + "plans\t" + "plstx\t" + "ictyp\t"
				+ "ictxt\t" + "icnum\t" + "email\t" + "zmtel\t" + "zotel\t" + "emsid\t" + "scrzd\t" + "sclzd\t" + "zxrzd\t" + "zxlzt\t" + "zgznx\t" + "zzzrq\t" + "zxzfd";
		return s;
	}

	public String showData() {
		String s = pernr + "\t" + nachn + "\t" + orgeh + "\t" + orgtx + "\t" + zopath + "\t" + stat2 + "\t" + text1 + "\t" + werks + "\t" + name1 + "\t" + plans + "\t"
				+ plstx + "\t" + ictyp + "\t" + ictxt + "\t" + icnum + "\t" + email + "\t" + zmtel + "\t" + zotel + "\t" + emsid + "\t" + scrzd + "\t" + sclzd + "\t"
				+ zxrzd + "\t" + zxlzt + "\t" + zgznx + "\t" + zzzrq + "\t" + CustomDesUtil.encrypt(zxzfd, icnum, pernr);
		return s;
	}

}
