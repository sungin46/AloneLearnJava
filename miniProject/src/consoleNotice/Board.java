package consoleNotice;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
	private int listNum;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	public Board(int listNum, String title, String content, String writer, Date date) {
		this.listNum = listNum;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}

	public int getListNum() {return listNum;}
	public void setListNum(int listNum) {this.listNum = listNum;}
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
	public Date getDate() {return date;}
	public void setDate(Date date) {this.date = date;}
}
