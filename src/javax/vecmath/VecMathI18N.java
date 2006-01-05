/*
 * $RCSfile$
 *
 * Copyright (c) 2006 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * $Revision$
 * $Date$
 * $State$
 */

package javax.vecmath;

import java.io.*;
import java.util.*;


class VecMathI18N {
    static String getString(String key) {
	String s;
	try {
	    s = (String) ResourceBundle.getBundle("javax.vecmath.ExceptionStrings").getString(key);
	}
	catch (MissingResourceException e) {
	    System.err.println("VecMathI18N: Error looking up: " + key);
	    s = key;
	}
	return s;
    }
}
