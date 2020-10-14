def digitToword(num):
    switcher = {
        0: 'zero',
        1: 'one',
        2: 'two',
        3: 'three',
        4: 'four',
        5: 'five',
        6: 'six',
        7: 'seven',
        8: 'eight',
        9: 'nine'
    }
    return switcher.get(num)
    
def numberToword(num):
    if(num == 0):
        return
    x = num%10
    numberToword(num//10)
    print(digitToword(x),end = " ")
    return
    
n = int(input())
numberToword(n)
