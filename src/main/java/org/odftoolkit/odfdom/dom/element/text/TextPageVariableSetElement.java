/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextActiveAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextPageAdjustAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:page-variable-set}.
 *
 */
public class TextPageVariableSetElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "page-variable-set" );


	/**
	 * Create the instance of <code>TextPageVariableSetElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextPageVariableSetElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:page-variable-set}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextActiveAttribute</code> , See {@odf.attribute text:active}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextActiveAttribute()
	{
		TextActiveAttribute attr = (TextActiveAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "active" ) );
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextActiveAttribute</code> , See {@odf.attribute text:active}
	 *
	 * @param textActiveValue   The type is <code>Boolean</code>
	 */
	public void setTextActiveAttribute( Boolean textActiveValue )
	{
		TextActiveAttribute attr =  new TextActiveAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( textActiveValue.booleanValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextPageAdjustAttribute</code> , See {@odf.attribute text:page-adjust}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTextPageAdjustAttribute()
	{
		TextPageAdjustAttribute attr = (TextPageAdjustAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "page-adjust" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextPageAdjustAttribute</code> , See {@odf.attribute text:page-adjust}
	 *
	 * @param textPageAdjustValue   The type is <code>Integer</code>
	 */
	public void setTextPageAdjustAttribute( Integer textPageAdjustValue )
	{
		TextPageAdjustAttribute attr =  new TextPageAdjustAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( textPageAdjustValue.intValue() );
	}

}