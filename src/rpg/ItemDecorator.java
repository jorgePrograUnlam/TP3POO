package rpg;
public abstract class ItemDecorator {

	private Item item;

	public ItemDecorator(Item item) {
		this.item = item;
	}

	//para agregar metodos futuros a los items
}
