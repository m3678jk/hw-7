class Filler {

    private  String fillerWithColor = null;

    public void setFillerWithColor(String fillerWithColor) {
        this.fillerWithColor = fillerWithColor;
    }

    public String getFillerWithColor() {
        return fillerWithColor;
    }

    // there we say what pattern or color framed shape or text is
    public Filler(){
        System.out.println("It is not fill with color");
    }

    public Filler( String fillerWithColor){
        System.out.println("It is filled with " + fillerWithColor);
    }

}
class FillerTester {
    public static void main(String[] args) {
        new Filler();
        new Filler("red");
    }
}