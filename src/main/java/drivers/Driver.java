package drivers;

import java.util.Date;

public class Driver
{

    private String firstName;
    private String lastName;
    private String id;
    private int licenseNumber;
    private String licenseType;
    private Date licenseExpiredDate;
    private int drivingExperience;
    private int dayliMileage;


    public void SetDayliMileage (){};

    public void GetdDayliMileage(){return ;};

    public void SetDayliFuel (){};

    public void SetParkingReports(){};

    public void SetDrivingReporrts(){};

    public void GetDayliFuel (){};

    public void GetParkingReports(){};

    public void GetDrivingReporrts(){};

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public Date getLicenseExpiredDate() {
        return licenseExpiredDate;
    }

    public void setLicenseExpiredDate(Date licenseExpiredDate) {
        this.licenseExpiredDate = licenseExpiredDate;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        drivingExperience = drivingExperience;
    }

    public int getDayliMileage() {
        return dayliMileage;
    }

    public void setDayliMileage(int dayliMileage) {
        this.dayliMileage = dayliMileage;
    }
}
