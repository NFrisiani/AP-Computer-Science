
public class DocumentIndex {

	public void addAllWords(String line, int lineNum) 
	{
		
	}
	
	public void addWord(String word, int num)
	{
		boolean isNew = true;
		
		if(word.equals(IndexEntry.word))
		{
			IndexEntry.add(num);
			isNew = false;
		}
		
		if(isNew = false)
		{
			this.addWord(IndexEntry.word, num);
		}
	}

}
