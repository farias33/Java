import java.util.EmptyStackException;
class FullStackException extends RuntimeException{ }

public class MyStackClass {

    private static final int MAX_SIZE = 100;//tamanho maximo da minha pilha
    private Object stack[] = new Object[MAX_SIZE];//vetor que armazena objetos
    private  int qtd = 0;//quantidade de elementos na pilha
    //retorna elemento da i-ésima posição da fila
    private Object objectAt(int i) {
        return stack[i];
    }
    //insere um elemento na i-ésima posição da pilha
    private void setObjectAt(int i, Object obj){
        stack[i] = obj;
    }
    //remove um elemento da pilha
    public Object pop(){
        if (qtd == 0){
            throw new EmptyStackException(); //Exceção do pacote java.util
        }else {
            Object obj = objectAt(qtd - 1);
            setObjectAt(qtd - 1, null);
            qtd--;
            return obj;
        }
    }

    //retorna o elemento do topo da pilha
    public void push(Object obj){
        //pilha está cheia
        if (qtd == MAX_SIZE){
            throw new FullStackException();
        }else {
            setObjectAt(qtd, obj);
            qtd++;
        }
    }
}
