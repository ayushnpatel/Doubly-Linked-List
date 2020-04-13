public class DLLRunnerOfficial{
    public DLLRunnerOfficial(){
        DoublyLinkedList list = new DoublyLinkedList<Integer>();

        for(int x = 0; x< 30; x++){
            list.add((int)(Math.random()*1000)+1);
        }
        System.out.println(list);
        System.out.println(list.toReversedString());
        System.out.println(list.size());

        int sum = 0;
        for(int x = 0; x < list.size(); x++){
            sum+=(int)list.get(x);
        }
        System.out.println(sum);

        sum = 0;
        for(int x = 0; x < list.size(); x+=2){
            sum+=(int)list.get(x);
        }
        System.out.println(sum);

        sum = 0;
        for(int x = 1; x < list.size(); x+=2){
            sum+=(int)list.get(x);
        }
        System.out.println(sum);

        for(int x = 0; x < 30; x++){
            if(x%2==0)
                list.add(list.get(x));
        }
        System.out.println(list);

        for(int x = 0; x < list.size(); x++){
            if((int)list.get(x)%3==0)
                list.remove(x);
        }
        System.out.println(list);

        list.add(3, 55555);
        System.out.println(list);

        int n = list.size(); 
        for (int x=1; x<n; x++) 
        { 
            int key = (int)list.get(x); 
            int j = x-1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j>=0 && (int)list.get(j) > key) 
            { 
                list.set(j+1, list.get(j));
                j = j-1; 
            } 
            list.set(j+1, key); 
        }

        System.out.println(list);

        
        if(list.size()%2==0){
            System.out.print("Before Median: ");
            for(int x = 0; x < list.size()/2; x++){
                System.out.print(list.get(x)+", ");
            }
            System.out.print("\nMedian: ");
            System.out.println(((int)list.get((list.size()/2)-1)+(int)list.get(list.size()/2))/2);
            System.out.print("After Median: ");
            for(int x = list.size()/2+1; x < list.size(); x++){
                System.out.print(list.get(x)+", ");
            }
        }

        if(list.size()%2==1){
            System.out.print("Before Median: ");
            for(int x = 0; x <= list.size()/2-1; x++){
                System.out.print(list.get(x)+", ");
            }
            System.out.print("\nMedian: ");
            System.out.println(((int)list.get(list.size()/2)));
            System.out.print("After Median: ");
            for(int x = list.size()/2+1; x < list.size(); x++){
                System.out.print(list.get(x)+", ");
            }
        }
            
        System.out.println();

        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] s = sentence.split(" ");
        DoublyLinkedList strings = new DoublyLinkedList<String>();
        for(int x = 0; x < s.length; x++){
            strings.add(s[x]);
        }
        System.out.println(strings);
        for(int x = 0 ; x < strings.size(); x++){
            if(strings.get(x).toString().length() <= 3){
                strings.remove(x);
            }
        }
        System.out.println(strings);

        n = strings.size(); 
        for (int x=1; x<n; x++) 
        { 
            String key = strings.get(x).toString(); 
            int j = x-1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j>=0 && strings.get(j).toString().compareToIgnoreCase(key) > 0) 
            { 
                strings.set(j+1, strings.get(j));
                j = j-1; 
            } 
            strings.set(j+1, key); 
        }
        System.out.println(strings);

        double averageWordLength = 0;
        for(int x = 0; x < strings.size(); x++){
            averageWordLength+=strings.get(x).toString().length();
        }
        averageWordLength/=strings.size();
        System.out.println(averageWordLength);



    }
    public static void main(String [] args){
        DLLRunnerOfficial app = new DLLRunnerOfficial();
    }
}