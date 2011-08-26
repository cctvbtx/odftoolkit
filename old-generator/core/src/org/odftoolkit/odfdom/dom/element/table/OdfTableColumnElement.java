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

import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.type.OdfPositiveInteger;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;
import org.odftoolkit.odfdom.dom.type.table.OdfVisibilityType;
import org.odftoolkit.odfdom.dom.type.OdfId;

;

/**
 * ODF DOM Element implementation for element "<table:table-column>".
 */
public abstract class OdfTableColumnElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "table-column" );

    public OdfTableColumnElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.TableColumn, OdfName.get( OdfNamespace.TABLE, "style-name" ) );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "table:number-columns-repeated".
     */
    public Integer getNumberColumnsRepeated()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "number-columns-repeated" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "1";
        }

        return OdfPositiveInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:number-columns-repeated".
     */
    public void setNumberColumnsRepeated( Integer _aNumberColumnsRepeated )
    {                    
        String aStringVal = OdfPositiveInteger.toString( _aNumberColumnsRepeated );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "number-columns-repeated" ), aStringVal );
    }

    /**
     * Get value of attribute "table:style-name".
     */
    public String getStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:style-name".
     */
    public void setStyleName( String _aStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "table:visibility".
     */
    public OdfVisibilityType getVisibility()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "visibility" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "visible";
        }

        return OdfVisibilityType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:visibility".
     */
    public void setVisibility( OdfVisibilityType _aVisibility )
    {                    
        String aStringVal = OdfVisibilityType.toString( _aVisibility );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "visibility" ), aStringVal );
    }

    /**
     * Get value of attribute "table:default-cell-style-name".
     */
    public String getDefaultCellStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "default-cell-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:default-cell-style-name".
     */
    public void setDefaultCellStyleName( String _aDefaultCellStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aDefaultCellStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "default-cell-style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "xml:id".
     */
    public String getXmlid()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ) );
        return OdfId.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xml:id".
     */
    public void setXmlid( String _aXmlid )
    {                    
        String aStringVal = OdfId.toString( _aXmlid );
        setOdfAttribute( OdfName.get( OdfNamespace.XML, "id" ), aStringVal );
    }

}
