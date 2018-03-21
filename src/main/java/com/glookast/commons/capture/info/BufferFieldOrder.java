
package com.glookast.commons.capture.info;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BufferFieldOrder.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BufferFieldOrder"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="LOWER_FIELD_FIRST"/&gt;
 *     &lt;enumeration value="UPPER_FIELD_FIRST"/&gt;
 *     &lt;enumeration value="PROGRESSIVE_FRAME"/&gt;
 *     &lt;enumeration value="PROGRESSIVE_SEGMENTED_FRAME"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "BufferFieldOrder", namespace = "http://info.capture.commons.glookast.com")
@XmlEnum
public enum BufferFieldOrder
{

    UNKNOWN,
    LOWER_FIELD_FIRST,
    UPPER_FIELD_FIRST,
    PROGRESSIVE_FRAME,
    PROGRESSIVE_SEGMENTED_FRAME;

    public String value()
    {
        return name();
    }

    public static BufferFieldOrder fromValue(String v)
    {
        return valueOf(v);
    }

}
