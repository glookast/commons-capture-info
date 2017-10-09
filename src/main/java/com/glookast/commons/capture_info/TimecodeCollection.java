
package com.glookast.commons.capture_info;

import com.glookast.commons.timecode.Timecode;
import com.glookast.commons.timecode.XmlAdapterTimecode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TimecodeCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimecodeCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ltc" type="{http://timecode.commons.glookast.com}Timecode" minOccurs="0"/&gt;
 *         &lt;element name="vitc" type="{http://timecode.commons.glookast.com}Timecode" minOccurs="0"/&gt;
 *         &lt;element name="tod" type="{http://timecode.commons.glookast.com}Timecode" minOccurs="0"/&gt;
 *         &lt;element name="rs422" type="{http://timecode.commons.glookast.com}Timecode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimecodeCollection", namespace = "http://capture-info.commons.glookast.com", propOrder = {
    "ltc",
    "vitc",
    "tod",
    "rs422"
})
public class TimecodeCollection {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterTimecode.class)
    protected Timecode ltc;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterTimecode.class)
    protected Timecode vitc;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterTimecode.class)
    protected Timecode tod;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterTimecode.class)
    protected Timecode rs422;

    public TimecodeCollection()
    {
    }

    public TimecodeCollection(Timecode ltc, Timecode vitc, Timecode tod, Timecode rs422)
    {
        this.ltc = ltc;
        this.vitc = vitc;
        this.tod = tod;
        this.rs422 = rs422;
    }

    /**
     * Gets the value of the ltc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Timecode getLtc() {
        return ltc;
    }

    /**
     * Sets the value of the ltc property.
     *
     * @param value
     *     allowed object is
     *     {@link Timecode }
     *
     */
    public void setLtc(Timecode value) {
        this.ltc = value;
    }

    /**
     * Gets the value of the vitc property.
     *
     * @return
     *     possible object is
     *     {@link Timecode }
     *
     */
    public Timecode getVitc() {
        return vitc;
    }

    /**
     * Sets the value of the vitc property.
     *
     * @param value
     *     allowed object is
     *     {@link Timecode }
     *
     */
    public void setVitc(Timecode value) {
        this.vitc = value;
    }

    /**
     * Gets the value of the tod property.
     *
     * @return
     *     possible object is
     *     {@link Timecode }
     *
     */
    public Timecode getTod() {
        return tod;
    }

    /**
     * Sets the value of the tod property.
     *
     * @param value
     *     allowed object is
     *     {@link Timecode }
     *
     */
    public void setTod(Timecode value) {
        this.tod = value;
    }

    /**
     * Gets the value of the rs422 property.
     *
     * @return
     *     possible object is
     *     {@link Timecode }
     *
     */
    public Timecode getRs422() {
        return rs422;
    }

    /**
     * Sets the value of the rs422 property.
     *
     * @param value
     *     allowed object is
     *     {@link Timecode }
     *
     */
    public void setRs422(Timecode value) {
        this.rs422 = value;
    }

    @Override
    public String toString()
    {
        return "TimecodeCollection{" +
               "ltc='" + ltc + '\'' +
               ", vitc='" + vitc + '\'' +
               ", tod='" + tod + '\'' +
               ", rs422='" + rs422 + '\'' +
               '}';
    }
}