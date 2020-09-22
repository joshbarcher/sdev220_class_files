package classes_review;

/**
 * Represents an umbrella which can be
 * waterproof or not.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class Umbrella
{
    private String material;
    private boolean waterproof;
    private int yearProduced;

    /**
     * Creates a default umbrella with cotton
     * material.
     */
    public Umbrella() {
        material = "cotton";
        waterproof = false;
        yearProduced = 2018;
    }

    /**
     * Creates a new umbrella
     * @param material a new material
     * @param waterproof is the new umbrella waterproof?
     * @param yearProduced the year the umbrella was made
     */
    public Umbrella(String material, boolean waterproof,
                    int yearProduced) {
        this.material = material;
        this.waterproof = waterproof;
        this.yearProduced = yearProduced;
    }

    /**
     * Retrieves the umbrella material
     * @return the umbrella material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Assigns a new umbrella material
     * @param material a new material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Determines if the umbrella is waterproof
     * @return true if waterproof, or otherwise false
     */
    public boolean isWaterproof() {
        return waterproof;
    }

    /**
     * Changes whether the umbrella is waterproof
     * @param waterproof the new waterproof status
     */
    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    /**
     * Returns the year the umbrella was created
     * @return the year created
     */
    public int getYearProduced() {
        return yearProduced;
    }

    /**
     * Changes the year the umbrella was created
     * @param yearProduced the year created
     */
    public void setYearProduced(int yearProduced) {
        this.yearProduced = yearProduced;
    }

    /**
     * Returns a string representation of an umbrella
     * @return the data of an umbrella as a string
     */
    public String toString() {
        String proof = waterproof ? " (waterproof)" : "";
        return "A " + material + proof + " umbrella";
    }
}
