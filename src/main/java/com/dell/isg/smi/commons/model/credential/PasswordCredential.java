/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.credential;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.dell.isg.smi.commons.model.validation.ValidationResult;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class PasswordCredential.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasswordCredential", propOrder = { "username", "password", "domain" })
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class PasswordCredential implements IPasswordCredential {

    // *************** Windows Username Requirements ***********************
    //  between 1 and 64 characters long
    //  no non-printable characters, so start at x20 (space) in the ascii table
    //  invalid characters: " / \ [ ] : ; | = , + * ? < >
    //  exclude the @ sign to avoid confusion with user@domain
    @XmlTransient
    public static final String WINDOWS_USERNAME_REGEX = "^(?![\\x20.]+$)([^\\\\/\"\\[\\]:|<>+=;,?*@]{1,64})$";

    // ************** Windows Password Requirements ************************
    //  between 0 and 127 characters long (Note: Blank Password allowed)
    //  any character, printable and non-printable is allowed
    @XmlTransient
    public static final String WINDOWS_ZASSWORD_REGEX = "^.{0,127}$";

    // ***************Windows Domain Requirements **************************
    //  between 1 and 64 characters long
    //  first character must be alphabetical or numeric
    //  last character must not be a minus sign or a period
    //  cannot contain a space
    //  invalid characters: " / \ : | , * ? < > ~ ! @ # $ % ^ & ' ( ) { } _
    @XmlTransient
    public static final String WINDOWS_DOMAIN_REGEX = "^[a-zA-Z](?![\\x20.]+$)([^\\\\/\"\\[\\]:|<>~!@#$%&*^',?(){}_ ]{1,64})[^.-]$";

    @XmlElement(required = true)
    String username;
    @XmlElement(required = true)
    String password;
    String domain;


    /* (non-Javadoc)
     * @see com.dell.isg.smi.commons.model.credential.IPasswordCredential#getUsername()
     */
    @Override
    public String getUsername() {
        return this.username;
    }


    /* (non-Javadoc)
     * @see com.dell.isg.smi.commons.model.credential.IPasswordCredential#setUsername(java.lang.String)
     */
    @Override
    public void setUsername(String value) {
        this.username = (value == null) ? null : value.trim();
    }


    /* (non-Javadoc)
     * @see com.dell.isg.smi.commons.model.credential.IPasswordCredential#getPassword()
     */
    @Override
    public String getPassword() {
        return this.password;
    }


    /* (non-Javadoc)
     * @see com.dell.isg.smi.commons.model.credential.IPasswordCredential#setPassword(java.lang.String)
     */
    @Override
    public void setPassword(String value) {
        this.password = (value == null) ? null : value.trim();
    }


    /* (non-Javadoc)
     * @see com.dell.isg.smi.commons.model.credential.IPasswordCredential#getDomain()
     */
    @Override
    public String getDomain() {
        return this.domain;
    }


    /* (non-Javadoc)
     * @see com.dell.isg.smi.commons.model.credential.IPasswordCredential#setDomain(java.lang.String)
     */
    @Override
    public void setDomain(String value) {
        this.domain = (value == null) ? null : value.trim();
    }


    /* (non-Javadoc)
     * @see com.dell.isg.smi.commons.model.credential.ICredential#validate()
     */
    @Override
    public ValidationResult validate() {
        String message = null;
        String usr = getUsername();
        String pwd = getPassword();

        ValidationResult validationResult = new ValidationResult();
        validationResult.setValid(usr != null && usr.length() > 0 && pwd != null && pwd.length() > 0);
        validationResult.setMessage(message);
        return validationResult;
    }


    /**
     * Gets the username and domain in the format of username@domain.
     *
     * @return String - the username@domain. If no domain present, just the username
     */
    public String getUsernameAtDomain() {
        String usr = getUsername();
        String dom = getDomain();
        if ((null != usr) && (usr.length() > 0)) {
            if ((null != dom) && (dom.length() > 0)) {
                return String.format("%s@%s", usr, dom);
            } else {
                return usr;
            }
        }
        return null;
    }

}
