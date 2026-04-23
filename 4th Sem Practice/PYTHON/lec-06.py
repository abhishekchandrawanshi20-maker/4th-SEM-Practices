# /Q1)   w.a.p....to print the list of first and last elements of each list of lists.
#lst2 =[[23,45,76],[45,3,12],[3,5,20]]
#out put;[23,76,45,12,3,20]

# Q2)  w.a.p.... to calculate and print the sum of max elements of each list of lists.
#lst3 = [[1,2,4,5],[3,4,5,3],[4,5,3,2]]
#output 15


# Q3) w,a,p,,, to calculate and print the sum of elements in each list of list and add the resultant value.
#  without using sum() function.
# sample list =[[1,2,4,5],[3,5,4,3],[4,5,3,2]]
# output:[12,15,14]


# Q4. Write a program to insert the product of the first and last elements at the third position in the list.
#  Print the list before and after insertion.

# Sample list (34,56,23,76,23,46]

# Output: [34,56,23,1564,76,23,46]

# Q5. Write a python program to divide the list into two equal halves and print the sum of each half.

# Ist1= [2,4,6,8,3,5,8,9]

# Output: 20, 25




        # Q1: Print first and last elements of each sublist
lst2 = [[23,45,76],[45,3,12],[3,5,20]]
result1 = [sub[0] for sub in lst2] + [sub[-1] for sub in lst2]
print("Q1 Output:", result1)


# Q2: Sum of max elements from each sublist
lst3 = [[1,2,4,5],[3,4,5,3],[4,5,3,2]]
result2 = sum(max(sub) for sub in lst3)
print("Q2 Output:", result2)


# Q3: Sum of each sublist without using sum()
sample_list = [[1,2,4,5],[3,5,4,3],[4,5,3,2]]
result3 = []
for sub in sample_list:
    total = 0
    for num in sub:
        total += num
    result3.append(total)
print("Q3 Output:", result3)


# Q4: Insert product of first and last element at 3rd position
lst = [34,56,23,76,23,46]
product = lst[0] * lst[-1]
lst.insert(3, product)
print("Q4 Output:", lst)


# Q5: Divide list into two halves and print sum
lst1 = [2,4,6,8,3,5,8,9]

mid = len(lst1)//2

sum1 = sum(lst1[:mid])
sum2 = sum(lst1[mid:])
print("Q5 Output:", sum1, sum2)




# Q6> w.a.p. which will create a list with all the
#  element divisible by 3 in 4 and 25
# normal loop
lst =[]
for i in range(4,26):
    if i% 3 ==0:
        lst.append(i)
print("Q6 Output:",lst)     


# list Comprehension:
lst=[i for i in range(4,26)if i%3==0]
print("Q6> Comprehension lst:",lst)

 

# List Comprehension with condition + expression

lst=[i for i in range(4,26)if i%3==0]
lst1=[i2 for i in lst if i%2==0]
lst2=[i2 for i in lst if i%2!=0]
print(lst,"\n",lst1,"\n",lst2)


lst=[2,3,4,5,6,4,3]
lst1=["even" if i%2==0 else"odd" for i in lst]
print(lst1)




# Q5. Write a program to print the list of first and last elements of each list of lists.

# lst2 = [[23,45,76),(45,3,12), (3,5,20])]

# Output: 123,76,45,12,3,20
lst= [(23,45,76),(45,3,12), (3,5,20)]
lst1=[]
for i in lst:
    lst1.append[i[0]]
    lst1.append[i[-1]]
print(lst1)





lst = [[1,2,4,5],[3,5,4,3],[4,5,3,2]]
lst1=[sum(i)for i in lst]
print