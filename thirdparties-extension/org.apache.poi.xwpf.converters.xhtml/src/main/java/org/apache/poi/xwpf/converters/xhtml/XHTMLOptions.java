/**
 * Copyright (C) 2011 The XDocReport Team <xdocreport@googlegroups.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.apache.poi.xwpf.converters.xhtml;

import org.apache.poi.xwpf.converters.core.IURIResolver;
import org.apache.poi.xwpf.converters.core.Options;

public class XHTMLOptions
    extends Options
{

    private int indent;

    private boolean generateCSSComments;

    private boolean omitHeaderFooterPages;

    private boolean fragment;

    private IURIResolver resolver = IURIResolver.DEFAULT;

    private XHTMLOptions()
    {
        this.omitHeaderFooterPages = false;
        this.fragment = false;
    }

    public static XHTMLOptions create()
    {
        return new XHTMLOptions();
    }

    public int getIndent()
    {
        return indent;
    }

    public XHTMLOptions indent( int indent )
    {
        this.indent = indent;
        return this;
    }

    public boolean isGenerateCSSComments()
    {
        return generateCSSComments;
    }

    public XHTMLOptions generateCSSComments( boolean generateCSSComments )
    {
        this.generateCSSComments = generateCSSComments;
        return this;
    }

    public IURIResolver getURIResolver()
    {
        return resolver;
    }

    public XHTMLOptions URIResolver( IURIResolver resolver )
    {
        this.resolver = resolver;
        return this;
    }

    public boolean isOmitHeaderFooterPages()
    {
        return omitHeaderFooterPages;
    }

    public XHTMLOptions setOmitHeaderFooterPages( boolean omitHeaderFooterPages )
    {
        this.omitHeaderFooterPages = omitHeaderFooterPages;
        return this;
    }

    public boolean isFragment()
    {
        return fragment;
    }

    public XHTMLOptions setFragment( boolean fragment )
    {
        this.fragment = fragment;
        return this;
    }

}