package service;

import model.aluguel.Aluguel;

import java.time.LocalDate;

public interface AluguelService{
    void criarAluguel(Aluguel aluguel);
    LocalDate definirDataInicial();
    LocalDate definirDataDeDevolucaoPrevista(LocalDate dataInicial, int quantidadeDias);
    Aluguel salvar(Aluguel aluguel);
}
