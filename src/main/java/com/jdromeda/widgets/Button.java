package com.jdromeda.widgets;

import def.dom.EventListener;

public class Button extends Widget {


	public Button(String text)
	{
		super("button");
		getRealElement().innerText = text;
		getRealElement().className = "btn";
	}
	
	public void addClickListener(EventListener listener)
	{
		getRealElement().addEventListener("click", listener);
	}

}
