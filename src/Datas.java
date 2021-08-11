import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println("hoje = " + hoje);

        LocalDate copa = LocalDate.of(2022, Month.JUNE, 5);
        
        int anos = copa.getYear() - hoje.getYear();
        System.out.println("anos = " + anos);

        Period period = Period.between(hoje, copa);
        System.out.println("period.getDays() = " + period.getDays());
        
        LocalDate proximaCopa = copa.plusYears(4);
        System.out.println("proximaCopa = " + proximaCopa);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximaCopa.format(formatador);
        System.out.println("valorFormatado = " + valorFormatado);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("agora = " + agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println("intervalo = " + intervalo);
    }
}
