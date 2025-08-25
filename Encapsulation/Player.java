package com.tka.july16;

public class Player {
	
	private int jersyNo;
	private String pName;
	private int runs;
	private int wickets;
	private String tName;
	
	Player()
	{
		
	}
	
	Player(int j, String pn, int r,int w, String t)
	{
		jersyNo = j;
		pName = pn;
		runs = r;
		wickets =w;
		tName = t;
	}
	
	
	public int getJersyNo()
	{
		return jersyNo;
	}
	
	
	public void setJersyNo(int jn)
	{
		jersyNo = jn;
	}
	
	
	public String getPname()
	{
		return pName;
	}
	
	public void setPname(String pn)
	{
		pName = pn;
	}
	
	public int getRuns()
	{
		return runs;
	}

	public void setRuns(int r)
	{
		runs = r;
	}
	
	public int getWickets()
	{
		return wickets;
	}
	
	public void setWickets(int w)
	{
		wickets = w;
	}
	
	public String getTname()
	{
		return tName;
	}
	
	public void setTname(String tn)
	{
		tName =tn;
	}
}
