package br.com.adatech.billboardsongs;

import br.com.adatech.billboardsongs.infra.banco.BancoDeDados;
import br.com.adatech.billboardsongs.infra.repositorio.AlbumRepositorio;
import br.com.adatech.billboardsongs.infra.repositorio.ArtistaRepositorio;
import br.com.adatech.billboardsongs.infra.repositorio.MusicoRepositorio;
import br.com.adatech.billboardsongs.modelo.Album;
import br.com.adatech.billboardsongs.modelo.Artista;
import br.com.adatech.billboardsongs.modelo.Musico;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArtistaRepositorio artistaRepositorio = new ArtistaRepositorio(new BancoDeDados());
        MusicoRepositorio musicoRepositorio = new MusicoRepositorio(new BancoDeDados());

        artistaRepositorio.gravar(new Artista("Will", List.of(),
                true, "THe best", "sgdgds"));
        musicoRepositorio.gravar(new Musico("Will", true));

        artistaRepositorio.listar();
        musicoRepositorio.listar();





        AlbumRepositorio albumRepositorio = new AlbumRepositorio(new BancoDeDados());

        Artista artista = new Artista("Lakaka", List.of(),
                true, "THe best", "sgdgds");
        artistaRepositorio.gravar(artista);


        albumRepositorio.gravar(new Album("teste", artista, LocalDate.now(), List.of(), List.of()));
        albumRepositorio.gravar(new Album("teste2", artista, LocalDate.now(), List.of(), List.of()));

        List<Album> consultaAlbum = albumRepositorio.consultarAlbumPorAutor(artista);

        for (Album album : consultaAlbum) {
            System.out.println(album.getNome());
        }
        System.out.println();

        Album consultarAlbum = albumRepositorio.consultarAlbumPorNome("teste");
        if (consultarAlbum != null)
            System.out.println(consultarAlbum.getAutor().getNome());
    }
}
