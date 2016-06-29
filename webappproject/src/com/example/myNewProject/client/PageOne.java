package com.example.myNewProject.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PageOne extends Composite{
	private TextBox tbox;
	private Label lab;
	private VerticalPanel  vPanel = new VerticalPanel();
	
	public PageOne (){
		initWidget(this.vPanel);
		vPanel.setBorderWidth(1);
		
		Image img = new Image ("/images/welt.PNG");
		vPanel.add(img);
		
		HorizontalPanel hori = new HorizontalPanel();
		hori.setBorderWidth(1);
	
		
		this. lab = new Label("Hey, es muss doch gehen");
		vPanel.add(lab);
		

		
		
		this.tbox = new TextBox ();
		hori.add(tbox);
		
		
		Button button = new Button("Touch Me Please");
		button.addClickHandler(new ButtonClickHandler());
		hori.add(button);
		
		vPanel.add(hori);
		PageTwo page2 = new PageTwo();
		vPanel.add(page2);
	}
	private class ButtonClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
		String theText =	tbox.getText();
		lab.setText(theText);
			
		}

	}}
