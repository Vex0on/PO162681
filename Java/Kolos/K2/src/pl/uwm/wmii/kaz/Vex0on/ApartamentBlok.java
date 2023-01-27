package pl.uwm.wmii.kaz.Vex0on;


import java.util.Objects;

public class ApartamentBlok extends House{
    private String type;
    private boolean lift;


    public ApartamentBlok(String address, int floors, int year, String ownerName, String type, boolean lift) {
        super(address, floors, year, ownerName);
        if (Objects.equals(type, ""))
        {
            type = "wieżowiec";
        }
        this.type = type;
        this.lift = lift;
    }

    public String getType() {
        return this.type;
    }

    public boolean isLift() {
        return this.lift;
    }

    public void setType(String type) {
        if (!Objects.equals(type, ""))
        {
            this.type = type;
        }
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    @Override
    public String toString(){
        return House.class.getSimpleName() + ": "+ "\nDom znajdujący się na " + getAddress() + ", ma " + getFloors() +
                " pięter i został wybudowany w " + getYear() + ". Jego właścicielem jest " + getOwnerName() +
                ".\nTypem tego budynku jest: " + this.type + " Czy ma on windę? " + this.lift;
    }

    public void renovate(int amount){
        setFloors(getFloors() + amount);
        if (getFloors() > 50){
            setFloors(50);
        }
        if (getFloors() > 10)
            setLift(true);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (!(obj instanceof House))
            return false;
        House house = (House) obj;
        ApartamentBlok apartamentBlok = (ApartamentBlok) obj;
        return getFloors() == house.getFloors() && Objects.equals(getType(), apartamentBlok.getType()) && isLift() == apartamentBlok.isLift();
    }
}
