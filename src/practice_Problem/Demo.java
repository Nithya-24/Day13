package practice_Problem;

public class Demo<T> {
    public T no;// This is generic character

    public Demo(T value) {
            this.no = value;
    }

    public void display() {
            System.out.println(no);
    }

    public static void main(String[] args) {
            Demo<Integer> iobj = new Demo<Integer>(50);
            Demo<Character> cobj = new Demo<Character>('a');
            iobj.display();
            cobj.display();
    }

}