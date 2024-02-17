package br.com.adatech.billboardsongs.infra.repositorio;

import br.com.adatech.billboardsongs.infra.banco.BancoDeDados;
import br.com.adatech.billboardsongs.modelo.Album;
import br.com.adatech.billboardsongs.modelo.Artista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlbumRepositorio extends AbstractRepositorio {

    public AlbumRepositorio(BancoDeDados bancoDeDados) {
        super(bancoDeDados);
    }

    /*protected BancoDeDados bancoDeDados;*/
    @Override
    protected Class classeModelo() {
        return Album.class;
    }

    /*public AlbumRepositorio(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }*/

   /* public void gravar(Object objeto) {
        this.bancoDeDados.inserirObjeto(objeto);
    }*/


    /*public  List listar() {
        List objetosPresentesNoBanco = this.bancoDeDados.buscarObjetosPorTipo(Album.class);
        return Collections.unmodifiableList(objetosPresentesNoBanco);
    }*/


    public List consultarAlbumPorAutor(Artista artista) {
        List albums = listar();
        List albumsDoArtista = new ArrayList();

        for(Object objeto : albums) {
            Album album = (Album) objeto;
            if(artista.equals(album.getAutor()))
                albumsDoArtista.add(album);
        }
        return albumsDoArtista;
    }



    public Album consultarAlbumPorNome(String nome) {
        List albums = listar();

        for(Object objeto : albums) {
            Album album = (Album) objeto;
            if(nome.equals(album.getNome()))
                return album;
        }
        return null;
    }

}
