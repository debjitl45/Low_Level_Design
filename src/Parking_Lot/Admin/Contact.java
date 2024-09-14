package Parking_Lot.Admin;

import Parking_Lot.Parking.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Contact {
    private String phone;
    private String email;
    private Address address;
}
