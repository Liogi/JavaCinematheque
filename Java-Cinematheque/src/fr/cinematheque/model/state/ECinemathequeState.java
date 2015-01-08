package fr.cinematheque.model.state;

public enum ECinemathequeState
{
	CINEMATHEQUE_FIN_OPERATION(	"L'ajout � la cin�math�que s'est bien d�roul�", 	null),
	CINEMATHEQUE_DEBUT_AJOUT("D�but de l'ajout � la cin�math�que", 	CINEMATHEQUE_FIN_OPERATION),
	NO_OPERATION(	"Aucune op�ration en cours", 	CINEMATHEQUE_DEBUT_AJOUT);
	
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
