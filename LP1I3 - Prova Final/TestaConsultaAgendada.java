public class TesteConsultaAgendada {
   public static void main(String[] args) {
      ConsultaAgendada p1 = new ConsultaAgendada(22, 30, 13, 13, 6, 2023, "Pedro Maia", "Dr. Leandro");

      System.out.println("Propriedades de p1:");
      System.out.println("Data: " + p1.getData());
      System.out.println("Hora: " + p1.getHora());
      System.out.println("Nome do Paciente: " + p1.getNomePaciente());
      System.out.println("Nome do Medico: " + p1.getNomeMedico());
      System.out.println("Quantidade de consultas agendadas: " + p1.getQuantidade());

      ConsultaAgendada p2 = new ConsultaAgendada(10, 15, 20, 1, 12, 2023, "Luisa Maia", "Dr. Murilo");

      System.out.println("\nPropriedades de p2:");
      System.out.println("Data: " + p2.getData());
      System.out.println("Hora: " + p2.getHora());
      System.out.println("Nome do Paciente: " + p2.getNomePaciente());
      System.out.println("Nome do Medico: " + p2.getNomeMedico());
      System.out.println("Quantidade de consultas agendadas: " + p2.getQuantidade());

      p1.setData(24, 2, 2023);
      p1.setHora(22, 12, 30);
      p1.setNomePaciente("Irani");
      p1.setNomeMedico("Dra. Elaine");

      System.out.println("\nPropriedades de p1 apos alteracoes:");
      System.out.println("Data: " + p1.getData());
      System.out.println("Hora: " + p1.getHora());
      System.out.println("Nome do Paciente: " + p1.getNomePaciente());
      System.out.println("Nome do Medico: " + p1.getNomeMedico());
      System.out.println("Quantidade de consultas agendadas: " + p1.getQuantidade());
   }
}