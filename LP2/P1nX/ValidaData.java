package P1nX;

import java.util.Calendar;
import java.time.LocalDate;

public class ValidaData {
    public static boolean isDiaValido(int dia) {
        return dia >= 1 && dia <= 31;
    }

    public static boolean isDia(String diaString) {
        try {
            int dia = Integer.parseInt(diaString);
            return dia >= 1 && dia <= 31;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isMesValido(int mes) {
        return mes >= 1 && mes <= 12;
    }

    public static boolean isMes(String mesString) {
        try {
            int mes = Integer.parseInt(mesString);
            return mes >= 1 && mes <= 12;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isAnoValido(int ano) {
        int AnoAtual = getAnoAtual();
        return ano >=1900 && ano <= AnoAtual;
    }

    public static boolean isAno(String anoString) {
        try {
            int ano = Integer.parseInt(anoString);
            return ano <= getAnoAtual();
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDataValida(int dia, int mes, int ano){
        try {
            LocalDate.of(ano, mes, dia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static int getAnoAtual(){
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    public static String formatarData(int dia, int mes, int ano) {
        String diaFormatado = String.format("%02d", dia);
        String mesFormatado = String.format("%02d", mes);
        String anoFormatado = String.format("%04d", ano);
        return diaFormatado + "/" + mesFormatado + "/" + anoFormatado;
    }
}
