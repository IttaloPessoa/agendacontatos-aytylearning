package br.com.ufpb.ayty.contatos;

/* Classe base para manter o estado e funções da aplicação global.
 * A classe Application funciona como um Singleton, onde ela é iniciada sempre que a aplicação é aberta
 * e é destruída sempre que a aplicação é encerrada. É necessário implementar os métodos onCreate e onTerminate
 * para iniciar ou finalizar as funcionalidades existentes na classe.
 * A classe Application pode ser recuperada em qualquer parte da sua aplicação, para isso utilize a seguinte
 * notação: AgendaApplication application = ((AgendaApplication) getApplicationContext())
 * { na Activity atual e recupere a ApplicationContext por meio do método getApplicationContext() }
 * A classe Application deverá ser informada no AndroidManifest.xml na TAG <application> com o seguinte atributo
 * android:name=".AgendaApplication"
 */

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import br.com.ufpb.ayty.contatos.util.Contato;

public class AgendaApplication extends Application{

    public static final String TAG = "AgendaApplication";

    private List<Contato> contatos;

    @Override
    public void onCreate() {
        super.onCreate();
        contatos = new ArrayList<>();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public void addContato(Contato contato){
        contatos.add(contato);
    }

    public void removerContato(Contato contato){
        contatos.remove(contato);
    }

    public List<Contato> getContatos(){
        return contatos;
    }

}
