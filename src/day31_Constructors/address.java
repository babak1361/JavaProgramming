package day31_Constructors;

public class address {

    public int buildingNumber;
    public String Street;
    public String city,state;
    public int zipCode;


    public address(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        Street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String address(){
       return buildingNumber+" "+Street+'\n'+city+" "+state+" "+zipCode;
    }

    public String toString() {
        return "address{" +
                "buildingNumber=" + buildingNumber +
                ", Street=" + Street +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", address=" + address() +
                '}';
    }
}
/*
2. Address Task:
	2.1 Create a class named Address
		    Attributes:
		         buildingNumber, street, city, state, zipCode;

		   	Add a constructor to set all the fields

		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012

 */