package com.example.myNewProject.client;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
















public class LandScape1 extends Composite{
	private VerticalPanel vPanel = new VerticalPanel();
	
	
	LandScape1 (){
		initWidget (this.vPanel);
		Image img = new Image ("/images/welt.PNG");
		img.setWidth("600px");
		this.vPanel.add(img);
	}


}
