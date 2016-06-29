package com.example.myNewProject.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class MenuView extends Composite	 {
HorizontalPanel hPanel= new HorizontalPanel();
private MainView main;




public MenuView(MainView main){
	initWidget (this.hPanel);
	this.main = main;
	
	
	
	
	
	
	
	Button landscape1Btn = new Button ("Landscape 1");
	landscape1Btn.addClickHandler(new Ls1Clickhandler());
	this.hPanel.add(landscape1Btn);

	Button landscape2Btn = new Button ("Landscape 2");
	landscape2Btn.addClickHandler(new Ls2Clickhandler ());
	this.hPanel.add(landscape2Btn);

}







private class Ls1Clickhandler implements ClickHandler {

	@Override
	public void onClick(ClickEvent event) {
	main.openImg();
		
	}
}
private class Ls2Clickhandler implements ClickHandler {

	@Override
	public void onClick(ClickEvent event) {
		
	

	}
		
}}





