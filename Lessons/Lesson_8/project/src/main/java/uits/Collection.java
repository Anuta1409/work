package uits;
/**
 * Created by Anna on 05.12.2015.
 */
public class Collection {
    private Object[] arr;// array

    public Collection(Object[] a){
        arr  =  a;
    }//constructor


    public class Forward implements Iterator {
        private int cur = 0;
        public boolean hasNest() {//���������� �����
            return cur < arr.length;
        }
        public Object next() {
            return arr[cur++];
        }
    }


    public class Backward implements Iterator{
        private  int cur = arr.length-1;
        public boolean hasNest() {
            return cur >= 0;
        }
        public Object next() {
            return arr[cur--];
        }
    }


    public Iterator createForward(){
        return  new Forward();//�����,������� ���������� ������ ���������� �������
    }
    public Iterator createBackward(){
        return  new Backward();//�����,������� ���������� ������ ���������� �������
    }

    public Iterator createIterator(){
        return new Iterator() {//��������� �����, ����������� ���������
            private int cur = -1;
            public boolean hasNest() {
                return cur > arr.length-2;
            }
            public Object next() {
                return cur+=2;
            }
        };
    }
}

