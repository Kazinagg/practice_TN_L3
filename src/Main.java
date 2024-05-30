import java.util.Scanner;

public class Main {
    public static double calculate(double x, int functionNumber) {
        double sum = 0;
        double term1 = 0;
        switch (functionNumber) {
            case 1:
                for (int n = 0;;n++){
                    double term = (Math.pow(-1, n) * ((2 * n * Math.pow(x, 2 * n + 1)) / (factorial((2 * n + 1)))));
                    if (Math.abs(term1 - term) < 0.0001 && n > 0){
                        break;
                    }
                    sum += term;
                }
                return sum;
            case 2:
                if (x <= -1 || x >= 1) {
                    throw new IllegalArgumentException("x должен быть в интервале (-1, 1)");
                }
                for (int n = 0; ; n++) {
                    double term = Math.pow(x, 2 * n + 1) / (2 * n + 1);

                    if (Math.abs(term1 - term) < 0.0001 && n > 0) {
                        break;
                    }
                    term1 = term;
                    sum += term;

                }
                return sum;
            case 3:
                if (x <= -1 || x >= 1) {
                    throw new IllegalArgumentException("x должен быть в интервале (-1, 1)");
                }
                for (int n = 0; ; n++) {
                    double term = Math.pow(x, 4 * n + 1) / (4 * n + 1);
                    if (n > 0 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 4:
                for (int n = 0; ; n++) {
                    double term = (Math.pow(2, n/2) * Math.cos((n * Math.PI) / 4) * Math.pow(x, n)) / factorial(n);
                    if (n > 0 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 5:
                for (int n = 0; ; n++) {
                    double term = (Math.pow(2, n/2) * Math.sin((n * Math.PI) / 4) * Math.pow(x, n)) / factorial(n);
                    if (n > 0 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 6:
                for (int n = 2; ; n++) {
                    double term = Math.pow(-1, n+1) * (n - 1) * Math.pow(x, n) / factorial(n);
                    if (n > 1 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 7:
                for (int n = 1; ; n++) {
                    double term = Math.pow(-1, n) * ((2 * n * Math.pow(x, 2 * n + 1)) / factorial(2 * n + 1));
                    if (n > 1 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 8:
                for (int n = 1; ; n++) {
                    double term = Math.pow(-1, n) * ((2 * n * Math.pow(x, 2 * n + 1)) / factorial(2 * n + 1));
                    if (n > 1 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 9:
                if (x < -1 || x > 1) {
                    throw new IllegalArgumentException("x должен быть в интервале [-1, 1]");
                }
                for (int n = 1; ; n++) {
                    double harmonicNumber = 0;
                    for (int i = 1; i <= n; i++) {
                        harmonicNumber += 1.0 / i;
                    }
                    double term = harmonicNumber * (Math.pow(x, n + 1)) / (n + 1);
                    if (n > 1 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum * 2;
            case 10:
                if (x <= -1 || x >= 1) {
                    throw new IllegalArgumentException("x должен быть в интервале (-1, 1)");
                }
                for (int n = 1; ; n++) {
                    double partialSum = 0;
                    for (int i = 2; i <= n; i++) {
                        partialSum += 1.0 / i;
                    }
                    double term = Math.pow(-1, n - 1) * partialSum * Math.pow(x, n);
                    if (n > 1 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 11:
                if (x <= -1 || x >= 1) {
                    throw new IllegalArgumentException("x должен быть в интервале (-1, 1)");
                }
                for (int n = 0; ; n++) {
                    double term = doubleFactorial(2 * n + 1) * Math.pow(x, 2 * n) / doubleFactorial(2 * n);
                    if (n > 0 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 12:
                if (x < 1.0/4 || x > 1.0/2) {
                    throw new IllegalArgumentException("x должен быть в интервале [1/4, 1/2]");
                }
                for (int n = 1; ; n++) {
                    double term = (Math.pow(-1, n) * Math.pow(2, 2 * n - 1) * Math.pow(x, 2 * n - 1)) / (2 * n - 1);
                    if (n > 1 && Math.abs(term - term1) < 0.01) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum + Math.atan(2);
            case 13:
                if (x < -1 || x > 1) {
                    throw new IllegalArgumentException("x должен быть в интервале [-1, 1]");
                }
                for (int n = 1; ; n++) {
                    double term = Math.pow(-1, n + 1) * Math.pow(x, 2 * n) / (2 * n * (2 * n - 1));
                    if (n > 1 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 14:
                if (x < -1 || x > 1) {
                    throw new IllegalArgumentException("x должен быть в интервале [-1, 1]");
                }
                for (int n = 0; ; n++) {
                    double term = Math.pow(-1, n) * Math.pow(x, 2 * n + 1) * (1+Math.pow(x, 2)) / (2 * n + 1);
                    if (n > 0 && Math.abs(term - term1) < 0.01) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 15:
                if (x < -1 || x > 1) {
                    throw new IllegalArgumentException("x должен быть в интервале [-1, 1]");
                }

                for (int n = 1; ; n++) {
                    double term = Math.pow(-1, n - 1) * Math.pow(x, n) * (1 + Math.pow(x, 2)) / n;


                    // Условие остановки, если следующий член меньше заданной точности
                    if (n > 1 && Math.abs(term - term1) < 0.01) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return sum;
            case 16:
                if (x < -1 || x > 1) {
                    throw new IllegalArgumentException("x должен быть в интервале [-1, 1]");
                }

                for (int n = 1; ; n++) {
                    double term = Math.pow(-1, n + 1) * Math.pow(x, 2 * n - 1) / (4 * Math.pow(n,2) - 1);


                    // Условие остановки, если следующий член меньше заданной точности
                    if (n > 1 && Math.abs(term - term1) < 0.0001) {
                        break;
                    }
                    term1 = term;
                    sum += term;
                }
                return x + 2*sum;
            default:
                return sum;
        }
    }

    public static long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static long doubleFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        long result = number;
        while (number > 2) {
            number -= 2;
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите значение x: ");
//        double x = scanner.nextDouble();

        double x = 0.5;

        for (int i = 1; i <= 16; i++) {
            System.out.println("Результат функции " + i + ": " + calculate(x, i));
        }

//        scanner.close();
    }
}
