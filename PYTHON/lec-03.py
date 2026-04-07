from builtins import input, int, print, range
# # 1. Write a program to print the  even numbers upto 30 

# for i in range(0, 30, 2):
#     print(i,end = " ")
    
#      -------x-------x---------x-----------x---    
    
    
# # 2. Write a program which will print no. is divisible by 3 fizz by 5 buzz  divisible by both 3 and 5 fizzbuzz

     
# for i in range(1,51):
#     if i%3 == 0 and i%5 == 0:
#         print("fizzbuzz")
#     elif i%3 == 0 :
#         print("fizz")
#     elif i%5 == 0:
#         print("buzz")
#     else :
#         print(i)
        
#      -------x-------x---------x-----------x---
        
        
# # 3. Write a program to which will take input from user and check the factors of number and print them
        
# n = int(input("Enter a number:  "))
# print("The factors of the number are: ")
# for i in range(1,n+1):
#     if n%i == 0:
#         print(i,end = " ")
        
#      -------x-------x---------x-----------x--- 
       
# # 
# 4. Write a program to count the even and odd factors of a number
# n = int(input("Enter a number:  "))
# even_count = 0
# odd_count = 0
# for i in range(1,n+1):
#     if n%i == 0:
#         if i%2 == 0:
#             even_count += 1
#         else:
#             odd_count += 1
# print("Even factors:", even_count)
# print("Odd factors:", odd_count)

#     -------x-------x---------x-----------x---



# n = int(input("Enter a number:  "))
# for i in range(2, n//2):
#     if n/i == 0:
#         print("The number is not prime")
#         break
# else:
#     print("The number is prime")

# write a program which will take input from user and check the count of digits in the number and print them

n = int(input("Enter a number:  "))
count = 0 
while n > 0:
    n = n//10
    count += 1
print("The count of digits in the number is: ", count)