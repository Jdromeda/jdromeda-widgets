package com.jdromeda.widgets;

import static def.dom.Globals.document;

public class RootPanel extends Widget {

	public static void addStatic(Widget w)
	{
		document.body.appendChild(w.getRealElement());
	}
}
