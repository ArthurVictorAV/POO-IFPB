    void main(String[] args) {


    Agendamento a1 = new Agendamento();
    Agendamento a2 = new Agendamento("Arthur");
    Agendamento a3 = new Agendamento("Arthur", LocalDateTime.of(2026,03,23,0,0), "Troca de oleo");

    System.out.println(a1);
    System.out.println(a2);

    System.out.println(a3);
}