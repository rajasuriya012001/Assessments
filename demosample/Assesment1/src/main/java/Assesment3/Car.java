package Assesment3;

import java.util.Objects;

public class Car {
	int RegisterNumber;
	int Model;
	int count=0;
	public Car(int registerNumber, int model) {
		super();
		RegisterNumber = registerNumber;
		Model = model;
	}
	public int getRegisterNumber() {
		return RegisterNumber;
	}
	public void setRegisterNumber(int registerNumber) {
		RegisterNumber = registerNumber;
		count++;
	}
	public int getModel() {
		return Model;
	}
	public void setModel(int model) {
		Model = model;
		count++;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Model, RegisterNumber, count);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Model == other.Model && RegisterNumber == other.RegisterNumber;
	}
	@Override
	public String toString() {
		return "Car [RegisterNumber=" + RegisterNumber + ", Model=" + Model + "]";
	}
	
	public int getCount() {
		return count;
	}
	
	
		
	}
	

