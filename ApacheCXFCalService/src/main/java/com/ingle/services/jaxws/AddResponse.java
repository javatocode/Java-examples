
package com.ingle.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.7
 * Thu Sep 02 18:57:27 IST 2021
 * Generated source version: 2.7.7
 */

@XmlRootElement(name = "addResponse", namespace = "http://services.ingle.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addResponse", namespace = "http://services.ingle.com/")

public class AddResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

