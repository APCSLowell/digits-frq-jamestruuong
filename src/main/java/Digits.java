import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		digitList = new ArrayList<Integer>();
		int nums = num;
		if(num == 0){
			digitList.add(0);
		}
		while(nums>0){
			digitList.add(0,nums%10);
			nums = nums/10;
		}
		return digitList;
		/* to be implemented in part (a) */ 
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 0; i<digitList.size() -1; i++){
			if(digitList.get(i) >= digitList.get(i+1)){
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
