#EPUB Examples
This project contains various examples for using the EPUB tools in [Mylyn Docs](http://www.eclipse.org/mylyn/docs/). The examples have been designed to be executed in two ways: Either using development versions of the code, or using the libraries found in the *lib* folder. Which one to use is automatically detected. If the *org.eclipse.mylyn.docs* project is present parallel to *epub-examples* the prior method will be used.

The generated EPUB's can be read using any EPUB supporting reading system such as iBooks, Nook or Sony Reader. Some desktop readers also exist. For instance [Kitabu](http://itunes.apple.com/no/app/kitabu/id492498910?l=en&mt=12) which is one of the better ones for Mac. And there is also the open source [Elibrārium](http://turesheim.github.com/elibrarium/).

##Ant Examples

The basic examples can be executed simply by running Ant, others have some dependencies.

<table>
<tr><th>Example</th><th>Description</th></tr>
<tr><td>simple</td><td>The most basic example</td></tr>
<tr><td>book</td><td>Builds the EPUB tool documentation as a book. Mylyn Docs must be present.</td></tr>
<tr><td>w3c-css2.1</td><td>The CCS 2.1 specification (experimental)</td></tr>
<tr><td>mathml</td><td>Embedding MathML in HTML5 content (experimental)</td></tr>
</table>

Mylyn docs can be obtained from the official [Git repository](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/) or from the [GitHub clone](https://github.com/eclipse/mylyn.docs).

##Java Examples

Note that the Java examples use the libraries contained in the *lib* folder. So while you may have the Mylyn Docs EPUB libraries installed, these will not be used.

<table>
<tr><th>Example</th><th>Description</th></tr>
<tr><td>Simple</td><td>The most basic example</td></tr>
<tr><td>MultiRoot</td><td>Multiple OEBPS root files</td></tr>
</table>

##License
This software is released under the [Eclipse Public License 1.0](http://www.eclipse.org/legal/epl-v10.html).

##Copyright
Copyright (c) 2011, 2012 Torkild Ulvøy Resheim, All Rights Reserved.