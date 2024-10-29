public class tekyonliste {
    Node head = null;
    Node tail = null;
    void basekle(int x){
    Node eleman = new Node();
    eleman.data = x;

    if(head == null){
        eleman.next= null;
        head = eleman;
        tail = eleman;
        System.out.println("liste oluşturuldu ilk eleman eklendi");
    }
    else{
        eleman.next = head;
        head = eleman;
        System.out.println("başa eleman eklendi");
    }


}

    void sonaekle(int x){
        Node eleman = new Node();
        eleman.data = x;

        if(head == null){
            eleman.next= null;
            head = eleman;
            tail = eleman;
            System.out.println("liste oluşturuldu ilk eleman eklendi");
        }
        else{
            eleman.next = null;
            tail.next = eleman;
            tail = eleman;
            System.out.println("sona eleman eklendi");
        }


    }

    void arayaekle(int indis ,int x){
        Node eleman = new Node();
        eleman.data = x;

        if(head == null && indis==0){
            eleman.next= null;
            head = eleman;
            tail = eleman;
            System.out.println("liste oluşturuldu ilk eleman eklendi");
        } else if (head!=null && indis==0) {
            eleman.next = head;
            head = eleman;
            System.out.println(indis +"indisinci sıraya yeni eleman eklendi");

            
        } else{
            int n=0;
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null) {
                n++;
                temp2=temp;
                temp = temp.next;
            }
            if (n==indis){
                tail.next = eleman;
                tail = eleman;
                eleman.next = null;
            }
            else{
                temp=head;
                int i=0;
                while(i!=indis){
                    temp2=temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next=eleman;
                eleman.next = temp;
                System.out.println(indis + ". eleman eklendi");
            }

        }


    }

    void bastansil(){
        if(head == null){
            System.out.println("liste boş");
        }
        else if (head.next == null){
            head = null;
            tail = null;
            System.out.println("listede bulunan son eleman silindi");
        }
        else{
            head = head.next;
            System.out.println("baştaki eleman silindi");
        }
    }

    void sondansil(){
        if(head==null && tail == null){
            System.out.println("listede silnecek eleman yok liste boş");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("listede kalan son eleman silindi");
        }
        else{
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null) {
                temp2=temp;
                temp = temp.next;
            }
            temp2.next = null;
            tail = temp2;
            System.out.println("sondan eleman silindi");
        }

    }

    void aradansil(int indis){
        if(head ==null){
            System.out.println("liste boş silinecek bir şey yok");
        }
        else if (head.next==null && indis==0){
            head = null;
            tail = null;
            System.out.println("listede kalan son eleman silindi");
        }
        else if(head.next!=null && indis==0){
            head = head.next;
            System.out.println("baştaki eleman silindi");
        }
        else{
            int i =0;
            Node temp = head;
            Node temp2 = head;
            while(temp!=null){
                i++;
                temp2=temp;
                temp=temp.next;
            }
            if(i==indis){
                temp2.next = null;
                System.out.println("listeden son eleman silindi");
            }
            else{
                temp = head;
                temp2 = head;
                int j=0;
                while(j!=indis){
                    j++;
                    temp2=temp;
                    temp = temp.next;
                }
                temp2.next = temp.next;
                System.out.println("aradaki eleman silindi");
            }
        }
    }

    void yazdir(){

        if(head == null){

            System.out.println("lise yapısı boş");
        }
        else{
            Node temp = head;
            while(temp !=null){
                System.out.println(temp.data);
                temp = temp.next;
            }

        }
    }
}
