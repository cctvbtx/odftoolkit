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
import org.odftoolkit.odfdom.dom.type.table.OdfNameType;
import org.odftoolkit.odfdom.dom.type.OdfNonNegativeInteger;

;

/**
 * ODF DOM Element implementation for element "<table:operation>".
 */
public abstract class OdfOperationElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "operation" );

    public OdfOperationElement( OdfFileDom _aOwnerDoc )
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
    public void init(OdfNameType _aName, Integer _aIndex)
    {
        setName( _aName );
        setIndex( _aIndex );
    }

    /**
     * Get value of attribute "table:name".
     */
    public OdfNameType getName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "name" ) );
        return OdfNameType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:name".
     */
    public void setName( OdfNameType _aName )
    {                    
        String aStringVal = OdfNameType.toString( _aName );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "name" ), aStringVal );
    }

    /**
     * Get value of attribute "table:index".
     */
    public Integer getIndex()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "index" ) );
        return OdfNonNegativeInteger.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:index".
     */
    public void setIndex( Integer _aIndex )
    {                    
        String aStringVal = OdfNonNegativeInteger.toString( _aIndex );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "index" ), aStringVal );
    }

}
