
public class ValidaCPF {
    public static boolean isCPF(String cpfString) {
        cpfString = cpfString.replaceAll("\\D", "");

        if (cpfString.length() != 11){
            System.out.println("CPF invalido.");
            return false;
        }

        boolean todosDigitosIguais = true;
        for(int i = 1; i < 11; i++){
            if(cpfString.charAt(i) != cpfString.charAt(0)){
                todosDigitosIguais = false;
                break;
            }
        }
        if (todosDigitosIguais){
            return false;
        }

        int soma = 0;
        for(int i = 0; i < 9; i++){
            soma += Character.getNumericValue(cpfString.charAt(i)) * (10 - i);
        }

        int digitoVerificador1 = 11 - (soma%11);
        if(digitoVerificador1 > 9){
            digitoVerificador1 = 0;
        }

        soma = 0;
        for(int i = 0; i<10; i++){
            soma+= Character.getNumericValue(cpfString.charAt(i)) * (11-i);
        }
        int digitoVerificador2 = 11 - (soma % 11);
        if (digitoVerificador2 > 9){
            digitoVerificador2 = 0;
        }

        return digitoVerificador1 == Character.getNumericValue(cpfString.charAt(9)) && digitoVerificador2 == Character.getNumericValue(cpfString.charAt(10));
    }
    public static String formatCPF(String cpfString) {
        cpfString = cpfString.replaceAll("\\D", "");
        return cpfString.substring(0, 3) + "." + cpfString.substring(3, 6) + "." + cpfString.substring(6, 9) + "-" + cpfString.substring(9);
    }
}
