package aula;

class Relogio {
    String formatarMinutosParaHorasEMinutos(int minutos) {
        Calculadora calculadora = new Calculadora();
        int horas = (int) calculadora.dividir(minutos, 60);
        minutos = calculadora.subtrair(minutos, calculadora.multiplicar((horas), 60));
        StringBuilder horario = new StringBuilder();
        horario.append(horas).append(" Horas e ").append(minutos).append(" Minutos");
        return horario.toString();
    }

    String formatarSegundosParaHorasEMinutos(int segundos) {
        Calculadora calculadora = new Calculadora();
        int minutos = (int) calculadora.dividir(segundos, 60);
        return formatarMinutosParaHorasEMinutos(minutos);
    }
}