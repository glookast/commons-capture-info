
package com.glookast.commons.capture_info;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceSignalStatus.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceSignalStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_REFERENCE"/&gt;
 *     &lt;enumeration value="WRONG_REFERENCE"/&gt;
 *     &lt;enumeration value="REFERENCE_UNLOCKED"/&gt;
 *     &lt;enumeration value="REFERENCE_OK"/&gt;
 *     &lt;enumeration value="REFERENCE_UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ReferenceSignalStatus", namespace = "http://capture-info.commons.glookast.com")
@XmlEnum
public enum ReferenceSignalStatus
{

    NO_REFERENCE,
    WRONG_REFERENCE,
    REFERENCE_UNLOCKED,
    REFERENCE_OK,
    REFERENCE_UNKNOWN;

    public String value()
    {
        return name();
    }

    public static ReferenceSignalStatus fromValue(String v)
    {
        return valueOf(v);
    }

}
