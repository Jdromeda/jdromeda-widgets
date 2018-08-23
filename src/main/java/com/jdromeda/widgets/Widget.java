package com.jdromeda.widgets;

import static def.dom.Globals.document;

import com.jdromeda.widgets.util.Util;

import def.dom.HTMLElement;


public class Widget {

	final String uuid;
	private HTMLElement realElement;
	
	public Widget()
	{ this("div"); }
	
	public Widget(String tag)
	{
		uuid = Util.createID();
		realElement = document.createElement(tag);
		realElement.id = uuid;
	}
	
	public void add(Widget w)
	{
		realElement.appendChild(w.realElement);
	}

	protected HTMLElement getRealElement() {
		return realElement;
	}
	
	
}
