public void main(String[] args) throws MyArraySizeException, MyArrayDataException {

    String[][] validArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };

    String[][] invalidSizeArray = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
    };

    String[][] invalidDataArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "a", "12"},
            {"13", "14", "15", "16"}
    };

    try {
        int result = sumArray(validArray);
        System.out.println("Sum: " + result);
    } catch (MyArraySizeException e) {
        System.out.println("Size error: " + e.getMessage());
    } catch (MyArrayDataException e) {
        System.out.println("Data error: " + e.getMessage());
    }


    sumArray(invalidSizeArray);
    sumArray(invalidDataArray);
}

public int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

    if (array.length != 4 || array[0].length != 4) {
        throw new MyArraySizeException("Array supposed to be 4x4");
    }

    int sum = 0;
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            try {
                sum += Integer.parseInt(array[i][j]);
            } catch (NumberFormatException e) {
                throw new MyArrayDataException("Invalid Data [" + i + "][" + j + "]: " + array[i][j]);
            }
        }
    }
    return sum;
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}