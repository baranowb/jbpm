/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.jboss.qa.bpms.remote.ejb.domain;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "list-type")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListType implements Serializable {

    private static final long serialVersionUID = 2L;

    @XmlElement
    private List<MyType> myObjects;

    public ListType() {

    }

    public ListType(List<MyType> myObjects) {
        this.myObjects = myObjects;
    }

    public List<MyType> getMyObjects() {
        return myObjects;
    }

    public void setMyObjects(List<MyType> myObjects) {
        this.myObjects = myObjects;
    }

    @Override
    public String toString() {
        return "ListType{" + "myObjects=" + myObjects + '}';
    }

}
