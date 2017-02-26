package comptes.gui.tableaux;

import javax.swing.table.AbstractTableModel;

import comptes.gui.manager.RapproManager;
import comptes.util.log.LogRappro;

public abstract class CheckableTableau extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	protected int tabSelectedRapproManu;
	protected int tabSelectedCreationCheck;
	protected RapproManager myRapproMngr;
	

	// Remplit le tableau
	public CheckableTableau(RapproManager rapproMngr) {
		LogRappro.logDebug("D�but : constructeur RapproTableau tableau");
		tabSelectedRapproManu=-1;
		tabSelectedCreationCheck=-1;
		this.myRapproMngr=rapproMngr;
	}


	public int getTabSelectedRapproManu() {
		return tabSelectedRapproManu;
	}
	
	public void resetTabSelected() {
		tabSelectedRapproManu=-1;
	}


	public int getTabSelectedCreationCheck() {
		return tabSelectedCreationCheck;
	}


	public void resetTabSelectedCreationCheck() {
		tabSelectedCreationCheck=-1;
	}

}