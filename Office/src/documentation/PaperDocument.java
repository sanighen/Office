package documentation;

public class PaperDocument implements PaperDocumentInterface, Cloneable {

	private String type;
	private String title;
	private String content;

	public PaperDocument() {
	}

	public PaperDocument(String type, String title, String content) {
		this.type = type;
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "PaperDocument [type=" + type + ", title=" + title + ", content=" + content + "]";
	}

	@Override
	public void setType(String type) {
		this.type = type;

	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;

	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setContent(String content) {
		this.content = content;

	}

	@Override
	public String getContent() {
		return content;
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		PaperDocumentInterface originalPaper = (PaperDocumentInterface) super.clone();
//		originalPaper.setType(type);
//		originalPaper.setTitle(title);
//		originalPaper.setContent(content);
//		return originalPaper;
//	}

}
