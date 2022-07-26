package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void addCars(Car car);

    List<User> listUsers();

    User userCar(String model, int series);
}
