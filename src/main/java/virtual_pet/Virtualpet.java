package virtual_pet;

class Virtualpet {
    private Integer hungerLevel;
    private Integer thirstLevel;
    private Integer boredomLevel;
    private Integer bathroomBreak;
    public Virtualpet(Integer hungerLevel, Integer thirstLevel, Integer boredomLevel, Integer bathroomBreak) {
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.bathroomBreak = bathroomBreak;
    }
    public Integer getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public Integer getThirstLevel() {
        return thirstLevel;
    }

    public void setThirstLevel(Integer thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public Integer getBoredomLevel() {
        return boredomLevel;
    }

    public void setBoredomLevel(Integer boredomLevel) {
        this.boredomLevel = boredomLevel;
    }

    public Integer getBathroomBreak() {
        return bathroomBreak;
    }

    public void setBathroomBreak(Integer bathroomBreak) {
        this.bathroomBreak = bathroomBreak;
    }


   /* public void tick() {
        hungerLevel++;
        thirstLevel++;
        boredomLevel++;
        bathroomBreak++;


    }*/

    public void feedPet() {
        hungerLevel = hungerLevel - 2;
        thirstLevel++;
        boredomLevel++;
        bathroomBreak++;
//        tick();

    }

    public void givePetWater() {
        thirstLevel = thirstLevel - 2;
        bathroomBreak++;
//        tick();


    }

    public void playWithPet() {
        boredomLevel = boredomLevel - 2;
        hungerLevel++;
        thirstLevel++;
//        tick();


    }

    public void givePetBathroomBreak() {
        bathroomBreak = bathroomBreak - 2;
        hungerLevel++;
        thirstLevel++;
        boredomLevel++;
//        tick();


    }
}
