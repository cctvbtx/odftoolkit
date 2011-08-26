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
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.table.OdfOrderType;

;

/**
 * ODF DOM Element implementation for element "<table:sort-groups>".
 */
public abstract class OdfSortGroupsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "sort-groups" );

    public OdfSortGroupsElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "table:data-type".
     */
    public String getDataType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "data-type" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "automatic";
        }

        return String.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:data-type".
     */
    public void setDataType( String _aDataType )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "data-type" ), _aDataType );
    }

    /**
     * Get value of attribute "table:order".
     */
    public OdfOrderType getOrder()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "order" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "ascending";
        }

        return OdfOrderType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:order".
     */
    public void setOrder( OdfOrderType _aOrder )
    {                    
        String aStringVal = OdfOrderType.toString( _aOrder );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "order" ), aStringVal );
    }

}
