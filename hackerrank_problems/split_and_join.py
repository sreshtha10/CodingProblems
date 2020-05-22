def split_and_join(line):
    l = line.split()
    s = '-'
    s = s.join(l)
    return s

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
