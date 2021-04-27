package gun_2_odev_1.guncelleme;

public class CategoryManager {
	
	public void Add(Category category) {
		System.out.println("\n" + category.getName() + " eklendi.");
	}
	
	public void Delete(Category category) {
		System.out.println("\n" + category.getName() + " silindi.");
	}
	
	public void Update(Category category) {
		System.out.println("\n" + category.getName() + " g�ncellendi.");
	}
	
	public void select(Category category) {
		System.out.println("\n" + category.getName() + " se�ildi.");
	}
	
	public void list(Category[] categories) {
		System.out.println("\nKATEGOR�\n_________\n");
		for(Category category : categories) {
			System.out.println(category.getId() + "-" + category.getName());
		}
	}

}
