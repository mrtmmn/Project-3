package com.imaginat.justhejist.jist.api.nyt.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Copyright 2016 Boloutare Doubeni
 */
public class Result {

  /**
   * A short description for the article provided by the NYT
   */
  @SerializedName("abstract") private String _abstract;

  private String created_date;

  private String published_date;

  private String subsection;

  //  private String per_facet;

  private String section;

  private String url;

  // private String[] des_facet;

  private String title;

  // private Multimedia[] multimedia;

  private String byline;

  private String updated_date;

  // private String[] org_facet;

  private String item_type;

  private String material_type_facet;

  public String getCreated_date() { return created_date; }

  public void setCreated_date(String created_date) {
    this.created_date = created_date;
  }

  public String getPublished_date() { return published_date; }

  public void setPublished_date(String published_date) {
    this.published_date = published_date;
  }

  public String getSubsection() { return subsection; }

  public void setSubsection(String subsection) { this.subsection = subsection; }

  //  public String getPer_facet() { return per_facet; }
  //
  //  public void setPer_facet(String per_facet) { this.per_facet = per_facet; }

  public String getSection() { return section; }

  public void setSection(String section) { this.section = section; }

  public String getUrl() { return url; }

  public void setUrl(String url) { this.url = url; }

  //  public String[] getDes_facet() { return des_facet; }
  //
  //  public void setDes_facet(String[] des_facet) { this.des_facet = des_facet;
  //  }

  public String getTitle() { return title; }

  public void setTitle(String title) { this.title = title; }

  //  public Multimedia[] getMultimedia() { return multimedia; }
  //
  //  public void setMultimedia(Multimedia[] multimedia) {
  //    this.multimedia = multimedia;
  //  }

  // FIXME(boloutaredoubeni): Articles may contain mutliple authors, not a
  // problem, just a thought
  public String getByline() { return byline; }

  public void setByline(String byline) { this.byline = byline; }

  public String getUpdated_date() { return updated_date; }

  public void setUpdated_date(String updated_date) {
    this.updated_date = updated_date;
  }

  //  public String[] getOrg_facet() { return org_facet; }
  //
  //  public void setOrg_facet(String[] org_facet) { this.org_facet = org_facet;
  //  }

  public String getItem_type() { return item_type; }

  public void setItem_type(String item_type) { this.item_type = item_type; }

  public String getMaterial_type_facet() { return material_type_facet; }

  public void setMaterial_type_facet(String material_type_facet) {
    this.material_type_facet = material_type_facet;
  }

  public String getAbstract() { return _abstract; }
  public void setAbstract(String _abstract) { this._abstract = _abstract; }
}
