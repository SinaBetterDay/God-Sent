import java.util.ArrayList;

public class InsertAtCommand extends UndoCommand {
   private ArrayList<String> sourceList;
   private int index;
   private String item;
   
   public InsertAtCommand(ArrayList<String> lst, int idx, String itm) {
      this.sourceList = lst;
      this.index = idx;
      this.item = itm;
   }
	
	@Override
	public void execute() {
		sourceList.add(index, item);
	}
}
