
package com.glookast.commons.capture_info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoundFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoundFormat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sampleSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="samplingRate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoundFormat", propOrder = {
    "channelCount",
    "sampleSize",
    "samplingRate"
})
public class SoundFormat {

    protected int channelCount;
    protected int sampleSize;
    protected int samplingRate;

    /**
     * Default no-arg constructor
     * 
     */
    public SoundFormat() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SoundFormat(final int channelCount, final int sampleSize, final int samplingRate) {
        this.channelCount = channelCount;
        this.sampleSize = sampleSize;
        this.samplingRate = samplingRate;
    }

    /**
     * Gets the value of the channelCount property.
     * 
     */
    public int getChannelCount() {
        return channelCount;
    }

    /**
     * Sets the value of the channelCount property.
     * 
     */
    public void setChannelCount(int value) {
        this.channelCount = value;
    }

    /**
     * Gets the value of the sampleSize property.
     * 
     */
    public int getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the value of the sampleSize property.
     * 
     */
    public void setSampleSize(int value) {
        this.sampleSize = value;
    }

    /**
     * Gets the value of the samplingRate property.
     * 
     */
    public int getSamplingRate() {
        return samplingRate;
    }

    /**
     * Sets the value of the samplingRate property.
     * 
     */
    public void setSamplingRate(int value) {
        this.samplingRate = value;
    }

    @Override
    public String toString()
    {
        return "SoundFormat{" +
               "channelCount=" + channelCount +
               ", sampleSize=" + sampleSize +
               ", samplingRate=" + samplingRate +
               '}';
    }
}
