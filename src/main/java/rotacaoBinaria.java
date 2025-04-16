import java.util.Scanner;

class rotacaoBinaria {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String [] integer = sc.next().split(" ");
        BST bst = new BST();

        for (int i = 0 ; i < integer.length; i++)
            bst.insertAvl(Integer.parseInt(integer[i]));
    }
}
