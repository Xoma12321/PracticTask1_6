public class STO {
    public String modify(Car car) {
        String model = car.getModel();
        model = model.toLowerCase();
        model = model.replace('a', 'o');
        model = model.replace('i', 'e');
        car.setModel(model);
        return model;
    }
}
