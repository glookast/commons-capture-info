
package com.glookast.commons.capture_info;

import com.glookast.commons.base.Rational;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Objects;


/**
 * <p>Java class for SignalFormat complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SignalFormat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="frameRate" type="{http://base.commons.glookast.com}Rational" minOccurs="0"/&gt;
 *         &lt;element name="picture" type="{http://capture-info.commons.glookast.com}PictureFormat" minOccurs="0"/&gt;
 *         &lt;element name="sound" type="{http://capture-info.commons.glookast.com}SoundFormat" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignalFormat", namespace = "http://capture-info.commons.glookast.com", propOrder = {
    "frameRate",
    "picture",
    "sound"
})
public class SignalFormat implements Serializable
{

    protected Rational frameRate;
    protected PictureFormat picture;
    protected SoundFormat sound;

    /**
     * Default no-arg constructor
     */
    public SignalFormat()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public SignalFormat(final Rational frameRate, final PictureFormat picture, final SoundFormat sound)
    {
        this.frameRate = frameRate;
        this.picture = picture;
        this.sound = sound;
    }

    /**
     * Gets the value of the frameRate property.
     *
     * @return possible object is
     * {@link Rational }
     */
    public Rational getFrameRate()
    {
        return frameRate;
    }

    /**
     * Sets the value of the frameRate property.
     *
     * @param value allowed object is
     *              {@link Rational }
     */
    public void setFrameRate(Rational value)
    {
        this.frameRate = value;
    }

    /**
     * Gets the value of the picture property.
     *
     * @return possible object is
     * {@link PictureFormat }
     */
    public PictureFormat getPicture()
    {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     *
     * @param value allowed object is
     *              {@link PictureFormat }
     */
    public void setPicture(PictureFormat value)
    {
        this.picture = value;
    }

    /**
     * Gets the value of the sound property.
     *
     * @return possible object is
     * {@link SoundFormat }
     */
    public SoundFormat getSound()
    {
        return sound;
    }

    /**
     * Sets the value of the sound property.
     *
     * @param value allowed object is
     *              {@link SoundFormat }
     */
    public void setSound(SoundFormat value)
    {
        this.sound = value;
    }

    @Override
    public String toString()
    {
        return "SignalFormat{" +
               "frameRate=" + frameRate +
               ", picture=" + picture +
               ", sound=" + sound +
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
        SignalFormat that = (SignalFormat) o;
        return Objects.equals(frameRate, that.frameRate) &&
               Objects.equals(picture, that.picture) &&
               Objects.equals(sound, that.sound);
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(frameRate, picture, sound);
    }
}
