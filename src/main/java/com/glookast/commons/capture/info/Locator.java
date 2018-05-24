
package com.glookast.commons.capture.info;

import com.glookast.commons.timecode.Timecode;
import com.glookast.commons.timecode.XmlAdapterTimecode;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Objects;


/**
 * <p>Java class for Locator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Locator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timecode" type="{http://timecode.commons.glookast.com}Timecode"/&gt;
 *         &lt;element name="color" type="{http://info.capture.commons.glookast.com}LocatorColor"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Locator", propOrder = {
    "timecode",
    "color",
    "message",
    "notes"
})
public class Locator implements Serializable
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterTimecode.class)
    protected Timecode timecode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LocatorColor color;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String notes;

    /**
     * Default no-arg constructor
     * 
     */
    public Locator() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Locator(final Timecode timecode, final LocatorColor color, final String message, final String notes) {
        this.timecode = timecode;
        this.color = color;
        this.message = message;
        this.notes = notes;
    }

    public Locator(final Locator locator) {
        if (locator.timecode != null) {
            this.timecode = new Timecode(locator.timecode);
        }
        this.color = locator.color;
        this.message = locator.message;
        this.notes = locator.notes;
    }

    /**
     * Gets the value of the timecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Timecode getTimecode() {
        return timecode;
    }

    /**
     * Sets the value of the timecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimecode(Timecode value) {
        this.timecode = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link LocatorColor }
     *     
     */
    public LocatorColor getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatorColor }
     *     
     */
    public void setColor(LocatorColor value) {
        this.color = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    @Override
    public String toString()
    {
        return "Locator{" +
               "timecode=" + timecode +
               ", color=" + color +
               ", message='" + message + '\'' +
               ", notes='" + notes + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Locator locator = (Locator) o;
        return Objects.equals(timecode, locator.timecode) &&
               color == locator.color &&
               Objects.equals(message, locator.message) &&
               Objects.equals(notes, locator.notes);
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(timecode, color, message, notes);
    }
}
