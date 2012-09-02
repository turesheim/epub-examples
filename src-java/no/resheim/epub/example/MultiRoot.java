package no.resheim.epub.example;
/*******************************************************************************
 * Copyright (c) 2012 Torkild U. Resheim.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Torkild U. Resheim - initial API and implementation
 *******************************************************************************/
import java.io.File;

import org.eclipse.mylyn.docs.epub.core.EPUB;
import org.eclipse.mylyn.docs.epub.core.ILogger;
import org.eclipse.mylyn.docs.epub.core.OPS2Publication;
import org.eclipse.mylyn.docs.epub.core.OPSPublication;

/**
 * This example produces an EPUB file that has the same content in three
 * different languages. Each of the "books" are contained in their own OEBPS.
 * Most reading systems have problem with this and will not handle it correctly.
 * See <a href=
 * "https://groups.google.com/forum/#!topic/epubcheck/QLeWFm9bn04/discussion">a
 * related discussion</a> in the epubcheck forum.
 * <p>
 * The example was created to see whether or not systems would handle multiple
 * root files of this kind.
 * </p>
 * 
 * @author Torkild U. Resheim
 */
public class MultiRoot {
	public static final void main(String[] args) {
		EPUB epub = new EPUB(new ILogger(){

			@Override
			public void log(String message) {
				System.out.println(message);
			}

			@Override
			public void log(String message, Severity severity) {
				System.out.println(message);
			}		
			
		});
		// English version
		OPSPublication en = new OPS2Publication();
		en.addLanguage(null, "en");
		en.addTitle(null, null, "Halfdan the Black's saga");
		en.addItem(new File("content/halfdan/halfdan_svarte_en.xhtml"));
		en.setGenerateToc(true);
		epub.add(en);
		// Norwegian version
		OPSPublication no = new OPS2Publication();
		no.addLanguage(null, "no");
		no.addTitle(null, null, "Halfdan Svartes saga");
		no.addItem(new File("content/halfdan/halfdan_svarte_no.xhtml"));
		no.setGenerateToc(true);
		epub.add(no);
		// Icelandic version
		OPSPublication is = new OPS2Publication();
		is.addLanguage(null, "is");
		is.addTitle(null, null, "Hálfdanar saga svarta");
		is.addItem(new File("content/halfdan/halfdan_svarte_is.xhtml"));
		is.setGenerateToc(true);
		epub.add(is);
		try {
			File epubFile = new File("Halfdan.epub");
			epubFile.delete();
			epub.pack(epubFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
