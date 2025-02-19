import java.util.ArrayList;

public class SwapCommand extends UndoCommand {
   private ArrayList<String> sourceList;
   private int index1, index2;
   
   public SwapCommand(ArrayList<String> lst, int idx1, int idx2) {
      this.sourceList = lst;
      this.index1 = idx1;
      this.index2 = idx2;
   }
	
	@Override
	public void execute() {
	   String temp = sourceList.get(index1);
      sourceList.set(index1, sourceList.get(index2));
      sourceList.set(index2, temp);
	}

}
