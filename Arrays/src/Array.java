public class Array {

    private int[] items;
    private int count;
    public Array(int length){
        items = new int[length];
    }

    public void print(){
        for(int i = 0;i< count; i++){
            System.out.println(items[i]);
        }
    }
    public void insert(int item){
        //if the array is full, resize it
        if(items.length == count){
            //create a new array (twice the size)
            int[] newItems = new int[count*2];
            //copy all the existing items
            for(int i =0; i<count;i++){
                newItems[i] = items[i];
            }
            //set "items" to this new array
            items = newItems;
        }

        //add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        for(int i = index; i<count; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        // if we find it, return index
        // otherwise, return -1
        for(int i = 0; i<count; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }


}
