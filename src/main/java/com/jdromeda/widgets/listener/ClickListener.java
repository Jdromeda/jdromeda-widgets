package com.jdromeda.widgets.listener;

import def.dom.Event;
import def.dom.EventListener;

public abstract class ClickListener implements EventListener {

	@Override
	public void $apply(Event evt) {
		click(evt);
	}
	
	public abstract void click(Event e);
}
