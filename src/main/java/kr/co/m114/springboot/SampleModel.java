package kr.co.m114.springboot;

/**
 * SampleModel
 */
public class SampleModel {
  private Integer seq;
  private String id;
  private String text;
  private String parent;
  public Integer getSeq() { return this.seq; }
  public String getId() { return this.id; }
  public String getText() { return this.text; }
  public String getParent() { return this.parent; }
  public void setSeq(Integer seq) { this.seq = seq; }
  public void setId(String id) { this.id = id; }
  public void setText(String text) { this.text = text; }
  public void setParent(String parent) { this.parent = parent; }
}