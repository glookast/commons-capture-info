
package com.glookast.commons.capture.info;

import com.glookast.commons.base.Rational;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Objects;


/**
 * <p>Java class for PictureFormat complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PictureFormat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="pixelFormat" type="{http://info.capture.commons.glookast.com}PixelFormat"/&gt;
 *         &lt;element name="bufferFieldOrder" type="{http://info.capture.commons.glookast.com}BufferFieldOrder"/&gt;
 *         &lt;element name="aspectRatio" type="{http://base.commons.glookast.com}Rational"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureFormat", namespace = "http://info.capture.commons.glookast.com", propOrder = {
    "width",
    "height",
    "pixelFormat",
    "bufferFieldOrder",
    "aspectRatio"
})
public class PictureFormat implements Serializable
{

    protected int width;
    protected int height;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PixelFormat pixelFormat;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BufferFieldOrder bufferFieldOrder;
    @XmlElement(required = true)
    protected Rational aspectRatio;

    /**
     * Default no-arg constructor
     */
    public PictureFormat()
    {
        super();
    }

    /**
     * Fully-initialising value constructor
     */
    public PictureFormat(final int width, final int height, final PixelFormat pixelFormat, final BufferFieldOrder bufferFieldOrder, final Rational aspectRatio)
    {
        this.width = width;
        this.height = height;
        this.pixelFormat = pixelFormat;
        this.bufferFieldOrder = bufferFieldOrder;
        this.aspectRatio = aspectRatio;
    }

    /**
     * Gets the value of the width property.
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * Sets the value of the width property.
     */
    public void setWidth(int value)
    {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * Sets the value of the height property.
     */
    public void setHeight(int value)
    {
        this.height = value;
    }

    /**
     * Gets the value of the pixelFormat property.
     *
     * @return possible object is
     * {@link PixelFormat }
     */
    public PixelFormat getPixelFormat()
    {
        return pixelFormat;
    }

    /**
     * Sets the value of the pixelFormat property.
     *
     * @param value allowed object is
     *              {@link PixelFormat }
     */
    public void setPixelFormat(PixelFormat value)
    {
        this.pixelFormat = value;
    }

    /**
     * Gets the value of the bufferFieldOrder property.
     *
     * @return possible object is
     * {@link BufferFieldOrder }
     */
    public BufferFieldOrder getBufferFieldOrder()
    {
        return bufferFieldOrder;
    }

    /**
     * Sets the value of the bufferFieldOrder property.
     *
     * @param value allowed object is
     *              {@link BufferFieldOrder }
     */
    public void setBufferFieldOrder(BufferFieldOrder value)
    {
        this.bufferFieldOrder = value;
    }

    /**
     * Gets the value of the aspectRatio property.
     *
     * @return possible object is
     * {@link Rational }
     */
    public Rational getAspectRatio()
    {
        return aspectRatio;
    }

    /**
     * Sets the value of the aspectRatio property.
     *
     * @param value allowed object is
     *              {@link Rational }
     */
    public void setAspectRatio(Rational value)
    {
        this.aspectRatio = value;
    }

    @Override
    public String toString()
    {
        return "PictureFormat{" +
               "width=" + width +
               ", height=" + height +
               ", pixelFormat=" + pixelFormat +
               ", bufferFieldOrder=" + bufferFieldOrder +
               ", aspectRatio=" + aspectRatio +
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
        PictureFormat that = (PictureFormat) o;
        return width == that.width &&
               height == that.height &&
               pixelFormat == that.pixelFormat &&
               bufferFieldOrder == that.bufferFieldOrder &&
               Objects.equals(aspectRatio, that.aspectRatio);
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(width, height, pixelFormat, bufferFieldOrder, aspectRatio);
    }
}
