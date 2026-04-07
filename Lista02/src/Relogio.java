public class Relogio {
        int horas;
        int minutos;
        int segundos;

        public Relogio (int horas, int minutos, int segundos) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }

        public void tick() {
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
            if (horas == 24) {
                horas = 0;
            }
        }

        public void adicionarSegundos(int n) {
            for (int i = 0; i < n; i++) {
                tick();
            }
        }

        public String exibirHorario() {

            return String.format("%02d:%02d:%02d", horas, minutos, segundos);
        }

        public boolean isMaiorQue(Relogio outro) {

            if (this.horas > outro.horas) return true;
            if (this.horas < outro.horas) return false;

            if (this.minutos > outro.minutos) return true;
            if (this.minutos < outro.minutos) return false;

            return this.segundos > outro.segundos;
        }
}
