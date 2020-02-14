package main;

import java.util.List;

import documentation.PaperDocument;
import documentation.PaperDocumentInterface;
import documentation.Xerox;

public class Application {

	public static void main(String[] args) {

		PaperDocumentInterface document = new PaperDocument("Contract", "Java Developer Hiring Contract",
				"1. Working hours per day: 6\\n2. Earn per hour: 15EUR\\n3. Hollidays per year: 30days.");
//		System.out.println(document);
		Xerox xerox = new Xerox();		
		
//		PaperDocumentInterface cloneDocument = xerox.copy(document);		
//		cloneDocument.setType("Contract Copy");		
//		System.out.println(cloneDocument);
		
		List<PaperDocumentInterface> newDoc = xerox.copy(document, 3);	
		
		for (PaperDocumentInterface paper : newDoc) {
			paper.setType("Archived Contract Copy");
		}
		
		for (PaperDocumentInterface fr : newDoc) {
		System.out.println(fr);
		}

	}

}
