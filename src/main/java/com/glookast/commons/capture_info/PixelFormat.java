
package com.glookast.commons.capture_info;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PixelFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="PixelFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="UYVY"/&gt;
 *     &lt;enumeration value="V210"/&gt;
 *     &lt;enumeration value="RGB24"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PixelFormat")
@XmlEnum
public enum PixelFormat {

    UNKNOWN("UNKNOWN"),
    UYVY("UYVY"),
    @XmlEnumValue("V210")
    V_210("V210"),
    @XmlEnumValue("RGB24")
    RGB_24("RGB24");
    private final String value;

    PixelFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PixelFormat fromValue(String v) {
        for (PixelFormat c: PixelFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
