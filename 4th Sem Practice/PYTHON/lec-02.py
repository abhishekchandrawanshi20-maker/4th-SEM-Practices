from builtins import input, int, print


# #1. Write a program which will take degree CELSIUS as input and convert it into FAHRENHEIT

# c= int(input("Enter the degree in CELSIUS: "))
# f= (c * 9/5) + 32
# print("The degree in FAHRENHEIT is: ",f)


#               -------x-------x---------x-----------x---


# # 2. Write a program which will take radius as a input and print the area of the circle

# r=int(input("Enter the radius of the circle: "))
# area= 3.14 * r**2
# perimeter= 2 * 3.14 * r
# print("The area of the circle is:", area)
# print("The perimeter of the circle is:", perimeter)


#               -------x-------x---------x-----------x---


# # 3. Write a program which will check if the user can vote or not. (age should be greater than 18)


# age=int(input("Enter your age: "))
# if age >18:
#     print("You are eligible to vote.")
# else:
#     print("You are not eligible to vote.")
    
    
    
#               -------x-------x---------x-----------x---



# #4. Write a program to determine grade based on marks.

# marks=int(input("Enter your marks: "))
# if marks>=90:
#     print("Grade A")
# else:
#     if marks>=80:
#         print("Grade B")
#     else:
#         if marks>=70:
#            print("Grade C")
#         else:
#             if marks>=60:
#               print("Grade D")
#             else:
#              print("Grade E")

# if marks>=90:     # in simple way we can write the above code using elif statement
#     print("Grade A")
# elif marks>=80:
#     print("Grade B")
# elif marks>=70:
#     print("Grade C")        
# elif marks>=60:
#     print("Grade D")
# else:    
#     print("Grade E")   

#               -------x-------x---------x-----------x---



# # 5. Write a program to fi d the largest of three numbers.


# number1=int(input("Enter the first number: ") )
# number2=int(input("Enter the second number: ") )
# number3=int(input("Enter the third number: ") )

# if number1 > number2 and number1 > number3:
#     print("The largest number is : ", number1)
# elif number2 > number1 and number2 > number3:
#     print("The largest number is : ",number2)
# elif number3 > number1 and number3 > number2:
#     print("The largest number is : ",number3)
# else:
#     print("All the numbers are equal.")


#               -------x-------x---------x-----------x---


# # 6. Write a program to deteremine if a triangle is equilateral, isosceles or scalene.

# side1= int(input("Enter the first side of the triangle: ") )
# side2= int(input("Enter the second side of the triangle: ") )
# side3= int(input("Enter the third side of the triangle: ") )    

# if side1 == side2 and side2 == side3:
#     print("The triangle is equilateral.")
# elif side1 == side2 or side2 == side3 or side1 == side3:
#     print("The triangle is isosceles.")
# else:
#     print("The triangle is scalene.")


# # 7. Write a program to check if given year is leap year or not.

# year=int(input("Enter the year: "))
# if (year % 4 == 0 or year % 400 == 0) and year % 100 !=0:
#     print("The year is Leap year: ", year)
# else:
#     print("The year is not a Leap year: ",year)


#               -------x-------x---------x-----------x---

# # 8. Write a program to input electricity unit charges and calculate total electricity bill
# according to the given condition:
# * for first 50 units Rs. 0.50/unit
# * for next 150 units Rs. 0.75/unit
# * for next 250 units Rs. 1.20/unit
# * for unit above 450 Rs. 1.50/unit
# * An additional surcharge of 20% is added to the bill



# unit=int(input("Enter the number of units consumed: "))
# if unit <= 50:
#     bill = unit * 0.50
# elif unit <= 150:
#     bill = (50 * 0.50) + ((unit - 50) * 0.75)
# elif unit <= 250:
#     bill = (50 * 0.50) + ((unit - 50) * 0.75) + ( (unit -150) * 1.20)
# elif unit <= 450:
#     bill = (50*0.50)+((unit - 50)* 0.75) + ((unit - 150) * 1.20 ) + ((unit - 250) * 1.50)
# else:
#     bill = (50 * 0.50) + ((unit - 50) * 0.75) + ((unit - 150) * 1.20) + (( unit - 250)* 1.50) 
    
# final_bill = bill + bill * 0.20
# print("The total electricity bill is: ", final_bill)



#               -------x-------x---------x-----------x---



 # # 9. Write a program which accepts to
