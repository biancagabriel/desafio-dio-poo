import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso  javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBia = new Dev();
        devBia.setNome("Bianca");
        devBia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Bianca: " + devBia.getConteudoInscrito());
        System.out.println("----");
        devBia.progredir();
        System.out.println("Conteúdos Incritos Bianca: " + devBia.getConteudoInscrito());
        System.out.println("Conteúdos Concluidos Bianca: " + devBia.getConteudosConcluidos());
        devBia.progredir();
        System.out.println("Conteúdos Incritos Bianca: " + devBia.getConteudoInscrito());
        System.out.println("Conteúdos Concluidos Bianca: " + devBia.getConteudosConcluidos());
        System.out.println("XP: " + devBia.calcularTotalXp());

        System.out.println("----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos João: " + devJoao.getConteudoInscrito());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("----");
        System.out.println("Conteúdos Incritos João: " + devJoao.getConteudoInscrito());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}