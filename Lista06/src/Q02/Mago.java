package Q02;

public class Mago extends Personagem{
    private int danoMagico, custoMana, manaAtual;
    public Mago(String nome, int pontosDeVida, int danoMagico, int custoMana, int manaAtual) {
        super(nome, pontosDeVida);
        setDanoMagico(danoMagico);
        setCustoMana(custoMana);
        setManaAtual(manaAtual);
    }

    public void setDanoMagico(int danoMagico) {
        if (danoMagico < 0) throw new IllegalArgumentException();
        this.danoMagico = danoMagico;
    }

    public void setCustoMana(int custoMana) {
        if (custoMana < 0) throw new IllegalArgumentException();
        this.custoMana = custoMana;
    }

    public int getManaAtual() {
        return manaAtual;
    }

    public void setManaAtual(int manaAtual) {
        this.manaAtual = manaAtual;
    }

    @Override
    public void executarAtaque(Personagem alvo) {
        if (manaAtual >= custoMana && alvo.estaVivo()) {
            alvo.receberDano(danoMagico);
            manaAtual -= custoMana;
        }
    }

    @Override
    public String getClasse() {
        return "Mago";
    }
}