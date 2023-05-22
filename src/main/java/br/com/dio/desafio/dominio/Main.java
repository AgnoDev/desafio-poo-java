package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAgno = new Dev();
        devAgno.setNome("Agno");
        devAgno.matricularBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Agno:" + devAgno.getConteudosInscritos());
        devAgno.avancar();
        devAgno.avancar();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Agno:" + devAgno.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Agno:" + devAgno.getConteudosConcluidos());
        System.out.println("CH:" + devAgno.calcularTotalXp());

        System.out.println("-------");

        Dev devDio = new Dev();
        devDio.setNome("Dio");
        devDio.matricularBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dio:" + devDio.getConteudosInscritos());
        devDio.avancar();
        devDio.avancar();
        devDio.avancar();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Dio:" + devDio.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Dio:" + devDio.getConteudosConcluidos());
        System.out.println("CH:" + devDio.calcularTotalXp());

    }

}