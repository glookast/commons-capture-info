
package com.glookast.commons.capture_info;

import com.glookast.commons.xml.XmlAdapterUUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.UUID;


/**
 * <p>Java class for TransferJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferJob"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="captureJobId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://capture-info.commons.glookast.com}TransferJobStatus"/&gt;
 *         &lt;element name="progress" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transformProfileId" type="{http://base.commons.glookast.com}UUID" minOccurs="0"/&gt;
 *         &lt;element name="outputSystemId" type="{http://base.commons.glookast.com}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferJob", namespace = "http://capture-info.commons.glookast.com", propOrder = {
    "id",
    "captureJobId",
    "status",
    "progress",
    "message",
    "transformProfileId",
    "outputSystemId"
})
public class TransferJob {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String captureJobId;
    @XmlElement(required = true)
    protected TransferJobStatus status;
    protected double progress;
    protected String message;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID transformProfileId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlAdapterUUID.class)
    protected UUID outputSystemId;

    public TransferJob(String id, String captureJobId, TransferJobStatus status, double progress, String message, UUID transformProfileId, UUID outputSystemId)
    {
        this.id = id;
        this.captureJobId = captureJobId;
        this.status = status;
        this.progress = progress;
        this.message = message;
        this.transformProfileId = transformProfileId;
        this.outputSystemId = outputSystemId;
    }

    public TransferJob()
    {
    }

    public TransferJob(TransferJob transferJob)
    {
        this.id = transferJob.id;
        this.captureJobId = transferJob.captureJobId;
        this.status = transferJob.status;
        this.progress = transferJob.progress;
        this.message = transferJob.message;
        this.transformProfileId = transferJob.transformProfileId;
        this.outputSystemId = transferJob.outputSystemId;
    }


    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the captureJobId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCaptureJobId() {
        return captureJobId;
    }

    /**
     * Sets the value of the captureJobId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCaptureJobId(String value) {
        this.captureJobId = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link TransferJobStatus }
     *
     */
    public TransferJobStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link TransferJobStatus }
     *
     */
    public void setStatus(TransferJobStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the progress property.
     *
     */
    public double getProgress() {
        return progress;
    }

    /**
     * Sets the value of the progress property.
     *
     */
    public void setProgress(double value) {
        this.progress = value;
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

    public UUID getTransformProfileId()
    {
        return transformProfileId;
    }

    public void setTransformProfileId(UUID transformProfileId)
    {
        this.transformProfileId = transformProfileId;
    }

    public UUID getOutputSystemId()
    {
        return outputSystemId;
    }

    public void setOutputSystemId(UUID outputSystemId)
    {
        this.outputSystemId = outputSystemId;
    }

    @Override
    public String toString()
    {
        return "TransferJob{" +
               "id='" + id + '\'' +
               ", captureJobId='" + captureJobId + '\'' +
               ", status=" + status +
               ", progress=" + progress +
               ", message='" + message + '\'' +
               '}';
    }
}
