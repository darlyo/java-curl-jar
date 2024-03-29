/*
** $Id$
*/

package net.haxx.curl;

public interface CurlWrite
{
  /**
   * handleString gets called by libcurl on each chunk of data
   * we receive from the remote server
   */
  int handleString(byte s[]);
}
