/*
 * @(#)EditAtom.java
 *
 * $Date: 2014-03-13 04:15:48 -0400 (Thu, 13 Mar 2014) $
 *
 * Copyright (c) 2012 by Jeremy Wood.
 * All rights reserved.
 *
 * The copyright of this software is owned by Jeremy Wood. 
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * Jeremy Wood. For details see accompanying license terms.
 * 
 * This software is probably, but not necessarily, discussed here:
 * https://javagraphics.java.net/
 * 
 * That site should also contain the most recent official version
 * of this software.  (See the SVN repository for more details.)
 */
package com.bric.qt.io;

import java.io.IOException;

import com.bric.io.GuardedInputStream;

public class EditAtom extends ParentAtom {

	public EditAtom(Atom parent, GuardedInputStream in)
			throws IOException {
		super(parent, "edts", in);
	}
	
	public EditAtom() {
		super("edts");
	}

}
