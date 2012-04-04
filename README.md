#EPUB Examples
This project contains various examples for using the EPUB tooling in [Mylyn Docs](http://www.eclipse.org/mylyn/docs/). The examples have been designed to be executed in two ways, either using development versions of the code or using the libraries found in the *lib* folder. Which one to use is automatically detected. If *org.eclipse.mylyn.docs* is present parallell to *epub-examples* in the file system the prior method will be used.

The basic examples can be executed simply by running Ant, others have some dependencies.

<table>
<tr><th>Example</th><th>Description</th></tr>
<tr><td>simple</td><td>The most basic example</td></tr>
<tr><td>book</td><td>Builds the EPUB tooling documentation as a book. Mylyn Docs must be present.</td></tr>
</table>

Mylyn docs can be obtained from the [GitHub repository](https://github.com/turesheim/org.eclipse.mylyn.docs).

The generated EPUB's can be read using any EPUB supporting reading system such as iBooks, Nook or Sony Reader. Some desktop readers also exist. For instance [Kitabu](http://itunes.apple.com/no/app/kitabu/id492498910?l=en&mt=12) which is one of the better ones for Mac. And there is also the open source [Elibrārium](http://turesheim.github.com/elibrarium/).

##License
This software is released under the [Eclipse Public License 1.0](http://www.eclipse.org/legal/epl-v10.html).

##Copyright
Copyright (c) 2011,2012 Torkild Ulvøy Resheim, All Rights Reserved.