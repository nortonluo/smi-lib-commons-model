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


// TODO: Auto-generated Javadoc
/**
 * The Class Controllers.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Controllers", propOrder = { "bottom", "top" })
public class Controllers {

    @XmlElement(required = true)
    protected Controller bottom;
    @XmlElement(required = true)
    protected Controller top;


    /**
     * Gets the value of the bottom property.
     * 
     * @return possible object is {@link Controller }
     * 
     */
    public Controller getBottom() {
        return bottom;
    }


    /**
     * Sets the value of the bottom property.
     * 
     * @param value allowed object is {@link Controller }
     * 
     */
    public void setBottom(Controller value) {
        this.bottom = value;
    }


    /**
     * Gets the value of the top property.
     * 
     * @return possible object is {@link Controller }
     * 
     */
    public Controller getTop() {
        return top;
    }


    /**
     * Sets the value of the top property.
     * 
     * @param value allowed object is {@link Controller }
     * 
     */
    public void setTop(Controller value) {
        this.top = value;
    }

}
