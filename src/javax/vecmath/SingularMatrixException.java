/*
 * $RCSfile$
 *
 * Copyright (c) 2007 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * $Revision$
 * $Date$
 * $State$
 */

package javax.vecmath;

/**
 * Indicates that inverse of a matrix can not be computed.
 */
public class SingularMatrixException extends RuntimeException{

/**
 * Create the exception object with default values.
 */
  public SingularMatrixException(){
  }

/**
 * Create the exception object that outputs message.
 * @param str the message string to be output.
 */
  public SingularMatrixException(String str){

    super(str);
  }

}
