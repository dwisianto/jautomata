package net.jhoogland.jautomata.semirings;

/**
 * 
 * This class defines the element type of the k-tropical semiring.
 * 
 * @author Jasper Hoogland
 *
 */

public class BestPathWeights<K extends Comparable<K>>
{
	public PathWeight<K>[] pathWeights;
	
	public BestPathWeights(PathWeight<K>[] pathWeights) 
	{
		this.pathWeights = pathWeights;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
//		throw new RuntimeException();
		if (obj instanceof BestPathWeights)
		{
			BestPathWeights<K> other = (BestPathWeights<K>) obj;
			for (int i = 0; i < this.pathWeights.length; i++)
				if (! this.pathWeights[i].equals(other.pathWeights[i])) 
					return false;
			return true;
		}
		else return false;
	}
}


