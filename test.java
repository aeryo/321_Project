public class Item {
	
	private int userID;
	private int itemID;
	private String location;
	
	public Item(int userID, String location) {
		this.userID = userID;
		this.location = location;
		this.itemID = 0;
	}
	
	public int getItemID() {
		return this.itemID;
	}
	
	public void createItem(int iQuality, int iType) {
		//use SQL statement to get table size
		itemID = tablesize + 1;
		//get all items with given item quality and type
		//for sql SELECT * FROM iPREFIXES WHERE itemQuality = iQuality AND prefixType = iType);
		String pName; //from ^
		String pATK; // ^
		String pdef; // ^
		String pcrit; // ^
		String pblock; // ^
		//SELECT * FROM iSUFFIXES WHERE itemQuality = iQuality AND suffixType = iType);
		String sName; //from ^
		String sATK; // ^
		String sdef; // ^
		String scrit; // ^
		String sblock; // ^
		//SELECT * FROM iNAMES WHERE itemQuality = iQuality AND nameType = iType);
		String iName; //from ^
		String iATK; // ^
		String idef; // ^
		String icrit; // ^
		String iblock; //^
		//All these are nested under 
		//SELECT column FROM table
		//ORDER BY RAND()
		//LIMIT 1
		//This command gets a randomized item with the matching itemquality and itemtype
		String tName = pName + iName +sName;
		String tATK = pATK + iATK + sATK;
		String tdef = pdef + idef + sdef;
		String tcrit = pdef + idef + sdef;
		String tblock = pblock + iblock + sblock;
		//INSERT into items table, userID = userID, itemID = itemID, itemName = tname...., location = bag, itemValue = Math.random()
	}
}
