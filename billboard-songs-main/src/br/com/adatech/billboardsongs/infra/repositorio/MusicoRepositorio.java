package br.com.adatech.billboardsongs.infra.repositorio;

import br.com.adatech.billboardsongs.infra.banco.BancoDeDados;
import br.com.adatech.billboardsongs.modelo.Musica;
import br.com.adatech.billboardsongs.modelo.Musico;

import java.util.List;

public class MusicoRepositorio extends AbstractRepositorio {

    @Override
    protected Class classeModelo() {
        return Musico.class;
    }


    public List musicosQueGravaramMusica(Musica musica) {
        return null;
    }


    public MusicoRepositorio(BancoDeDados bancoDeDados) {
        super(bancoDeDados);
    }
}
