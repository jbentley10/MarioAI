package ucsc_mario_astar;

import ch.idsia.ai.agents.Agent;
import ch.idsia.ai.agents.ai.BasicAIAgent;
import ch.idsia.mario.environments.Environment;

/**
 * Created by IntelliJ IDEA.
 * User: Sergey Karakovskiy
 * Date: Apr 25, 2009
 * Time: 12:30:41 AM
 * Package: ch.idsia.ai.agents.ai;
 */
public class UCSC_AStarAgent extends BasicAIAgent
{
    protected boolean action[] = new boolean[Environment.numberOfButtons];
    protected String name = "UCSC_AStarAgent";

    public UCSC_AStarAgent()
    {
        super("UCSC_AStarAgent");
    }

    public void reset()
    {
        action = new boolean[Environment.numberOfButtons];// Empty action
    }

    // This function 
    public boolean[] getAction(Environment observation)
    {
        return new boolean[Environment.numberOfButtons]; // Empty action
    }

    public AGENT_TYPE getType()
    {
        return Agent.AGENT_TYPE.AI;
    }

    public String getName() {        
    	return name;    
    }

    public void setName(String Name) { 
    	this.name = Name;    
    }
}
