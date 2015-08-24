package vo;

import java.util.Date;

public class Post {
	
	private int post_no;
	private String e_mail;
	private String msg;
	private int hate_count;
	private int like_count;
	private Date post_date;
	private char tb_flag;

	public Post(){

	}

	public int getPost_no() {
		return post_no;
	}

	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getHate_count() {
		return hate_count;
	}

	public void setHate_count(int hate_count) {
		this.hate_count = hate_count;
	}

	public int getLike_count() {
		return like_count;
	}

	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}

	public Date getPost_date() {
		return post_date;
	}

	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}

	public char getTb_flag() {
		return tb_flag;
	}

	public void setTb_flag(char tb_flag) {
		this.tb_flag = tb_flag;
	}


}