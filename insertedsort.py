def insertion_sort(arr):

    for i in range(1,len(arr)):
        key = arr[i]
        j = i-1

        while j>=0 and key<arr[j]:
            arr[j+1]=arr[j]
            j=j-1
            arr[j+1]=key

arr = [12,29,25,8,32,17,40]
insertion_sort(arr)
print("sorted array is :",arr)

