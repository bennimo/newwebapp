package com.example.myNewProject.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class PageTwo extends Composite {

	private HorizontalPanel hPanel = new HorizontalPanel();
	
	public PageTwo(){
	initWidget(this.hPanel);
	FlexTable ft = new FlexTable();
	Label lab1 = new Label("1");
	Label lab2 = new Label("2");

	Label lab3 = new Label("3");

	Label lab4 = new Label("4");

	Label lab5 = new Label("5");

	ft.setWidget(0, 0, lab1);
	ft.setWidget(0, 1, lab2);
	ft.setWidget(0, 2, lab3);
	ft.setWidget(0, 3, lab4);
	ft.setWidget(0, 4, lab5);
hPanel.add(ft);
}
}