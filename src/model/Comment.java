package model;
public class Comment{
private int id;
private int recipeId;
private int userId;
private String text;
public int getId(){return id;}
public void setId(int id){this.id=id;}
public int getRecipeId(){return recipeId;}
public void setRecipeId(int recipeId){this.recipeId=recipeId;}
public int getUserId(){return userId;}
public void setUserId(int userId){this.userId=userId;}
public String getText(){return text;}
public void setText(String text){this.text=text;}
}
