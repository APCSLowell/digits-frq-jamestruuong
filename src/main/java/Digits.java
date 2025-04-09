import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		int nums = num;
		if(num == 0){
			list.add(0);
		}
		while(nums>0){
			list.add(0,nums%10);
			nums = nums/10;
		}
		return list;
		/* to be implemented in part (a) */ 
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i<list.size() -1; i++){
			if(list.get(i) >= list.get(i+1)){
				return false;
			}
		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
