/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:06:10 PM CDT 
//

package com.dell.isg.smi.commons.model.storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Class StorageActivity.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageActivity", propOrder = { "time", "level", "userEmail", "message" })
public class StorageActivity {

    @XmlElement(required = true)
    protected String time;
    @XmlElement(required = true)
    protected StorageLogLevel level;
    @XmlElement(required = true)
    protected String userEmail;
    @XmlElement(required = true)
    protected String message;


    /**
     * Gets the value of the time property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTime() {
        return time;
    }


    /**
     * Sets the value of the time property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTime(String value) {
        this.time = value;
    }


    /**
     * Gets the value of the level property.
     * 
     * @return possible object is {@link StorageLogLevel }
     * 
     */
    public StorageLogLevel getLevel() {
        return level;
    }


    /**
     * Sets the value of the level property.
     * 
     * @param value allowed object is {@link StorageLogLevel }
     * 
     */
    public void setLevel(StorageLogLevel value) {
        this.level = value;
    }


    /**
     * Gets the value of the userEmail property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUserEmail() {
        return userEmail;
    }


    /**
     * Sets the value of the userEmail property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }


    /**
     * Gets the value of the message property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMessage() {
        return message;
    }


    /**
     * Sets the value of the message property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setMessage(String value) {
        this.message = value;
    }

}