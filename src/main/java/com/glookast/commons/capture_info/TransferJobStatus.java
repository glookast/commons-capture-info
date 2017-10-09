
package com.glookast.commons.capture_info;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferJobStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="TransferJobStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STARTING"/&gt;
 *     &lt;enumeration value="RUNNING"/&gt;
 *     &lt;enumeration value="PAUSED"/&gt;
 *     &lt;enumeration value="FAILED"/&gt;
 *     &lt;enumeration value="ABORTED"/&gt;
 *     &lt;enumeration value="FINISHED"/&gt;
 *     &lt;enumeration value="IDLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferJobStatus")
@XmlEnum
public enum TransferJobStatus {

    STARTING,
    RUNNING,
    PAUSED,
    FAILED,
    ABORTED,
    FINISHED,
    IDLE;

    public String value() {
        return name();
    }

    public static TransferJobStatus fromValue(String v) {
        return valueOf(v);
    }

}
