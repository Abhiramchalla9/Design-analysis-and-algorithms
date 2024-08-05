def selection_sort(arr):

    for i in range(len(arr)):
        small = i

        for j in range(i+1,len(arr)):
            if arr[j]<arr[small]:
                small = j
        temp = arr[i]
        arr[i] = arr[small]
        arr[small] = temp

arr = [12,29,25,8,32,17,40]
selection_sort(arr)
print("Sorted array is",arr)