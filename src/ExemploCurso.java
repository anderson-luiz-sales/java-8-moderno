import java.util.*;
import java.util.stream.Collectors;

class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public static class ExemploCursos {
        public static void main(String[] args) {

            List<Curso> cursos = new ArrayList<Curso>();
            cursos.add(new Curso("Python", 45));
            cursos.add(new Curso("JavaScript", 150));
            cursos.add(new Curso("Java 8", 113));
            cursos.add(new Curso("C", 55));

            cursos.sort(Comparator.comparing(Curso::getAlunos));

//            cursos.stream().filter(curso -> curso.getAlunos() >= 100)
//                    .forEach(c -> System.out.println(c.getNome()));

//            cursos.stream().filter(curso -> curso.getAlunos() >= 100)
//                    .map(c -> c.getAlunos())
//                    .forEach(total -> System.out.println(total));

//            int sum = cursos.stream().filter(curso -> curso.getAlunos() >= 100)
//                    .mapToInt(c -> c.getAlunos())
//                    .sum();
//            System.out.println("sum = " + sum);

//            cursos.stream()
//                    .filter(c -> c.getAlunos() >= 100)
//                    .findAny()
//                    .ifPresent(c -> System.out.println("c.getNome() = " + c.getNome()));

//            Curso curso = optionalCurso.orElse(null);
//            System.out.println("curso.getNome() = " + curso.getNome());

//            cursos = cursos.stream()
//                    .filter(c -> c.getAlunos() >= 100)
//                    .collect(Collectors.toList());
//
//            cursos.stream().
//                    forEach(c -> System.out.println("c.getNome() = " + c.getNome()));

//            Map<String, Integer> map = cursos.stream()
//                    .filter(c -> c.getAlunos() >= 100)
//                    .collect(Collectors.toMap(
//                            c -> c.getNome(),
//                            c -> c.getAlunos()
//                    ));
//            System.out.println("map = " + map);

//            cursos.stream()
//                    .filter(c -> c.getAlunos() >= 100)
//                    .collect(Collectors.toMap(
//                            c -> c.getNome(),
//                            c -> c.getAlunos()))
//                    .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

            cursos.parallelStream()
                    .filter(c -> c.getAlunos() >= 100)
                    .collect(Collectors.toMap(
                            c -> c.getNome(),
                            c -> c.getAlunos()))
                    .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
        }
    }
}
