package com.example.myNewProject.client;

import com.google.gwt.user.client.ui.Composite;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite{
	private VerticalPanel vPanel = new VerticalPanel();
	private VerticalPanel contentPanel;
	private Integer o = new Integer (3);
	String aneuer= "Die ist richtig so  und muss so blei1!!!!!";
	public MainView(){
		
		
	
	  initWidget(this.vPanel);
	  this.vPanel.setBorderWidth(5);
	  MenuView menu = new MenuView(this);
	  this.vPanel.add(menu);
	  
	  
	  
	  this.contentPanel = new VerticalPanel();
	  this.vPanel.add(contentPanel);
	  
	  
	  Label label = new Label ("Öffe diese wunscheschöen Bild!!!!!!!!");
	  this.contentPanel.add(label);
	

}
	
	
	public void openImg (){
		this.contentPanel.clear();
		LandScape1 page1 = new LandScape1 ();
		this.contentPanel.add(page1);
	}
}