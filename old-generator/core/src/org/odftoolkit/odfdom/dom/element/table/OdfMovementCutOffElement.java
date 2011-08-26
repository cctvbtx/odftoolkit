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

;

/**
 * ODF DOM Element implementation for element "<table:movement-cut-off>".
 */
public abstract class OdfMovementCutOffElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "movement-cut-off" );

    public OdfMovementCutOffElement( OdfFileDom _aOwnerDoc )
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
    public void init(Integer _aPosition, Integer _aStartPosition, Integer _aEndPosition)
    {
        setPosition( _aPosition );
        setStartPosition( _aStartPosition );
        setEndPosition( _aEndPosition );
    }

    /**
     * Get value of attribute "table:position".
     */
    public Integer getPosition()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "position" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:position".
     */
    public void setPosition( Integer _aPosition )
    {                    
        String aStringVal = Integer.toString( _aPosition );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "position" ), aStringVal );
    }

    /**
     * Get value of attribute "table:start-position".
     */
    public Integer getStartPosition()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "start-position" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:start-position".
     */
    public void setStartPosition( Integer _aStartPosition )
    {                    
        String aStringVal = Integer.toString( _aStartPosition );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "start-position" ), aStringVal );
    }

    /**
     * Get value of attribute "table:end-position".
     */
    public Integer getEndPosition()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-position" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:end-position".
     */
    public void setEndPosition( Integer _aEndPosition )
    {                    
        String aStringVal = Integer.toString( _aEndPosition );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "end-position" ), aStringVal );
    }

}
