package lmb;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(exclude = {"model", "year", "price", "color", "quantity"})
public class CarWithLombok {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;
}
