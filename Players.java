
public class Players {
int id;
String Name;
String LastName;
String NickName;
int YearOfBirth;
Long NatilionId;
String[] Products;

public Players(int id, String name, String lastName, String nickName, int yearOfBirth, Long natilionId) {
	super();
	this.id = id;
	Name = name;
	LastName = lastName;
	NickName = nickName;
	YearOfBirth = yearOfBirth;
	NatilionId = natilionId;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public String getNickName() {
	return NickName;
}

public void setNickName(String nickName) {
	NickName = nickName;
}

public int getYearOfBirth() {
	return YearOfBirth;
}

public void setYearOfBirth(int yearOfBirth) {
	YearOfBirth = yearOfBirth;
}

public Long getNatilionId() {
	return NatilionId;
}

public void setNatilionId(Long natilionId) {
	NatilionId = natilionId;
}
}
