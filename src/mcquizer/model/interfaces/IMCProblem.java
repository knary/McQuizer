package mcquizer.model.interfaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A multiple choice problem to give to user to solve. The question is presented
 * to the user accompanied by a number of possible answers; only one answer is
 * correct.
 * 
 * @author Konstantin Naryshkin
 */
public interface IMCProblem extends IProblem
{
	
	/**
	 * Get the index into {@link #getPossibleAnswers()} of the correct answer to
	 * the question
	 * 
	 * @return the answer
	 */
	public int getCorrectAnswer();
	
	/**
	 * Get the possible answers that the user can chose from.
	 * 
	 * @return answers to give the user
	 */
	public List<String> getPossibleAnswers();
	
	/**
	 * A hack to get around type erasure. This was, the list type is known at run
	 * time.
	 *
	 * @author Konstantin Naryshkin
	 */
	class MCProbemList extends ArrayList<IMCProblem> {
		
			/**
			 * @see Serializable
			 */
			private static final long serialVersionUID = 8607296112799774506L;
		}
}
