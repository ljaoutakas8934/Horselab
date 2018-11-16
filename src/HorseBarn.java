public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] horses) {
        this.spaces = horses;
    }

    public int findHorseSpace(String name) {
        for(int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null && name.equals(this.spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    public void consolidate() {
        Horse[] newSpaces = new Horse[this.spaces.length];
        int nextSpot = 0;
        for (Horse nextHorse : this.spaces) {
            if (nextHorse != null){
                newSpaces[nextSpot] = nextHorse;
                nextSpot++;
            }
        }
        this.spaces = newSpaces;
    }
    public String toString()
    {
        String out = "";
        for (int i = 0; i < spaces.length; i++)
        {
            if (spaces[i] != null) out = out + "[" + spaces[i].getName() + "]";
            if (spaces [i] == null) out =out + "[null]";
        }
        return out;
    }

}
