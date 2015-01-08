package fr.cinematheque.model.state;

public enum ECinemathequeState
{
	CINEMATHEQUE_FIN_OPERATION(	"L'ajout à la cinémathèque s'est bien déroulé", 	null),
	CINEMATHEQUE_DEBUT_AJOUT("Début de l'ajout à la cinémathèque", 	CINEMATHEQUE_FIN_OPERATION),
	NO_OPERATION(	"Aucune opération en cours", 	CINEMATHEQUE_DEBUT_AJOUT);
	
	/** Following step */
	private ECinemathequeState 		nextStepState;
	
	/** State */
	private String 			state;
	
	
	
	private ECinemathequeState(String state, ECinemathequeState nextStepState)
	{
		this.state 			= state;
		this.nextStepState	= nextStepState;
	}

	public String getState()
	{
		return state;
	}

	public ECinemathequeState getNextStepState()
	{
		return nextStepState;
	}
}
