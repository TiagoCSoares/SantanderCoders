package br.com.adatech.billboardsongs;

import br.com.adatech.billboardsongs.infra.banco.BancoDeDados;
import br.com.adatech.billboardsongs.infra.repositorio.AlbumRepositorio;
import br.com.adatech.billboardsongs.infra.repositorio.ArtistaRepositorio;
import br.com.adatech.billboardsongs.infra.repositorio.MusicoRepositorio;
import br.com.adatech.billboardsongs.modelo.Album;
import br.com.adatech.billboardsongs.modelo.Artista;
import br.com.adatech.billboardsongs.modelo.Musico;
import br.com.adatech.billboardsongs.service.MusicoService;
import br.com.adatech.billboardsongs.service.exception.ModeloInvalidoException;
import br.com.adatech.billboardsongs.view.Menu;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();
        MusicoRepositorio musicoRepositorio = new MusicoRepositorio(bancoDeDados);
        MusicoService musicoService = new MusicoService(musicoRepositorio);

        Menu principal = new Menu(musicoService);
        principal.execute();
    }
}

