def mutate_string(string, position, character):
    l = []
    for i in string:
        l.append(i)
    s = ''
    l[position] = character
    s = s.join(l)
    return s
    
if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)
