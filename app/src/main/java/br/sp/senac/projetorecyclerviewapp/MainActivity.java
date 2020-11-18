package br.sp.senac.projetorecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Times> lstTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inserindo os livros no arrayList vazio
        lstTimes = new ArrayList<>();
        lstTimes.add(new Times("AtleticoMG","O Clube Atlético Mineiro é um clube brasileiro de futebol sediado na cidade de Belo Horizonte, Minas Gerais.","1",R.drawable.atleticomg));
        lstTimes.add(new Times("Internacional","O Sport Club Internacional é um clube multiesportivo brasileiro com sede na cidade de Porto Alegre, capital do Rio Grande do Sul","2",R.drawable.inter));
        lstTimes.add(new Times("São Paulo", "São Paulo Futebol Clube é uma associação esportiva brasileira da cidade de São Paulo, capital do estado homônimo", "3", R.drawable.sp));
        lstTimes.add(new Times("Flamengo", "O Clube de Regatas do Flamengo é uma agremiação poliesportiva brasileira com sede na cidade do Rio de Janeiro", "4", R.drawable.flamengo));
        lstTimes.add(new Times("Palmeiras", "A Sociedade Esportiva Palmeiras é um clube poliesportivo brasileiro da cidade de São Paulo, capital do estado homônimo", "5", R.drawable.palmeiras));
        lstTimes.add(new Times("Santos", "O Santos Futebol Clube, popularmente conhecido como Santos, é um clube poliesportivo brasileiro da cidade de Santos, litoral do estado de São Paulo.", "6", R.drawable.santos));
        lstTimes.add(new Times("Gremio", "Grêmio Foot-Ball Porto Alegrense é um clube de futebol brasileiro da cidade de Porto Alegre, no Rio Grande do Sul", "7", R.drawable.gremio));
        lstTimes.add(new Times("Fluminense", "Fluminense Football Club é uma agremiação poliesportiva e cultural sediada no bairro de Laranjeiras, Zona Sul da cidade do Rio de Janeiro", "8", R.drawable.fluminense));
        lstTimes.add(new Times("Bahia","O Esporte Clube Bahia é um clube desportivo brasileiro de futebol da cidade de Salvador, na Bahia","9",R.drawable.bahia));
        lstTimes.add(new Times("Sport","Sport Recife ou Sport, é um clube esportivo brasileiro, localizado na cidade de Recife","10",R.drawable.sport));
        lstTimes.add(new Times("Corinthians", "O Sport Club Corinthians Paulista é um clube multiesportivo brasileiro da cidade de São Paulo, capital do estado homônimo", "11", R.drawable.corinthians));
        lstTimes.add(new Times("Fortaleza", "Fortaleza Esporte Clube é um clube poliesportivo que está sediado na cidade de Fortaleza, no Nordeste", "12", R.drawable.fortaleza));
        lstTimes.add(new Times("Ceara", "Ceará Sporting Club é um clube poliesportivo brasileiro. Sua sede situa-se em Fortaleza, na Região Nordeste ", "13", R.drawable.ceara));
        lstTimes.add(new Times("AtleticoGo", "Atlético Clube Goianiense é uma agremiação esportiva brasileira da cidade de Goiânia", "14", R.drawable.atleticogo));
        lstTimes.add(new Times("Bragantino", "Bragantino, é um clube esportivo brasileiro da cidade de Bragança Paulista, interior do estado de São Paulo", "15", R.drawable.bragantino));
        lstTimes.add(new Times("Vasco", "Vasco da Gama é uma entidade sócio-poliesportiva brasileira com sede na cidade do Rio de Janeiro", "16", R.drawable.vasco));
        lstTimes.add(new Times("AtleticoPr", "Club Athletico Paranaense é um clube de futebol brasileiro, da cidade de Curitiba", "17", R.drawable.atleticopr));
        lstTimes.add(new Times("Coritiba", "Coritiba, é um clube desportivo brasileiro da cidade de Curitiba.", "18", R.drawable.coritiba));
        lstTimes.add(new Times("Botafogo", "Botafogo de Futebol e Regatas é uma agremiação poliesportiva brasileira, com sede no bairro homônimo ao clube", "19", R.drawable.botafogo));
        lstTimes.add(new Times("Goias", "Goiás Esporte Clube é uma agremiação esportiva sediada na cidade de Goiânia, no estado brasileiro de Goiás", "20", R.drawable.goias));
        //declarando a variavel xml enviando para o java
        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);

        //Instânciando o adaptador com os valores necessários
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplicationContext(), lstTimes);
        //Criando o layout para inserção dos valores

        //LayoutManager não é necessário inserção de colunas - pode ser utilizado na vertical ou horizontal
       // mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL,true));

        //GriLayoutManager necessário a inserção de colunas
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //Para melhorar a performance do RecyclerView na listagem
        mRecyclerView.setHasFixedSize(true);

        //Inserindo os valores na lista do RecyclerView
        mRecyclerView.setAdapter(mAdapter);
    }
}
