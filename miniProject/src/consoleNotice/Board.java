package consoleNotice;

import java.io.Serializable;

public class Board implements Serializable{
	private int listNum;
	private String title;
	private String content;
	private String writer;
	
	public Board(int listNum, String title, String content, String writer) {
		this.listNum = listNum;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getListNum() {return listNum;}
	public void setListNum(int listNum) {this.listNum = listNum;}
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
}
