# java_programs

## Let's talk about time complexity
### Big O
There is a term known as big O notation through which we describe the efficiency of algorithm.

for eg:-
    we need to send a file of 1 terabyte to a person in another country.
    And we are sending it through internet it will take about 1 day or a week to reach to the 
    required person.
    For this it would be better to take the file and send it through flight to the required person.

In the example we have seen that for doing a work their are different solutions which we call here as algorithm.
But we have to always choose the most efficient solution.

#### O(1)

Now,lets discuss about O(1):-

eg:- For entering a single no. in array we require O(1) time.

    Means for doing single operation we require O(1) 

#### O(n)

Now,lets discuss about O(n):-

eg1:- for entering n items in an array we require O(n) time.

    Means for doing n number of operation we require O(n)


#### O(n^2)

Now,lets discuss about O(n^2):-

eg2:- In case of selection sort , bubble sort and insertion sort we require O(n^2) time.

    **insertion sort **
        public static void Sort(int a[])
        {   int n=a.length;
        for(int i=1;i<n;i++){
        int current=a[i];
        int j=i-1;
        while(j>=0){
        if(current<a[j]){
        a[j+1]=a[j];
        }
        else{
        break;
        }
        j--;
        }
        a[j+1]=current;
        }
        }
        
    
    Here we perform (n*(n-1))/2 
    which is equivalent to n^2 operations.
    So, it's time complexity is O(n^2)




   