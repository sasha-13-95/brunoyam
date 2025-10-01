package Module13.Middle4;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private Set<String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashSet<>();
    }

    public void addNumber(String number) throws IncorrectInputException {
        if (!number.matches("^8[0-9]{10}")) {
            throw new IncorrectInputException("Номер введен неправильно");
        }
        phoneBook.add(number);
        System.out.println("Ваш номер добавлен в телефонную книгу");
    }
}
