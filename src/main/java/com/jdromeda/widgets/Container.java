package com.jdromeda.widgets;

public class Container extends Widget {

	public Container()
	{
		super("div");
		getRealElement().className = "container";
	}

}
