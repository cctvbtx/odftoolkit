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
import org.odftoolkit.odfdom.dom.type.table.OdfSheetObjectType;
import org.odftoolkit.odfdom.dom.type.table.OdfAcceptanceStateType;

import org.odftoolkit.odfdom.dom.element.office.OdfChangeInfoElement;

/**
 * ODF DOM Element implementation for element "<table:deletion>".
 */
public abstract class OdfDeletionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.TABLE, "deletion" );

    public OdfDeletionElement( OdfFileDom _aOwnerDoc )
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
    public void init(OdfSheetObjectType _aType, Integer _aPosition, String _aId)
    {
        setType( _aType );
        setPosition( _aPosition );
        setId( _aId );
    }

    /**
     * Get value of attribute "table:type".
     */
    public OdfSheetObjectType getType()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "type" ) );
        return OdfSheetObjectType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:type".
     */
    public void setType( OdfSheetObjectType _aType )
    {                    
        String aStringVal = OdfSheetObjectType.toString( _aType );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "type" ), aStringVal );
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
     * Get value of attribute "table:table".
     */
    public Integer getTable()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "table" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:table".
     */
    public void setTable( Integer _aTable )
    {                    
        String aStringVal = Integer.toString( _aTable );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "table" ), aStringVal );
    }

    /**
     * Get value of attribute "table:multi-deletion-spanned".
     */
    public Integer getMultiDeletionSpanned()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "multi-deletion-spanned" ) );
        return Integer.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:multi-deletion-spanned".
     */
    public void setMultiDeletionSpanned( Integer _aMultiDeletionSpanned )
    {                    
        String aStringVal = Integer.toString( _aMultiDeletionSpanned );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "multi-deletion-spanned" ), aStringVal );
    }

    /**
     * Get value of attribute "table:id".
     */
    public String getId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "id" ) );
    }

    /**
     * Set value of attribute "table:id".
     */
    public void setId( String _aId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "id" ), _aId );
    }

    /**
     * Get value of attribute "table:acceptance-state".
     */
    public OdfAcceptanceStateType getAcceptanceState()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "acceptance-state" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "pending";
        }

        return OdfAcceptanceStateType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "table:acceptance-state".
     */
    public void setAcceptanceState( OdfAcceptanceStateType _aAcceptanceState )
    {                    
        String aStringVal = OdfAcceptanceStateType.toString( _aAcceptanceState );
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "acceptance-state" ), aStringVal );
    }

    /**
     * Get value of attribute "table:rejecting-change-id".
     */
    public String getRejectingChangeId()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.TABLE, "rejecting-change-id" ) );
    }

    /**
     * Set value of attribute "table:rejecting-change-id".
     */
    public void setRejectingChangeId( String _aRejectingChangeId )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.TABLE, "rejecting-change-id" ), _aRejectingChangeId );
    }

    /**
    * Create child element "office:change-info".
    */
    public OdfChangeInfoElement createChangeInfoElement()
    {
        OdfChangeInfoElement  _nChangeInfo = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfChangeInfoElement.class);
        this.appendChild( _nChangeInfo);
        return  _nChangeInfo;
    }                   
               
    /**
    * Create child element "table:dependencies".
    */
    public OdfDependenciesElement createDependenciesElement()
    {
        OdfDependenciesElement  _nDependencies = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDependenciesElement.class);
        this.appendChild( _nDependencies);
        return  _nDependencies;
    }                   
               
    /**
    * Create child element "table:deletions".
    */
    public OdfDeletionsElement createDeletionsElement()
    {
        OdfDeletionsElement  _nDeletions = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfDeletionsElement.class);
        this.appendChild( _nDeletions);
        return  _nDeletions;
    }                   
               
    /**
    * Create child element "table:cut-offs".
    */
    public OdfCutOffsElement createCutOffsElement()
    {
        OdfCutOffsElement  _nCutOffs = ((OdfFileDom)this.ownerDocument).createOdfElement(OdfCutOffsElement.class);
        this.appendChild( _nCutOffs);
        return  _nCutOffs;
    }                   
               
}
