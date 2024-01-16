public class Start implements FirstPart {
    public static void main(String[] args) {
        System.out.println("The first part of Homework\n");
        FirstPart.getUniqueValues(FirstPart.fillArray());
        System.out.println("==============================");
        FirstPart.countValues(FirstPart.fillArray());

        System.out.println("\nThe second part of Homework\n");
        AddressBook addressBook = new AddressBook();
        addressBook.add("Pelevin", "+380991234567");
        addressBook.add("Kolin", "+380991234567");
        addressBook.add("Kolin", "+380991234561");
        addressBook.add("Bulgarin", "+780991234567");
        addressBook.add("Petrov", "+9999999");
        addressBook.add("Petrov", "");
        addressBook.get("Kolin");
        addressBook.get("Pelevin");
        addressBook.get("Bulgarin");
        addressBook.get("Petrov");
        addressBook.get("Petrov1");
    }

}
