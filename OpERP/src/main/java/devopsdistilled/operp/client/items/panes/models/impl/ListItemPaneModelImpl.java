package devopsdistilled.operp.client.items.panes.models.impl;

import devopsdistilled.operp.client.abstracts.AbstractPaneModel;
import devopsdistilled.operp.client.items.models.observers.ListItemPaneModelObserver;
import devopsdistilled.operp.client.items.panes.models.ListItemPaneModel;

public class ListItemPaneModelImpl extends
		AbstractPaneModel<ListItemPaneModelObserver> implements
		ListItemPaneModel {

	public ListItemPaneModelImpl() {
		title = "Items List";
	}

	@Override
	public String getTitle() {
		return title;
	}

}