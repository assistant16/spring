package lab1.hometask.state;

public class ColorCar {

    private ColorCar colorCar;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColorCar colorCar(){
        if (colorCar==null){
            System.out.println("springAop.logger.object not ready(color)");
            ColorCar colorCar = new ColorCar();
        }
        return colorCar;
    }
}
