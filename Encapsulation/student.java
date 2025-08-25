package com.tka.july16;

public class student {
      private int roll;
      private String name;
      private int marks;
      
      student(){
    	  
      }
      
      student(int r, String nm, int m)
      {
    	 roll =r;
    	 name = nm;
    	 marks = m;
      }
      
      public int getRoll()
      {
    	  return roll;
      }
      
      public void setRoll(int nr)
      {
    	  roll = nr;
      }
      
      
      public String getName()
      {
    	  return name;
      }
      
      public void setName(String nn)
      {
    	  name = nn;
      }
      
      public int getMarks()
      {
    	  return marks;
      }
      
      public void setMarks(int nm)
      {
    	  marks = nm;
      }
}
