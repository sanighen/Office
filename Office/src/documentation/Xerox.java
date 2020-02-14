package documentation;

import java.util.ArrayList;
import java.util.List;

public class Xerox {

	public PaperDocumentInterface copy(PaperDocumentInterface original) {
		PaperDocumentInterface doc = new PaperDocument();
		doc.setType(original.getType());
		doc.setTitle(original.getTitle());
		doc.setContent(original.getContent());
		return doc;
	}

	public List<PaperDocumentInterface> copy(PaperDocumentInterface original, int quantity) {
		List<PaperDocumentInterface> paper = new ArrayList<>();
			while (quantity-- > 0) {
				paper.add(copy(original));
			}
		return paper;
	}

}
