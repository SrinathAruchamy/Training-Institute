package com.keane.training.domain;

public class Article {
	
	
	public Article(int article_Id, String institute_Id, String article) {
		super();
		Article_Id = article_Id;
		Institute_Id = institute_Id;
		Article = article;
	}
	
	public Article(int article_Id2) {
		// TODO Auto-generated constructor stub
	}

	public int getArticle_Id() {
		return Article_Id;
	}
	public void setArticle_Id(int article_Id) {
		Article_Id = article_Id;
	}
	public String getInstitute_Id() {
		return Institute_Id;
	}
	public void setInstitute_Id(String institute_Id) {
		Institute_Id = institute_Id;
	}
	public String getArticle() {
		return Article;
	}
	public void setArticle(String article) {
		Article = article;
	}
	
	
	@Override
	public String toString() {
		return "Article [Article_Id=" + Article_Id + ", Institute_Id=" + Institute_Id + ", Article=" + Article + "]";
	}

	private int Article_Id;
	private String Institute_Id;
	private String Article;

}
