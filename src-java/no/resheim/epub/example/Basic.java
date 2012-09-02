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
 * This example produces a very simple EPUB file.
 * 
 * @author Torkild U. Resheim
 */
public class Basic {
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

		OPSPublication en = new OPS2Publication();
		en.addLanguage(null, "en");
		en.addTitle(null, null, "Halfdan the Black's saga");
		en.addItem(new File("content/halfdan/halfdan_svarte_en.xhtml"));
		en.setGenerateToc(true);
		epub.add(en);
		try {
			File epubFile = new File("Halfdan_en.epub");
			epubFile.delete();
			epub.pack(epubFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
