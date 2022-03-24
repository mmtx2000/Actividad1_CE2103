
class Nodo{
    int dato;
    Nodo next;
    public Nodo(int dato){
        this.dato = dato;
        this.next = null;
    }
    public int get_value(){
        return this.dato;
    }
}

public class Lista_simp{
    private Nodo first;
    public Lista_simp(){
        this.first = null;
    }
    
    public void addLast(int e){
        if(this.first == null){
            this.first = new Nodo(e);
        }else{
            Nodo current = this.first;
            while(current.next != null){
                current= current.next;
            }
            current.next = new Nodo(e);
        }
    }



    public void addFirst(int e){
        if (this.first==null){
            this.first = new Nodo(e);
        }else{
            Nodo temp = new Nodo(e);
            temp.next = this.first;
            this.first = temp;
        }
    }
    public void deleteFirst(){
        if(this.first == null){
            return;
        }else{
        Nodo temp = this.first;
        this.first=temp.next;
        temp.next = null;
        }
    }

    public void leer(){
        Nodo current = this.first;
        while (current != null){
            System.out.println(current.get_value());
            current=current.next;
        }

    }

    public static void main(String[] args){
        Lista_simp l = new Lista_simp();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.leer();

    }
}








