package model;
public class Recipe implements Shareable{
private int id;
private String title;
private String ingredients;
private String instructions;
private int userId;
public int getId(){return id;}
public void setId(int id){this.id=id;}
public String getTitle(){return title;}
public void setTitle(String title){this.title=title;}
public String getIngredients(){return ingredients;}
public void setIngredients(String ingredients){this.ingredients=ingredients;}
public String getInstructions(){return instructions;}
public void setInstructions(String instructions){this.instructions=instructions;}
public int getUserId(){return userId;}
public void setUserId(int userId){this.userId=userId;}
public void share(){System.out.println("Recipe Shared");}
}
