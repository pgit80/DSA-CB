package map;

public class My_Map_Implementation {
    class Node {
        String key;
        Integer val;
        Node next;
    }

    private Node[] buk;

    // custom bucket size as per user demand
    public My_Map_Implementation(int n) {
        buk = new Node[n];
    }

    // default 4 size bucket.
    public My_Map_Implementation() {
        buk = new Node[4];
    }

    int size = 0;

    public void put(String key, Integer value) {
        // first get buket node
        int bucketNo = hashFunction(key);
        // now get start address of the LL in that bucket
        Node temp = buk[bucketNo];

        while (temp != null) {
            // if key already exist then only update its value
            if (temp.key.equals(key)) {
                temp.val = value;
                return;
            }
            temp = temp.next;
        }
        // add new node to start of previous LL in bucket, if key doesn't already exist
        Node nn = new Node();
        nn.key = key;
        nn.val = value;
        nn.next = buk[bucketNo];
        // update the pointer
        buk[bucketNo] = nn;
        size++;
    }

    public Integer get(String key) {
        // first get buket node
        int bucketNo = hashFunction(key);
        // now get start address of the LL in that bucket
        Node temp = buk[bucketNo];

        while (temp != null) {
            // if key already exist then only update its value
            if (temp.key.equals(key)) {

                return temp.val;
            }
            temp = temp.next;
        }
        // add new node to start of previous LL in bucket, if key doesn't already exist]
        return null;
    }

    public boolean contains(String key) {
        // first get buket node
        int bucketNo = hashFunction(key);
        // now get start address of the LL in that bucket
        Node temp = buk[bucketNo];

        while (temp != null) {
            // if key already exist then only update its value
            if (temp.key.equals(key)) {

                return true;
            }
            temp = temp.next;
        }
        // add new node to start of previous LL in bucket, if key doesn't already exist]
        return false;
    }

    public Integer remove(String key) {
        int bucketNo = hashFunction(key);
        // here just node removal code in ll

        Node curr = buk[bucketNo];
        Node prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (curr == null)
            return null;
        // if we are removing first node
        if (prev == null) {
            buk[bucketNo] = curr.next;
            curr.next = null;
        } else {
            prev.next = curr.next;
            curr.next = null;
        }

        size--;
        // if no such key exists
        return curr.val;
    }

    public int hashFunction(String key) {
        // hashcode is uniquely defined for every data in java built-in. It assign a
        // value.
        int idx = key.hashCode() % buk.length;
        // if by case we get negative remainder
        if (idx < 0) {
            idx += buk.length;
        }
        return idx;
    }
}