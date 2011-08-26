/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfDate;
import org.odftoolkit.odfdom.dom.type.table.OdfGroupedByType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ODF DOM Element implementation for element "<table:data-pilot-groups>".
 */
public abstract class OdfDataPilotGroupsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "data-pilot-groups" );

    public OdfDataPilotGroupsElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aSourceFieldName, XMLGregorianCalendar _aDateStart, Double _aStart, XMLGregorianCalendar _aDateEnd, Double _aEnd, Double _aStep, OdfGroupedByType _aGroupedBy)
    {
        setSourceFieldName( _aSourceFieldName );
        setDateStart( _aDateStart );
        setStart( _aStart );
        setDateEnd( _aDateEnd );
        setEnd( _aEnd );
        setStep( _aStep );
        setGroupedBy( _aGroupedBy );
    }

    /**
     * Get value of attribute "table:source-field-name".
     */
    public String getSourceFieldName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "source-field-name" ) );
    }

    /**
     * Set value of attribute "table:source-field-name".
     */
    public void setSourceFieldName( String _aSourceFieldName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "source-field-name" ), _aSourceFieldName );
    }

    /**
     * Get value of attribute "table:date-start".
     */
    public XMLGregorianCalendar getDateStart()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "date-start" ) );
        return OdfDate.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:date-start".
     */
    public void setDateStart( XMLGregorianCalendar _aDateStart )
    {                    
        String aStringVal = OdfDate.toString( _aDateStart );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "date-start" ), aStringVal );
    }

    /**
     * Get value of attribute "table:start".
     */
    public Double getStart()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "start" ) );
        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:start".
     */
    public void setStart( Double _aStart )
    {                    
        String aStringVal = Double.toString( _aStart );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "start" ), aStringVal );
    }

    /**
     * Get value of attribute "table:date-end".
     */
    public XMLGregorianCalendar getDateEnd()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "date-end" ) );
        return OdfDate.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:date-end".
     */
    public void setDateEnd( XMLGregorianCalendar _aDateEnd )
    {                    
        String aStringVal = OdfDate.toString( _aDateEnd );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "date-end" ), aStringVal );
    }

    /**
     * Get value of attribute "table:end".
     */
    public Double getEnd()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end" ) );
        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:end".
     */
    public void setEnd( Double _aEnd )
    {                    
        String aStringVal = Double.toString( _aEnd );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end" ), aStringVal );
    }

    /**
     * Get value of attribute "table:step".
     */
    public Double getStep()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "step" ) );
        return Double.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:step".
     */
    public void setStep( Double _aStep )
    {                    
        String aStringVal = Double.toString( _aStep );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "step" ), aStringVal );
    }

    /**
     * Get value of attribute "table:grouped-by".
     */
    public OdfGroupedByType getGroupedBy()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "grouped-by" ) );
        return OdfGroupedByType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:grouped-by".
     */
    public void setGroupedBy( OdfGroupedByType _aGroupedBy )
    {                    
        String aStringVal = OdfGroupedByType.toString( _aGroupedBy );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "grouped-by" ), aStringVal );
    }

}