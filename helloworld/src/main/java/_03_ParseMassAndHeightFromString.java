import javax.measure.Quantity;

import tech.units.indriya.quantity.Quantities;

public class _03_ParseMassAndHeightFromString {

	public static void main(String[] args) {
		final Quantity<?> mass = Quantities.getQuantity("75 kg");
		System.out.println(mass);
		final Quantity<?> height = Quantities.getQuantity("1.80 m");
		System.out.println(height);
		final Quantity<?> height2 = Quantities.getQuantity("180 cm");
		System.out.println(height2);
		final Quantity<?> bmi = mass.divide(height).divide(height);
		System.out.println(bmi);
		final Quantity<?> bmi2 = mass.divide(height).divide(height2);
		System.out.println(bmi2);
	}
}